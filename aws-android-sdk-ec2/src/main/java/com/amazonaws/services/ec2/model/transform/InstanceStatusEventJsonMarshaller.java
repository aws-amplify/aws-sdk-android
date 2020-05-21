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
 * JSON marshaller for POJO InstanceStatusEvent
 */
class InstanceStatusEventJsonMarshaller {

    public void marshall(InstanceStatusEvent instanceStatusEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceStatusEvent.getInstanceEventId() != null) {
            String instanceEventId = instanceStatusEvent.getInstanceEventId();
            jsonWriter.name("InstanceEventId");
            jsonWriter.value(instanceEventId);
        }
        if (instanceStatusEvent.getCode() != null) {
            String code = instanceStatusEvent.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (instanceStatusEvent.getDescription() != null) {
            String description = instanceStatusEvent.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (instanceStatusEvent.getNotAfter() != null) {
            java.util.Date notAfter = instanceStatusEvent.getNotAfter();
            jsonWriter.name("NotAfter");
            jsonWriter.value(notAfter);
        }
        if (instanceStatusEvent.getNotBefore() != null) {
            java.util.Date notBefore = instanceStatusEvent.getNotBefore();
            jsonWriter.name("NotBefore");
            jsonWriter.value(notBefore);
        }
        if (instanceStatusEvent.getNotBeforeDeadline() != null) {
            java.util.Date notBeforeDeadline = instanceStatusEvent.getNotBeforeDeadline();
            jsonWriter.name("NotBeforeDeadline");
            jsonWriter.value(notBeforeDeadline);
        }
        jsonWriter.endObject();
    }

    private static InstanceStatusEventJsonMarshaller instance;

    public static InstanceStatusEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStatusEventJsonMarshaller();
        return instance;
    }
}
