package delect;

import ADD.adcouv;
import ADD.adgrav;
import ADD.adstuv;
import ADD.adview;
import menu.menuview;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class delecthandle implements ActionListener {
    private delectview x;
    public delecthandle(delectview x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("删除学生".equals(text)){
            new destuv(x);
        }else if ("删除课程".equals(text)){
            new decouv(x);
        }else if ("删除成绩".equals(text)){
            new degrav(x);
        } else if ("返回".equals(text)) {
            x.dispose();
            new menuview();
        }
    }
}
