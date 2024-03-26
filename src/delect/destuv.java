package delect;

import ADD.adstuh;
import ADD.adview;

import javax.swing.*;
import java.awt.*;

public class destuv extends JDialog {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    JLabel a1=new JLabel("学号");
    JTextField a2=new JTextField();
    JButton ad=new JButton("删除");
    JButton s=new JButton("重置");
    destuh l;
    public destuv(delectview delectview){
        super(delectview,"删除学生",true);
        a1.setPreferredSize(new Dimension(80,30));
        jp.add(a1);
        a2.setPreferredSize(new Dimension(200,30));
        jp.add(a2);
        jp.add(ad);
        jp.add(s);
        l=new destuh(this);
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
