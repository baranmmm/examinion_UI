package newSample.pages;


import newSample.utilities.Driver;

public class PageInitializer extends Driver {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static StudentsPage studentsPage;


    public static void initialize() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        studentsPage = new StudentsPage();
    }
}
