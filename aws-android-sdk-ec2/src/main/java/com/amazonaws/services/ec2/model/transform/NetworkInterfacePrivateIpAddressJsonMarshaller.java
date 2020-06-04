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
 * JSON marshaller for POJO NetworkInterfacePrivateIpAddress
 */
class NetworkInterfacePrivateIpAddressJsonMarshaller {

    public void marshall(NetworkInterfacePrivateIpAddress networkInterfacePrivateIpAddress,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInterfacePrivateIpAddress.getAssociation() != null) {
            NetworkInterfaceAssociation association = networkInterfacePrivateIpAddress
                    .getAssociation();
            jsonWriter.name("Association");
            NetworkInterfaceAssociationJsonMarshaller.getInstance().marshall(association,
                    jsonWriter);
        }
        if (networkInterfacePrivateIpAddress.getPrimary() != null) {
            Boolean primary = networkInterfacePrivateIpAddress.getPrimary();
            jsonWriter.name("Primary");
            jsonWriter.value(primary);
        }
        if (networkInterfacePrivateIpAddress.getPrivateDnsName() != null) {
            String privateDnsName = networkInterfacePrivateIpAddress.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (networkInterfacePrivateIpAddress.getPrivateIpAddress() != null) {
            String privateIpAddress = networkInterfacePrivateIpAddress.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfacePrivateIpAddressJsonMarshaller instance;

    public static NetworkInterfacePrivateIpAddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfacePrivateIpAddressJsonMarshaller();
        return instance;
    }
}
