package Reporting;

public class Report{
    static int counterObjects = 0;
    public Report(){
        counterObjects++;
    }
    public void getReport(String name){
       System.out.println(name);
    }
}
