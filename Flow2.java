public class TestResult {
 
    public static void main(String[] args) {
         
        int marks1 = 45;
        int marks2 = 90;
        getResult(marks1);
        getResult(marks2);
 
    }
 
    private static void getResult(int marks) {
        if ( marks >= 50 ) {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
 
}
Drawbacks:
* The above method didn’t return the result
