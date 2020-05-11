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
 * JSON marshaller for POJO InstanceStatus
 */
class InstanceStatusJsonMarshaller {

    public void marshall(InstanceStatus instanceStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceStatus.getAvailabilityZone() != null) {
            String availabilityZone = instanceStatus.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (instanceStatus.getOutpostArn() != null) {
            String outpostArn = instanceStatus.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (instanceStatus.getEvents() != null) {
            java.util.List<InstanceStatusEvent> events = instanceStatus.getEvents();
            jsonWriter.name("Events");
            jsonWriter.beginArray();
            for (InstanceStatusEvent eventsItem : events) {
                if (eventsItem != null) {
                    InstanceStatusEventJsonMarshaller.getInstance()
                            .marshall(eventsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceStatus.getInstanceId() != null) {
            String instanceId = instanceStatus.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceStatus.getInstanceState() != null) {
            InstanceState instanceState = instanceStatus.getInstanceState();
            jsonWriter.name("InstanceState");
            InstanceStateJsonMarshaller.getInstance().marshall(instanceState, jsonWriter);
        }
        if (instanceStatus.getInstanceStatus() != null) {
            InstanceStatusSummary instanceStatus = instanceStatus.getInstanceStatus();
            jsonWriter.name("InstanceStatus");
            InstanceStatusSummaryJsonMarshaller.getInstance().marshall(instanceStatus, jsonWriter);
        }
        if (instanceStatus.getSystemStatus() != null) {
            InstanceStatusSummary systemStatus = instanceStatus.getSystemStatus();
            jsonWriter.name("SystemStatus");
            InstanceStatusSummaryJsonMarshaller.getInstance().marshall(systemStatus, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceStatusJsonMarshaller instance;

    public static InstanceStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStatusJsonMarshaller();
        return instance;
    }
}
