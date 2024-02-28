
public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];

        readers[0] = new Reader("Петров В. В.", 12345, "Факультет 1", "01.01.1990", "+7(123)456-78-90");
        readers[1] = new Reader("Иванов И. И.", 23456, "Факультет 2", "02.02.1991", "+7(234)567-89-01");
        readers[2] = new Reader("Сидоров А. А.", 34567, "Факультет 3", "03.03.1992", "+7(345)678-90-12");
        readers[3] = new Reader("Козлов Н. Н.", 45678, "Факультет 4", "04.04.1993", "+7(456)789-01-23");
        readers[4] = new Reader("Петрова Е. В.", 56789, "Факультет 5", "05.05.1994", "+7(567)890-12-34");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].returnBook(4);
        readers[3].returnBook("Приключения", "Словарь", "Энциклопедия");
    }
}
class Reader {
    public String fullName;
    public int readerTicketNumber;
    public String faculty;
    public String dateOfBirth;
    public String phoneNumber;

    public Reader(String fullName, int readerTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
    }
}

