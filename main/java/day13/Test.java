package Day13;

/**
 * Проверка
 */
public class Test {
    public static void main(String[] args) {
        //создать трех пользователей
        User user1 = new User("User 1");
        User user2 = new User("User 2");
        User user3 = new User("User 3");
        user2.subscribe(user1);
        user1.subscribe(user2);

        //Отправить 2 сообщения от пользователя 1 пользователю 2
        MessageDatabase.sendMessage(user1, user2,
            "Привет, " + (user2.isSubscribed(user1) ? "подписчик " : "") + user2.getUsername());
        MessageDatabase.sendMessage(user1, user2, "Ты знаешь джаву?");

        //Отправить 3 сообщения от пользователя 2 пользователю 1
        user2.sendMessage(user1,
            "Привет" + (user2.isSFriend(user1) ? ", мой друг" : ""));
        user2.sendMessage(user1, "Да, я крутой джавист");
        user2.sendMessage(user1, "Да, я супер крутой");

        //Отправить 3 сообщения от пользователя 3 пользователю 1
        user3.sendMessage(user1, "Дарова, парни!");
        user3.sendMessage(user1, "А я офигенный сибелист");
        user3.sendMessage(user1, "А вы знаете Siebel?");

        //Отправить 3 сообщения от пользователя 1 пользователю 3
        user1.sendMessage(user3, "Siebel отстой");
        user1.sendMessage(user3, "Java рулит");
        user1.sendMessage(user3, "...");

        //Отправить 1 сообщение от пользователя 3 пользователю 1
        user3.sendMessage(user1, "TBUI");
        user3.sendMessage(user1, "WF");
        user3.sendMessage(user1, "EAI");

        MessageDatabase.showDialog(user1, user3);

        //Другие тесты
        System.out.printf("\n--- Другие тесты ---\n\n");
        System.out.println(MessageDatabase.getMessages().get(0));
        System.out.println(MessageDatabase.getMessages().get(2));
    }
}
