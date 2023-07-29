package lld.ObserverDesignPattern.observable;

import lld.ObserverDesignPattern.observer.NotificationObserver;

public interface OnlineShopping {

    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifySusbcribers();

    public void setCount(int count);

    public int getStock();


}
