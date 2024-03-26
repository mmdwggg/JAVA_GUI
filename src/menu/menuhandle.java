package menu;
import ADD.ad;
import delect.DELECT;
import update.UPDATE;
import check.NAMEREFER;
import visit.VISIT;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class menuhandle implements ActionListener {
    private menuview x;
    public menuhandle(menuview x){
        this.x=x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("添加功能".equals(text)){
            JOptionPane.showMessageDialog(x,"欢迎进入添加功能");
            ad add=new ad();
            try {
                x.dispose();
                add.go();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else if ("删除功能".equals(text)){
            JOptionPane.showMessageDialog(x,"欢迎进入删除功能");
            DELECT delect=new DELECT();
            try {
                x.dispose();
                delect.go();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else if ("修改功能".equals(text)){
            JOptionPane.showMessageDialog(x,"欢迎进入修改功能");
            UPDATE update=new UPDATE();
            try {
                x.dispose();
                update.go();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else if ("查找功能".equals(text)){
            JOptionPane.showMessageDialog(x,"欢迎进入查找功能");
            NAMEREFER namerefer=new NAMEREFER();
            try {
                x.dispose();
                namerefer.go();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else if ("浏览功能".equals(text)){
            JOptionPane.showMessageDialog(x,"欢迎进入浏览功能");
            VISIT v=new VISIT();
            try {
                x.dispose();
                v.go();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
