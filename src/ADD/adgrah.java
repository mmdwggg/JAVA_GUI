package ADD;
import DATA.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class adgrah implements ActionListener{
    private adgrav x;
    public adgrah(adgrav x){
        this.x=x;
    }

    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("添加".equals(text)){
            String num=x.getA2().getText();
            String id=x.getB2().getText();
            String day=x.getC2().getText();
            String gra1=x.getD2().getText();
            int gra=Integer.parseInt(gra1);
            if (DATA.checkcou(num)==true){
                JOptionPane.showMessageDialog(x,"添加失败,课程号不存在");
            } else if (DATA.checkstu(id)==true) {
                JOptionPane.showMessageDialog(x,"添加失败,该学号不存在");
            } else if (DATA.checkgra(num,id)==false) {
                JOptionPane.showMessageDialog(x,"添加失败,该学生已被该课程成绩录入，请重新输入");
            } else {
                DATA.getGrades().add(new GRADE(num,id,day,gra));
                JOptionPane.showMessageDialog(x,"添加成功");
                DATA.write();
                x.dispose();
            }
        }else if ("重置".equals(text)){
            x.getA2().setText("");
            x.getB2().setText("");
            x.getC2().setText("");
            x.getD2().setText("");
        }
    }
}
