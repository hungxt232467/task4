public class task4_18 {
    public static void main(String[] args) {
        int count,square,cube;
        for (count=1;count<300;count++){
            if (count % 3 ==0){
                continue;
            }
            square = count * count;
            cube = count * count * count;
            System.out.printf("\n Square of %d is %d and cube is %d",count,square,cube);
        }
    }
}
