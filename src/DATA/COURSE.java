package DATA;

public class COURSE {
    private String name;
    private String num;
    private int scores;
    private int time;
    private String start;

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public int getScores() {
        return scores;
    }

    public String getStart() {
        return start;
    }

    public int getTime() {
        return time;
    }

    public COURSE(String name,String num,int scores,int time,String start){
        this.name=name;
        this.scores=scores;
        this.time=time;
        this.num=num;
        this.start=start;
    }
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("课程名:"+getName()+" 课程号:"+getNum()+" 学分:"+getScores()+" 课时:"+getTime()+" 开课学期:"+getStart());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getName()+"  "+this.getNum()+"  "+this.getScores()+"  "+this.getTime()+"  "+this.getStart();
    }
}
