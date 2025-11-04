package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {
    private List<String> data;

    public CSVProcessor(String inputFile, String outputFile) {
        //super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    protected void load() {
        System.out.println("loading CSV...");
        this.data.add("line 1");
        this.data.add("line 2");
        this.data.add("line 3");
    }

    protected void transform() {
        System.out.println("transforming CSV...");
        data.replaceAll(String::toUpperCase);
    }

    protected void save() {
        System.out.println("saving CSV...");
    }

}
