package org.CristianLedesma;

import com.google.gson.annotations.SerializedName;

public class Monedas {
    @SerializedName("base_code")
    public String valorPartida;
    @SerializedName("target_code")
    public String valorllegada;
    @SerializedName("conversion_rate")
    public double conversion;
    @SerializedName("conversion_result")
    public double resultado;

    public void formatearDatos(int cantidad){
        System.out.println("El resultado de la conversacion es: " + resultado);
    }
}
