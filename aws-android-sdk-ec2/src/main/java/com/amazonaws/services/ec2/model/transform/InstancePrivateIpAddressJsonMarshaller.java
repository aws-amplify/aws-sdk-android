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
 * JSON marshaller for POJO InstancePrivateIpAddress
 */
class InstancePrivateIpAddressJsonMarshaller {

    public void marshall(InstancePrivateIpAddress instancePrivateIpAddress, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instancePrivateIpAddress.getAssociation() != null) {
            InstanceNetworkInterfaceAssociation association = instancePrivateIpAddress
                    .getAssociation();
            jsonWriter.name("Association");
            InstanceNetworkInterfaceAssociationJsonMarshaller.getInstance().marshall(association,
                    jsonWriter);
        }
        if (instancePrivateIpAddress.getPrimary() != null) {
            Boolean primary = instancePrivateIpAddress.getPrimary();
            jsonWriter.name("Primary");
            jsonWriter.value(primary);
        }
        if (instancePrivateIpAddress.getPrivateDnsName() != null) {
            String privateDnsName = instancePrivateIpAddress.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (instancePrivateIpAddress.getPrivateIpAddress() != null) {
            String privateIpAddress = instancePrivateIpAddress.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        jsonWriter.endObject();
    }

    private static InstancePrivateIpAddressJsonMarshaller instance;

    public static InstancePrivateIpAddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancePrivateIpAddressJsonMarshaller();
        return instance;
    }
}
