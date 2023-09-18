public class anioBisiesto {
    public static boolean anioBisiesto (int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            bisiesto = true;
        }
        return bisiesto;
    }

    public static void main(String[] args) {
        int anio = 1993;
        if (anioBisiesto(anio)) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }
}
