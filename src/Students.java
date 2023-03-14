public class Students {
   String name;
    String nomber;
   String teachername;
    String startDate;
    int age;
    public Students (String name,String nomber, String teachername, String startDate, int age) {
        this.name = name;
        this.nomber = nomber;
        this.teachername = teachername;
        this.startDate = startDate;
        if (age > 0) {
            this.age = age;
        }
        }
        @Override
        public String toString () {
            return "Students: " + "\n" +
                    "name: " + name + "\n" +
                    "nomber: " + nomber + "\n" +
                    "teachername: " + teachername + "\n" +
                    "startDate: " + startDate + "\n" +
                    "age: " + age;


        }
    }

