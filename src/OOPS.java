class pen{
    String color;
    String type;
    int price;

    public void write(){
        System.out.println("writting better");
    }

    public void penInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.price);

    }
 //constructor has not return type and called once
   //Non parameterise constructor
  /*  pen(){
        System.out.println("constructor called");
    }

   */
 //parameterise constructor
    /*pen(String color,String type, int price){
        this.color = color;
        this.type = type;
        this.price = price;
 }
    */

    //copy constructor
    pen(pen p2){
        this.color = p2.color;
        this.type = p2.type;
        this .price = p2.price;
    }

    pen(){

    }

}
public class OOPS {
    public static void main(String[] args){
//        pen p1 = new pen();
//        p1.color = "red";
//        p1.type = "gel";
//        p1.price = 10;

  //      pen p2 = new pen("blue","ball_Pen",20);


        pen p1 = new pen();
        p1.color = "red";
        p1.type = "gel";
        p1.price = 10;
        pen p2 = new pen(p1);


        //p1.write();
       // p1.penInfo();

        p2.write();
        p2.penInfo();
    }
}
