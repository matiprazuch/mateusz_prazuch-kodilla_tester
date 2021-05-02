public class Notebook {

    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 1200) {
            System.out.println("This notebook is cheap.");
        }
        else if (this.price >= 1200 && this.price < 2200){
            System.out.println("This notebook has an average price.");
        }
        else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This notebook is light");
        }
        else if (this.weight == "2000g" || this.weight == "1200g") {
            System.out.println("This notebook has an average weight.");
        }
        else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year >= 2017 && this.year <= 2018 && this.price <= 2200 && this.price >= 1200) {
            System.out.println("This notebook is not that old and has an average price.");
        }
        else if (this.year > 2018 && this.price > 2200) {
            System.out.println("This notebook is new and expensive.");
        }
        else {
            System.out.println("This notebook is old and cheap.");
        }
    }

}
