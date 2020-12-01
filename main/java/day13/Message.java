package Day13;

import java.util.Date;

/**
 * Сообщение
 */
class Message {
    User sender;
    User receiver;
    String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Вывод сообщения
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FROM: ").append(sender.getUsername()).append('\n');
        sb.append("TO: ").append(receiver.getUsername()).append('\n');
        sb.append("ON: ").append(this.date).append('\n');
        sb.append('\t').append(this.text).append('\n');
        return sb.toString();
    }
}
