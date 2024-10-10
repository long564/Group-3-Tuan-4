import java.util.*;
public class Tuan4Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap 1 so: ");
        int n = sc.nextInt();
        int sodng = 0;
        int a=n;
        while (a!=0) 
        {
            int dv=a%10;
            a=a/10;
            sodng=sodng*10 + dv;
        }
        if (sodng==n)
            System.out.println("So "+n+" la mot so doi xung");
        else    
            System.out.println("So "+n+" khong phai la mot so doi xung");

    }
}
