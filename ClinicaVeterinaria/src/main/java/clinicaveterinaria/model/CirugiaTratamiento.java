package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class CirugiaTratamiento  implements ITratamiento {
    private final double costo ;
    public CirugiaTratamiento(double costo){
        this.costo=costo;
    }

    @Override
    public double calcularCostoFinal() {
      return costo * 1.25 +80.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "ayuno previo y control postoperatorio";
    }

    @Override
    public String PrepararSala() {
        return "preparar quirofano y anestesia";
    }

    @Override
    public double calcularConImpuesto() {
       return costo * 1.35 ;
    }



}
