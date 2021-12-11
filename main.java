package project_cuaGai;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        infor crush = new infor();
        infor.Fullname crushName = crush.new Fullname();
        infor.Born crushBorn = crush.new Born();

        System.out.println(" \n\n\t\t||    ||  ||####  ||     ||     ");
        System.out.println(" \t\t|| ## ||  ||##    ||     ||     ");
        System.out.println(" \t\t||    ||  ||####  ||###  ||###  ");


            System.out.println("\n\n\t\tXIN CHÀO BẠN HÃY CÙNG TÔI CHƠI MỘT TRÒ CHƠI NHỎ NÀO....");


            System.out.print("\n\t\tNHẬP TÊN ĐỆM CỦA BẠN NÀO : ");
            String fistName = scanner.next();
            crushName.setFistName(fistName);
            System.out.print("\n\t\tNhập Tên CỦA BẠN NÀO: ");
            String lastName = scanner.next();
            crushName.setLastName(lastName);

        int ngayS;
            do{
                System.out.print("\n\t\tNHẬP NGÀY SINH CỦA BẠN ");
                ngayS = scanner.nextInt();
                crushBorn.setNgayS(ngayS);
            }while( ngayS < 1 || ngayS > 30);


            int thangS;

                System.out.print("\n\t\tNHẬP THÁNG SINH CỦA BẠN: ");
                thangS = scanner.nextInt();
            switch (thangS){
                case 1,3,5,7,8,12 :{
                    crushBorn.setThangS(thangS);
                }
                case 4,6,9,11:{
                    crushBorn.setThangS(thangS);
                }
                case 2:{
                    if( ngayS == 28 && ngayS == 29){
                        crushBorn.setThangS(thangS);

                    }
                }
            }//end swich

            int namS;
            do{
                System.out.print("\n\t\tNHẬP NĂM SINH CỦA BẠN: ");
                namS = scanner.nextInt();
                crushBorn.setNamS(namS);
            }while( namS < 1992 ||  namS > 2022);


        int age = (2022 - namS);
        System.out.println("\t\t\n\n ");
        System.out.printf("\n\t\t%-10s %-10s %-5s", "Họ", "Tên", "Tuổi\n");
        System.out.printf("\t\t%-10s %-10s %-5d \n" , fistName, lastName, age);







//        System.out.print("\n\t\tNhập Sở Thích Khác Của Bạn: ");
//        String ortherFv = scanner.nextLine();
//        crush.setFavorite_orther(ortherFv);

        System.out.println("\n\n\t\tChào " + crushName.getLastName()  +"...........\n ");
        System.out.println("\t\tAnh có một câu hỏi này hi vọng em sẽ trả lời. \n");


        char ans;
        do{
            System.out.print("\t\tHãy Cho Anh Một Câu Trả: Y or N...\t");
            ans = scanner.next().charAt(0);
        }while( ! (ans == 'y' || ans =='Y') );

        crush.ans(scanner);
//
//        int age = (2022 - namS);
//        System.out.println("Em Hãy Nhìn Xem Anh Đã làm Gì Nào");
//        System.out.printf("\n\n\t\t %-10s %-5d ", "Tên", "Tuổi\n");
//        System.out.printf("\t\t%-10s %-5d \n" , (fistName + " " + lastName), age);








    }


}
