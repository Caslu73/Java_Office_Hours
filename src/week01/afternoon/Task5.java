package week01.afternoon;

public class Task5 {

    public static void main(String[] args) {

 /*
    Task 5
Write a Java program that accepts two integer values between 25 to 75 and
return true if there is a common digit in both numbers.
Sample Input and Output
Input the first number : 53
Input the second number: 34
Result: true
     */
        int first = 53;
        int second = 34;

        if((first>=25 && first <=75) && (second>=25 && second<=75)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }





    }
}
