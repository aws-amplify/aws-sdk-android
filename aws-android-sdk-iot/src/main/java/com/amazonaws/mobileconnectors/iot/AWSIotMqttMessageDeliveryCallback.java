/**
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * <p/>
 * http://aws.amazon.com/apache2.0
 * <p/>
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

/**
 * Enables an application to be notified when delivery status of a publish message occurs.
 */
public interface AWSIotMqttMessageDeliveryCallback {

    /**
     * Possible message delivery states.
     */
    enum MessageDeliveryStatus {
        /**
         * Message was successfully delivered.
         * For QoS 0 messages this is when the message is written to the network.
         * For QoS 1 messages this is when an ack was received from the service.
         */
        Success,
        /**
         * Message delivery failure.
         */
        Fail;
    }

    /**
     * Callback interface to be implemented by application.
     * @param status New status of the publish message.
     * @param userData User defined data which was passed in as part of the publish call.
     */
    void statusChanged(MessageDeliveryStatus status, Object userData);
}
