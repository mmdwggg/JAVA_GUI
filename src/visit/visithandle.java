package visit;

import menu.menuview;
import visit.viscouv;
import visit.visgrav;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visithandle implements ActionListener {
    private visitview x;
    public visithandle(visitview x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("浏览学生".equals(text)){
            new visstuv();
        }else if ("浏览课程".equals(text)){
            new viscouv();
        }else if ("浏览成绩".equals(text)){
            new visgrav();
        } else if ("返回".equals(text)) {
            x.dispose();
            new menuview();
        }
    }
}
