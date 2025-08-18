package state.impl;

import state.State;

public class InitialState implements State {
    @Override
    public void insertCoin() {
        // Logic for inserting a coin in the initial state
        System.out.println("Coin inserted. Transitioning to CoinInsertedState.");
        // Transition to CoinInsertedState (not implemented here)
    }

    @Override
    public void selectItem() {
        // Logic for selecting an item in the initial state
        System.out.println("Please insert a coin before selecting an item.");
    }

    @Override
    public void dispenseItem() {
        // Logic for dispensing an item in the initial state
        System.out.println("No item can be dispensed without a coin.");
    }

    @Override
    public void cancelTransaction() {
        // Logic for canceling a transaction in the initial state
        System.out.println("No transaction to cancel in the initial state.");
    }

    @Override
    public void refillItem() {
        // Logic for refilling an item in the initial state
        System.out.println("Refill operation not allowed in the initial state.");
    }

    @Override
    public void dispenseChange() {
        // Logic for dispensing change in the initial state
        System.out.println("No change to dispense in the initial state.");
    }

    @Override
    public void dispenseRefund() {
        // Logic for dispensing a refund in the initial state
        System.out.println("No refund to dispense in the initial state.");
    }

    @Override
    public void dispenseItemWithChange() {
        // Logic for dispensing an item with change in the initial state
        System.out.println("Cannot dispense item with change in the initial state.");
    }

    @Override
    public void dispenseItemWithRefund() {
        // Logic for dispensing an item with refund in the initial state
        System.out.println("Cannot dispense item with refund in the initial state.");
    }
}
