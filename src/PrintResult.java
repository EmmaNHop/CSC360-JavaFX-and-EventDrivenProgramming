public class PrintResult {

//Parse textfield and catch if there is exception
    try {
        a = Double.parseDouble(tfA.getText());
    }
    catch (NumberFormatException e) {
        tfA.setText("0");
        a = 0;
    }
    try {
        b = Double.parseDouble(tfB.getText());
    }
    catch (NumberFormatException e) {
        tfB.setText("0");
        b = 0;
    }
    try {
        c = Double.parseDouble(tfC.getText());
    }
    catch (NumberFormatException e) {
        tfC.setText("0");
        c = 0;
    }
//Deal with all cases of a,b,c and print result
    if (a == 0) {
        if (b == 0 && c == 0) {
            result.setText("All x");
        } else if (b == 0 && c != 0) {
            result.setText("No x");
        } else if (b != 0 && c == 0) {
            result.setText("0.0");
        } else {
            double x = -c / b;
            result.setText(String.valueOf(x));
        }
    } else {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            double x2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
            String resultString = String.valueOf(x1) + ", " +
                    String.valueOf(x2);
            result.setText(resultString);
        } else if (discriminant < 0) {
            result.setText("No x");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            if (x == -0.0)
                result.setText("0.0");
            else
                result.setText(String.valueOf(x));
        }
    }
}
