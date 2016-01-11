package com.goit.module6;

/**
 * Created by Администратор on 11.01.2016.
 */
public class Engine {
    private boolean status;

    public Engine(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
