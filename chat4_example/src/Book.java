public class Book {
    class InnerBook {
        String title;
        String author;

        public InnerBook(String t) {
            title = t;
            author = "작자미상";
        }

        public InnerBook(String t, String a) {
            title = t;
            author = a;
        }
    }

    public Book() {
        InnerBook littlePrince = new InnerBook("어린왕자", "생텍쥐페리");

        InnerBook loveStroy = new InnerBook("춘향전");

        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStroy.title + " " + loveStroy.author);
    }
}
