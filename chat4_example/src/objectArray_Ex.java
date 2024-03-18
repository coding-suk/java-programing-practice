import java.util.Scanner;

public class objectArray_Ex {
    class BookArray {
        String title, author;
        public BookArray (String title, String author) { // 생성자
            this.title = title;
            this.author = author;
        }
    }

    public objectArray_Ex() {
        Scanner sc = new Scanner(System.in);
        BookArray[] book = new BookArray[2];

        for (int i = 0;i<book.length;i++) { // book.length = 2;
            System.out.print("제목 ");
            String title = sc.nextLine();
            System.out.print("저자 ");
            String author = sc.nextLine();
            book[i] = new BookArray(title,author);
        }

        for(int i=0;i<book.length;i++) {
            System.out.print("(" + book[i].title + "," + book[i].author + ")");
        }
    }
}
