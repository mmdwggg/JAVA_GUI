package DATA;

public class STUDENT {
    private String name;
    private String id;
    private String sex;
    private String field;
    private String tel;

    public void setName(String name) {
        this.name = name;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public String getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public String getTel() {
        return tel;
    }
    public STUDENT(String id,String name,String sex,String field,String tel){
        this.field=field;
        this.name=name;
        this.id=id;
        this.sex=sex;
        this.tel=tel;
    }
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("学号:"+getId()+" 姓名:"+getName()+" 性别:"+getSex()+" 专业:"+getField()+" 电话:"+getTel());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getId()+"  "+this.getName()+"  "+this.getSex()+"  "+this.getField()+"  "+this.getTel();
    }
}
