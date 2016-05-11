package com.amazonaws.mobileconnectors.iot;

/**
 * Class to store user information passed in as part of a publish request.
 * Includes a user defined callback method as well as user-defined context data
 * to be returned upon invoking the callback.
 */
class PublishMessageUserData {

    /**
     * User defined callback method.
     */
    private AWSIotMqttMessageDeliveryCallback userCallback;
    /**
     * User defined context data.
     */
    private Object userData;

    /**
     * Create a new PublishMessageUserData object.
     * @param userCallback User defined callback method.
     * @param userData User defined context data.
     */
    PublishMessageUserData(AWSIotMqttMessageDeliveryCallback userCallback, Object userData) {
        this.userCallback = userCallback;
        this.userData = userData;
    }

    /**
     * Return the callback in this object.
     * @return The user's callback.
     */
    AWSIotMqttMessageDeliveryCallback getUserCallback() {
        return userCallback;
    }

    /**
     * Return the user's context data.
     * @return User defined context data.
     */
    Object getUserData() {
        return userData;
    }
}
