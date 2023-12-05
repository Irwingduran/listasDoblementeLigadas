import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        listaDoble p = new listaDoble();
        listaDoble x = p;
        String nombre, i;
        String tel;
        String edad;
        int edad2, i1, j;

        i = JOptionPane.showInputDialog("Escribe el numero de persona ");
        i1 = Integer.parseInt(i);

        for (j = 1; j <= i1; j++) {
            nombre = JOptionPane.showInputDialog("Escribe nombre " + j);
            tel = JOptionPane.showInputDialog("Escribe telefono " + j);
            edad = JOptionPane.showInputDialog("Escibre edad " + j);
            edad2 = Integer.parseInt(edad);
            p.addtotail(nombre, tel, edad2);
        }

        p.imprimirdoble();

        // Ejemplo de cómo usar el método eliminar
        // p.eliminar("Nombre a eliminar");

        // Ejemplo de cómo usar el método recorrerHaciaAtras
        // p.recorrerHaciaAtras();

        // Ejemplo de cómo usar el método buscar
        // p.buscar("Nombre a buscar");

        System.exit(0);
    }
}
