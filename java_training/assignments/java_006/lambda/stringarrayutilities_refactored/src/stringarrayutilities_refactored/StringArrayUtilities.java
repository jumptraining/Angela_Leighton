package stringarrayutilities_refactored;

import java.util.Arrays;

public class StringArrayUtilities {

	public static void main(String[] args) {
		printReport();
	}
	
	static void printReport() {
		String myList[] = new String[] {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money","Zoo"};
		
		Match ExactMatch = (arr, match, caseSen) -> {
			//if the match is case sensitive
			if (caseSen) {
				//loop thru the array
				for(int x=0;x<arr.length;x++) {
					//if there's a match return true
					if (arr[x] == match) {
						return true;
					}
				}
			//if the match is not case sensitive
			}else {
				//loop thru the array
				for(int x=0;x<arr.length;x++) {
					//if there's a match return true
					if (arr[x].equalsIgnoreCase((match))) {
						return true;
					}
				}
			}
			
			//if there is not a match return false
			return false;
		};
		
		Occurrence HasMatch = (arr, match, caseSen) -> {
			
			 //declare array to return
			 int[] matches = new int[] {0};
			 
		 	//if the match is case sensitive
			if (caseSen) {
				//loop thru the array
				for(int x=0;x<arr.length;x++) {
					//if there's a match add index to matches
					if (arr[x] == match) {
						matches[0] = x;
					}
				}
			//if the match is not case sensitive
			}else {
				//loop thru the array
				for(int x=0;x<arr.length;x++) {
					//if there's a match add index to matches
					if (arr[x].equalsIgnoreCase((match))) {
						matches[0] = x;
					}
				}
			}
			
			//if there are no matches return -1
			if (matches[0] == 0) {
				matches[0] = -1;
			}
			
			//return the array of indexes
			return matches;
			
		 };	
		
		//Report header
		System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items: ");
		System.out.println("{\"Bozo\", \"FooBar\", \"Delta\", \"Foozball\", \"Demo\", \"Money\", \"Zoo\"}");
		
		//test these cases
		System.out.println("Scenario 1");
		System.out.print("arrayHasExactMatch(myList, \"zo\", false): is "); 
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "zo", false));
		
		System.out.println("\nScenario 2");
		System.out.print("arrayHasExactMatch(myList, \"zoo\", false): is "); 
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "zoo", false));
		
		System.out.println("\nScenario 3");
		System.out.print("arrayHasExactMatch(myList, \"zoo\", true): is ");
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "zoo", true));
		
		System.out.println("\nScenario 4");
		System.out.print("arrayHasExactMatch(myList, \"foo\", true): is "); 
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "foo", true));
		
		System.out.println("\nScenario 5");
		System.out.print("arrayHasExactMatch(myList, \"foo\", false): is "); 
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "foo", false));
		
		System.out.println("\nScenario 6");
		System.out.print("arrayHasExactMatch (myList, \"delta\", true): is "); 
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "delta", true));
		
		System.out.println("\nScenario 7");
		System.out.print("arrayHasExactMatch(myList, \"Delta\", true): is "); 
		System.out.println(ExactMatch.arrayHasExactMatch(myList, "Delta", true));
		
		System.out.println("\nScenario 8");
		System.out.print("indexOfOccuranceInArray(myList, \"zo\", false): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "zo", false)));
		
	
		System.out.println("\nScenario 9");
		System.out.print("indexOfOccuranceInArray(myList, \"zoo\", false): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "zoo", false)));
		
		System.out.println("\nScenario 10");
		System.out.print("indexOfOccuranceInArray(myList, \"zoo\", true): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "zoo", true)));
		
		System.out.println("\nScenario 11");
		System.out.print("indexOfOccuranceInArray(myList, \"foo\", true): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "foo", true)));
		
		System.out.println("\nScenario 12");
		System.out.print("indexOfOccuranceInArray(myList, \"foo\", false): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "foo", false)));
		
		System.out.println("\nScenario 13");
		System.out.print("indexOfOccuranceInArray(myList, \"delta\", true): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "delta", true)));
		
		System.out.println("\nScenario 14");
		System.out.print("indexOfOccuranceInArray(myList, \"Delta\", true): returns ");
		System.out.println(Arrays.toString(HasMatch.indexofOccurrenceinArray(myList, "Delta", true)));
	}
	
//	static int[] indexOfOccuranceInArray(String[] arr, String match, boolean caseSen) {
//		
//		 //declare array to return
//		 int[] matches = new int[] {0};
//		 
//	 	//if the match is case sensitive
//		if (caseSen) {
//			//loop thru the array
//			for(int x=0;x<arr.length;x++) {
//				//if there's a match add index to matches
//				if (arr[x] == match) {
//					matches[0] = x;
//				}
//			}
//		//if the match is not case sensitive
//		}else {
//			//loop thru the array
//			for(int x=0;x<arr.length;x++) {
//				//if there's a match add index to matches
//				if (arr[x].equalsIgnoreCase((match))) {
//					matches[0] = x;
//				}
//			}
//		}
//		
//		//if there are no matches return -1
//		if (matches[0] == 0) {
//			matches[0] = -1;
//		}
//		
//		//return the array of indexes
//		return matches;
//		
//	 }	
}
