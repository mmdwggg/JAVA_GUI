package update;

import ADD.adstuv;
import DATA.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class upstuh implements ActionListener {
    private upstuv x;
    public upstuh(upstuv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("修改".equals(text)){
            String old=x.getF2().getText();
            String id=x.getA2().getText();
            String name=x.getB2().getText();
            String sex=x.getC2().getText();
            String field=x.getD2().getText();
            String tel=x.getE2().getText();
            if (DATA.checkstu(old)==true){
                JOptionPane.showMessageDialog(x,"修改失败,原学号不存在");
            } else if (DATA.checkstu(id)==false) {
                JOptionPane.showMessageDialog(x,"修改失败,新学号重复");
            } else {
                DATA.delectstu(old);
                DATA.getStudents().add(new STUDENT(id,name,sex,field,tel));
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
