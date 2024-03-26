package DATA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DATA {
    private static List<STUDENT> students=new ArrayList<>();
    private static List<COURSE> courses=new ArrayList<>();
    private static List<GRADE> grades=new ArrayList<>();

    public static void setCourses(List<COURSE> courses) {
        DATA.courses = courses;
    }

    public static void setGrades(List<GRADE> grades) {
        DATA.grades = grades;
    }

    public static void setStudents(List<STUDENT> students) {
        DATA.students = students;
    }

    public static List<COURSE> getCourses() {
        return courses;
    }

    public static List<GRADE> getGrades() {
        return grades;
    }

    public static List<STUDENT> getStudents() {
        return students;
    }

    public static boolean checkstu(String id){
        for(int i=0;i<students.size();i++) {
            if(id.equals(students.get(i).getId())) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkcou(String num){
        for(int i=0;i<courses.size();i++) {
            if(num.equals(courses.get(i).getNum())) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkgra(String num,String id){
        for(int i=0;i<grades.size();i++) {
            if(num.equals(grades.get(i).getNum())&&id.equals(grades.get(i).getId())) {
                return false;
            }
        }
        return true;
    }
    public static boolean delectstu(String id){
        for(int i=0;i<students.size();i++) {
            if(id.equals(students.get(i).getId())){
                students.remove(i);
                return true;
            }
        }
        System.out.println("删除失败，该学号不存在");
        return false;
    }
    public static boolean delectcou(String num){
        for(int i=0;i<courses.size();i++) {
            if(num.equals(courses.get(i).getNum())){
                courses.remove(i);
                return true;
            }
        }
        System.out.println("删除失败，该课程号不存在");
        return false;
    }
    public static boolean delectgra(String num,String id){
        for(int i=0;i<grades.size();i++) {
            if(id.equals(grades.get(i).getId())&&num.equals(grades.get(i).getNum())){
                grades.remove(i);
                return true;
            }
        }
        System.out.println("删除失败，该同学未参加本课程");
        return false;
    }
    public static void read() {

        Connection con;
        String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="gly2020199062";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            String sql1 = "SELECT *FROM student;";
            String sql2 = "SELECT *FROM course;";
            String sql3 = "SELECT *FROM grade;";
            ResultSet resultSet1 = statement.executeQuery(sql1);
            while(resultSet1.next()){
                students.add(new STUDENT(resultSet1.getString("stuid"),resultSet1.getString("stuname"),resultSet1.getString("stusex"),resultSet1.getString("stufield"),resultSet1.getString("stutel")));
            }
            resultSet1=statement.executeQuery(sql2);
            while(resultSet1.next()){
                courses.add(new COURSE(resultSet1.getString("couname"),resultSet1.getString("counum"),resultSet1.getInt("couscore"),resultSet1.getInt("coutime"),resultSet1.getString("coustart")));
            }
            resultSet1=statement.executeQuery(sql3);
            while(resultSet1.next()){
                grades.add(new GRADE(resultSet1.getString("granum"),resultSet1.getString("graid"),resultSet1.getString("graday"),resultSet1.getInt("grag")));
            }
            resultSet1.close();
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
    public static void write() {
        Connection con;
        String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="gly2020199062";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            String sql1 = "delete from student";
            String sql2 = "delete from course";
            String sql3 = "delete from grade";
            String sql4= "insert into student values (?,?,?,?,?)";
            String sql5= "insert into course values (?,?,?,?,?)";
            String sql6= "insert into grade values (?,?,?,?)";
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            statement.executeUpdate(sql3);
            int i;
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql4);
            for (i=0;i<students.size();i++){
                stmt.setString(1,students.get(i).getId());
                stmt.setString(2,students.get(i).getName());
                stmt.setString(3,students.get(i).getSex());
                stmt.setString(4,students.get(i).getField());
                stmt.setString(5,students.get(i).getTel());
                stmt.executeUpdate();
            }
            stmt = (PreparedStatement) con.prepareStatement(sql5);
            for (i=0;i<courses.size();i++){
                stmt.setString(1,courses.get(i).getName());
                stmt.setString(2,courses.get(i).getNum());
                stmt.setInt(3,courses.get(i).getScores());
                stmt.setInt(4,courses.get(i).getTime());
                stmt.setString(5,courses.get(i).getStart());
                stmt.executeUpdate();
            }
            stmt = (PreparedStatement) con.prepareStatement(sql6);
            for (i=0;i<grades.size();i++){
                stmt.setString(1,grades.get(i).getNum());
                stmt.setString(2,grades.get(i).getId());
                stmt.setString(3,grades.get(i).getDay());
                stmt.setInt(4,grades.get(i).getGrade());
                stmt.executeUpdate();
            }
            stmt.close();
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
