// for the Peasant class you need to store, a name / life / age / attack

class Peasant implements AutoCloseable {
        public void close() {
    }
    //when the Peasant class is create write a string like this "A New Peasant as join the village, named : {name}, {age} year old";

    //when the Peasant class is destroy you need to displau "{name} has leave the village at {age + 5}"
}

// EX4 ensures that a Soldier class is created; the soldier defaults to a sword as a weapon (15 points of damage and 100 life).
// if the soldier is created with a bow he will have (30 points of damage and 60 life).

class Soldier extends Peasant {

    //if the soldier have a bow you need to display "{name} is an archer"
    //if the soldier have a sord you need to display "{name} is a swordman"

    //when the class Soldier is destroy you need to display a string like this "The Soldier: {name} retires at the age of {age}"
}
