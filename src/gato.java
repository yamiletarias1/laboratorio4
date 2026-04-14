public class gato extends Mascota{

    private boolean esdeInterior;
    public gato (boolean esdeInterior, String nombre, int edad){
        super (nombre, edad);
        this.esdeInterior = esdeInterior ;
    }
    public void hacerSonido (){
        System.out.print("Miau");
    }
    public void mostarinfo (){
        super.mostrarinfo();
        System.out.print("Es de Interior:"+esdeInterior);
    }

}
