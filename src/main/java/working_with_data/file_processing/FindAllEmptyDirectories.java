package working_with_data.file_processing;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindAllEmptyDirectories {
    static Scanner sc = new Scanner(System.in);
    static List<String> emptyDirectories = new LinkedList<>();

    public static void main(String[] args) {
        System.out.print("Enter the path of the folder: ");
        File file = new File(sc.next());
        goRecursive(file);
        System.out.print("Empty Directories: ");
        emptyDirectories.forEach(d -> System.out.print(d + " "));
    }

    public static void goRecursive(File dir) {
        if (dir.isDirectory() && dir.listFiles().length != 0) {
            for (File subdir : dir.listFiles()) {
                goRecursive(subdir);
            }
        } else if (dir.isDirectory() && dir.listFiles().length == 0) {
            emptyDirectories.add(dir.getName());
        } else {
            return;
        }
    }
}