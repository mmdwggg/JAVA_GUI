package menu;

import menu.menuhandle;

import javax.swing.*;
import java.awt.*;

public class menuview extends JFrame{

    JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JLabel hy=new JLabel("欢迎来到学生信息与成绩管理系统",JLabel.CENTER);
    JButton a=new JButton("添加功能");
    JButton b=new JButton("删除功能");
    JButton c=new JButton("修改功能");
    JButton d=new JButton("查找功能");
    JButton e=new JButton("浏览功能");
    menuhandle l;
    //JTable jt;
    //JScrollPane js;
    public menuview(){
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
        l=new menuhandle(this);
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
