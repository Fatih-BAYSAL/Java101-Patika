package StudentsInfo;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Fatih Baysal", "905555509090", "TRH");
        Teacher t2 = new Teacher("Sude Naz", "05556765543", "FZK");
        Teacher t3 = new Teacher("Adem Say", "05654563637", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("Salih Kal", "2211", "4", tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();



    }
}
