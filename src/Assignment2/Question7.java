package Assignment2;
//- Program to display the following sequence of numbers: 1 2 4 8 16 32 64 128 256
//512
public class Question7 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=1; i<=1024; i++){
            sum = i*2;
            System.out.println(sum);
        }
    }
}
