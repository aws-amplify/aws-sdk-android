/**
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Enables an application to be notified of status of call to subscribe to a topic.
 */
public interface AWSIotMqttSubscriptionStatusCallback {
    /**
     * This method is invoked when a susbcription has completed successfully.
     */
    void onSuccess();

    /**
     * This method is invoked when subscription fails.
     * If a client is disconnected while an action is in progress
     * onFailure will be called. For connections
     * that use cleanSession set to false, any QoS 1 messages that
     * are in the process of being delivered will be delivered to the requested
     * quality of service next time the client connects.
     */
    void onFailure(Throwable exception);
}