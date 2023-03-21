package working_with_data.file_processing;

import java.io.File;
import java.util.Scanner;

public class TheDeepestFile {

    static int maxLevel = 0;
    static String deepestFileName = null;
    static int currentLevel = 0;
    static String deepestPath = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        ./Files/basedir1
        System.out.print("Enter the path of the folder: ");
        File file = new File(sc.next());
        goRecursive(file);
        System.out.printf("\nFile Name: %s\nAbsolute Path: %s\nLevel from input directory: %d", deepestFileName,
                deepestPath, maxLevel);
    }

    public static void goRecursive(File dir) {
        if (currentLevel > maxLevel) {
            deepestFileName = dir.getName();
            deepestPath = dir.getAbsolutePath();
        }
        if (dir.isDirectory() && dir.listFiles().length != 0) {
            ++currentLevel;
            for (File subdir : dir.listFiles()) {
                goRecursive(subdir);
            }
            maxLevel = Math.max(maxLevel, currentLevel);
            --currentLevel;
        } else {
            return;
        }
    }
}