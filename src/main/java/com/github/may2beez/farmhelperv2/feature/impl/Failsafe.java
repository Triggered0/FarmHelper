package com.github.may2beez.farmhelperv2.feature.impl;

import com.github.may2beez.farmhelperv2.feature.IFeature;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Failsafe implements IFeature {

    private static Failsafe instance;
    public static Failsafe getInstance() {
        if (instance == null) {
            instance = new Failsafe();
        }
        return instance;
    }

    @Override
    public String getName() {
        return "Failsafes";
    }

    @Override
    public boolean isEnabled() {
        return emergency;
    }

    @Override
    public boolean shouldPauseMacroExecution() {
        return true;
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isActivated() {
        return true;
    }

    @Setter
    private boolean emergency = false;

    public void resetFailSafe() {
        emergency = false;
    }

}
