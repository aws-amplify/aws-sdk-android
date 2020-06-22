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
 * JSON marshaller for POJO NetworkInterfaceAssociation
 */
class NetworkInterfaceAssociationJsonMarshaller {

    public void marshall(NetworkInterfaceAssociation networkInterfaceAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInterfaceAssociation.getAllocationId() != null) {
            String allocationId = networkInterfaceAssociation.getAllocationId();
            jsonWriter.name("AllocationId");
            jsonWriter.value(allocationId);
        }
        if (networkInterfaceAssociation.getAssociationId() != null) {
            String associationId = networkInterfaceAssociation.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (networkInterfaceAssociation.getIpOwnerId() != null) {
            String ipOwnerId = networkInterfaceAssociation.getIpOwnerId();
            jsonWriter.name("IpOwnerId");
            jsonWriter.value(ipOwnerId);
        }
        if (networkInterfaceAssociation.getPublicDnsName() != null) {
            String publicDnsName = networkInterfaceAssociation.getPublicDnsName();
            jsonWriter.name("PublicDnsName");
            jsonWriter.value(publicDnsName);
        }
        if (networkInterfaceAssociation.getPublicIp() != null) {
            String publicIp = networkInterfaceAssociation.getPublicIp();
            jsonWriter.name("PublicIp");
            jsonWriter.value(publicIp);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfaceAssociationJsonMarshaller instance;

    public static NetworkInterfaceAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAssociationJsonMarshaller();
        return instance;
    }
}
