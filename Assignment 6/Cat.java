public class Cat {
    String name;
    int age;
    int weight;

    public Cat(String n, int a, int w){
        name=n;
        age=a;
        weight=w;
    }
    void overWeight(){
        if (this.weight>15){
            System.out.println(this.name + " is overweight");
        }
        else{
            System.out.println(this.name + " is not overweight");
        }
        }
    void old(){
        if (this.age>10){
            System.out.println(this.name + " is old");
        }
        else{
            System.out.println(this.name + " is not old");
        }
    }
}

