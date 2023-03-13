
public class PalindromeNumber {
	public static void main(String[] args) {
		int r,sum=0,temp;
		int num=787;
		
		temp=num;
		while(num>0) {
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		if(temp==sum)
			System.out.println("Plaindrome");
		else
			System.out.println("Not a palindrome");
	}
}
}

