 public class perro extends Mascota{
    private String raza;
    public perro (String raza,String nombre, int edad){
        super (nombre, edad);
        this.raza = raza ;
    }
    public void hacerSonido (){
        System.out.print("Guau");
    }
    public void mostarinfo (){
        super.mostrarinfo();
        System.out.print("Raza:"+raza);
    }




}
