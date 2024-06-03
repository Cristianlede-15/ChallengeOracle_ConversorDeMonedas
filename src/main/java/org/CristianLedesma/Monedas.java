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

    public void datos(int cantidad){
        System.out.println("1[" + valorPartida + "] es igual a " + conversion + "[" + valorllegada + "]");
        System.out.println("La conversión de " + cantidad + "[" + valorPartida + "] a [" + valorllegada + "] es de " + resultado + "[" + valorllegada + "]");
    }
}
