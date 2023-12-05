class NodoListaDoble {
    public String nombre, tel;
    public int edad;
    public NodoListaDoble prev, next;

    public NodoListaDoble(String nombre, String tel, int edad) {
        this(nombre, tel, edad, null, null);
    }

    public NodoListaDoble(String nombre1, String tel1, int edad1, NodoListaDoble n, NodoListaDoble p) {
        nombre = nombre1;
        tel = tel1;
        edad = edad1;
        next = n;
        prev = p;
    }
}

