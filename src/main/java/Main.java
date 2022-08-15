public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate(); {
            post.birthday.day = 13;
            post.birthday.month = 12;
            post.birthday.year = 1887;
        }
        post.name = "Иван";
        post.passport = "1234 N 567890";
        post.patronymic = "Евграфович";
        post.phone = "89997776655";
        post.surname = "Крузенштерн";
        post.subscription = true;


    }
}
