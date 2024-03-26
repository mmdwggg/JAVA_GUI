package update;

import ADD.adcouv;
import ADD.adgrav;
import ADD.adstuv;
import ADD.adview;
import menu.menuview;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class uphandle implements ActionListener {
    private upview x;
    public uphandle(upview x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("修改学生".equals(text)){
            new upstuv(x);
        }else if ("修改课程".equals(text)){
            new upcouv(x);
        }else if ("修改成绩".equals(text)){
            new upgrav(x);
        } else if ("返回".equals(text)) {
            x.dispose();
            new menuview();
        }
    }
}
