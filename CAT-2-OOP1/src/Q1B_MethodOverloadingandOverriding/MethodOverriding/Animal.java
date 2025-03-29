package Q1B_MethodOverloadingandOverriding.MethodOverriding;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
