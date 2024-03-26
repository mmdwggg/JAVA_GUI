package delect;

import DATA.DATA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class decouh implements ActionListener {
    private decouv x;
    public decouh(decouv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("删除".equals(text)){
            String num=x.getA2().getText();
            if (DATA.checkcou(num)==true){
                JOptionPane.showMessageDialog(x,"删除失败,课程号不存在");
            }
            else {
                DATA.delectcou(num);
                JOptionPane.showMessageDialog(x,"删除成功");
                DATA.write();
                x.dispose();
            }
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }
}
