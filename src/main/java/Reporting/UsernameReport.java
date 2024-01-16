package Reporting;

public class UsernameReport extends Report{
    @Override
    public void getReport(String name){
        super.getReport(name);
        System.out.println(System.getProperty("user.name"));
    }
}
