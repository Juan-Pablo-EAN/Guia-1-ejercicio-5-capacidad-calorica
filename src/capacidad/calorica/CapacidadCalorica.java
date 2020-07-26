package capacidad.calorica;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CapacidadCalorica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.000");
        int m = 0;
        int t = 0;
        double c = (double) 4.179;
        
        System.out.println("Hola! Escribe la masa del agua (m):");
        m = entrada.nextInt();
        System.out.println("Escribe la cantidad de temperatura en °C que deseas aumentarle (t):");
        t = entrada.nextInt();
        System.out.println("El calor especifico del agua es" + " " + c + " " + "J/°C" + " ." + "Por lo tanto, la formula queda de la siguiente manera:");
        System.out.println("q" + " " + "=" + " " + "m" + " " + "*" + " " + "c" + " " + "*" + " " + "t");
        System.out.println("q" + " " + "=" + " " + m + " " + "*" + " " + c + " " + "*" + " " + t);
        double q = (double) m*c*t;
        System.out.println("q" + " " + "=" + " " + dec.format(q) + " " + "J");
        System.out.println("");
        System.out.println("Resultado:");
        System.out.println("Cuando una masa de agua de" + " " + m + " " + "kg/L" + " " + "aumenta en" + " " + t + "°C" + " " + ",la cantitad total de energía será" + " " + dec.format(q) + " " + "J");
    }
    
}
