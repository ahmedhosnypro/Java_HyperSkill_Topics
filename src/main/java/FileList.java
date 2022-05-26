import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.Collection;

public class FileList {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        boolean recursive = true;
        File root = new File("E:\\الفتاوى\\ممنتج");
        Collection<File> files = FileUtils.listFiles(root, null, recursive);

        try (PrintWriter writer = new PrintWriter("E:\\الفتاوى\\ممنتج\\l.txt", "UTF-16")) {
            for (var file : files) {
                File file1 = new File(file.toString());
                System.out.println(file1.getName().replace(".mp4", "") + "\n");
            }
        } catch (IOException ignored) {
        }

    }
}
