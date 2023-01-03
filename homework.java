import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyJFrame4 extends JFrame {
    JPanel contentPanel;
    int imageIndex = 1;

    public MyJFrame4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        setVisible(true);
        setTitle("swing2.homework");

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPanel);
        ImageIcon pic1 = new ImageIcon("E:\\pic\\pocker.jpg");
        pic1.setImage(pic1.getImage().getScaledInstance(400, 400, DO_NOTHING_ON_CLOSE));
        ImageIcon pic2 = new ImageIcon("E:\\pic\\pocker2.jpg");
        pic2.setImage(pic2.getImage().getScaledInstance(400, 400, DO_NOTHING_ON_CLOSE));
        ImageIcon pic3 = new ImageIcon("E:\\pic\\pocker3.jpg");
        pic3.setImage(pic3.getImage().getScaledInstance(400, 400, DO_NOTHING_ON_CLOSE));

        ImageIcon piclist[] = { pic1, pic2, pic3 };
        String picName[] = { "Number 1", "Number 2", "Number 3" };
        JLabel iconName = new JLabel(picName[1], SwingConstants.CENTER);
        contentPanel.add(iconName, BorderLayout.PAGE_START);

        JLabel jb1 = new JLabel(piclist[1]);
        jb1.setBounds(0, 0, 400, 400);
        contentPanel.add(jb1, BorderLayout.CENTER);

        JPanel btn = new JPanel(new GridLayout(1, 2));
        JButton btnleft = new JButton("Previous");
        btnleft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageIndex -= 1;
                if (imageIndex < 0 || imageIndex > 2) {
                    iconName.setText("");
                    jb1.setIcon(null);
                    jb1.setText("No more picture");
                } else {
                    jb1.setText(null);
                    iconName.setText(picName[imageIndex]);
                    jb1.setIcon(piclist[imageIndex]);
                }
            }
        });
        btn.add(btnleft);
        JButton btnnext = new JButton("Next");
        btnnext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageIndex += 1;
                if (imageIndex > 2 || imageIndex < 0) {
                    iconName.setText("");
                    jb1.setIcon(null);
                    jb1.setText("No more picture");
                } else {
                    jb1.setText(null);
                    iconName.setText(picName[imageIndex]);
                    jb1.setIcon(piclist[imageIndex]);
                }
            }
        });
        btn.add(btnnext);
        contentPanel.add(btn, BorderLayout.PAGE_END);

    }

}

public class homework {
    public static void main(String[] args) {
        MyJFrame4 f1 = new MyJFrame4();
    }
}