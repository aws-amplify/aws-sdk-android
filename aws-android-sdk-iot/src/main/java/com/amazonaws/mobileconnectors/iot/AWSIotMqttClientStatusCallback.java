/**
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 * http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

/**
 * Enables an application to be notified when asynchronous connection status
 * related to the client occur.
 */
public interface AWSIotMqttClientStatusCallback {

    /**
     * Possible connection statuses.
     */

    enum AWSIotMqttClientStatus {
        /**
         * Client is attempting to connect.
         */
        Connecting,
        /**
         * Client successfully connected.
         */
        Connected,
        /**
         * Connection was lost. Can be user initiated disconnect or network.
         */
        ConnectionLost,
        /**
         * Automatically reconnecting after connection loss.
         */
        Reconnecting
    }

    /**
     * This method is called when the connection to the server is changed.
     *
     * @param status the current status of MQTT connection.
     * @param throwable a throwable in the case of connection exceptions.
     */
    void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable);
}
