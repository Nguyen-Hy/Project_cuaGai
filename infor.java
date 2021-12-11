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

        System.out.println("\n\n\t\tDạo này em có khoẻ không ?\n" +
                "\n" +
                "\t\tNơi mà em ở mùa đông thế nào ?\n" +
                "\n" +
                "\t\tCó làm lòng dạ cồn cào ?\n" +
                "\n" +
                "\t\tCó làm thương nhớ nghẹn ngào như anh ?\n" +
                "\n" +
                "\t\tMột năm nhanh quá, em xem\n" +
                "\n" +
                "\t\tThế mà đâu đó trong anh vẫn buồn\n" +
                "\n" +
                "\t\tVì đời lắm lúc quay cuồng\n" +
                "\n" +
                "\t\tNhưng sau tất cả nỗi buồn vẫn đây\n" +
                "\n" +
                "\t\tGửi vào đâu đó trời mây\n" +
                "\n" +
                "\t\tRằng anh vẫn ổn chỉ hay nhớ người\n" +
                "\n" +
                "\t\tKhông sao, anh hứa siêng cười\n" +
                "\n" +
                "\t\tNhưng mà cũng chẳng thể lười nhớ em!\n" +
                "\n\t\tLiệu Em Có Nhớ Anh Chăng ");
        char ans;
        do{
            System.out.print("\t\tEm Sẽ Trả Lời Anh Chứ?: Y or N...\t");
           ans = scanner.next().charAt(0);
        }while( ! (ans == 'y' || ans == 'Y') );

            System.out.print("\n\n\t\tNhân gian vốn lắm bộn bề.\n" +
                    "\n" +
                    "\t\tSao không bỏ hết rồi về bên nhau.\n" +
                    "\n\t\tLiệu hai ta có cơ hội về chung 1 nhà với nhau không? \n" );
        char ans2;
        do{
            System.out.print("\t\tEm Sẽ Trả Lời Anh Chứ?: Y or N...\t");
            ans2 = scanner.next().charAt(0);
        }while( ! (ans2 == 'y' || ans2 == 'Y') );


        System.out.println("\n\n\t\tAnh gửi tặng em một cành bông\n" +
                        "\n" +
                        "\t\tHoa chen đôi lá buộc nhành hông\n" +
                        "\n" +
                        "\t\tĐỏ pha chút tía ửng thêm hồng\n" +
                        "\n" +
                        "\t\tLiệu chăng em có động lòng không?" );
        char ans3;
        do{
            System.out.print("\t\t\tHãy nhập câu trả lời: Y or N...");
            ans3 = scanner.next().charAt(0);
        }while( ! (ans3 == 'y' || ans3 == 'Y') );
        System.out.println("\n\t\tTHẬT RA THÌ ANH ĐÃ THÍCH EM TỪ LÂU RỒI, HÔM NAY ANH LẤY HẾT CAN ĐẢM ĐỂ NÓI LÊN THÀNH "
                + " Ý CỦA MÌNH ĐỐI VỚI EM. CẢM ƠN EM VÌ ĐÃ CHO ANH MỘT CƠ HỘI QUÝ GIÁ NÀY ĐỂ ĐƯỢC Ở BÊN CẠNH EM. CHÚNG TA HÃY CÙNG NHƯ SỐNG NHỮNG THÁNG NGÀY HẠNH PHÚC THẬT TƯƠI ĐẸP.....");

    }


///////////////////////
//    public void ques2(){
//        System.out.println("\n\n\t\tChào " +  +"...........\n ");
//        System.out.println("\t\tAnh có một câu hỏi này hi vọng em sẽ trả lời. \n");
//        System.out.print("\t\tEm Sẽ Trả Lời Anh Chứ?: Y or N...\t");
//        System.out.println("");
//    }



}
