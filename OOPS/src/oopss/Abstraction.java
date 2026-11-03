package oopss;
  

abstract class lucky{
	abstract void delivers() {
		System.out.println("succcess");
	}
	void deliver() {
		System.out.println("deliver successs");
	}
}
 class lucklu extends lucky{
	void delivers() {
		System.out.println("lucklu susess");
	}
}
 class jyo extends lucky{
	 void delivers() {
		 System.out.println("jyo sucess");
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      lucky l;
    l=  new lucklu();
    l.deliver();
    l.delivers();
    l=new jyo();
    l.delivers();
	}

}
