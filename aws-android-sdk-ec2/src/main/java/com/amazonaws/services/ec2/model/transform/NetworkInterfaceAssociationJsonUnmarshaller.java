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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkInterfaceAssociation
 */
class NetworkInterfaceAssociationJsonUnmarshaller implements
        Unmarshaller<NetworkInterfaceAssociation, JsonUnmarshallerContext> {

    public NetworkInterfaceAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkInterfaceAssociation networkInterfaceAssociation = new NetworkInterfaceAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AllocationId")) {
                networkInterfaceAssociation.setAllocationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociationId")) {
                networkInterfaceAssociation.setAssociationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpOwnerId")) {
                networkInterfaceAssociation.setIpOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PublicDnsName")) {
                networkInterfaceAssociation.setPublicDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PublicIp")) {
                networkInterfaceAssociation.setPublicIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkInterfaceAssociation;
    }

    private static NetworkInterfaceAssociationJsonUnmarshaller instance;

    public static NetworkInterfaceAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAssociationJsonUnmarshaller();
        return instance;
    }
}
