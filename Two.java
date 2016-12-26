
abstract class Bird {// fly, talk, dive, swim
   abstract void fly();
   abstract void swim();
   abstract void dive();
   abstract void talk();

  public void describe(){
    fly();
    swim();
    dive();
    talk();   
  }
}


class Duck extends Bird {
  public void fly() {
    System.out.println("I am a duck and I can fly");
  }
  public void swim() {
    System.out.println("I am a duck and I swim");
  }
  public void dive() {
    System.out.println("I am a duck and I can dive");
  }
  public void talk() {
    System.out.println("I am a duck and I hate talking");
  }
 }


class Penguin extends Bird {
  public void fly() {
    System.out.println("I am a Penguin and I cant fly");
  }
  public void swim() {
    System.out.println("I am a Penguin and I can swim");
  }
  public void dive() {
    System.out.println("I am a Penguin and I can dive");
  }
  public void talk() {
    System.out.println("I am a Penguin and I hate talking");
  }
 }
 
 
 class Parrot extends Bird 
{
  public void fly() {
    System.out.println("I am a Parrot and I cant fly");
  }
  public void swim() {
    System.out.println("I am a Parrot and I can't swim");
  }
  public void dive() {
    System.out.println("I am a Parrot and I can dive");
  }
  public void talk() {
    System.out.println("I am a Parrot and I love talking");
  }
 }
 
 
 class Two {
  public static void main(String[] args) {
    Bird[] birds = new Bird[3]; 
    birds[0] = new Duck(); 
    birds[1] = new Penguin(); 
    birds[2] = new Parrot(); 
    for (Bird b : birds)
      b.describe(); 
  }
}

 
  


