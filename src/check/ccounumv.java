package check;

import javax.swing.*;
import java.awt.*;

public class ccounumv extends JDialog {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    JLabel a1=new JLabel("课程号");
    JTextField a2=new JTextField();
    JButton ad=new JButton("查找");
    JButton s=new JButton("重置");
    ccounumh l;
    public ccounumv(ccouv ccouv){
        super(ccouv,"课程课程号查找",true);
        a1.setPreferredSize(new Dimension(80,30));
        jp.add(a1);
        a2.setPreferredSize(new Dimension(200,30));
        jp.add(a2);
        jp.add(ad);
        jp.add(s);
        l=new ccounumh(this);
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
