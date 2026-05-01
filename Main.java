class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        System.out.println("\nСтрока 2: работа продолжается");
        String project = "Lab 5";
        System.out.println("Проект: " + project);
        printInfo();
        System.out.println("Работа в ветке dev запущена");
        int step = 1;
        System.out.println("Шаг выполнения: " + step);
        showBranchInfo();
        System.out.println("Привет");
    }

    static void showBranchInfo() {
        System.out.println(">>> Текущая ветка: dev");
    }

    static void printInfo() {
        System.out.println(">>> Информация о работе");

    }
}