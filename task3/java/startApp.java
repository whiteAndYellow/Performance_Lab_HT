import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Report;
import entity.Values;
import service.ReportService;
import service.ValueService;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class startApp {

    public static void main(String[] args) throws IOException {
        Path testsPath = Paths.get(args[0]);
        Path valuesPath = Paths.get(args[1]);
        ObjectMapper mapper = new ObjectMapper();

        //deserialize
        String testsString = String.join("", Files.readAllLines(testsPath));
        String valuesString = String.join("", Files.readAllLines(valuesPath));
        Report report = mapper.readValue(testsString,Report.class);
        Values values = mapper.readValue(valuesString, Values.class);

        //create report
        ValueService service = new ValueService(values.getValues());
        ReportService reportService = new ReportService(report,service);
        reportService.fillReport();

        //serialize and output
        Path path = Paths.get(new File(startApp.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getPath());
        path = path.getParent().resolve("report.json");
        Files.write(path,mapper.writeValueAsBytes(report));





    }
}
