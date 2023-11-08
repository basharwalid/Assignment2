package Assignment2;
//1- A program to print numbers divisible by 5, for the integers from 1 to 99.
public class Question1 {
    public static void main(String[] args) {
        for (int i =0; i<99;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}
