package Reporting;

import java.util.Date;

public class TimestampedReport extends Report{
    @Override
    public void getReport(String name){
        super.getReport(name);
        System.out.println(new Date(System.currentTimeMillis()));
    }
}
