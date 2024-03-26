package ADD;
import DATA.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class adcouh implements ActionListener{
    private adcouv x;
    public adcouh(adcouv x){
        this.x=x;
    }

    public adcouh() {
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("添加".equals(text)){
            String name=x.getA2().getText();
            String num=x.getB2().getText();
            String score1=x.getC2().getText();
            int score=Integer.parseInt(score1);
            String time1=x.getD2().getText();
            int time=Integer.parseInt(time1);
            String start=x.getE2().getText();
            if (DATA.checkcou(num)==false){
                JOptionPane.showMessageDialog(x,"添加失败,课程号重复");
            }
            else {
                DATA.getCourses().add(new COURSE(name,num,score,time,start));
                JOptionPane.showMessageDialog(x,"添加成功");
                DATA.write();
                x.dispose();
            }
        }else if ("重置".equals(text)){
            x.getA2().setText("");
            x.getB2().setText("");
            x.getC2().setText("");
            x.getD2().setText("");
            x.getE2().setText("");
        }
    }
}
