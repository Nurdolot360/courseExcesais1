public class Course {
String name;
String nomber;
String teacherName;
String startData;
public Course (String name, String nomber, String teacherName,String startData){
    this.name=name;
    this.nomber = nomber;
    this.teacherName = teacherName;
    this.startData=startData;

}

    @Override
    public String toString() {
        return "Course: " +"\n"+
                "name: " + name + "\n" +
                " nomber: " + nomber + "\n" +
                " teacherName: " + teacherName + "\n" +
                " startData: " + startData ;
    }
}
