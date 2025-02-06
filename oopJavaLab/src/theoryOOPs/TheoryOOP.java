package theoryOOPs;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class TheoryOOP {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballPoint";


        pen1.write();
        pen1.printColor();
        pen2.write();
        pen2.printColor();
    }
}
