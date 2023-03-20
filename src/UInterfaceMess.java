public class UInterfaceMess {
    private static final String greetings = "\nДобро пожаловать в лототрон";
    private static final String menu = """
            \n1. Вывести список игрушек лототрона и их параметры
            2. Добавить еще одну игрушку в лототрон
            3. Разыграть игрушку
            4. Закончить игру в лототрон""";
    private static final String goodbye = "\nМы будем ждать вас вновь";
    private static final String exitGame = "\nЗавершаю работу лототрона";
    private static final String errorItemMissing = "\nНет такого пункта меню";
    private static final String newToyName = "\nВведите имя новой игрушки: ";
    private static final String newToyQuantity = "\nКоличество вновь добавляемых игрушек: ";
    private static final String newToyChance = "\nШанс выпадения этой игрушки: ";

    public String getGreetings() {
        return greetings;
    }

    public String getMenu() {
        return menu;
    }

    public String getExitGame() {
        return exitGame;
    }

    public String getErrorItemMissing() {
        return errorItemMissing;
    }
}
