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
 * JSON marshaller for POJO NetworkInterfaceIpv6Address
 */
class NetworkInterfaceIpv6AddressJsonMarshaller {

    public void marshall(NetworkInterfaceIpv6Address networkInterfaceIpv6Address,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInterfaceIpv6Address.getIpv6Address() != null) {
            String ipv6Address = networkInterfaceIpv6Address.getIpv6Address();
            jsonWriter.name("Ipv6Address");
            jsonWriter.value(ipv6Address);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfaceIpv6AddressJsonMarshaller instance;

    public static NetworkInterfaceIpv6AddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceIpv6AddressJsonMarshaller();
        return instance;
    }
}
