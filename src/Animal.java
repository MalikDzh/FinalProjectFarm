////abstract class Animal {
////    protected String name;
////    protected int age;
////    protected int hungerLevel;
////
////    public Animal(String name, int age) {
////        this.name = name;
////        this.age = age;
////        this.hungerLevel = 10;
////    }
////
////    public abstract ProductBundle produce();
////
////    public void feed(FeedType feedType) {
////        if (feedType == FeedType.HAY){
////            this.hungerLevel = Math.max(0, this.hungerLevel - 3);
////        } else if (feedType == FeedType.GRAIN) {
////            this.hungerLevel = Math.max(0, this.hungerLevel - 2);
////        }
////    }
////
////    public int getHungerLevel() {
////        return hungerLevel;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public abstract AnimalType getType();
////
////    public abstract ProductBundle produce();
////
////    public void feed(FeedType feedType) {
////        hungerLevel = Math.max(0, hungerLevel - 30);
////    }
////
////    @Override
////    public String toString() {
////        return name + " (" + age + " лет, голод " + hungerLevel + ")";
////    }
////}
//
//
//public abstract class Animal {
//    protected String name;
//    protected int age;
//    protected int hungerLevel;
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.hungerLevel = 50;
//    }
//
//    public abstract AnimalType getType();
//    public abstract ProductBundle produce();
//
//    public void feed(FeedType feedType) {
//        hungerLevel = Math.max(0, hungerLevel - 30);
//    }
//
//    public boolean isHungry() {
//        return hungerLevel > 60;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (" + getType() + ", возраст " + age + ", голод " + hungerLevel + ")";
//    }
//}
public abstract class Animal {
    protected String name;
    protected int age;
    protected int hungerLevel;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hungerLevel = 50;
    }

    public abstract AnimalType getType();
    public abstract ProductBundle produce();

    public void feed(FeedType feedType) {
        hungerLevel = Math.max(0, hungerLevel - 30);
    }

    public boolean isHungry() {
        return hungerLevel > 60;
    }

    @Override
    public String toString() {
        return name + " (" + getType() + ", возраст " + age + ", голод " + hungerLevel + ")";
    }
}
