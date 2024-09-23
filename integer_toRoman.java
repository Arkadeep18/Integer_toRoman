package practice_prev;

public class integer_toRoman {

	static String int_toRoman(int num) {
		int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String Romann[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		String FinalAns = "";
		for(int i=0;i<values.length;i++){
	        while(num>=values[i]){
	            FinalAns+=Romann[i];
	            num -= values[i];
	        }
	    }
		return FinalAns;
	}

	public static void main(String[] args) {
		
		int num = 1900;
		System.out.println("Roman numerial: "+int_toRoman(num));
	}

}