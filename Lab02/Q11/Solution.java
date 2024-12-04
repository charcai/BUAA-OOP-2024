import java.util.Scanner;

class Palindrome {
	private String num;
	public void getNum() {
		Scanner sc = new Scanner(System.in);
		num = sc.nextLine();
	}
	public boolean checkIsNum() {
		int len = num.length();
		if(len == 0) {
			return false;
		}
		for(int i = 0; i < len; ++i) {
			char ch = num.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	private String deleteZero(String ss) {
		int len = ss.length();
		String ret = "";
		ret = ret + ss.charAt(len - 1);
		for(int i = len - 2; i >= 0; --i) {
			if(ss.charAt(i) != '0') {
				ret = ss.charAt(i) + ret;
			}
		}
		return ret;
	}
	public boolean checkIsPalindrome() {
		if(num.equals(deleteZero(new StringBuffer(num).reverse().toString()))) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.getNum();
		if(p.checkIsNum()) {
			if(p.checkIsPalindrome()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("Not a number");
		}
	}
}