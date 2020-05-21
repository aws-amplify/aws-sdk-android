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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonMarshaller {

    public void marshall(NetworkInterface networkInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkInterface.getSubnetId() != null) {
            String subnetId = networkInterface.getSubnetId();
            jsonWriter.name("subnetId");
            jsonWriter.value(subnetId);
        }
        if (networkInterface.getNetworkInterfaceId() != null) {
            String networkInterfaceId = networkInterface.getNetworkInterfaceId();
            jsonWriter.name("networkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfaceJsonMarshaller instance;

    public static NetworkInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceJsonMarshaller();
        return instance;
    }
}
