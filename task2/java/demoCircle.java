import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class demoCircle {
    private final float centerX;
    private final float centerY;
    private final double radius;

    public demoCircle(Path circlePath) throws IOException {
        List<String> lines =  Files.readAllLines(circlePath);
        centerX = Float.parseFloat(lines.get(0).split(" ")[0]);
        centerY = Float.parseFloat(lines.get(0).split(" ")[1]);
        radius = Double.parseDouble(lines.get(1));
    }

    public int isDotInCircle(String dot){
        String[] arr = dot.split(" ");
        float dotX = Float.parseFloat(arr[0]);
        float dotY = Float.parseFloat(arr[1]);
        double difference = Math.sqrt(Math.pow((dotX-centerX),2)+Math.pow((dotY-centerY),2));
        if (difference>radius) return 2;
        if (difference<radius) return 1;
        else return 0;
    }
}
