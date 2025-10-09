import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fileCounter = 0;

        while (true) {
            System.out.print("Укажите путь к файлу: ");
            String path = new Scanner (System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            // Если файл не существует или указан путь не к файлу
            if (!fileExists) {
                System.out.println("Файл не существует.");
                continue;
            } else if (isDirectory) {
                System.out.println("Указанный путь ведет к папке, а не к файлу.");
                continue;
            }
            // Если файл существует и это не папка.
            System.out.println("Путь указан верно");
            fileCounter++;
            System.out.println("Это файл номер " + fileCounter);
        }
    }
}
