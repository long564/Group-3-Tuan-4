import java.util.*;
public class Tuan4Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n: ");
        int n = sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
            s=s+i;
        System.out.println("Tong la "+s+"");
    }
}