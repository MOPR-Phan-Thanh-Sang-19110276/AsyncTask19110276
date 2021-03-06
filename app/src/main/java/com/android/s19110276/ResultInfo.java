package com.android.s19110276;

public class ResultInfo {

    private boolean completed;

    public ResultInfo(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getMessage() {
        if (this.isCompleted()) {
            return "Completed in 60 seconds.";
        }
        return "Failed or cancelled.";
    }
}
