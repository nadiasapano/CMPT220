public class App {
    public static void main(String[] args) throws Exception {

        Student s1= new Student("Kate", "Senior", 3.8, 12345);
        Student s2= new Student("Marc", "Sophomore", 2.9, 54321);
        Student s3= new Student("John", "Junior", 3.6, 98765);
        Student s4= new Student("Lisa", "Freshman", 3.7, 24680);
        Student s5= new Student("Bill", "Senior", 4.0, 13590);

        s1.gpa();
        s2.gpa();
        s3.gpa();
        s4.gpa();
        s5.gpa();

        s1.freeLunch();
        s2.freeLunch();
        s3.freeLunch();
        s4.freeLunch();
        s5.freeLunch();

        // This assignment taught me how to use the rand function to generate random values and implement them within my program. Here I generated random 5 digit ID numbers to compare to my student's IDs
        // I also learned how to create a class with methods. Methods are useful for organizing code, making it very user-friendly and reusable.

        Cat c1= new Cat("Oreo",2, 10);
        Cat c2= new Cat("Mittens", 7, 16);
        Cat c3= new Cat("Meow", 4, 12);

        c1.overWeight();
        c2.overWeight();
        c3.overWeight();

        c1.old();
        c2.old();
        c3.old();
    }
}

