package visit;

import visit.visithandle;

import javax.swing.*;
import java.awt.*;

public class visitview extends JFrame{
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton a=new JButton("浏览学生");
    JButton b=new JButton("浏览课程");
    JButton c=new JButton("浏览成绩");
    JButton d=new JButton("返回");
    visithandle l;
    JLabel hy=new JLabel("欢迎使用浏览功能",JLabel.CENTER);
    public visitview(){
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
        l=new visithandle(this);
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
