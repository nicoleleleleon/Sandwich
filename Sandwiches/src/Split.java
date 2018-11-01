import java.util.*;

public class Split {
	public static void main(String[] args) {
		
		// Your task Part 0
		//String.split();

		//It's a method that acts on a string, <StringName>.split(<String sp>);

		//Where sp is the string where the string splits

		//And it returns an array

		// Example: "I like apples!".split(" ");
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		
			
		// it will split at spaces and return an array of ["I","like","apples!"]

		// Example 2: "I really like really red apples"split("really")
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		
		// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

		//play around with String.split!
		System.out.println(Arrays.toString("I really like reallyreally apples".split("really")));

		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));

		//Your task Part 1:

		/*Write a method that take in a string like

		* "applespineapplesbreadlettustomatobaconmayohambreadcheese"

		* describing a sandwich.

		* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

		* the sandwich and ignores what's on the outside

		* What if it's a fancy sandwich with multiple pieces of bread?

		*/
		
		partI("applespineapplesbreadlettustomatobaconmayohambreadcheese");
	//	partII("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}
	public static String removeExcess(String sandwich) {
		int start = sandwich.indexOf("bread");
		sandwich = sandwich.substring(start);
		int end = sandwich.indexOf("d");
		sandwich = sandwich.substring(0, end);
		return sandwich;
	}
	
		public static String partI(String list) {
		removeExcess(list);
		System.out.println(list);
		return"";
		
		}
	//	System.out.println(Arrays.toString("hambreadbreadcheesebread".split("bread")));
		//String sandwichI = "hambreadbreadcheesebread";
		//String[] sandwichII = "hambreadbreadcheesebread".split("bread");
		//int beginning = sandwichI.indexOf("bread");
		//System.out.println(beginning);
		//then remove what is before bread, then find next bread,then print out what is between those??
		
		//return middle token?? 

		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettus tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/
	//	public static String partII(String list) {
//	System.out.println(Arrays.toString(list.split(" ")));
//	int start = list.indexOf("d");
//	String newlist = list.substring(start+2,list.length());
//	System.out.println(newlist);
//	int end = newlist.indexOf("bread");
//	String finallist = newlist.substring(0, end);
//	System.out.println(Arrays.toString(finallist.split(" ")));

//	return "";
	
		// }
}

