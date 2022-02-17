import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class homogenizeArray {
    public static void main(String[] args) throws IOException {
        Path numbersFilePath = Paths.get(args[0]);
        List<Integer> numbers = Files.readAllLines(numbersFilePath).stream()
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        for (int i = numbers.get(0); i < numbers.get(numbers.size()-1); i++) {
            resultList.add(normalize(numbers,i));
        }

        System.out.println(resultList.stream().min(Integer::compare).get());
    }

    private static int normalize(List<Integer> list, int num){
        int result=0;
        for(int i : list)  result += Math.abs(i-num);
        return result;
    }
}
