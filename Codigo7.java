package ejerciciocodigo7;
/*
 * Este codigo permite al usuario ingresar el nombre de un país y recibir su capital. El programa continúa ejecutándose hasta que el usuario escriba "salir" y si no se sabe la respuesta guarda lo que le pone el usuario para después tener esa respuesta
 */
//importo las bibliotecas
import java.util.HashMap;
import java.util.Scanner;
public class Codigo7 {//le quite el acento
	public static void main(String[] args) { //se agrega el main

    Scanner s = new Scanner(System.in);//Agrego el system.in

    HashMap<String, String> capitales = new HashMap<>(); //cambio los tipos de datos a string

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador","San Salvador"); //se pone capital para cumplir con HashMap
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = "";//String bien escrito

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      c = s.nextLine();//out en el print y nextLine
      
      if (!c.equals("salir")) {//equals
        if (capitales.containsValue(c)) {//capitales
          System.out.print("La capital de " + c);//out
          System.out.println(" es " + capitales.get(c));//get
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir"));//while y el )
  }

}