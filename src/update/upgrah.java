package update;

import DATA.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class upgrah implements ActionListener {
    private upgrav x;
    public upgrah(upgrav x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("修改".equals(text)){
            String old1=x.getF2().getText();
            String old2=x.getE2().getText();
            String num=x.getA2().getText();
            String id=x.getB2().getText();
            String day=x.getC2().getText();
            String gra1=x.getD2().getText();
            int gra=Integer.parseInt(gra1);
            if (DATA.checkgra(old1,old2)==true){
                JOptionPane.showMessageDialog(x,"修改失败,这位同学以前未报名此课程");
            } else if (DATA.checkcou(num)==true){
                JOptionPane.showMessageDialog(x,"修改失败,新课程号不存在");
            } else if (DATA.checkstu(id)==true) {
                JOptionPane.showMessageDialog(x,"修改失败,新学号不存在");
            } else if (DATA.checkgra(num,id)==false) {
                JOptionPane.showMessageDialog(x,"添加失败,该学生已被该课程成绩录入，请重新输入");
            } else {
                DATA.delectgra(old2,old1);
                DATA.getGrades().add(new GRADE(num,id,day,gra));
                JOptionPane.showMessageDialog(x,"修改成功");
                DATA.write();
                x.dispose();
            }
        }else if ("重置".equals(text)){
            x.getA2().setText("");
            x.getB2().setText("");
            x.getC2().setText("");
            x.getD2().setText("");
            x.getE2().setText("");
            x.getF2().setText("");
        }
    }
}
