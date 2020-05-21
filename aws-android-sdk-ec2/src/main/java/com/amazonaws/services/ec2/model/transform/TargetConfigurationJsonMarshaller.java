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
 * JSON marshaller for POJO TargetConfiguration
 */
class TargetConfigurationJsonMarshaller {

    public void marshall(TargetConfiguration targetConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (targetConfiguration.getInstanceCount() != null) {
            Integer instanceCount = targetConfiguration.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (targetConfiguration.getOfferingId() != null) {
            String offeringId = targetConfiguration.getOfferingId();
            jsonWriter.name("OfferingId");
            jsonWriter.value(offeringId);
        }
        jsonWriter.endObject();
    }

    private static TargetConfigurationJsonMarshaller instance;

    public static TargetConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetConfigurationJsonMarshaller();
        return instance;
    }
}
