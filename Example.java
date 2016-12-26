

abstract class Creature {
  String name;
  Creature(String name) {
    this.name = name;
  }
  abstract public int howLong();
  
  public void describe(){
   System.out.println("My name is "+ name + "and I live to " + howLong() );
    
  }
}


 class Cow extends Creature 
{
  public Cow(String name) {
    super(name);
  }
  public int howLong() {
    return 15;
  }
}
 
 
 class Dolphin extends Creature 
{
 public Dolphin(String name) {
    super(name);
  }
  public int howLong() {
    return 40;
  }
}
 abstract class Fish extends Creature{
   public Fish(String name){
    super(name);
   }
   
 }
 
 
  class Guppy extends Fish {
    public Guppy(String name) {
    super(name);
  }
  public int howLong() {
    return 2;
  }
}
  

 class Bass extends Fish {
    public Bass(String name) {
    super(name);
  }
  public int howLong() {
    return 15;
  }
}


public class Example{
  public static void main(String args[]) {
    Creature[] animal = new Creature[4];
    animal[0] = new Cow("carolina");
    animal[1] = new Dolphin("Flipper");
    animal[2] = new Bass("MOuthy");
    animal[3] = new Guppy("Tiny");
    for (Creature c : animal){
      c.describe();
      //System.out.println("kk");
  }
}
}

