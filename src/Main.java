public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        String fullNameUpper = fullName.toUpperCase() ;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUpper);
    }
}