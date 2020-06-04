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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceNetworking
 */
class InstanceNetworkingJsonMarshaller {

    public void marshall(InstanceNetworking instanceNetworking, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceNetworking.getMonthlyTransfer() != null) {
            MonthlyTransfer monthlyTransfer = instanceNetworking.getMonthlyTransfer();
            jsonWriter.name("monthlyTransfer");
            MonthlyTransferJsonMarshaller.getInstance().marshall(monthlyTransfer, jsonWriter);
        }
        if (instanceNetworking.getPorts() != null) {
            java.util.List<InstancePortInfo> ports = instanceNetworking.getPorts();
            jsonWriter.name("ports");
            jsonWriter.beginArray();
            for (InstancePortInfo portsItem : ports) {
                if (portsItem != null) {
                    InstancePortInfoJsonMarshaller.getInstance().marshall(portsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceNetworkingJsonMarshaller instance;

    public static InstanceNetworkingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkingJsonMarshaller();
        return instance;
    }
}
