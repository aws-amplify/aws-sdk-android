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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceResizePolicy
 */
class InstanceResizePolicyJsonMarshaller {

    public void marshall(InstanceResizePolicy instanceResizePolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceResizePolicy.getInstancesToTerminate() != null) {
            java.util.List<String> instancesToTerminate = instanceResizePolicy
                    .getInstancesToTerminate();
            jsonWriter.name("InstancesToTerminate");
            jsonWriter.beginArray();
            for (String instancesToTerminateItem : instancesToTerminate) {
                if (instancesToTerminateItem != null) {
                    jsonWriter.value(instancesToTerminateItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceResizePolicy.getInstancesToProtect() != null) {
            java.util.List<String> instancesToProtect = instanceResizePolicy
                    .getInstancesToProtect();
            jsonWriter.name("InstancesToProtect");
            jsonWriter.beginArray();
            for (String instancesToProtectItem : instancesToProtect) {
                if (instancesToProtectItem != null) {
                    jsonWriter.value(instancesToProtectItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceResizePolicy.getInstanceTerminationTimeout() != null) {
            Integer instanceTerminationTimeout = instanceResizePolicy
                    .getInstanceTerminationTimeout();
            jsonWriter.name("InstanceTerminationTimeout");
            jsonWriter.value(instanceTerminationTimeout);
        }
        jsonWriter.endObject();
    }

    private static InstanceResizePolicyJsonMarshaller instance;

    public static InstanceResizePolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceResizePolicyJsonMarshaller();
        return instance;
    }
}
