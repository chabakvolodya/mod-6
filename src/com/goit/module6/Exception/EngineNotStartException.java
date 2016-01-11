package com.goit.module6.Exception;

/**
 * Created by Администратор on 11.01.2016.
 */
public class EngineNotStartException extends Exception {
    private boolean status;

    public EngineNotStartException(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
