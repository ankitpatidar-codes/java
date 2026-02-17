

public class Book {
    private String Title;
    private String Author;
    private int price ;


    Book(String t, String A, int P){
       this.Title = t;
        this.Author = A;
        this.price = P;

    }
   public int getPrice(){
        return price;
   }

   void setPrice(int Price) {
       this.price = price;
   }
        void DisplayInfo() {
            System.out.println(" The Title of the Book is   " + Title);
            System.out.println("The Author  of the Book is   " + Author);
            System.out.println("The Price  of the Book is   " + price);

       }

    static void main(String[] args) {

        Book b = new Book("Ravindranath", "Ankit",700);
        b.DisplayInfo();
        b.setPrice(500);
        System.out.println("After updating price ");

        b.DisplayInfo();




    }
}
