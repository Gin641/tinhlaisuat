import java.util.Scanner;

public class tinhlaisuat {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền vào: ");
        money = sc.nextDouble();
        System.out.print("nhập số tháng vào: ");
        month = sc.nextInt();
        System.out.print("nhập lãi suất: ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 *3;
        }
        System.out.println("total of interset : " + total_interset);
    }
}
