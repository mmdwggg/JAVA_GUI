package delect;

import ADD.adstuv;
import DATA.DATA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class destuh implements ActionListener {
    private destuv x;
    public destuh(destuv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("删除".equals(text)){
            String id=x.getA2().getText();
            if (DATA.checkstu(id)==true){
                JOptionPane.showMessageDialog(x,"删除失败,学号不存在");
            }
            else {
                DATA.delectstu(id);
                JOptionPane.showMessageDialog(x,"删除成功");
                DATA.write();
                x.dispose();
            }
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }

}
