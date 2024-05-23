package sistema.familiar.familia;

import sistema.familiar.persona.Persona;

public class Familia {

    private final Persona[] familia = new Persona[20];
    private int lugar = 0;

    public void agregarPersona(String nombre, String apellido, int edad) {
        familia[lugar] = new Persona(nombre, apellido, edad);
        System.out.println("La persona se agregó con éxito.");

        if (lugar >= 20) {
            System.out.println("No hay espacio en la Familia.");
            lugar = 0;
        }
    }

    public void listarFamilia() {
        System.out.println("LISTA DE MIEMBROS");

        int miembrosActuales = 0;

        for (int i = 0; i < familia.length; i++) {
            if (familia[i] != null) {
                miembrosActuales++;
                System.out.println("\t" + (i + 1) + "\t\t" + familia[i].getNombre() + " " + familia[i].getApellido());

            } else System.out.println("\t" + (i + 1) + "\t\t-");
        }

        if (miembrosActuales == 0) System.out.println("No hay personas registradas.");
    }

    public void eliminarPersona(int id) {

        if (id >= 19) {
            familia[id] = null;
        } else {
            familia[id] = familia[id + 1];
        }


    }

}

