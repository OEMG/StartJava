public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Men");
        wolf.setName("Woof");
        wolf.setWeight(35.4);
        wolf.setAge(5);
        wolf.setColor("Grey");
        System.out.println("Gender: " + wolf.getGender() + "\nName: " + wolf.getName() + "\nWeight: " +
                wolf.getWeight() + "\nAge: " + wolf.getAge() + "\nColor:" + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}