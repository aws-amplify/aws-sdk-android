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
 * JSON marshaller for POJO InstanceSpecification
 */
class InstanceSpecificationJsonMarshaller {

    public void marshall(InstanceSpecification instanceSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceSpecification.getInstanceId() != null) {
            String instanceId = instanceSpecification.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceSpecification.getExcludeBootVolume() != null) {
            Boolean excludeBootVolume = instanceSpecification.getExcludeBootVolume();
            jsonWriter.name("ExcludeBootVolume");
            jsonWriter.value(excludeBootVolume);
        }
        jsonWriter.endObject();
    }

    private static InstanceSpecificationJsonMarshaller instance;

    public static InstanceSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSpecificationJsonMarshaller();
        return instance;
    }
}
