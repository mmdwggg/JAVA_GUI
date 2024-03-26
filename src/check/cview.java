package check;

import visit.visithandle;

import javax.swing.*;
import java.awt.*;

public class cview extends JFrame {
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton a=new JButton("学生查找");
    JButton b=new JButton("课程查找");
    JButton c=new JButton("成绩查找");
    JButton d=new JButton("返回");
    chandle l;
    JLabel hy=new JLabel("欢迎使用查找功能",JLabel.CENTER);
    public cview(){
        super("学生信息与成绩管理系统");
        Container con=getContentPane();
        setSize(1500,1000);
        setLocationRelativeTo(null);
        hy.setFont(new Font("华文行楷",Font.PLAIN,30));
        con.add(hy,BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setVisible(true);
        con.add(jp);
        l=new chandle(this);
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
