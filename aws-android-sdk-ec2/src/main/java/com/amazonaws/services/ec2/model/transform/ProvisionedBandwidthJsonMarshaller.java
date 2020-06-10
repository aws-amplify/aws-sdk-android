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
 * JSON marshaller for POJO ProvisionedBandwidth
 */
class ProvisionedBandwidthJsonMarshaller {

    public void marshall(ProvisionedBandwidth provisionedBandwidth, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (provisionedBandwidth.getProvisionTime() != null) {
            java.util.Date provisionTime = provisionedBandwidth.getProvisionTime();
            jsonWriter.name("ProvisionTime");
            jsonWriter.value(provisionTime);
        }
        if (provisionedBandwidth.getProvisioned() != null) {
            String provisioned = provisionedBandwidth.getProvisioned();
            jsonWriter.name("Provisioned");
            jsonWriter.value(provisioned);
        }
        if (provisionedBandwidth.getRequestTime() != null) {
            java.util.Date requestTime = provisionedBandwidth.getRequestTime();
            jsonWriter.name("RequestTime");
            jsonWriter.value(requestTime);
        }
        if (provisionedBandwidth.getRequested() != null) {
            String requested = provisionedBandwidth.getRequested();
            jsonWriter.name("Requested");
            jsonWriter.value(requested);
        }
        if (provisionedBandwidth.getStatus() != null) {
            String status = provisionedBandwidth.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedBandwidthJsonMarshaller instance;

    public static ProvisionedBandwidthJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedBandwidthJsonMarshaller();
        return instance;
    }
}
