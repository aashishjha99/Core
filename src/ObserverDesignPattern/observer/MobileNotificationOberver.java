package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.OnlineShopping;

public class MobileNotificationOberver implements NotificationObserver {

    private String mobileNotification;
    private OnlineShopping onlineShopping;

    public MobileNotificationOberver(String mobileNotification, OnlineShopping onlineShopping) {
        this.mobileNotification = mobileNotification;
        this.onlineShopping = onlineShopping;
    }

    @Override
    public void update() {

        sendMsgOnMobile(mobileNotification, "product is in stock hurry up!");
    }

    public void sendMsgOnMobile(String mobileNotification, String msg) {
        System.out.println("Send msg to contact number :" + mobileNotification);
    }
}
