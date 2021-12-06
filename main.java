package project_cuaGai;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        infor crush = new infor();

        System.out.println("\n\t\tFill In Your Information In The Table");
        System.out.print("\n\t\tNhập Họ : ");
        String fistName = scanner.next();
        crush.setFistName(fistName);
        System.out.print("\n\t\tNhập Tên: ");
        String lastName = scanner.next();
        crush.setLastName(lastName);

        int ngayS;
        do{
            System.out.print("\n\t\tNhập Ngày Sinh: ");
            ngayS = scanner.nextInt();
            crush.setNgayS(ngayS);
        }while( ngayS < 0 ||  ngayS > 30 );

        int thangS;
        do{
            System.out.print("\n\t\tNhập Tháng Sinh: ");
            thangS = scanner.nextInt();
            crush.setThangS(thangS);
        }while( thangS < 1 || thangS > 12);


        int namS;
        do{
            System.out.print("\n\t\tNhập Năm Sinh: ");
            namS = scanner.nextInt();
            crush.setNamS(namS);
        }while( namS < 1992 ||  namS > 2022);

        scanner.nextLine();
        System.out.print("\n\t\tNhập Thức Ăn Yêu Thích: ");
        String fvFood = scanner.nextLine();
        crush.setFavorite_foods(fvFood);
        System.out.print("\n\t\tNhập Thức Uống Yêu Thích: ");
        String fvDrink = scanner.nextLine();
        crush.setFavorite_drink(fvDrink);
        System.out.print("\n\t\tNhập Sở Thích Khác Của Bạn: ");
        String ortherFv = scanner.nextLine();
        crush.setFavorite_orther(ortherFv);

        System.out.println("\n\n\t\tChào " + crush.getLastName() +"...........\n ");
        System.out.println("\t\tAnh có một câu hỏi này hi vọng em sẽ trả lời. \n");

        char ans;
        do{
            System.out.print("\t\tHãy Cho Anh Một Câu Trả: Y or N...\t");
            ans = scanner.next().charAt(0);
        }while( ! (ans == 'y' || ans =='Y') );

        crush.ans(scanner);

        int age = (2022 - namS);
        System.out.printf("\n\n\t\t%-10s %-10s %-5s", "Họ", "Tên", "Tuổi\n");
        System.out.printf("\t\t%-10s %-10s %-5d \n" , fistName, lastName, age);
    }

}
