package sistema.familiar;

import java.util.Scanner;

import sistema.familiar.familia.Familia;

public class SistemaFamilia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String nombre;
            String apellido;
            int edad;

            scan.nextLine();

            System.out.println("Nombre:");
            nombre = scan.nextLine();
            System.out.println("Apellido:");
            apellido = scan.nextLine();
            System.out.println("Edad:");
            edad = scan.nextInt();

            Familia f = new Familia();

            f.agregarPersona(nombre, apellido, edad);
            // f.eliminarPersona(0);
            f.listarFamilia();


        }
    }
}
