package com.codewithdev;

public abstract class UIControl {
    private boolean isEnabled = true;

    // public UIControl(boolean isEnabled) {
    // this.isEnabled = isEnabled;
    // System.out.println("UIControl");
    // }
    public abstract void render();

    public final void enable() {
        isEnabled = true;
    }

    public void disabled() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}