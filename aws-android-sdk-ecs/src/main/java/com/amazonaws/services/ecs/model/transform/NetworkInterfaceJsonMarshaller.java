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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonMarshaller {

    public void marshall(NetworkInterface networkInterface, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkInterface.getAttachmentId() != null) {
            String attachmentId = networkInterface.getAttachmentId();
            jsonWriter.name("attachmentId");
            jsonWriter.value(attachmentId);
        }
        if (networkInterface.getPrivateIpv4Address() != null) {
            String privateIpv4Address = networkInterface.getPrivateIpv4Address();
            jsonWriter.name("privateIpv4Address");
            jsonWriter.value(privateIpv4Address);
        }
        if (networkInterface.getIpv6Address() != null) {
            String ipv6Address = networkInterface.getIpv6Address();
            jsonWriter.name("ipv6Address");
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
