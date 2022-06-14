public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
        System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is lightweight.");
        } else if (this.weight > 1000 && this.weight <1700) {
            System.out.println("This notebook not too heavy");
        }else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkYear() {
        if (this.price < 1500 && this.year > 2010) {
            System.out.println("This notebook is too cheap to be good");
        } else if (this.price > 1000 && this.year >= 2010) {
            System.out.println("This notebook is very good");
        } else if (this.price < 1000 && this.year <= 2000) {
            System.out.println("This notebook is indestructible but slow");
        }
    }
}


