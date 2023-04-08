import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/** Class myAppswing1 represents a simple version of calculator. It performs basic arithmetic operations
* such as addition, subtraction, multiplication, division and exponentiation.
* @author Krzysztof Chmielarski
* @version 1.3
 * */



public class myAppswing1 {
    private JPanel mainPanel;
    private JTextField textResult;
    private JTextField textNumber1;
    private JLabel labell1;
    private JTextField textNumber2;
    private JLabel labell2;
    private JLabel labelResult;
    public JButton buttomadd;
    private JButton buttonReset;
    private JButton buttonSubsract;
    private JButton ButtonDivide;
    private JButton buttonMultiply;
    private JButton buttonRoot;
    private JLabel appTitle;
    private JButton buttonadd;

    public myAppswing1() {
        /**
         * buttomadd.addActionListener method allows the user to add two numbers.
         * @param addActionListener
         * @return addition result
         * @throws NumberFormatException on user input
         * @see NumberFormatException
         * */


        buttomadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float wynik = Float.parseFloat(textNumber1.getText()) + Float.parseFloat(textNumber2.getText());
                    textResult.setText(Float.toString(wynik));
                     }
                catch (NumberFormatException ex) {
                    textResult.setText("Błędny format liczby");
                     }

            }
        });
        /** buttonSubstract.addActionListener method allows the user to subtract two numbers.
         * @return subtraction result
         * @param  ActionListener.textNumber1 to be represented by the float
         * @throws NumberFormatException on user input
         * @see NumberFormatException
         * */
        buttonSubsract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float wynik = Float.parseFloat(textNumber1.getText()) - Float.parseFloat(textNumber2.getText());
                    textResult.setText(Float.toString(wynik));
                }
               catch (NumberFormatException y){
                   textResult.setText("Błędny format liczby");
               }


            }
        });
        /** buttonReset.addActionListener method allows the user to clear all input fields in application.
         * @return empty input fields
         * @param no parameters
         * */
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNumber1.setText("");
                textNumber2.setText("");
                textResult.setText("");
            }
        });

        /** ButtonDivide.addActionListener method allows the user to divide two numbers.
         * @return division result
         * @param user number to be represented by the float
         * @throws NumberFormatException on user input
         * @see NumberFormatException
         * */

        ButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
               Float wynik = Float.parseFloat(textNumber1.getText()) / Float.parseFloat(textNumber2.getText());
               textResult.setText(Float.toString(wynik));
            }
                catch (NumberFormatException t){
                    textResult.setText("Błędny format liczby");
                }
            }
        });
        /** buttonMultiply.addActionListener method allows the user to multiply two numbers.
         * @return multiplication result
         * @param user number to be represented by the float
         * @throws NumberFormatException on user input
         * @see NumberFormatException
         * */


        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                float wynik = Float.parseFloat(textNumber1.getText()) * Float.parseFloat(textNumber2.getText());
                textResult.setText(Float.toString(wynik));
            }
                catch (NumberFormatException s) {
                    textResult.setText("Błędny format liczby");
                }
            }
        });

        /** buttonRoot.addActionListener method allows the user to power the numbers.
         * @return exponentiation result
         * @param user number to be represented by the double
         * @throws NumberFormatException on user input
         * @see NumberFormatException
         * */


        buttonRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double x = Double.parseDouble(textNumber1.getText());
                double y = Double.parseDouble(textNumber2.getText());
                double wynik = Math.pow(x,y);
                textResult.setText(Double.toString(wynik));
            }
                catch (NumberFormatException w) {
                    textResult.setText("Błędny format liczby");
                }

                 }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("myAppswing1");
        frame.setContentPane(new myAppswing1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450, 300);
    }
}
