public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "6666 № 12345678";
        post.patronymic = "Александрович";
        post.phone = "+7 (999)-898-66-66";
        post.surname = "Макаров";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 6;
        post.birthday.year = 1986;

    }
}
