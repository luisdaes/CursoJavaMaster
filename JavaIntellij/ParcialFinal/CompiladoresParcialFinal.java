import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class CompiladoresParcialFinal extends JFrame {

  private JTextArea textArea;
  private JButton BotonGuardar;
  private JButton BotonCifrar;
  private JButton Botondescifrar;

  private static final String ALFABETO_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
  private static final String ALFABETO_MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String ALFABETO_NUMEROS = "0123456789";
  private static final Pattern EXPRESION_VALIDA = Pattern.compile("[a-zA-Z0-9 ]+");

  private int cantMinus = ALFABETO_MINUSCULAS.length();
  private int cantMayus = ALFABETO_MAYUSCULAS.length();
  private int cantNumeros = ALFABETO_NUMEROS.length();

  public CompiladoresParcialFinal() {
	setTitle("Cifrado de Archivos");
	setSize(400, 300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());

	textArea = new JTextArea();
	add(new JScrollPane(textArea), BorderLayout.CENTER);

	JPanel buttonPanel = new JPanel();
	BotonGuardar = new JButton("Guardar");
	BotonCifrar = new JButton("Cifrar");
	Botondescifrar = new JButton("Descifrar");

	buttonPanel.add(BotonGuardar);
	buttonPanel.add(BotonCifrar);
	buttonPanel.add(Botondescifrar);

	add(buttonPanel, BorderLayout.SOUTH);

	BotonGuardar.addActionListener(new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		guardarTexto();
	  }
	});

	BotonCifrar.addActionListener(new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		cifrarTexto();
	  }
	});

	Botondescifrar.addActionListener(new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		descifrarTexto();
	  }
	});
  }

  private void guardarTexto() {
	try (PrintWriter out = new PrintWriter("original.txt")) {
	  String text = textArea.getText();
	  if (EXPRESION_VALIDA.matcher(text).matches()) {
		out.println(text);
		JOptionPane.showMessageDialog(this, "Texto guardado en original.txt");
	  } else {
		JOptionPane.showMessageDialog(this, "El texto no cumple con los requisitos del alfabeto.");
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }

  private void cifrarTexto() {
	try {
	  String texto = new String(Files.readAllBytes(Paths.get("original.txt")));
	  texto = texto.replace("\n", "");
	  if (EXPRESION_VALIDA.matcher(texto).matches()) {
		String textoCifrado = cifrar(texto);
		try (PrintWriter archivo = new PrintWriter("cifrado.txt")) {
		  archivo.println(textoCifrado);
		  JOptionPane.showMessageDialog(this, "Texto guardado en cifrado.txt");
		}
	  } else {
		JOptionPane.showMessageDialog(this, "El texto en original.txt no cumple con los requisitos del alfabeto.");
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }

  private void descifrarTexto() {
	try {
	  String texto = new String(Files.readAllBytes(Paths.get("cifrado.txt"))).trim();
	  if (EXPRESION_VALIDA.matcher(texto).matches()) {
		String textoDescifrado = descifrar(texto);
		try (PrintWriter archivo = new PrintWriter("descifrado.txt")) {
		  archivo.println(textoDescifrado);
		  JOptionPane.showMessageDialog(this, "Texto guardado en descifrado.txt");
		}
	  } else {
		JOptionPane.showMessageDialog(this, "El texto en cifrado.txt no cumple con los requisitos del alfabeto.");
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }

  private String cifrar(String texto) {
	StringBuilder textoSalida = new StringBuilder();
	for (char caracter : texto.toCharArray()) {
	  if (ALFABETO_MINUSCULAS.indexOf(caracter) != -1) {
		int indice = ALFABETO_MINUSCULAS.indexOf(caracter);
		int indiceAux = (indice + 5) % cantMinus;
		textoSalida.append(ALFABETO_MINUSCULAS.charAt(indiceAux));
	  } else if (ALFABETO_MAYUSCULAS.indexOf(caracter) != -1) {
		int indice = ALFABETO_MAYUSCULAS.indexOf(caracter);
		int indiceAux = (indice + 5) % cantMayus;
		textoSalida.append(ALFABETO_MAYUSCULAS.charAt(indiceAux));
	  } else if (ALFABETO_NUMEROS.indexOf(caracter) != -1) {
		int indice = ALFABETO_NUMEROS.indexOf(caracter);
		int indiceAux = (indice + 5) % cantNumeros;
		textoSalida.append(ALFABETO_NUMEROS.charAt(indiceAux));
	  }else {
		textoSalida.append(caracter);
	  }
	}
	return textoSalida.toString();
  }

  private String descifrar(String texto) {
	StringBuilder textoSalida = new StringBuilder();
	for (char caracter : texto.toCharArray()) {
	  if (ALFABETO_MINUSCULAS.indexOf(caracter) != -1) {
		int indice = ALFABETO_MINUSCULAS.indexOf(caracter);
		int indiceAux = (indice - 5 + cantMinus) % ALFABETO_MINUSCULAS.length();
		textoSalida.append(ALFABETO_MINUSCULAS.charAt(indiceAux));
	  } else if (ALFABETO_MAYUSCULAS.indexOf(caracter) != -1) {
		int indice = ALFABETO_MAYUSCULAS.indexOf(caracter);
		int indiceAux = (indice - 5 + cantMayus) % cantMayus;
		textoSalida.append(ALFABETO_MAYUSCULAS.charAt(indiceAux));
	  } else if (ALFABETO_NUMEROS.indexOf(caracter) != -1) {
		int indice = ALFABETO_NUMEROS.indexOf(caracter);
		int indiceAux = (indice - 5 + cantNumeros) % cantNumeros;
		textoSalida.append(ALFABETO_NUMEROS.charAt(indiceAux));
	  }else {
		textoSalida.append(caracter);
	  }
	}
	return textoSalida.toString();
  }

  public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> {
	  CompiladoresParcialFinal gui = new CompiladoresParcialFinal();
	  gui.setVisible(true);
	});
  }
}
