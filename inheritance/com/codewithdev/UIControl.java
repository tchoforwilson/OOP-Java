package com.codewithdev;

public class UIControl {
    private boolean isEnabled = true;

    // public UIControl(boolean isEnabled) {
    // this.isEnabled = isEnabled;
    // System.out.println("UIControl");
    // }
    public void render() {
    }

    public void enable() {
        isEnabled = true;
    }

    public void disabled() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}