package ADD;

import menu.menuview;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adhandle extends adcouh implements ActionListener {
    private adview x;
    public adhandle(adview x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("添加学生".equals(text)){
            new adstuv(x);
        }else if ("添加课程".equals(text)){
            new adcouv(x);
        }else if ("添加成绩".equals(text)){
            new adgrav(x);
        } else if ("返回".equals(text)) {
            x.dispose();
            new menuview();
        }
    }
}
