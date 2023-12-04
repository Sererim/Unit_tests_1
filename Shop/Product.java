public class Product {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost <= 0) {
            throw new ArithmeticException("Cost can't be zero or negative, store is not a bank to give out money.");
        }
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() == 0) {
            throw new Error("Title can't be empty.");
        }
        this.title = title;
    }
}
