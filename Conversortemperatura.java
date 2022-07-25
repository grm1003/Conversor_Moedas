import javax.swing.JOptionPane;

public class Conversortemperatura {
    public static double convertetemp(double a, String tempin, String tempout) {
        double temp;

        switch(tempin) {
            case "Celsius":
                temp = a;
                break;
            case "Kelvin":
                if (a < 0) throw new IllegalArgumentException(JOptionPane.showInputDialog(null, "Valor inválido"));
                temp = a + 273.5;
                break;
            case "Fahrenheit":
                temp = (a-32)/1.8;
                break;
            default:
                temp = 0;
        }

        double out = converteCelsius(temp, tempout);


        return out;
    }

    public static double converteCelsius(double a, String tempout) {
        double c;

        switch(tempout) {
            case "Celsius":
                c = a;
                break;
            case "Kelvin":
                if (a < 0) throw new IllegalArgumentException(JOptionPane.showInputDialog(null, "Valor inválido"));
                c = a - 273.5;
                break;
            case "Fahrenheit":
                c = (a*1.8)+32;
                break;
            default:
                c = 0;
        }

        return c;
    }


}