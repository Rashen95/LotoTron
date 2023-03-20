public class Toy {
    private final int id;
    private final String name;
    private int quantity;
    private final int chance;

    public String getInformation() {
        return String.format("<><><><><><><><><><><><><><><><><><><><><><>\nID:%d  Имя:%s  Количество:%d  " +
                        "Шанс выпадения(в процентах):%d", id, this.name,
                this.quantity, this.chance);
    }

    public Toy (int arg_id, String arg_name, int arg_quantity, int arg_chance){
        this.id = arg_id;
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
