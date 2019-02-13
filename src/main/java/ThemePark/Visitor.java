package ThemePark;

public class Visitor {
    private int age;
    private int height;
    private int money;

    public Visitor(int age, int height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }

    public boolean canAfford(int amount){
        return amount <= this.money;
    }

    public void payMoney(int amount){
        if (canAfford(amount)){
            this.money -= amount;
        }
    }
}
