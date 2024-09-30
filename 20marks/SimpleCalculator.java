// Write a java program that works as a simple calculator. Use a grid
// layout to arrange buttons for the digits and for the +, -, *, % operations.
// Add a text field to display the result.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SimpleCalculator {
private JFrame frame;
private JTextField textField;
private String operator = "";
private double num1, num2, result;
public SimpleCalculator() {
frame = new JFrame("Simple Calculator");
textField = new JTextField();
textField.setEditable(false);
JButton[] numberButtons = new JButton[10];
for (int i = 0; i < 10; i++) {
numberButtons[i] = new JButton(String.valueOf(i));
numberButtons[i].addActionListener(new
NumberButtonListener());
}
 JButton addButton = new JButton("+");
JButton subButton = new JButton("-");
JButton mulButton = new JButton("*");
JButton divButton = new JButton("%");
JButton eqButton = new JButton("=");
JButton clrButton = new JButton("C");
addButton.addActionListener(new OperatorButtonListener());
subButton.addActionListener(new OperatorButtonListener());
mulButton.addActionListener(new OperatorButtonListener());
divButton.addActionListener(new OperatorButtonListener());
eqButton.addActionListener(new EqualButtonListener());
clrButton.addActionListener(new ClearButtonListener());
frame.setLayout(new BorderLayout());
frame.add(textField, BorderLayout.NORTH);
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(4, 4));
panel.add(numberButtons[1]);
panel.add(numberButtons[2]);
panel.add(numberButtons[3]);
panel.add(addButton);
panel.add(numberButtons[4]);
panel.add(numberButtons[5]);
panel.add(numberButtons[6]);
panel.add(subButton);
panel.add(numberButtons[7]);
panel.add(numberButtons[8]);
panel.add(numberButtons[9]);
panel.add(mulButton);
panel.add(clrButton);
panel.add(numberButtons[0]);
panel.add(eqButton);
panel.add(divButton);
frame.add(panel);
frame.setSize(300, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
private class NumberButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
JButton source = (JButton) e.getSource();
textField.setText(textField.getText() + source.getText());
}
}
private class OperatorButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
JButton source = (JButton) e.getSource();
operator = source.getText();
num1 = Double.parseDouble(textField.getText());
textField.setText("");
}
}
private class EqualButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
num2 = Double.parseDouble(textField.getText());
switch (operator) {
case "+":
result = num1 + num2;
break;
case "-":
result = num1 - num2;
break;
case "*":
result = num1 * num2;
break;
case "%":
result = num1 % num2;
break;
}
textField.setText(String.valueOf(result));
}
}
private class ClearButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
textField.setText("");
operator = "";
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(SimpleCalculator::new);
}
}