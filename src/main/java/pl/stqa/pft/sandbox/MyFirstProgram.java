package pl.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String[] args){

    hello("world");
    hello("user");
    hello("Alexei");

    Square s = new Square(5);

    System.out.println("Pole powierzni kwadratu" + s.l + " = " + s.area());


    Rectangle r =  new Rectangle(4,6);
    System.out.println("Pole powierzchni prostokata" + r.a + r.b + "  = " + s.area());







  }

  public  static void hello(String somebody){
    System.out.println("Hello, " + somebody + " !");
  }

  }
