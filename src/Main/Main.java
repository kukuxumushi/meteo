package Main;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        java.lang.System.out.println("      [Processing start]");
        System system = new System();
        double workTimeBegin = java.lang.System.nanoTime() / 1000000000.0;
        system.searchData();
        double workTimeEnd = java.lang.System.nanoTime() / 1000000000.0;
        java.lang.System.out.println("Total time - " + (workTimeEnd - workTimeBegin));
        java.lang.System.out.println("Полный лог обработки смотрите Log.txt");
    }
}
