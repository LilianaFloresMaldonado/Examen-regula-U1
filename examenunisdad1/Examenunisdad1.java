package examenunisdad1;

import java.util.ArrayList;
import java.util.Scanner;


public class Examenunisdad1 {

    
    public static void main(String[] args) {
     ArrayList<String> lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        int tamano;
        boolean parar = false;
        System.out.println("Longitud del arreglo");
        tamano= leer.nextInt();
        String arreglo[] = new String[tamano];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa el dato: ");
            arreglo[i] = leer.next();
            lista.add(arreglo[i]);
        }
        System.out.println("¿desea agregar mas datos? (SI/NO)");
        respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("SI")) {
            do {
                parar = false;
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Dame el dato: ");
                    arreglo[i] = leer.next();
                    lista.add(arreglo[i]);
                    System.out.println("¿desea agregar mas datos? (SI/NO)");
                    respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("SI")) {
                        parar = true;
                    } else {
                        parar = false;
                        break;
                    }
                }
            } while (parar == true);
        }
        System.out.println(lista.toString());
    }
}
