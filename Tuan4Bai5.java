import java.util.*;
public class Tuan4Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap 2 so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x=a;
        int y=b;
        while (x%y!=0) 
        {
            int r=x%y;
            x=y;
            y=r;
        }
        System.out.println("UCLN cua "+a+" va "+b+" la "+y+"");
        if (a>b)
            for (int i=a;i<=a*b;i++)
                if (i%b==0&&i%a==0)
            {
                System.out.println("BCNN cua "+a+" va "+b+" la "+i+"");
                break;
            }
        if (a<b)
            for (int i=b;i<=a*b;i++)
                if (i%b==0&&i%a==0)
            {
                System.out.println("BCNN cua "+a+" va "+b+" la "+i+"");
                break;
            }
    }
}
