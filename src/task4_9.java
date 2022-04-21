public class task4_9 {
    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";
        switch (day) {
            case "Sunday":
                System.out.printf("Sunday is holiday....");
                switch (hour) {
                    case "am":
                        System.out.println("Goodmorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }
                break;
            case "Monday":
                System.out.printf("Monday is working day....");
                switch (hour) {
                    case "am":
                        System.out.println("Goodmorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }
                break;
            default:
                System.out.printf("Invalid Day");

        }
    }
}
