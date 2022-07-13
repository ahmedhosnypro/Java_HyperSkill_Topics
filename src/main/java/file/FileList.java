package file;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

public class FileList {
    public static void main(String[] args) {
        boolean recursive = true;
        File root = new File("D:\\10-Work\\Waheed Baly\\فتاوى\\Facebook");
        Collection<File> files = FileUtils.listFiles(root, null, recursive);

        try (PrintWriter writer = new PrintWriter("D:\\7-Learn\\Java\\Java_HyperSkill_Topics\\src\\main\\java\\file\\list.txt", StandardCharsets.UTF_8)) {
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
