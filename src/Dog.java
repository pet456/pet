public class Dog extends Pet implements Talkable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Gav, Gav");
    }
}