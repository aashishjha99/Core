package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.OnlineShopping;

public class EmailNotificationObserver implements NotificationObserver {

    private String emailId;
    private OnlineShopping onlineShopping;

    public EmailNotificationObserver(String emailId, OnlineShopping onlineShopping) {
        this.emailId = emailId;
        this.onlineShopping = onlineShopping;
    }

    @Override
    public void update() {

        sendMail(emailId, "Product is available hurry !");

    }

    public void sendMail(String mail, String msg) {
        System.out.println("Email sent to  : " + mail);
    }
}
