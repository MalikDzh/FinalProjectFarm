abstract class Animal {
    protected String name;
    protected int age;
    protected int hungerLevel;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hungerLevel = 10;
    }

    public abstract ProductBundle produce();

    public void feed(FeedType feedType) {
        if (feedType == FeedType.HAY){
            this.hungerLevel == Math.max(0, this.hungerLevel - 3);
        } else if (feedType == FeedType.GRAIN) {
            this.hungerLevel = Math.max(0, this.hungerLevel - 2);
        }
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
