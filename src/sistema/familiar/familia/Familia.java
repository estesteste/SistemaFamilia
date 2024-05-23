package sistema.familiar.familia;

import sistema.familiar.persona.Persona;

public class Familia {

    private Persona familia[] = new Persona[20];
    private int lugar = 0;

    public void agregarPersona(String nombre, String apellido, int edad) {

        Persona nuevaPersona = new Persona(nombre,apellido,edad);

        familia[lugar] = nuevaPersona;
        lugar = lugar + 1;

        if (lugar >=19) {
            System.out.print("No hay espacio en la Familia.");
            lugar = 0;
        }
    }

    public void listarFamilia() {
        for (int i = 0; i < familia.length; i++) {

            if (familia[i] != null) {
                System.out.println("-" + i + " " + familia[i].getNombre() + "," + familia[i].getApellido() + "," + familia[i].getEdad());
                System.out.println(lugar);
            } else {
                break;
            }


        }
    }


}
