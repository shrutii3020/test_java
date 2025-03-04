import java.util.Scanner;

public class LargestOfThree {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("Enter the third number: ");
    int c = sc.nextInt();

    int largest = findLargest(a, b, c);
    System.out.println("The largest number: " + largest);

    sc.close();
}

public static int findLargest(int a, int b, int c) { 
    int largest = a;
    if (b > largest) {
        largest = b;
    }
    if (c > largest) {
        largest = c;
    }
    return largest;
}
}