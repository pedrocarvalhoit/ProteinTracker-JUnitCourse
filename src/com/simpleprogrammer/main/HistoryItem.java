package com.simpleprogrammer.main;

public class HistoryItem {

    private final int id;
    private final int amount;
    private final String operation;
    private final int total;

    public int getAmount() {
        return amount;
    }

    public String getOperation() {
        return operation;
    }

    public int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public HistoryItem(int id, int amount, String operation, int total) {
        this.id = id;
        this.amount = amount;
        this.operation = operation;
        this.total = total;
    }
}
