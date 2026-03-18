class Product{
    private double price;
    private double discount;
    public void setPrice(double price){
        this.price = price;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getFinalPrice(){
        return price - (price * discount / 100);
    }
    public static void main(String[] args){
        Product p = new Product();
        p.setPrice(1000);
        p.setDiscount(15);
        System.out.println(p.getFinalPrice());
    }
}
