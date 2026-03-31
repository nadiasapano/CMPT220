import java.util.Random;

public class Student {
String name;
String year;
double gpa;
int id;

public Student(String n, String y, double g, int i){
    name=n;
    year=y;
    gpa=g;
    id=i;
}
void gpa(){
    if (this.gpa>= 3.6){
        System.out.println(this.name + " is an honor roll student");
    }
    else{
        System.out.println(this.name + " is not an honor roll student");
    }
}
void freeLunch(){
   int randomID= new Random().nextInt(100000); // generates a random ID between 0 and 99999
   if (randomID == this.id){
    System.out.println(this.name +" gets free lunch");
   }
   else{
    System.out.println(this.name + " does not get free lunch");
   }
}
}
