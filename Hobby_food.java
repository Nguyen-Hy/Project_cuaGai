package project_cuaGai;

public enum Hobby_food {

    MILK_TEA("trà sữa"), PEACH_TEA("trà đào"), BEAR("bia"), HOTNOODLE("mì cay"), CHICHKEN_FIED("rà gán"), NODDLE_MAM("bún đậu mắm tôm"), GOBBLE("ăn tạp");

    Hobby_food(String food){
        this.food = food;
    }

    private String food;

    public String getFood(){
        return food;
    }








}
