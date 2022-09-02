public class Main {
    public static void main(String[] args) {
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёныч";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        String fullNameUpper = fullName.toUpperCase() ;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUpper);
        fullName = fullName.replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);

        System.out.println(fullName.contains("ё"));
        System.out.println(fullName.contains("е"));
        System.out.println(fullName.split("ё").length);
        System.out.println(fullName.split("е").length);
    }
}