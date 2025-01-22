package src.day11.Homwork;

public class ShopService {
    private static ShopService object;
    private ShopService(){};

    public static ShopService getInstance(){
        if(object == null){
            object = new ShopService();
        }
        return  object;
    }
}