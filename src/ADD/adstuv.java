package ADD;

import javax.swing.*;
import java.awt.*;

public class adstuv extends JDialog {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    JLabel a1=new JLabel("学号");
    JTextField a2=new JTextField();
    JLabel b1=new JLabel("姓名");
    JTextField b2=new JTextField();
    JLabel c1=new JLabel("性别");
    JTextField c2=new JTextField();
    JLabel d1=new JLabel("专业");
    JTextField d2=new JTextField();
    JLabel e1=new JLabel("电话");
    JTextField e2=new JTextField();
    JButton ad=new JButton("添加");
    JButton s=new JButton("重置");
    adstuh l;
    public adstuv(adview adview){
        super(adview,"添加学生",true);
        a1.setPreferredSize(new Dimension(80,30));
        jp.add(a1);
        a2.setPreferredSize(new Dimension(200,30));
        jp.add(a2);
        b1.setPreferredSize(new Dimension(80,30));
        jp.add(b1);
        b2.setPreferredSize(new Dimension(200,30));
        jp.add(b2);
        c1.setPreferredSize(new Dimension(80,30));
        jp.add(c1);
        c2.setPreferredSize(new Dimension(200,30));
        jp.add(c2);
        d1.setPreferredSize(new Dimension(80,30));
        jp.add(d1);
        d2.setPreferredSize(new Dimension(200,30));
        jp.add(d2);
        e1.setPreferredSize(new Dimension(80,30));
        jp.add(e1);
        e2.setPreferredSize(new Dimension(200,30));
        jp.add(e2);
        jp.add(ad);
        jp.add(s);
        l=new adstuh(this);
        ad.addActionListener(l);
        s.addActionListener(l);
        Container con=getContentPane();
        con.add(jp);
        setSize(350,400);
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


    public JTextField getC2() {
        return c2;
    }


    public JTextField getD2() {
        return d2;
    }


    public JTextField getE2() {
        return e2;
    }

}
