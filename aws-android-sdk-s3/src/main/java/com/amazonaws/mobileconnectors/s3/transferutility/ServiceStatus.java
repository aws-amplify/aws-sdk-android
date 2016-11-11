package com.amazonaws.mobileconnectors.s3.transferutility;

/**
 * Created by <a href="mailto:Dmitry.Gorohov@ebuilder.com">Dmitry Gorohov</a>
 */
public enum ServiceStatus {
    DESTROYED("destroyed"),
    PAUSED("paused"),
    RESUMED("resumed");

    private String name;

    ServiceStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
