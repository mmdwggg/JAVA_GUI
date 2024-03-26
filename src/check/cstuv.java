package check;

import javax.swing.*;
import java.awt.*;

public class cstuv extends JFrame{
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton a=new JButton("按学号查找");
    JButton b=new JButton("按姓名查找");
    JButton c=new JButton("按性别查找");
    JButton d=new JButton("按专业查找");
    JButton e=new JButton("返回");
    cstuh l;
    JLabel hy=new JLabel("查找学生功能",JLabel.CENTER);
    public cstuv(){
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
        l=new cstuh(this);
        jp.add(a);
        a.addActionListener(l);
        jp.add(b);
        b.addActionListener(l);
        jp.add(c);
        c.addActionListener(l);
        jp.add(d);
        d.addActionListener(l);
        jp.add(e);
        e.addActionListener(l);
    }
}
