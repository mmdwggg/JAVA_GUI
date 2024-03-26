package update;

import ADD.adhandle;

import javax.swing.*;
import java.awt.*;

public class upview extends JFrame {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton a=new JButton("修改学生");
    JButton b=new JButton("修改课程");
    JButton c=new JButton("修改成绩");
    JButton d=new JButton("返回");
    uphandle l;
    JLabel hy=new JLabel("欢迎使用修改功能",JLabel.CENTER);
    public upview(){
        super("学生信息与成绩管理系统");
        Container con=getContentPane();
        setSize(1500,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setVisible(true);
        hy.setFont(new Font("华文行楷",Font.PLAIN,30));
        con.add(hy,BorderLayout.CENTER);
        con.add(jp,BorderLayout.NORTH);
        l=new uphandle(this);
        jp.add(a);
        a.addActionListener(l);
        jp.add(b);
        b.addActionListener(l);
        jp.add(c);
        c.addActionListener(l);
        jp.add(d);
        d.addActionListener(l);
    }
}
