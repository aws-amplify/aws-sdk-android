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
 * JSON marshaller for POJO InstanceNetworkInterfaceAssociation
 */
class InstanceNetworkInterfaceAssociationJsonMarshaller {

    public void marshall(InstanceNetworkInterfaceAssociation instanceNetworkInterfaceAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceNetworkInterfaceAssociation.getIpOwnerId() != null) {
            String ipOwnerId = instanceNetworkInterfaceAssociation.getIpOwnerId();
            jsonWriter.name("IpOwnerId");
            jsonWriter.value(ipOwnerId);
        }
        if (instanceNetworkInterfaceAssociation.getPublicDnsName() != null) {
            String publicDnsName = instanceNetworkInterfaceAssociation.getPublicDnsName();
            jsonWriter.name("PublicDnsName");
            jsonWriter.value(publicDnsName);
        }
        if (instanceNetworkInterfaceAssociation.getPublicIp() != null) {
            String publicIp = instanceNetworkInterfaceAssociation.getPublicIp();
            jsonWriter.name("PublicIp");
            jsonWriter.value(publicIp);
        }
        jsonWriter.endObject();
    }

    private static InstanceNetworkInterfaceAssociationJsonMarshaller instance;

    public static InstanceNetworkInterfaceAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkInterfaceAssociationJsonMarshaller();
        return instance;
    }
}
