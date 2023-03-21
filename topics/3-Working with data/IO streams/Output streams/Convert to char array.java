import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {
    public static char[] convert(String[] Words) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        for (String word : Words) {
            charArrayWriter.write(word);
        }
        return charArrayWriter.toCharArray();
    }
}