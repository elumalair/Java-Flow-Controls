public class TestResult {
 
    public static void main(String[] args) {
         
        int marks1 = 45;
        int marks2 = 90;
        String result1 = getResult(marks1);
        String result2 = getResult(marks2);
 
        System.out.println("Result:" + result1 + "  marks=" + marks1);
        System.out.println("Result:" + result2 + " marks=" + marks2);
    }
 
    private static String getResult(int marks) {
        String result = null;
        if ( marks >= 50 ) {
            result = "Passed" ;
        }
        else
        {
            result = "Failed";
        }
        return result ;
    }
 
}
