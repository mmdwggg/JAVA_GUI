package ADD;

import DATA.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class adstuh implements ActionListener {
    private adstuv x;
    public adstuh(adstuv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("添加".equals(text)){
            String id=x.getA2().getText();
            String name=x.getB2().getText();
            String sex=x.getC2().getText();
            String field=x.getD2().getText();
            String tel=x.getE2().getText();
            if (DATA.checkstu(id)==false){
                JOptionPane.showMessageDialog(x,"添加失败,学号重复");
            }
            else {
                DATA.getStudents().add(new STUDENT(id,name,sex,field,tel));
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
