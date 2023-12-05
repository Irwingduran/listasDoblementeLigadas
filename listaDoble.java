import javax.swing.*;

class listaDoble {
    private NodoListaDoble head, tail;

    public listaDoble() {
        head = tail = null;
    }

    public boolean isEmpety() {
        return head == null;
    }

    public void addtotail(String nombre, String tel, int edad) {
        if (!isEmpety()) {
            tail = new NodoListaDoble(nombre, tel, edad, null, tail);
            tail.prev.next = tail;
        } else {
            head = tail = new NodoListaDoble(nombre, tel, edad);
        }
    }

    public void imprimirdoble() {
        NodoListaDoble p = head;
        int cont = 0;
        String output = "No. progr \t Nombre \t Telefono \t edad \n";
        if (!isEmpety()) {
            for (; p != null; p = p.next) {
                cont++;
                output += cont + "\t" + p.nombre + "\t" + p.tel + "\t" + p.edad + "\n";
            }
            JTextArea outputArea = new JTextArea();
            outputArea.setText(output);
            JOptionPane.showMessageDialog(null, outputArea, "Valores de la lista ligada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("lista vacia");
        }
    }

    // Método para eliminar un nodo por nombre
    public void eliminar(String nombre) {
        NodoListaDoble current = head;
        while (current != null) {
            if (current.nombre.equals(nombre)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    // Se está eliminando el primer nodo
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    // Se está eliminando el último nodo
                    tail = current.prev;
                }

                JOptionPane.showMessageDialog(null, "Nodo con nombre '" + nombre + "' eliminado correctamente");
                return;
            }
            current = current.next;
        }

        JOptionPane.showMessageDialog(null, "Nodo con nombre '" + nombre + "' no encontrado");
    }

    // Método para recorrer la lista hacia atrás
    public void recorrerHaciaAtras() {
        NodoListaDoble current = tail;
        int cont = 0;
        String output = "No. progr \t Nombre \t Telefono \t edad \n";
        while (current != null) {
            cont++;
            output += cont + "\t" + current.nombre + "\t" + current.tel + "\t" + current.edad + "\n";
            current = current.prev;
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Valores de la lista ligada (hacia atrás)", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para buscar un elemento por nombre
    public void buscar(String nombre) {
        NodoListaDoble current = head;
        while (current != null) {
            if (current.nombre.equals(nombre)) {
                JOptionPane.showMessageDialog(null, "Nodo con nombre '" + nombre + "' encontrado:\n" +
                        "Nombre: " + current.nombre + "\nTeléfono: " + current.tel + "\nEdad: " + current.edad);
                return;
            }
            current = current.next;
        }

        JOptionPane.showMessageDialog(null, "Nodo con nombre '" + nombre + "' no encontrado");
    }
}
