package examenunisdad1;

import java.util.ArrayList;
import java.util.Scanner;


public class Examenunisdad1 {

    
    public static void main(String[] args) {
          ArrayList<String> lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        int tam;
        boolean agregar = false;
        do {
            agregar = false;
            System.out.println("Longitud del arreglo:");
            tam = leer.nextInt();
            String arreglo[] = new String[tam];
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("" + i + "Ingresa el dato: ");
                arreglo[i] = leer.next();
                lista.add(arreglo[i]);
            }
            System.out.println("¿desea agregar mas elementos? (SI/NO)");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("SI")) {
                agregar = true;
            }
        } while (agregar == true);
        System.out.println(lista.toString());
    }
    }
