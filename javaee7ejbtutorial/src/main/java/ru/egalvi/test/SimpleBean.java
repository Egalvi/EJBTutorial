package ru.egalvi.test;

import javax.ejb.Stateless;

@Stateless
public class SimpleBean implements SimpleBeanRemote {
    @Override
    public String getMessage() {
        return "This message was generated by simple ejb";
    }
}