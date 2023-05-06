package Lesson10;

public class TryCatchArray {

    public static void main(String[] args) {
        try {
            int numbers[] = {5, 6, 7};
            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println(":)");
        }
    }
}
