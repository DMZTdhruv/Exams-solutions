public class Another {
  public static void main(String[] args) {
    Cat cat = new Cat("Alexa");
    cat.noise();
  }   
}


interface IShape {
  void draw();
}

interface IColor{
  void color();
}

class Rectangle implements IShape, IColor {
  @Override
  public void draw(){
    
  }
   @Override
  public void color() {

  }
}

abstract class Animal {
  String name;
  public Animal(String name) {
    this.name = name;
  }
  public abstract void noise();
}


class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }
  @Override
  public void noise() {
    System.out.println("Hello this is: " + super.name);
  }
}