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
 * JSON marshaller for POJO TerminateConnectionStatus
 */
class TerminateConnectionStatusJsonMarshaller {

    public void marshall(TerminateConnectionStatus terminateConnectionStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (terminateConnectionStatus.getConnectionId() != null) {
            String connectionId = terminateConnectionStatus.getConnectionId();
            jsonWriter.name("ConnectionId");
            jsonWriter.value(connectionId);
        }
        if (terminateConnectionStatus.getPreviousStatus() != null) {
            ClientVpnConnectionStatus previousStatus = terminateConnectionStatus
                    .getPreviousStatus();
            jsonWriter.name("PreviousStatus");
            ClientVpnConnectionStatusJsonMarshaller.getInstance().marshall(previousStatus,
                    jsonWriter);
        }
        if (terminateConnectionStatus.getCurrentStatus() != null) {
            ClientVpnConnectionStatus currentStatus = terminateConnectionStatus.getCurrentStatus();
            jsonWriter.name("CurrentStatus");
            ClientVpnConnectionStatusJsonMarshaller.getInstance().marshall(currentStatus,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TerminateConnectionStatusJsonMarshaller instance;

    public static TerminateConnectionStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TerminateConnectionStatusJsonMarshaller();
        return instance;
    }
}
