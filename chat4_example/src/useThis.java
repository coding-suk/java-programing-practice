public class useThis {
    public useThis() {
        BookApp littlePrince = new BookApp("어린왕자", "생텍쥐페리");
        BookApp loveStory = new BookApp("춘향전");
        BookApp emptyBook = new BookApp();
        loveStory.show();
    }

    class BookApp {
        String title;
        String author;

        void show() {
            System.out.println(title + " " + author);
        }
        public BookApp() {
            this("", "");
            System.out.println("생성자 호출됨");
        }

        public BookApp(String title) {
            this(title, "작자미상");
        }
        public BookApp(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
