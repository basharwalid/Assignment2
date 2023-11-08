package Assignment2;
//- program to display the following sequence of numbers: 7 14 21 28 35 42 49 56
//63 70 77 84 91 98
public class Question6 {
    public static void main(String[] args) {
        for (int i =1; i<=100; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}
