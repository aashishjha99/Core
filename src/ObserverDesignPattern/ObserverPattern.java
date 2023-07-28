package ObserverDesignPattern;

import ObserverDesignPattern.observable.Amazon;
import ObserverDesignPattern.observable.OnlineShopping;
import ObserverDesignPattern.observer.EmailNotificationObserver;
import ObserverDesignPattern.observer.MobileNotificationOberver;
import ObserverDesignPattern.observer.NotificationObserver;

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
