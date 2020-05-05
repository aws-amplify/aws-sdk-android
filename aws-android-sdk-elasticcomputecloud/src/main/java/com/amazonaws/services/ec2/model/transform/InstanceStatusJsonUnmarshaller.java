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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceStatus
 */
class InstanceStatusJsonUnmarshaller implements
        Unmarshaller<InstanceStatus, JsonUnmarshallerContext> {

    public InstanceStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceStatus instanceStatus = new InstanceStatus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                instanceStatus.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                instanceStatus.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Events")) {
                instanceStatus.setEvents(new ListUnmarshaller<InstanceStatusEvent>(
                        InstanceStatusEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                instanceStatus.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceState")) {
                instanceStatus.setInstanceState(InstanceStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceStatus")) {
                instanceStatus.setInstanceStatus(InstanceStatusSummaryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SystemStatus")) {
                instanceStatus.setSystemStatus(InstanceStatusSummaryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceStatus;
    }

    private static InstanceStatusJsonUnmarshaller instance;

    public static InstanceStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStatusJsonUnmarshaller();
        return instance;
    }
}
