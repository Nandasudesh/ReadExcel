package abstraction;

public class Circle extends Shape {
void draw(){
	System.out.println("Draw a circle");
	
}
	public static void main(String[] args) {
	Shape s=new Circle();
	s.draw();
	Shape r=new Rectangle();
	r.draw();

	}

}
