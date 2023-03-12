package tarea9_5_6;

public class Main {
    public static void main(String[] args) {
        Person firstEmployee = new Person("Pedro", "Cruz", "Pomares", "1995-04-30", "Masculino", 212343);
        Person secondEmployee = new Person("Carlos", "Mengano", "Fulano", "1997-11-10", "Masculino", 323244);

        job physician = new job("médico de cabecera", "2020-03-01", "2021-03-01", 3000, firstEmployee, secondEmployee);
        job surgeon = new job("cirujano", "2021-03-01", "2050-01-02", 5000, firstEmployee, secondEmployee);

    }
}
