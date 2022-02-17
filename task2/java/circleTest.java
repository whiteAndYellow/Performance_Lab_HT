import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class circleTest {
    public static void main(String[] args) throws IOException {
        Path circlePath = Paths.get(args[0]);
        Path dotsPath = Paths.get(args[1]);

        demoCircle circle  = new demoCircle(circlePath);
        List<String> dots = Files.readAllLines(dotsPath);
        dots.forEach(d -> System.out.println(circle.isDotInCircle(d)));
    }
}
