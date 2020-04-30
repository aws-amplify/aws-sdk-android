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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonMarshaller {

    public void marshall(NetworkInterface networkInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkInterface.getIpv4Address() != null) {
            String ipv4Address = networkInterface.getIpv4Address();
            jsonWriter.name("Ipv4Address");
            jsonWriter.value(ipv4Address);
        }
        if (networkInterface.getMacAddress() != null) {
            String macAddress = networkInterface.getMacAddress();
            jsonWriter.name("MacAddress");
            jsonWriter.value(macAddress);
        }
        if (networkInterface.getIpv6Address() != null) {
            String ipv6Address = networkInterface.getIpv6Address();
            jsonWriter.name("Ipv6Address");
            jsonWriter.value(ipv6Address);
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
