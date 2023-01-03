
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class myJFrame8 extends JFrame implements ListSelectionListener {
    JLabel jla1;
    JList<String> jl1;
    JTextArea jta1;
    String city[] = { "台北", "桃園", "台中", "新竹", "台南", "高雄", "台東", "花蓮" };
    String scenic[] = { "台北101", "龍潭大池", "審計新村", "內灣老街", "孔廟", "漢神巨蛋", "伯朗大道", "翡翠谷" };

    public myJFrame8() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("景點");
        setBounds(0, 0, 300, 300);
        setVisible(true);
        setLayout(null);
        setResizable(false);

        jla1 = new JLabel("找景點：");
        add(jla1);
        jla1.setBounds(40, 40, 100, 20);

        jl1 = new JList<String>(city);
        jl1.addListSelectionListener(this);
        JScrollPane jsp = new JScrollPane(jl1);
        add(jsp);
        jsp.setBounds(120, 20, 100, 120);

        jta1 = new JTextArea("地名");
        JScrollPane jsp2 = new JScrollPane(jta1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp2.setBounds(40, 150, 200, 100);
        add(jsp2);
    }

    public void valueChanged(ListSelectionEvent e) {
        String text = "";
        for (int i = 0; i < city.length; i++) {
            if (jl1.isSelectedIndex(i)) {
                text = text + city[i] + "景點：" + scenic[i] + "\n";
            }
        }
        jta1.setText(text);

    }

}

public class homework2 {
    public static void main(String[] args) {
        myJFrame8 f8 = new myJFrame8();
    }
}