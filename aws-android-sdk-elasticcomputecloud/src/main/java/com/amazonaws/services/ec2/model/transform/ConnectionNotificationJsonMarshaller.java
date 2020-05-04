/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConnectionNotification
 */
class ConnectionNotificationJsonMarshaller {

    public void marshall(ConnectionNotification connectionNotification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (connectionNotification.getConnectionNotificationId() != null) {
            String connectionNotificationId = connectionNotification.getConnectionNotificationId();
            jsonWriter.name("ConnectionNotificationId");
            jsonWriter.value(connectionNotificationId);
        }
        if (connectionNotification.getServiceId() != null) {
            String serviceId = connectionNotification.getServiceId();
            jsonWriter.name("ServiceId");
            jsonWriter.value(serviceId);
        }
        if (connectionNotification.getVpcEndpointId() != null) {
            String vpcEndpointId = connectionNotification.getVpcEndpointId();
            jsonWriter.name("VpcEndpointId");
            jsonWriter.value(vpcEndpointId);
        }
        if (connectionNotification.getConnectionNotificationType() != null) {
            String connectionNotificationType = connectionNotification
                    .getConnectionNotificationType();
            jsonWriter.name("ConnectionNotificationType");
            jsonWriter.value(connectionNotificationType);
        }
        if (connectionNotification.getConnectionNotificationArn() != null) {
            String connectionNotificationArn = connectionNotification
                    .getConnectionNotificationArn();
            jsonWriter.name("ConnectionNotificationArn");
            jsonWriter.value(connectionNotificationArn);
        }
        if (connectionNotification.getConnectionEvents() != null) {
            java.util.List<String> connectionEvents = connectionNotification.getConnectionEvents();
            jsonWriter.name("ConnectionEvents");
            jsonWriter.beginArray();
            for (String connectionEventsItem : connectionEvents) {
                if (connectionEventsItem != null) {
                    jsonWriter.value(connectionEventsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (connectionNotification.getConnectionNotificationState() != null) {
            String connectionNotificationState = connectionNotification
                    .getConnectionNotificationState();
            jsonWriter.name("ConnectionNotificationState");
            jsonWriter.value(connectionNotificationState);
        }
        jsonWriter.endObject();
    }

    private static ConnectionNotificationJsonMarshaller instance;

    public static ConnectionNotificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionNotificationJsonMarshaller();
        return instance;
    }
}
