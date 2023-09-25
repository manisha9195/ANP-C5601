package arraydiya;
import java.lang.*;
import java.util.*;

public class ArrayDiyaTest {

	public static void main(String[] args) {
		Q1();
		Q2();
		Q3();
		Q4();
		Q5();
		Q6();
		Q7();
		Q8();
		Q9();
		Q10();
		Q11();
		Q12();
		Q13();
		Q14();
		Q15();
		Q16();
		Q17();
	
	}


//Q1	WAP to insert 7 integer values in 1D array and print them
	private static void Q1() {
		int[] a = new int[7];
		
		a[0]= 1;
		a[1]= 2;
		a[2]= 3;
		a[3]= 4;
		a[4]= 5;
		a[5]= 6;
		a[6]= 7;
		
		System.out.println("1D Array Values");
		System.out.print(a[0]+" ");
		System.out.print(a[1]+" ");
		System.out.print(a[2]+" ");
		System.out.print(a[3]+" ");
		System.out.print(a[4]+" ");
		System.out.print(a[5]+" ");
		System.out.print(a[6]+" ");	
		
	}
	
//Q2	WAP to take two 1D array of length five and insert integer values in each. Take a third 1D array that shows the 
//	output of addition of first two arrays.
	private static void Q2() 
	{
		Scanner sc = new Scanner(System.in);
		
		int[]array1 = new int[5];
		int[]array2 = new int[5];
		int[]sumArray = new int[5];
		
		System.out.println("Enter values for the first array:");
		for (int i = 0; i < 5; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
		System.out.println("Enter values for the second array:");
		for (int i = 0; i < 5; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
		for (int i = 0; i < 5; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
		 System.out.println("Resultant array after addition:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Element " + (i + 1) + ": " + sumArray[i]);
	        }
	        sc.close();
		
	}
	
//	Q3 WAP to take two 2D array of length five and insert integer values in each. Take a third 2D array that 
//	shows the output of addition of first two arrays.
	private static void Q3() 
	{
		Scanner scanner = new Scanner(System.in);

        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] sumArray = new int[5][5];

        System.out.println("Enter values for the first array:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter values for the second array:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Resultant array after addition:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();	
	}
//	Q4.      WAP to multiply two matrices of type 3x3 and print the appropriate output.
	private static void Q4() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] resultMatrix = new int[3][3];

        System.out.println("Enter values for the first matrix (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter values for the second matrix (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
     // Matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
	}
	
//	Q5.      WAP to insert 6 different integer values in 1D array and find the largest value and smallest 
//			values in array using any kind of sorting.
	private static void Q5() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] array = new int[6];

        System.out.println("Enter 6 different integer values:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sorting the array using Arrays.sort() method
        Arrays.sort(array);

        int smallest = array[0];
        int largest = array[5];

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);

        scanner.close();
	}
	
//	Q6.      WAP to count the even and odd number between 9 elements of an array.
	private static void Q6() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];

        System.out.println("Enter 9 integer values:");

        for (int i = 0; i < 9; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 9; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);

        scanner.close();
	}
	
//	Q7.      WAP to find a particular number entered by user and match this number with five elements of an array.
//			If number is found then print “found” otherwise print “Not found”.
	
	private static void Q7() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];

        System.out.println("Enter 9 integer values:");

        for (int i = 0; i < 9; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 9; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);

        scanner.close();
	}
	
//	Q8.      In program no. 7, if number is found then replace that number by another number.
	
	private static void Q8() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter 5 integer values for the array:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to find: ");
        int numberToFind = scanner.nextInt();

        System.out.print("Enter the replacement number: ");
        int replacementNumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (array[i] == numberToFind) {
                array[i] = replacementNumber;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found and replaced in the array.");
        } else {
            System.out.println("Number not found in the array.");
        }

        System.out.println("Updated array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
	}
//	Q9.      WAP to insert 7 integer values in an array and store even/odd numbers in different two arrays.
	
	private static void Q9() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] originalArray = new int[7];
        int[] evenArray = new int[7];
        int[] oddArray = new int[7];

        System.out.println("Enter 7 integer values:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 7; i++) {
            if (originalArray[i] % 2 == 0) {
                evenArray[evenCount] = originalArray[i];
                evenCount++;
            } else {
                oddArray[oddCount] = originalArray[i];
                oddCount++;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();

        scanner.close();
	}
	
//	Q10.   WAP to insert 10 integer values and count all prime numbers and its values.
	
	private static void Q10(){
		
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter 10 integer values:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int primeCount = 0;
        String primeNumbers = "";

        for (int i = 0; i < 10; i++) {
            if (isPrime(array[i])) {
                primeCount++;
                primeNumbers += array[i] + " ";
            }
        }

        System.out.println("Number of prime numbers: " + primeCount);
        
        if (primeCount > 0) {
            System.out.println("Prime numbers: " + primeNumbers);
        }

        scanner.close();
	}
        static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
	
//        Q11.   WAP to accept and categorize 20 employees in the age group of 22-30, 31-40, 41-50, 51-60
        private static void Q11() {
    		// TODO Auto-generated method stub
        	Scanner scanner = new Scanner(System.in);

            int[] ageGroups = new int[4]; // Index 0: 22-30, Index 1: 31-40, Index 2: 41-50, Index 3: 51-60

            System.out.println("Enter ages of 20 employees:");

            for (int i = 0; i < 20; i++) {
                System.out.print("Enter age of employee " + (i + 1) + ": ");
                int age = scanner.nextInt();

                if (age >= 22 && age <= 30) {
                    ageGroups[0]++;
                } else if (age >= 31 && age <= 40) {
                    ageGroups[1]++;
                } else if (age >= 41 && age <= 50) {
                    ageGroups[2]++;
                } else if (age >= 51 && age <= 60) {
                    ageGroups[3]++;
                }
            }

            System.out.println("Age distribution of employees:");
            System.out.println("Age group 22-30: " + ageGroups[0] + " employees");
            System.out.println("Age group 31-40: " + ageGroups[1] + " employees");
            System.out.println("Age group 41-50: " + ageGroups[2] + " employees");
            System.out.println("Age group 51-60: " + ageGroups[3] + " employees");

            scanner.close();

    		
    	}
        
//        Q12.   WAP to accept salary of 20 employees and find out people who are earning more than rupees 50000 per month.
        private static void Q12() {
	// TODO Auto-generated method stub
        	 Scanner scanner = new Scanner(System.in);

             double[] salaries = new double[20];
             int countHighSalary = 0;

             System.out.println("Enter salaries of 20 employees:");

             for (int i = 0; i < 20; i++) {
                 System.out.print("Enter salary of employee " + (i + 1) + ": ");
                 salaries[i] = scanner.nextDouble();

                 if (salaries[i] > 50000) {
                     countHighSalary++;
                 }
             }
             System.out.println("Employees earning more than 50000 rupees per month: " + countHighSalary);

             scanner.close();
}


//        Q13.   WAP to accept names and temperature of 10 cities and find the city which has the maximum temperature.
        private static void Q13() {
	// TODO Auto-generated method stub
        	Scanner scanner = new Scanner(System.in);

            String[] cityNames = new String[10];
            double[] temperatures = new double[10];
            int hottestCityIndex = 0;

            System.out.println("Enter names and temperatures of 10 cities:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter name of city " + (i + 1) + ": ");
                cityNames[i] = scanner.nextLine();

                System.out.print("Enter temperature of city " + (i + 1) + " (in Celsius): ");
                temperatures[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                if (temperatures[i] > temperatures[hottestCityIndex]) {
                    hottestCityIndex = i;
                }
            }
            System.out.println("The city with the highest temperature is: " + cityNames[hottestCityIndex]);
            System.out.println("Temperature: " + temperatures[hottestCityIndex] + " Celsius");

            scanner.close();	
}


//        Q14.   WAP to accept marks of 10 students in computer application subject and display the name of the student who has got maximum marks.
        private static void Q14() {
	// TODO Auto-generated method stub
        	Scanner scanner = new Scanner(System.in);

            String[] studentNames = new String[10];
            double[] marks = new double[10];
            int topScorerIndex = 0;

            System.out.println("Enter names and marks of 10 students:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter name of student " + (i + 1) + ": ");
                studentNames[i] = scanner.nextLine();

                System.out.print("Enter marks of student " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                if (marks[i] > marks[topScorerIndex]) {
                    topScorerIndex = i;
                }
            }

            System.out.println("The top scorer is: " + studentNames[topScorerIndex]);
            System.out.println("Marks: " + marks[topScorerIndex]);

            scanner.close();
	
}

//        Q15.   Find the highest and smallest number of following array?

//        		Int[] arr ={45,3,6,7,21,5,62,9};

        private static void Q15() {
	// TODO Auto-generated method stub
        	 int[] arr = {45, 3, 6, 7, 21, 5, 62, 9};

             int smallest = arr[0];
             int highest = arr[0];

             for (int num : arr) {
                 if (num < smallest) {
                     smallest = num;
                 }

                 if (num > highest) {
                     highest = num;
                 }
             }

             System.out.println("Smallest number: " + smallest);
             System.out.println("Highest number: " + highest);
}


//    Q16    WAP to remove duplicates from the following array?

//        		Int[] arr ={2,3,4,5,2,3,3,2,4,5,4,5};
        private static void Q16() {
	// TODO Auto-generated method stub
        	 int[] arr = {2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5};

             int[] uniqueArray = removeDuplicates(arr);

             System.out.println("Original array: " + Arrays.toString(arr));
             System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        }
             private static int[] removeDuplicates(int[] arr) {
             {
                 HashSet<Integer> set = new HashSet<>();
                 List<Integer> resultList = new ArrayList<>();

                 for (int num : arr) {
                     if (!set.contains(num)) {
                         set.add(num);
                         resultList.add(num);
                     }
                 }

                 int[] resultArray = new int[resultList.size()];
                 for (int i = 0; i < resultList.size(); i++) {
                     resultArray[i] = resultList.get(i);
                 }

                 return resultArray;
             }
	
      }

//             Q17.   WAP to find number of occurrences from  the following array?

//            		 Int[] arr ={2,3,4,5,2,3,3,2,4,5,4,5};


		private static void Q17() {
	// TODO Auto-generated method stub
			   int[] arr = {2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5};
			
	        HashMap<Integer, Integer> occurrencesMap = new HashMap<>();

	        for (int num : arr) {
	            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
	        }

	        System.out.println("Number of occurrences:");
	        for (int num : occurrencesMap.keySet()) {
	            int count = occurrencesMap.get(num);
	            System.out.println(num + ": " + count + " times");
	        }
	    
	
}

      
}
