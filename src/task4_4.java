public class task4_4 {
    public static void main(String[] args) {
        int totalMarks = 59;
        if (totalMarks >=90){
            System.out.println("Grade = A+");
        } else if(totalMarks >= 60) {
            System.out.printf("Grade = A");
        } else if (totalMarks >=40){
            System.out.println("Grade = B");
        }else if (totalMarks >=30){
            System.out.println("Grade = C");
        } else{
            System.out.printf("Fail");
        }
    }
}
