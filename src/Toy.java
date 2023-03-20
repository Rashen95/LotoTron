public class Toy {
    static int id = 0;
    private final String name;
    private int quantity;
    private final int chance;

    public String getInformation() {
        return String.format("<><><><><><><><><><><><>\nID:%d, Name:%s, Quantity:%d, DropChance:%d", id, this.name,
                this.quantity, this.chance);
    }

    public Toy (String arg_name, int arg_quantity, int arg_chance){
        id += 1;
        this.name = arg_name;
        this.quantity = arg_quantity;
        this. chance = arg_chance;
    }

    public void setQuantity(){
        this.quantity -= 1;
    }
    public int getQuantity() {
        return quantity;
    }
}
