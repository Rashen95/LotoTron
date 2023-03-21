public class UInterfaceMess {
    private static final String greetings = """
            \n<><><><><><><><><><><><><><>
            Добро пожаловать в лототрон
            <><><><><><><><><><><><><><>""";
    private static final String menu = """
            \n1. Вывести список игрушек лототрона и их параметры
            2. Добавить игрушек в лототрон
            3. Разыграть игрушку
            4. Закончить игру в лототрон""";
    private static final String exitGame = """
            \n<><><><><><><><><><><><>
            Завершаю работу лототрона
            <><><><><><><><><><><><>""";
    private static final String errorItemMissing = """
            \n<><><><><><><><><><><>
            Нет такого пункта меню
            <><><><><><><><><><><>""";
    private static final String newToyName = "\nВведите имя новой игрушки: ";
    private static final String newToyQuantity = "\nКоличество вновь добавляемых игрушек: ";
    private static final String newToyChance = "\nШанс выпадения этой игрушки(от 1 до 100): ";
    private static final String chanceError = """
            \n<><><><><><><><><><><><><><><><><><><><>
            Вы должны ввести целое число от 1 до 100
            <><><><><><><><><><><><><><><><><><><><>""";
    private static final String quantityError = """
            \n<><><><><><><><><><><><><><><><><><><><>
            Вы должны ввести целое число не меньше 1
            <><><><><><><><><><><><><><><><><><><><>""";
    private static final String nameError = """
            \n<><><><><><><><><><><><>
            Имя не может быть пустым
            <><><><><><><><><><><><>""";
    private static final String emptyLototron = """
            \n<><><><><><><><><><><><><><><><><><><>
            Лототрон пуст, нужно добавить игрушек
            <><><><><><><><><><><><><><><><><><><>""";

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

    public String getNewToyName() {
        return newToyName;
    }

    public String getNewToyQuantity() {
        return newToyQuantity;
    }

    public String getNewToyChance() {
        return newToyChance;
    }

    public String getChanceError() {
        return chanceError;
    }

    public String getQuantityError() {
        return quantityError;
    }

    public String getNameError() {
        return nameError;
    }
    public String winMess(String s) {
        return String.format("""
                \n<><><><><><><><><><><><><><><><><><>
                Вы выиграли игрушку %s, поздравляем!
                <><><><><><><><><><><><><><><><><><>""", s);
    }
    public String getEmptyLototron() {
        return emptyLototron;
    }
}