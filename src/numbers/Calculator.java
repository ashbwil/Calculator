package numbers;

import javax.swing.*;

public class Calculator {
    private JPanel CalculatorView;
    private JButton divideButton;
    private JButton enterButton;
    private JButton signButton;
    private JButton percentButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton clearButton;
    private JButton multiplyButton;
    private JButton sixButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton subtractButton;
    private JButton addButton;
    private JButton zeroButton;
    private JButton decimalButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().CalculatorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
