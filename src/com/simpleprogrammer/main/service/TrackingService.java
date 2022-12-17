package com.simpleprogrammer.main.service;

import com.simpleprogrammer.main.HistoryItem;
import com.simpleprogrammer.main.Notifier;
import com.simpleprogrammer.main.exception.InvalidGoalException;

import java.util.ArrayList;
import java.util.List;

public class TrackingService {
    private int total;
    private int goal;
    private List<HistoryItem> history = new ArrayList<>();
    private int hitoryId = 0;
    private Notifier notifier;

    public TrackingService(Notifier notifier){
        this.notifier = notifier;
    }

    public void addProtein(int amount){
        total += amount;
        history.add(new HistoryItem(hitoryId++, amount, "add", total));

        //Using an outside dependency (notifierStub)
        if(total > goal){
            boolean sendResult = notifier.send("goal met");
            String historyMesage = "sent: goal met";
            if(!sendResult){
                historyMesage = "send_error:goal met";
            history.add(new HistoryItem(hitoryId++, 0, historyMesage, total));
            }
        }
    }

    public void removeProtein(int amount){
        total -= amount;
        if(total < 0){
            total = 0;
            history.add(new HistoryItem(hitoryId++, amount, "subtract", total) );
        }
    }

    public int getTotal(){
        return total;
    }

    public void setGoal(int value) throws InvalidGoalException {
        if(value <= 0)
            throw new InvalidGoalException("Goal was less than zero");

        goal = value;
    }

    public boolean isGoalMet(){
        return total >= goal;
    }

    public List<HistoryItem> getHistory(){
        return history;
    }

}
