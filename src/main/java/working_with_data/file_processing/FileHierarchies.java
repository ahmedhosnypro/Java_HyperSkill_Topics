import java.io.File;

public class FileHierarchies {
    public static void tryFileHierarchies() {
        File completedProjsDirectory = new File("./Files/CompletedProjects");
        File[] projects = completedProjsDirectory.listFiles(); // HelloWorld and JCalculator

        File helloWorldProject = findFileByName(projects, "HelloWorld"); // just find a file

        File reviews = findFileByName(helloWorldProject.listFiles(), "Reviews.txt");

        File files = completedProjsDirectory.getParentFile();

        File Music = findFileByName(files.listFiles(), "Music");
        File soundtracks = findFileByName(Music.listFiles(), "Soundtracks");


        int length = soundtracks.listFiles().length;

    }

    static File findFileByName(File[] files, String fileName) {
        File ret = null;
        for (File file : files) {
            if (file.getName().equals(fileName)) {
                ret = file;
                break;
            }
        }
        return ret;
    }
}
