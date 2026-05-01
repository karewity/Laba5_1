class Main {
    public static void main(String[] args) {
        System.out.println("Работа в ветке dev запущена");
        int step = 1;
        System.out.println("Шаг выполнения: " + step);
        showBranchInfo();

    }
    static void showBranchInfo() {
        System.out.println(">>> Текущая ветка: dev");
    }
}