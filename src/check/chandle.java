package check;

import menu.menuview;
import visit.viscouv;
import visit.visgrav;
import visit.visitview;
import visit.visstuv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chandle implements ActionListener {
    private cview x;
    public chandle(cview x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("学生查找".equals(text)){
            new cstuv();
            x.dispose();
        }else if ("课程查找".equals(text)){
            new ccouv();
            x.dispose();
        }else if ("成绩查找".equals(text)){
            new cgrav();
            x.dispose();
        } else if ("返回".equals(text)) {
            x.dispose();
            new menuview();
        }
    }
}
