// for the Peasant class you need to store, a name / life / age / attack
class Peasant {
    private String name;
    private int age;
    protected int attack;
    protected int life;

    public Peasant(String name, int age) {
        this.name = name;
        this.age = age;
        //when the Peasant class is create write a string like this "A New Peasant as join the village, named : {name}, {age} year old";
        System.out.println("A New Peasant as join the village, named : " + name + ", " + age + " year old");
    }

    public int add_Age(int age) {
        this.age += age;
        return (this.age);
    }

    public int getAge() {
        return (this.age);
    }

    public String getName() {
        return (this.name);
    }

    //when the Peasant class is destroy you need to display "{name} has leave the village at {age + 5}"
    public void close() {
        System.out.println(name + " has leave the village at " + (age + 5));
    }
}

// EX4 ensures that a Soldier class is created; the soldier defaults to a sword as a weapon (15 points of damage and 100 life).
// if the soldier is created with a bow he will have (30 points of damage and 60 life).

class Soldier extends Peasant {

    //if the soldier have a bow you need to display "{name} is an archer"
    //if the soldier have a sord you need to display "{name} is a swordman"

    //when the class Soldier is destroy you need to display a string like this "The Soldier: {name} retires at the age of {age}"
}
