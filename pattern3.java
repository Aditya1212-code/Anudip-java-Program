public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        //int num = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1 ; j < n-1; j++){
                System.out.print("*");
            }    
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}