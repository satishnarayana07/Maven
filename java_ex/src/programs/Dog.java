package programs;

import Examples.Animal;

public class Dog extends Animal {
    public void cat(){
        super.bark();
        System.out.println("my name is cat");
    }

    public void bark(){
        System.out.println("cat does not bark, cat always makes sound like Meow");
    }

}
