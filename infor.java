package project_cuaGai;

import java.util.Scanner;

public class infor {


    public class Fullname{
        private String fistName;
        private String midName;
        private String lastName;

        public String getFistName() {
            return fistName;
        }

        public void setFistName(String fistName) {
            this.fistName = fistName;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    public class Foods{
        private String favorite_foods;
        private String favorite_orther;
        private String favorite_drink;
    }

    public class Born{
        private int age;
        private int ngayS;
        private int thangS;
        private int namS;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getNgayS() {
            return ngayS;
        }

        public void setNgayS(int ngayS) {
            this.ngayS = ngayS;
        }

        public int getThangS() {
            return thangS;
        }

        public void setThangS(int thangS) {
            this.thangS = thangS;
        }

        public int getNamS() {
            return namS;
        }

        public void setNamS(int namS) {
            this.namS = namS;
        }
    }

      private Fullname fullname;
      private Foods foods;
      private Born born;

//     public infor(){
//
//          fullname.midName = "";
//          fullname.lastName = "";
//
//          foods.favorite_drink = "";
//          foods.favorite_foods = "";
//          foods.favorite_orther = "";
//
//          born.age = 0;
//          born.namS = 0;
//          born.ngayS = 0;
//          born.thangS = 0;
//
//      }



    public void ans(Scanner scanner ){

        System.out.println("\n\n\t\tD???o n??y em c?? kho??? kh??ng ?\n" +
                "\n" +
                "\t\tN??i m?? em ??? m??a ????ng th??? n??o ?\n" +
                "\n" +
                "\t\tC?? l??m l??ng d??? c???n c??o ?\n" +
                "\n" +
                "\t\tC?? l??m th????ng nh??? ngh???n ng??o nh?? anh ?\n" +
                "\n" +
                "\t\tM???t n??m nhanh qu??, em xem\n" +
                "\n" +
                "\t\tTh??? m?? ????u ???? trong anh v???n bu???n\n" +
                "\n" +
                "\t\tV?? ?????i l???m l??c quay cu???ng\n" +
                "\n" +
                "\t\tNh??ng sau t???t c??? n???i bu???n v???n ????y\n" +
                "\n" +
                "\t\tG???i v??o ????u ???? tr???i m??y\n" +
                "\n" +
                "\t\tR???ng anh v???n ???n ch??? hay nh??? ng?????i\n" +
                "\n" +
                "\t\tKh??ng sao, anh h???a si??ng c?????i\n" +
                "\n" +
                "\t\tNh??ng m?? c??ng ch???ng th??? l?????i nh??? em!\n" +
                "\n\t\tLi???u Em C?? Nh??? Anh Ch??ng ");
        char ans;
        do{
            System.out.print("\t\tEm S??? Tr??? L???i Anh Ch????: Y or N...\t");
           ans = scanner.next().charAt(0);
        }while( ! (ans == 'y' || ans == 'Y') );

            System.out.print("\n\n\t\tNh??n gian v???n l???m b???n b???.\n" +
                    "\n" +
                    "\t\tSao kh??ng b??? h???t r???i v??? b??n nhau.\n" +
                    "\n\t\tLi???u hai ta c?? c?? h???i v??? chung 1 nh?? v???i nhau kh??ng? \n" );
        char ans2;
        do{
            System.out.print("\t\tEm S??? Tr??? L???i Anh Ch????: Y or N...\t");
            ans2 = scanner.next().charAt(0);
        }while( ! (ans2 == 'y' || ans2 == 'Y') );


        System.out.println("\n\n\t\tAnh g???i t???ng em m???t c??nh b??ng\n" +
                        "\n" +
                        "\t\tHoa chen ????i l?? bu???c nh??nh h??ng\n" +
                        "\n" +
                        "\t\t????? pha ch??t t??a ???ng th??m h???ng\n" +
                        "\n" +
                        "\t\tLi???u ch??ng em c?? ?????ng l??ng kh??ng?" );
        char ans3;
        do{
            System.out.print("\t\t\tH??y nh???p c??u tr??? l???i: Y or N...");
            ans3 = scanner.next().charAt(0);
        }while( ! (ans3 == 'y' || ans3 == 'Y') );
        System.out.println("\n\t\tTH???T RA TH?? ANH ???? TH??CH EM T??? L??U R???I, H??M NAY ANH L???Y H???T CAN ?????M ????? N??I L??N TH??NH "
                + " ?? C???A M??NH ?????I V???I EM. C???M ??N EM V?? ???? CHO ANH M???T C?? H???I QU?? GI?? N??Y ????? ???????C ??? B??N C???NH EM. CH??NG TA H??Y C??NG NH?? S???NG NH???NG TH??NG NG??Y H???NH PH??C TH???T T????I ?????P.....");

    }


///////////////////////
//    public void ques2(){
//        System.out.println("\n\n\t\tCh??o " +  +"...........\n ");
//        System.out.println("\t\tAnh c?? m???t c??u h???i n??y hi v???ng em s??? tr??? l???i. \n");
//        System.out.print("\t\tEm S??? Tr??? L???i Anh Ch????: Y or N...\t");
//        System.out.println("");
//    }



}
