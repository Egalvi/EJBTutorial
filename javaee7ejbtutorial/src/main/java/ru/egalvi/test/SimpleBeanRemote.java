package ru.egalvi.test;

import javax.ejb.Remote;
@Remote
public interface SimpleBeanRemote {
    String getMessage();
}
