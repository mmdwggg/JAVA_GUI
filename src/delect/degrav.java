package delect;

import javax.swing.*;
import java.awt.*;

public class degrav extends JDialog {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    JLabel a1=new JLabel("课程号");
    JTextField a2=new JTextField();
    JLabel b1=new JLabel("学号");
    JTextField b2=new JTextField();
    JButton ad=new JButton("删除");
    JButton s=new JButton("重置");
    degrah l;
    public degrav(delectview delectview){
        super(delectview,"删除成绩",true);
        a1.setPreferredSize(new Dimension(80,30));
        jp.add(a1);
        a2.setPreferredSize(new Dimension(200,30));
        jp.add(a2);
        b1.setPreferredSize(new Dimension(80,30));
        jp.add(b1);
        b2.setPreferredSize(new Dimension(200,30));
        jp.add(b2);
        jp.add(ad);
        jp.add(s);
        l=new degrah(this);
        ad.addActionListener(l);
        s.addActionListener(l);
        Container con=getContentPane();
        con.add(jp);
        setSize(350,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public JTextField getA2() {
        return a2;
    }
    public JTextField getB2() {
        return b2;
    }
}
