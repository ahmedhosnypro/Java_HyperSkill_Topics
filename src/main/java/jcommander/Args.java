package jcommander;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Args {
    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = {"-log", "-verbose"}, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    private String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = false;

    public static void main(String[] args) {
        Args arguments = new Args();
        String[] argv = {"-log", "2", "-groups", "unit"};
        JCommander.newBuilder()
                .addObject(arguments)
                .build()
                .parse(argv);
        System.out.println(arguments.verbose);
        System.out.println(arguments.groups);
        System.out.println(arguments.debug);
        System.out.println(arguments.parameters);
    }
}
