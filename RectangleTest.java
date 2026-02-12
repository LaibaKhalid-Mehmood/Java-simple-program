public class RectangleTest{
 public static void main(String[] args){

 Rectangle r=new Rectangle();

 r.length=10.0;
 r.width=10.0;

 System.out.println(r.length);
 System.out.println(r.width);

 double Area=r.calArea();
System.out.println("Area of rectangle "+ Area);

 double Perimeter=r.calPer();
 System.out.println("Perimeter of rectangle "+ Perimeter);
 
 
}
}