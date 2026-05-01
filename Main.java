class Main {
    public static void main(String[] args) {
        System.out.println("Работа в ветке dev запущена");
        int step = 1;
        System.out.println("Шаг выполнения: " + step);
        showBranchInfo();
        System.out.println("Привет");

    }
    static void showBranchInfo() {
        System.out.println(">>> Текущая ветка: dev");
    }
}