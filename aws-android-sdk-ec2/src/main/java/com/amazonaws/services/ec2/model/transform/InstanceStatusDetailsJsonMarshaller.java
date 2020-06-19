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
 * JSON marshaller for POJO InstanceStatusDetails
 */
class InstanceStatusDetailsJsonMarshaller {

    public void marshall(InstanceStatusDetails instanceStatusDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceStatusDetails.getImpairedSince() != null) {
            java.util.Date impairedSince = instanceStatusDetails.getImpairedSince();
            jsonWriter.name("ImpairedSince");
            jsonWriter.value(impairedSince);
        }
        if (instanceStatusDetails.getName() != null) {
            String name = instanceStatusDetails.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceStatusDetails.getStatus() != null) {
            String status = instanceStatusDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static InstanceStatusDetailsJsonMarshaller instance;

    public static InstanceStatusDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStatusDetailsJsonMarshaller();
        return instance;
    }
}
