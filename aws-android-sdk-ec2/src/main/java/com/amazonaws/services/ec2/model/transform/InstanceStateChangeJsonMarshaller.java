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
 * JSON marshaller for POJO InstanceStateChange
 */
class InstanceStateChangeJsonMarshaller {

    public void marshall(InstanceStateChange instanceStateChange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceStateChange.getCurrentState() != null) {
            InstanceState currentState = instanceStateChange.getCurrentState();
            jsonWriter.name("CurrentState");
            InstanceStateJsonMarshaller.getInstance().marshall(currentState, jsonWriter);
        }
        if (instanceStateChange.getInstanceId() != null) {
            String instanceId = instanceStateChange.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceStateChange.getPreviousState() != null) {
            InstanceState previousState = instanceStateChange.getPreviousState();
            jsonWriter.name("PreviousState");
            InstanceStateJsonMarshaller.getInstance().marshall(previousState, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceStateChangeJsonMarshaller instance;

    public static InstanceStateChangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStateChangeJsonMarshaller();
        return instance;
    }
}
