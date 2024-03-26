package check;

import DATA.DATA;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class cstufl extends JFrame {
    JTable jt;
    JScrollPane js;
    public cstufl(String field){
        super("学生信息");
        Container con=getContentPane();
        setSize(1000,800);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        Vector<String> col=new Vector<>();
        col.addElement("学号");
        col.addElement("姓名");
        col.addElement("性别");
        col.addElement("专业");
        col.addElement("电话");
        Vector<Vector<Object>> data=new Vector<>();
        int i;
        for (i=0; i< DATA.getStudents().size(); i++){
            if (field.equals(DATA.getStudents().get(i).getField())){
                Vector<Object> d=new Vector<>();
                d.addElement(DATA.getStudents().get(i).getId());
                d.addElement(DATA.getStudents().get(i).getName());
                d.addElement(DATA.getStudents().get(i).getSex());
                d.addElement(DATA.getStudents().get(i).getField());
                d.addElement(DATA.getStudents().get(i).getTel());
                data.addElement(d);
            }
        }
        DefaultTableModel tm=new DefaultTableModel();
        tm.setDataVector(data,col);
        jt=new JTable(tm);
        js=new JScrollPane(jt);
        con.add(js);
    }
}
