public class App{
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy enemy1 = new Enemy(50, 25);
        enemy1.attack();    
        

        //create a fire and an ice wizard and call all functions
        Wizard wizard1 = new Wizard(60, 10, "fire");
        Wizard wizard2 = new Wizard(10, 40, "ice");

        wizard1.attack();
        wizard2.attack();
        wizard1.damageType();
        wizard2.damageType();
        
        //create a goblin and call its functions
        Goblin goblin1 = new Goblin(30, 70);
        goblin1.attack();

    }
}
