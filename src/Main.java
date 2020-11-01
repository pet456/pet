public class Main {
    public static void main(String[] args) {
        var fish = new Fish("Asya");
        var dog = new Dog("Bobik");
        Swimmable myPet = fish;
        myPet.swim(10);
        myPet.dive(1);
        Talkable somePat = dog;
        somePat.talk();
    }
}