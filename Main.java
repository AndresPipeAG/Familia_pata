package Familia_Pata;

public class Main {
    public static void main(String[] args) {
        int cantidad = 250;
        FrascoDulce frasco = new FrascoDulce();

        System.out.println("Cantidad de dulces en el frasco: " + frasco.consultarCantidad());
        boolean envasar = frasco.envasarDulce(cantidad);
        if(envasar){
            System.out.println("Se ha envasado " + cantidad + "gr de dulce.");
            
        } else {
            int sobrante= cantidad - (200 - frasco.consultarCantidad());
            System.out.println("No se puede envasar " + sobrante + "gr de dulce");
        }
        
        System.out.println("Cantidad de dulces en el frasco: " + frasco.consultarCantidad());
        int cantidadSacar = 150;
        int sacar = frasco.sacarDulce(cantidadSacar);
        
        System.out.println("La cantidad de dulce que se sacó del frasco es: "+ sacar);
        System.out.println("Cantidad de dulces en el frasco: " + frasco.consultarCantidad());

        int nuevaCantidadSacar = 50;
        int sacarOtra = frasco.sacarDulce(nuevaCantidadSacar);
        System.out.println("La cantidad de dulce que se sacó del frasco es: "+ sacarOtra);
        System.out.println("Cantidad de dulces en el frasco: " + frasco.consultarCantidad());
        
    }
}
