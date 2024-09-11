
package angel;



public class product2 {

    int id;
    String name;
    double price;
    int stocks, tep;
    
    public static void addproduct (int id, String name, double price, int stocks) {
        this.id = zid;
        this.name = zname;
        this.price = zprice;
        this.stocks = zstocks;
    }
    public void viewProducts(){
     double profit = this.price + this.sold;
     double tep = this.stocks + this.price;
      String status = (this.stocks > 0) ? "Available" : "Out-of-stock";
        
      System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f\n",
        this.id, this.name, this.price, this.stocks, this.sold, profit, tep);
    }
    
}

