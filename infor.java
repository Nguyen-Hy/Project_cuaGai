package project_cuaGai;

import java.util.Scanner;

public class infor {

      private String fistName;
      private String lastName;
      private int age;
      private int ngayS;
      private int thangS;
      private int namS;
    //  private String birthday;
      private String favorite_foods;
      private String favorite_orther;
      private String favorite_drink;


      public void setFistName( String fistName ){
            this.fistName = fistName;
      }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNamS(int namS) {
        this.namS = namS;
    }

    public void setNgayS(int ngayS) {
        this.ngayS = ngayS;
    }

    public void setThangS(int thangS) {
        this.thangS = thangS;
    }

    public void setFavorite_foods(String favorite_foods) {
        this.favorite_foods = favorite_foods;
    }

    public void setFavorite_orther(String favorite_orther) {
        this.favorite_orther = favorite_orther;
    }

    public void setFavorite_drink(String favorite_drink) {
        this.favorite_drink = favorite_drink;
    }
/////////////////////////////////////////////////////////////////////
    public String getLastName( ){
        return lastName;
    }

    public String getFistName( ){
        return fistName;
    }

    public int getAge() {
        return age;
    }

    public int getNamS() {
        return namS;
    }

    public int getNgayS() {
        return ngayS;
    }

    public int getThangS() {
        return thangS;
    }

    public String getFavorite_foods() {
        return favorite_foods;
    }

    public String getFavorite_orther() {
        return favorite_orther;
    }

    public String getFavorite_drink() {
        return favorite_drink;
    }

//////////////////////////////////////////////////////////

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
        System.out.println("\n\t\tÔi Anh Thật Là May Mắn Khi Em Đã Cho Anh Cơ Hội Quý Giá Này Để Hai Ta Tìm Hiểu Nhau....");

    }


///////////////////////
    public void ques2(){
        System.out.println("\n\n\t\tChào " + getLastName() +"...........\n ");
        System.out.println("\t\tAnh có một câu hỏi này hi vọng em sẽ trả lời. \n");
        System.out.print("\t\tEm Sẽ Trả Lời Anh Chứ?: Y or N...\t");
        System.out.println("");
    }



}
