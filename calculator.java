import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

class jframe extends JFrame {

    jframe() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("calculator");
        setBounds(100, 100, 450, 300);

        Container container = getContentPane();

        JPanel jPanel = new JPanel();
        JPanel jPanel2 = new JPanel();

        JTextField txt1 = new JTextField(30);
        jPanel.add(txt1, BorderLayout.CENTER);

        jPanel2.setLayout(new GridLayout(5, 4, 5, 10));

        JButton btn1 = new JButton("C");
        jPanel2.add(btn1);
        JButton btn2 = new JButton("AC");
        jPanel2.add(btn2);
        JButton btn3 = new JButton("back");
        jPanel2.add(btn3);
        JButton btn4 = new JButton("/");
        jPanel2.add(btn4);
        JButton btn5 = new JButton("7");
        jPanel2.add(btn5);
        JButton btn6 = new JButton("8");
        jPanel2.add(btn6);
        JButton btn7 = new JButton("9");
        jPanel2.add(btn7);
        JButton btn8 = new JButton("*");
        jPanel2.add(btn8);
        JButton btn9 = new JButton("4");
        jPanel2.add(btn9);
        JButton btn10 = new JButton("5");
        jPanel2.add(btn10);
        JButton btn11 = new JButton("6");
        jPanel2.add(btn11);
        JButton btn12 = new JButton("-");
        jPanel2.add(btn12);
        JButton btn13 = new JButton("1");
        jPanel2.add(btn13);
        JButton btn14 = new JButton("2");
        jPanel2.add(btn14);
        JButton btn15 = new JButton("3");
        jPanel2.add(btn15);
        JButton btn16 = new JButton("+");
        jPanel2.add(btn16);
        JButton btn17 = new JButton("+/-");
        jPanel2.add(btn17);
        JButton btn18 = new JButton("0");
        jPanel2.add(btn18);
        JButton btn19 = new JButton(".");
        jPanel2.add(btn19);
        JButton btn20 = new JButton("=");
        jPanel2.add(btn20);

        container.setLayout(new GridLayout(2, 1));
        container.add(jPanel);
        container.add(jPanel2);
    }
}

public class test2 {
    public static void main(String[] args) {
        jframe fi = new jframe();
    }
}
