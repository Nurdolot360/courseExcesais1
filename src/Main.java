import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
       Course course = new Course("It.kg","nomer 1 ","Azamat Muratov","02.01.23");
       Students students = new Students("Nursalin","0556789123","Erlan Agay","25.02.2004",18);
        Students students1 = new Students("Nursalin","0556789123","Erlan Agay","25.02.2004",-12);
        System.out.println(course);
        System.out.println(students);
        System.out.println(students1);
    }
}