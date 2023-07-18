public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Men";
        wolf.name = "Woof";
        wolf.weight = 35.4;
        wolf.age = 5;
        wolf.color = "Grey";
        System.out.println("Gender: " + wolf.gender + "\nName: " + wolf.name + "\nWeight: " +
                wolf.weight + "\nAge: " + wolf.age + "\nColor: " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}