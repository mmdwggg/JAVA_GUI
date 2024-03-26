package check;

import javax.swing.*;
import java.awt.*;

public class cgragv extends JDialog {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    JLabel a1=new JLabel("最低成绩");
    JTextField a2=new JTextField();
    JLabel b1=new JLabel("最高成绩");
    JTextField b2=new JTextField();
    JButton ad=new JButton("查找");
    JButton s=new JButton("重置");
    cgragh l;
    public cgragv(cgrav cgrav){
        super(cgrav,"成绩查找",true);
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
        l=new cgragh(this);
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
