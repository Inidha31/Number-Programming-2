
public class calculator {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		String s="add";
		
		switch(s) {
		case "add":
			System.out.println(num1+num2);
			break;
		case "sub":
			System.out.println(num1-num2);
			break;
		case "mul":
			System.out.println(num1*num2);
			break;
		case "div":
			System.out.println(num1/num2);
			break;
			default:
			System.out.println("not valid");
		}
	}

}
