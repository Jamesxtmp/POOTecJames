package Lesson4;
import java.util.Scanner;

public class MultiplyTable {

    int table;

    public void drawTable(int table) {
        this.table = table;
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.table + " x " + i + " = " + (this.table * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiplyTable MTob = new MultiplyTable();
        
        int table;
        System.out.print("Que tabla deseas?: ");
        table = sc.nextInt();
        MTob.drawTable(table);
    }
}
