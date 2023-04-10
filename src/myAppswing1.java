import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/** Class myAppswing1 represents a simple version of calculator. It performs basic arithmetic operations
* such as addition, subtraction, multiplication, division and exponentiation.
* @author Krzysztof Chmielarski
* @version 1.5
 */

public class myAppswing1 {
    private JPanel mainPanel;
    private JTextField textResult;
    private JTextField textNumber1;
    private JLabel label1;
    private JTextField textNumber2;
    private JLabel label2;
    private JLabel labelResult;
    public JButton buttonAdd;
    private JButton buttonReset;
    private JButton buttonSubtract;
    private JButton ButtonDivide;
    private JButton buttonMultiply;
    private JButton buttonRoot;
    private JLabel appTitle;


    public myAppswing1() {
        /**
        * invoked when an action occurs.
        * @param e the event to be processed
        * @return addition result
        * @throws NumberFormatException on user input
        */
        buttonAdd.addActionListener(new ActionListener() {

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
        /**
         * invoked when an action occurs.
         * @param e the event to be processed
         * @return subtraction result
         * @throws NumberFormatException on user input
         */
        buttonSubtract.addActionListener(new ActionListener() {

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
            /**
            * invoked when an action occurs.
            * @param e the event to be processed
            * @return empty input fields
            */
            buttonReset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textNumber1.setText("");
                textNumber2.setText("");
                textResult.setText("");
            }
        });
            /**
            * invoked when an action occurs.
            * @param e the event to be processed
            * @return division result
            * @throws NumberFormatException on user input
            */
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
        /**
        * invoked when an action occurs.
        * @param e the event to be processed
        * @return multiplication result
        * @throws NumberFormatException on user input
        */
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
        /**
        * invoked when an action occurs.
        * @param e the event to be processed
        * @return exponentiation result
        * @throws NumberFormatException on user input
        */
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

    /**
     * Main function of class myAppswing1
     * @param args parameters of JFrame
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("myAppswing1");
        frame.setContentPane(new myAppswing1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450, 300);
    }
}
