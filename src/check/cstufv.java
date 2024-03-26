package check;

import javax.swing.*;
import java.awt.*;

public class cstufv extends JDialog {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    JLabel a1=new JLabel("专业");
    JTextField a2=new JTextField();
    JButton ad=new JButton("查找");
    JButton s=new JButton("重置");
    cstufh l;
    public cstufv(cstuv cstuv){
        super(cstuv,"学生专业查找",true);
        a1.setPreferredSize(new Dimension(80,30));
        jp.add(a1);
        a2.setPreferredSize(new Dimension(200,30));
        jp.add(a2);
        jp.add(ad);
        jp.add(s);
        l=new cstufh(this);
        ad.addActionListener(l);
        s.addActionListener(l);
        Container con=getContentPane();
        con.add(jp);
        setSize(350,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public JTextField getA2() {
        return a2;
    }
}
