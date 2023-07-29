package lld.ObserverDesignPattern;

import lld.ObserverDesignPattern.observable.Amazon;
import lld.ObserverDesignPattern.observable.OnlineShopping;
import lld.ObserverDesignPattern.observer.EmailNotificationObserver;
import lld.ObserverDesignPattern.observer.MobileNotificationOberver;
import lld.ObserverDesignPattern.observer.NotificationObserver;

public class ObserverPattern {

    public static void main(String[] args) {

        OnlineShopping onlineShopping = new Amazon();

        NotificationObserver observer1 = new EmailNotificationObserver("sac@gmai.com", onlineShopping);
        NotificationObserver observer2 = new MobileNotificationOberver("2314414141", onlineShopping);
        NotificationObserver observer3 = new EmailNotificationObserver("dasdadsc@gmai.com", onlineShopping);

        onlineShopping.add(observer1);
        onlineShopping.add(observer2);
        onlineShopping.add(observer3);

        onlineShopping.setCount(6);

        onlineShopping.notifySusbcribers();


    }
}
