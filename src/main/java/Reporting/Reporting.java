package Reporting;

public class Reporting {
    public static void main(String[] args) {

        //оздать иерархию классов Report. При конструировании принимает на вход некую Строку. Этот
//класс имеет метод getReport(), который возвращает эту строку.
//Создать дочерний класс TimestampedReport, который переопределяет метод getReport() таким образом,
//что возвращается строка,а затем текущую дату
//(получает ее с помощью new Date(System.currentTimeMillis()).
//Потом этот объект можно выводить на консоль)
//Создать дочерний класс UsernameReport, который переопределяет метод getReport() таким образом, что возвращается строка,
//содержащая имя пользователя (получает его  с помощью System.getProperty("user.name")
//
        Report pasport = new Report();
        pasport.getReport("Отчет");
        TimestampedReport pasportStudent = new TimestampedReport();
        pasportStudent.getReport("Баланс");
        UsernameReport pasportUK = new UsernameReport();
        pasportUK.getReport("56.23 pounds");
        System.out.println("Количество объектов, созданных в классе: " + (UsernameReport.counterObjects));
    }
}
