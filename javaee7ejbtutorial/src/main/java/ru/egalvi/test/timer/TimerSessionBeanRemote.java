package ru.egalvi.test.timer;

import javax.ejb.Remote;

@Remote
public interface TimerSessionBeanRemote {
    void createTimer(long milliseconds);
}