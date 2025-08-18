package state;

public interface State {
    void insertCoin();
    void selectItem();
    void dispenseItem();
    void cancelTransaction();
    void refillItem();
    void dispenseChange();
    void dispenseRefund();
    void dispenseItemWithChange();
    void dispenseItemWithRefund();
}