package session11.practice.dataTransformationSystem;

import java.util.List;

public abstract class Report {

    protected String title;
    protected List<String> data;

    Report (String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public abstract void showPreview();

    public void displayMetadata() {
        System.out.println("Title: " + title);
    }
}

interface PDFExportable {
    void exportToPdf();
}

interface CSVExportable {
    void exportToCsv();
}

class PDFReport extends Report implements PDFExportable {

    PDFReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportToPdf() {
    }
}

class CSVReport extends Report implements CSVExportable {

    CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
    }

    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    @Override
    public void exportToCsv() {
    }
}