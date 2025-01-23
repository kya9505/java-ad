package day10.BookMarket;

public class CartItem {
    private String[] itemBook = new String[7];
    private String bookID;
    private int quantity;
    private int totalPrice;

    public void setItemBook(String[] itemBook) {
        this.itemBook = itemBook;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
        this.updateTotalPrice();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateTotalPrice();
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice= totalPrice;
    }

    public String[] getItemBook() {
        return itemBook;
    }

    public String getBookID() {
        return bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public void updateTotalPrice(){
        totalPrice = Integer.parseInt(this.itemBook[2])*this.quantity;
    }
    public CartItem(){}
    public CartItem(String[] book){
        this.itemBook = book; //welcome - mCartItem[3]
        this.bookID = book[0]; //welcome - mCartItem[3][0]
        this.quantity = 1; //welcome - mCartItem.quantity
        updateTotalPrice();
    }


}
