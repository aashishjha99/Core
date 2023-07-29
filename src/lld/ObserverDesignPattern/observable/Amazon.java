package lld.ObserverDesignPattern.observable;

import lld.ObserverDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements OnlineShopping {

    List<NotificationObserver> observerList = new ArrayList<>();
    public int shopCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySusbcribers() {

        for (NotificationObserver observer : observerList) {
            observer.update();
        }

    }

    @Override
    public void setCount(int count) {

        if (count == 0) {
            notifySusbcribers();
        }

        shopCount += count;

    }

    @Override
    public int getStock() {
        return shopCount;
    }
}
