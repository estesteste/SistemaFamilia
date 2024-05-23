package sistema.familiar;

import java.util.Objects;
import java.util.Scanner;

import sistema.familiar.familia.Familia;



public class SistemaFamilia {
    public static void main(String[] args) {

        int x = 0;

        while(x == 0) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = scan.nextLine();
        System.out.println("Apellido:");
        String apellido = scan.nextLine();
        System.out.println("Edad:");
        int Edad = scan.nextInt();

        Familia f = new Familia();

        f.agregarPersona(nombre, apellido, Edad);
        f.listarFamilia();

        }
    }
}
