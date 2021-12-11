package project_cuaGai;

public enum Hobby_foods {

    MILK_TEA("trà sữa"), PEACH_TEA("trà đào"), LITCHI_TEA("trà vải"), BEAR("bia"), WINE("rượu"), CAFFE("caffe đen"), MILK_CAFFE("cà phê sữa"),
    HOT_NOODLE("mì cay"), CHICHKEN_FIED("rà gán"), NODDLE_MAM("bún đậu mắm tôm"), GOBBLE("ăn tạp"), DUCK_EGGS("hột vịt lộn"), QUAIL_EGGS("trứng cút lộn") ;

    Hobby_foods(String food){
        this.foods = foods;
    }

    private String foods;

    public String getFoods(){
        return foods;
    }








}
