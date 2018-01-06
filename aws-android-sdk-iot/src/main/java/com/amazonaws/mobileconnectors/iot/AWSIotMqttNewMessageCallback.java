/**
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

/**
 * Enables an application to be notified when a message arrives from the mqtt
 * client.
 */
public interface AWSIotMqttNewMessageCallback {
    /**
     * This method is called when a message arrives from the mqtt client.
     *
     * @param topic the incoming message topic.
     * @param data the message payload.
     */
    void onMessageArrived(String topic, byte[] data);
}
