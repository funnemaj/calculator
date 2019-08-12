import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel Calculator;
    private JTextField textInput;
    private JButton bOne;
    private JButton bTwo;
    private JButton bThree;
    private JButton bFour;
    private JButton bFive;
    private JButton bSix;
    private JButton bSeven;
    private JButton bEight;
    private JButton bNine;
    private JButton bZero;
    private JButton bDouble;
    private JButton bCancel;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bUmnojenie;
    private JButton bDelenie;
    private JButton bEquals;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textInput.getText());
        textInput.setText("");
    }

    public NewCalculator() {
        bOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bOneText = textInput.getText() + bOne.getText();
                textInput.setText(bOneText);
            }
        });
        bTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bTwoText = textInput.getText() + bTwo.getText();
                textInput.setText(bTwoText);
            }
        });
        bThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bThreeText = textInput.getText() + bThree.getText();
                textInput.setText(bThreeText);
            }
        });
        bFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bFourText = textInput.getText() + bFour.getText();
                textInput.setText(bFourText);
            }
        });
        bFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bFiveText = textInput.getText() + bFive.getText();
                textInput.setText(bFiveText);
            }
        });
        bSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bSixText = textInput.getText() + bSix.getText();
                textInput.setText(bSixText);
            }
        });
        bSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bSevenText = textInput.getText() + bSeven.getText();
                textInput.setText(bSevenText);
            }
        });
        bEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bEightText = textInput.getText() + bEight.getText();
                textInput.setText(bEightText);
            }
        });
        bNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bNineText = textInput.getText() + bNine.getText();
                textInput.setText(bNineText);
            }
        });
        bZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bZeroText = textInput.getText() + bZero.getText();
                textInput.setText(bZeroText);
            }
        });
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = bPlus.getText();
                getOperator(button_text);
            }
        });
        bEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textInput.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textInput.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textInput.getText());
                    case '/':
                        total2 = total1 / Double.parseDouble(textInput.getText());
                }
                textInput.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        bCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textInput.setText("");
            }
        });
        bDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textInput.getText().equals("")){
                    textInput.setText("0.");
                }
                else if (textInput.getText().contains(".")) {
                    bDouble.setEnabled(false);
                }
                else {
                    String bDoubleText = textInput.getText() + bDouble.getText();
                    textInput.setText(bDoubleText);
                }
                bDouble.setEnabled(true);
            }
        });
        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = bMinus.getText();
                getOperator(button_text);
            }
        });
        bDelenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = bDelenie.getText();
                getOperator(button_text);
            }
        });
        bUmnojenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = bUmnojenie.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NewCalculator");
        frame.setContentPane(new NewCalculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

