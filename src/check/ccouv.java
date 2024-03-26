package check;

import javax.swing.*;
import java.awt.*;

public class ccouv extends JFrame{
    JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton a=new JButton("按课程名查找");
    JButton b=new JButton("按课程号查找");
    JButton c=new JButton("按开课时间查找");
    JButton e=new JButton("返回");
    ccouh l;
    JLabel hy=new JLabel("查找课程功能",JLabel.CENTER);
    public ccouv(){
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
        l=new ccouh(this);
        jp.add(a);
        a.addActionListener(l);
        jp.add(b);
        b.addActionListener(l);
        jp.add(c);
        c.addActionListener(l);
        jp.add(e);
        e.addActionListener(l);
    }
}
