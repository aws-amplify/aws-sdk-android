package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

/**
 * Interface providing an app-level opt-out value. This can be used to override the system-level opt out.
 */
public interface AppLevelOptOutProvider {
    /**
     * @return True if the app should not receive notifications, false otherwise.
     */
    boolean isOptedOut();
}
