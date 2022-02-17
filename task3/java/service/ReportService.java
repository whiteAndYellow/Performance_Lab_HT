package service;

import entity.Report;
import entity.TestUnit;

public class ReportService {
    private Report report;
    private ValueService service;

    public ReportService(Report report, ValueService service) {
        this.report = report;
        this.service = service;
    }

    public void fillReport(){
        report.getTests().forEach(this::setValuePass);
    }

    public void setValuePass(TestUnit test){
        test.setValue(service.getValue(test.getId()));
        if (test.getValues() != null ) test.getValues().forEach(this::setValuePass);
    }

    public Report getReport() {
        return report;
    }
}
