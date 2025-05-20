package ABSTRACTA;

import ABSTRACTA.Elementos.ElementoForm;
import ABSTRACTA.Elementos.InputForm;
import ABSTRACTA.Elementos.Select.Opcion;
import ABSTRACTA.Elementos.SelectForm;
import ABSTRACTA.Elementos.TextareaForm;
import ABSTRACTA.Validador.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm pass = new InputForm("clave", "password");
        pass.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencias = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNullValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "Javascript"))
        .addOpcion(new Opcion("4", "Typescript").setSelected(true))
        .addOpcion(new Opcion("5", "PHP"));

        //Clase anonimas
        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };

        saludar.setValor("Hola que tal!, este campo esta inhabilitado");
        username.setValor("LuisDa.Escorcia");
        pass.setValor("123456");
        email.setValor("example@gmail.com");
        edad.setValor("26");
        experiencias.setValor("Con mas de 2 años, trabajando con el lenguaje de programacion");
        //java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username, pass, email, edad, edad, experiencias, lenguaje, saludar);
        /*elementos.add(username);
        elementos.add(pass);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencias);
        elementos.add(lenguaje);*/

        /*for (ElementoForm el : elementos) {
            System.out.println(el.dibujarHtml());
            System.out.println("<br>");
        }*/

        //expresion lambda
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        //validamos los datos
        elementos.forEach(e -> {
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
