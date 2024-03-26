package delect;

import DATA.DATA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class degrah implements ActionListener {
    private degrav x;
    public degrah(degrav x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("删除".equals(text)){
            String num=x.getA2().getText();
            String id=x.getB2().getText();
            if (DATA.checkgra(num, id)==true){

                JOptionPane.showMessageDialog(x,"删除失败,该同学未报名该考试");
            }
            else {
                DATA.delectgra(num,id);
                JOptionPane.showMessageDialog(x,"删除成功");
                DATA.write();
                x.dispose();
            }
        }else if ("重置".equals(text)){
            x.getA2().setText("");
            x.getB2().setText("");
        }
    }
}
