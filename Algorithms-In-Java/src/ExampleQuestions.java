import java.util.Arrays;

// I will be taking an Algorithms course in the spring semester, so I am preparing for it by solving old homework questions during this winter break.
// Questions from: https://www.cs.rochester.edu/~stefanko/Teaching/19CS282/

public class ExampleQuestions {

	public static void q1_1() {
		System.out.println("QUESTION 1.1\n");
		System.out.println("We are given n positive numbers a1, . . . , an.");
		System.out.println("The goal is to select a subset of the numbers with " + 
				"maximal sum and such that no three consecutive numbers are selected.");
		System.out.println("Here are three example inputs together with " + 
				"optimal solutions (the numbers in boxes are selected)");
		
		System.out.println("       _   _     _   _");
		System.out.println("      |5| |5| 8 |5| |5|");
		System.out.println("       _     __     _");
		System.out.println("      |5| 5 |12| 5 |5|");
		System.out.println("   _   _     _   _     _   _");
		System.out.println("1 |2| |2| 1 |2| |1| 2 |5| |5|\n");
		
		System.out.println("Give an O(n)-time algorithm for the problem.\n");
		
	   int arr1[] = {5, 5, 8, 5, 5};
	   System.out.println("Input: " + Arrays.toString(arr1));
	   System.out.println("Sum = " + answer_q1_1(arr1, 0, 0, 0));
	   
	   int arr2[] = {5, 5, 12, 5, 5};
	   System.out.println("Input: " + Arrays.toString(arr2));
	   System.out.println("Sum = " + answer_q1_1(arr2, 0, 0, 0));
	   
	   int arr3[] = {1, 2, 2, 1, 2, 1, 2, 5, 5};
	   System.out.println("Input: " + Arrays.toString(arr3));
	   System.out.println("Sum = " + answer_q1_1(arr3, 0, 0, 0));
	}
	
	public static int answer_q1_1(int arr[], int i, int count, int val) {
		
		// end of array
		if(i == arr.length)
		return val;
		  
		// step 1: check for consecutive count
		if(count == 2) {
		// step 2a: current element cannot be taken
		// => skip and move to next item and reset count
		return answer_q1_1(arr, i+1, 0, val);
		}
		// step 2b: else there are can be 2 cases (decide to take the item or not)
		// step 3: max of the 2 decisions
		return Math.max(answer_q1_1(arr, i+1, count+1, val+arr[i]), answer_q1_1(arr, i+1, 0, val));
		// int val1 = func(arr, i+1, count+1, val+arr[i]);
		// int val2 = func(arr, i+1, 0, val);
		}
	
	public static void q1_2() {
		System.out.println("QUESTION 1.2\n");
		System.out.println("We are given an n × n array A of zeros and ones.");
		System.out.println("We want to find the size of the largest " + 
				"contiguous all-ones square. ");
		System.out.println("Give an O(n^2)-time algorithm for the problem.");

		answer_q1_2();
	}
	
	public static void answer_q1_2() {
		
		System.out.println();
		
	}
	
	public static void q1_3() {
		System.out.println("QUESTION 1.3\n");
		System.out.println("Activity selection problem with two people.");
		System.out.println("We have a set of n activities.");
		System.out.println("For i e{1, . . . , n} the i-th activity is described by an interval [ai, bi] and a value vi (we assume ai <= bi).\n");
		
		System.out.println("We have two people that wantto pick activities to attend so that");
		System.out.println("- they attend disjoint sets of activities,");
		System.out.println("- the activities attended by each person are non-overlapping, and");
		System.out.println("- the total value of activities attended is maximized.\n");
		
		System.out.println("Formally, we search for S, Z subset {1, . . . , n} such that the following are true.");
		System.out.println("- S intersect Z = null (“they attend disjoint sets of activities”).");
		System.out.println("- For i, j e S such that i != j we have bi < aj or bj < ai (“the activities attended by the first person arenon-overlapping”).");
		System.out.println("- For i, j e Z such that i != j we have bi < aj or bj < ai (“the activities attended by the second person arenon-overlapping”).");
		System.out.println("- SUM(ieS)vi + SUM(ieZ)vi is maximized (“the total value of activities attended is maximized”).\n");
		
		System.out.println("We will solve the problem using dynamic programming.");
		System.out.println("Assume that the activities are sorted by their end time,that is, b1 <= b2 <= b3 <= · · · <= bn.");
		System.out.println("For j, k e {1, . . . , n} let T[j, k] be the maximum value of a valid selection where the last activity\n" + 
				"for the first person is j and the last activity for the second person is k, that is,\n" +
				"we require max S = j and maxZ = k (if j = k then we let T[j, k] = -inf).");
		System.out.println("Give an expression (or a piece of code) to compute T[j, k] from smaller subproblems. Argue why your expressionis correct.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		answer_q1_3();
	}
	
	public static void answer_q1_3() {
		
		System.out.println("");
		
	}
	
	public static void printLine() {
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	
	public static void part1() {
		q1_1();
		printLine();
		q1_2();
		printLine();
		q1_3();
	}
	
	
	public static void printExamples() {
		part1();
	}
}
