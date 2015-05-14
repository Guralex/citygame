package citygame;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		AbstractParser parser=new BDParser();
		parser.parse("qwea");

	}

}
