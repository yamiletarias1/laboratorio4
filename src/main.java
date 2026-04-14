public class main {
    public static void main (String[] args) {


    perro perro1 = new perro("pudul", "pepito", 6);
    gato gato1 = new gato(true, "juanito", 3);

     System.out.println("PERRO");
        perro1.mostrarinfo();
        perro1.hacerSonido();

        System.out.println("  GATO ");
        gato1.mostrarinfo();
        gato1.hacerSonido() ;
}

}
