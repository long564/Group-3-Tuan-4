import java.util.*;
public class Tuan4Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n:");
        int n = sc.nextInt();
        int gth=1;
        for (int i=n;i>=1;i--)
            gth=gth*i;
        System.out.println("Giai thua cua "+n+" la "+gth+"");
    }
}
