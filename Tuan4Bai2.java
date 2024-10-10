import java.util.*;
public class Tuan4Bai2 {
    public static void main(String[] args) {
        System.out.println("Ban muon in chuong so may?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=10;i++)
            System.out.println(""+n+"x"+i+"="+n*i+"");
    }
}
