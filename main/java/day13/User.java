package Day13;

import java.util.ArrayList;
import java.util.List;


/**
 * Пользователь
 */
class User {
    private String username;
    List<User> subscriptions; //пользователи, на кот подписан текущий пользователь

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    /**
     * подписывает пользователя на пользователя ​user
     * @param user
     */
    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    /**
     * Проверка подписки
     * @param user
     * @return
     * True​, если пользователь подписан на пользователя ​user;
     * ​False​, если не подписан
     */
    public boolean isSubscribed(User user){
        return this.subscriptions.contains(user);
    }

    /**
     * Дружба
     * @param user
     * @return возвращает ​ True​ , если
     * пользователь ​ user​является другом и ​ False​ , если пользователь ​ user​не
     * является другом
     */
    public boolean isSFriend(User user){
        return user.subscriptions.contains(this);
    }

    /**
     * отправляет сообщение с текстом ​ text​пользователю ​ user
     * @param user
     * @param text
     */
    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return this.username;
    }
}
