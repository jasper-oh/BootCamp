
public class Practice {

	
	public static void main(String[] args) {
		

		Number num = new Number();
		
		num.a = 1;
		num.addOneNum();
		num.print();
	
	}

}
class Number{
	
	int a;
	
	void addOneNum() {
		
		a++;
		
	}
	
	private void print() {
		System.out.println(a);
	}

}

