package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        HtmlReport htmlReport = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        String text1 = htmlReport.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println(text1);
    }
}
