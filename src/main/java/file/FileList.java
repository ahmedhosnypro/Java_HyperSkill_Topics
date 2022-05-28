package file;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

public class FileList {
    public static void main(String[] args) {
        boolean recursive = true;
        File root = new File("E:\\الفتاوى\\ممنتج");
        Collection<File> files = FileUtils.listFiles(root, null, recursive);

        try (PrintWriter writer = new PrintWriter("E:\\الفتاوى\\ممنتج\\l.txt", StandardCharsets.UTF_16)) {
            for (var file : files) {
                File file1 = new File(file.toString());
                String out = file1.getName().replace(".mp4", "") + "\n";
                System.out.println(out);
                writer.println(out);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
