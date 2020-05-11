package intermediate;

import java.awt.*;

import javax.swing.*;

public class JApp extends JApplet {

    private double sum;

    @Override
    public void init() {

        String fn = JOptionPane.showInputDialog("Enter first  number");
        String sn = JOptionPane.showInputDialog("Enter second number");
        String tn = JOptionPane.showInputDialog("Enter third  number");
        String ffn = JOptionPane.showInputDialog("Enter fourth number");

        double num1 = Double.parseDouble(fn);
        double num2 = Double.parseDouble(sn);
        double num3 = Double.parseDouble(tn);
        double num4 = Double.parseDouble(ffn);

        sum = num1 + num2 + num3 + num4;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("The Sum is : " + sum, 25, 30);
    }

}
