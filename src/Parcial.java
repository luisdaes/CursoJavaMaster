import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Parcial extends JFrame {

  private JTextArea textArea;
  private JButton guardarButton;
  private JButton cifrarButton;
  private JButton descifrarButton;

  private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  private static final Pattern VALID_PATTERN = Pattern.compile("[a-zA-Z0-9 ]+");

  public Parcial() {
	setTitle("Cifrado de Archivos");
	setSize(400, 300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());

	textArea = new JTextArea();
	add(new JScrollPane(textArea), BorderLayout.CENTER);

	JPanel buttonPanel = new JPanel();
	guardarButton = new JButton("Guardar");
	cifrarButton = new JButton("Cifrar");
	descifrarButton = new JButton("Descifrar");

	buttonPanel.add(guardarButton);
	buttonPanel.add(cifrarButton);
	buttonPanel.add(descifrarButton);

	add(buttonPanel, BorderLayout.SOUTH);

	guardarButton.addActionListener(new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		guardarTexto();
	  }
	});

	cifrarButton.addActionListener(new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		cifrarTexto();
	  }
	});

	descifrarButton.addActionListener(new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		descifrarTexto();
	  }
	});
  }

  private void guardarTexto() {
	try (PrintWriter out = new PrintWriter("original.txt")) {
	  String text = textArea.getText();
	  if (VALID_PATTERN.matcher(text).matches()) {
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
	  String text = new String(Files.readAllBytes(Paths.get("original.txt"))).trim();
	  if (VALID_PATTERN.matcher(text).matches()) {
		String encrypted = cifrar(text);
		try (PrintWriter out = new PrintWriter("cifrado.txt")) {
		  out.println(encrypted);
		  JOptionPane.showMessageDialog(this, "Texto cifrado guardado en cifrado.txt");
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
	  String text = new String(Files.readAllBytes(Paths.get("cifrado.txt"))).trim();
	  if (VALID_PATTERN.matcher(text).matches()) {
		String decrypted = descifrar(text);
		try (PrintWriter out = new PrintWriter("descifrado.txt")) {
		  out.println(decrypted);
		  JOptionPane.showMessageDialog(this, "Texto descifrado guardado en descifrado.txt");
		}
	  } else {
		JOptionPane.showMessageDialog(this, "El texto en cifrado.txt no cumple con los requisitos del alfabeto.");
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }

  private String cifrar(String text) {
	StringBuilder result = new StringBuilder();
	for (char c : text.toCharArray()) {
	  int index = ALFABETO.indexOf(c);
	  if (index != -1) {
		int newIndex = (index + 5) % ALFABETO.length();
		result.append(ALFABETO.charAt(newIndex));
	  } else {
		result.append(c);
	  }
	}
	return result.toString();
  }

  private String descifrar(String text) {
	StringBuilder result = new StringBuilder();
	for (char c : text.toCharArray()) {
	  int index = ALFABETO.indexOf(c);
	  if (index != -1) {
		int newIndex = (index - 5 + ALFABETO.length()) % ALFABETO.length();
		result.append(ALFABETO.charAt(newIndex));
	  } else {
		result.append(c);
	  }
	}
	return result.toString();
  }

  public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> {
	  Parcial gui = new Parcial();
	  gui.setVisible(true);
	});
  }
}
