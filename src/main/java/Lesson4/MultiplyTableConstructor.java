package Lesson4;
import java.util.Scanner;

public class MultiplyTableConstructor {

    int table;
    
    public MultiplyTableConstructor(int table){
        this.table = table;
    }

    public void drawTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.table + " x " + i + " = " + (this.table * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table;
        
        System.out.print("Que tabla deseas?: ");
        table = sc.nextInt();
        
        MultiplyTableConstructor MTCob = new MultiplyTableConstructor(table);
        MTCob.drawTable();
    }
}
