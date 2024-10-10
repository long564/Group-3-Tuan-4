import java.util.*;
public class Tuan4Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n: ");
        int n = sc.nextInt();
        int dem=0;
        for (int i=1;i<=n;i++)
            if (n%i==0)
                dem++;
        if (dem==2)
            System.out.println("So "+n+" la so nguyen to");
        else    
            System.out.println("So "+n+" khong phai so nguyen to");
    }
}
