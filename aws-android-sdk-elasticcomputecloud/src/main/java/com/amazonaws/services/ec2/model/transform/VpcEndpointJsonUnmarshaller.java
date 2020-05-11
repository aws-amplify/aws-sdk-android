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
 * JSON unmarshaller for POJO VpcEndpoint
 */
class VpcEndpointJsonUnmarshaller implements Unmarshaller<VpcEndpoint, JsonUnmarshallerContext> {

    public VpcEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VpcEndpoint vpcEndpoint = new VpcEndpoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VpcEndpointId")) {
                vpcEndpoint.setVpcEndpointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcEndpointType")) {
                vpcEndpoint.setVpcEndpointType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                vpcEndpoint.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceName")) {
                vpcEndpoint.setServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                vpcEndpoint.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyDocument")) {
                vpcEndpoint.setPolicyDocument(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteTableIds")) {
                vpcEndpoint.setRouteTableIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                vpcEndpoint.setSubnetIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Groups")) {
                vpcEndpoint.setGroups(new ListUnmarshaller<SecurityGroupIdentifier>(
                        SecurityGroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PrivateDnsEnabled")) {
                vpcEndpoint.setPrivateDnsEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequesterManaged")) {
                vpcEndpoint.setRequesterManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceIds")) {
                vpcEndpoint.setNetworkInterfaceIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DnsEntries")) {
                vpcEndpoint.setDnsEntries(new ListUnmarshaller<DnsEntry>(DnsEntryJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreationTimestamp")) {
                vpcEndpoint.setCreationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                vpcEndpoint.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                vpcEndpoint.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastError")) {
                vpcEndpoint.setLastError(LastErrorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vpcEndpoint;
    }

    private static VpcEndpointJsonUnmarshaller instance;

    public static VpcEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcEndpointJsonUnmarshaller();
        return instance;
    }
}
