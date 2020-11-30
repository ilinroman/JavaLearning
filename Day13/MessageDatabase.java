package Day13;

import java.util.ArrayList;
import java.util.List;

/**
 * Чат
 */
class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    /**
     * этот метод “отправляет” новое сообщение от пользователя ​ u1​ пользователю
     * u2​ с текстом ​ text
     * @param u1
     * @param u2
     * @param text
     */
    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    /**
     * возвращает список всех
     * сообщений в “базе данных”
     * @return
     */
    public static List<Message> getMessages(){
        return MessageDatabase.messages;
    }

    /**
     * этот метод
     * должен вывести цепочку сообщений (диалог) пользователей ​ u1​ и ​ u2
     * @param u1
     * @param u2
     */
    public static void showDialog(User u1, User u2){
        String userName1 = u1.getUsername();
        String userName2 = u2.getUsername();
        for (Message m:
             messages) {
            if(m.sender == u1 && m.receiver == u2)
                System.out.printf("%s: %s\n", userName1, m.getText());
            else if(m.sender == u2 && m.receiver == u1)
                System.out.printf("%s: %s\n", userName2, m.getText());
        }

    }
}
