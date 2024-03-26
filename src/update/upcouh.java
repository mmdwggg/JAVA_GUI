package update;

import DATA.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class upcouh implements ActionListener {
    private upcouv x;
    public upcouh(upcouv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("修改".equals(text)){
            String old=x.getF2().getText();
            String name=x.getA2().getText();
            String num=x.getB2().getText();
            String score1=x.getC2().getText();
            int score=Integer.parseInt(score1);
            String time1=x.getD2().getText();
            int time=Integer.parseInt(time1);
            String start=x.getE2().getText();
            if (DATA.checkcou(old)==true){
                JOptionPane.showMessageDialog(x,"修改失败,原课程号不存在");
            } else if (DATA.checkcou(num)==false) {
                JOptionPane.showMessageDialog(x,"修改失败,新课程号重复");
            } else {
                DATA.delectcou(old);
                DATA.getCourses().add(new COURSE(name,num,score,time,start));
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
