package Familia_Pata;

public class FrascoDulce {
    String sabor;
    int cantidad;
    String FechaEnvase;

    public int consultarCantidad(){
        return this.cantidad;
    }

    public boolean envasarDulce(int cantidad){
        if (this.cantidad + cantidad > 200) {
            this.cantidad = 200;
            return false;
        } else {
            this.cantidad += cantidad;
            return true;
        }
    }

    public int sacarDulce(int cantidadSacar){
        int cantidadSacada = 0;
        if (this.consultarCantidad() >= cantidadSacar) {
            this.cantidad -= cantidadSacar;
            cantidadSacada = cantidadSacar;
            
        } else {
            cantidadSacada = this.cantidad;
            this.cantidad = 0;
            return this.consultarCantidad();
        }
        return cantidadSacada;
    }
    

}
