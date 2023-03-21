import java.io.File;
import java.util.Scanner;

class findDirectoryWithMaximumNumberOfFiles{
    static int maxNOF = 0;
    static String MNOF_Directory = null;
    static int currentNOF = 0;
    static String MNOF_DirectoryPath = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        ./Files/basedir
        System.out.print("Enter the path of the folder: ");
        File file = new File(sc.next());
        goRecursive(file);
        System.out.printf("\nFile Name: %s" +
                        "\nAbsolute Path: %s" +
                        "\nNumber of Files: %d",
                MNOF_Directory, MNOF_DirectoryPath, maxNOF);
    }

    public static void goRecursive(File dir) {
        if (currentNOF > maxNOF) {
            MNOF_Directory = dir.getName();
            MNOF_DirectoryPath = dir.getAbsolutePath();
        }
        if (dir.isDirectory() && dir.listFiles().length != 0) {

            currentNOF = dir.listFiles().length;
            for (File subdir : dir.listFiles()) {
                goRecursive(subdir);
            }
            maxNOF = Math.max(maxNOF, currentNOF);
            --currentNOF;
        } else {
            return;
        }
    }
}