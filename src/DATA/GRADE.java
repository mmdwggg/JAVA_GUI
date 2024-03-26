package DATA;

public class GRADE {
    private String num;
    private String id;
    private String day;
    private int grade;

    public void setNum(String num) {
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public int getGrade() {
        return grade;
    }

    public GRADE(String num,String id,String day,int grade){
        this.grade=grade;
        this.day=day;
        this.id=id;
        this.num=num;
    }
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("课程号:"+getNum()+" 学号:"+getId()+" 日期:"+getDay()+" 成绩:"+getGrade());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getNum()+"  "+this.getId()+"  "+this.getDay()+"  "+this.getGrade()+"  ";
    }
}
