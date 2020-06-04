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
 * JSON unmarshaller for POJO Subnet
 */
class SubnetJsonUnmarshaller implements Unmarshaller<Subnet, JsonUnmarshallerContext> {

    public Subnet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Subnet subnet = new Subnet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                subnet.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZoneId")) {
                subnet.setAvailabilityZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailableIpAddressCount")) {
                subnet.setAvailableIpAddressCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CidrBlock")) {
                subnet.setCidrBlock(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultForAz")) {
                subnet.setDefaultForAz(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MapPublicIpOnLaunch")) {
                subnet.setMapPublicIpOnLaunch(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MapCustomerOwnedIpOnLaunch")) {
                subnet.setMapCustomerOwnedIpOnLaunch(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomerOwnedIpv4Pool")) {
                subnet.setCustomerOwnedIpv4Pool(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                subnet.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                subnet.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                subnet.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                subnet.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssignIpv6AddressOnCreation")) {
                subnet.setAssignIpv6AddressOnCreation(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ipv6CidrBlockAssociationSet")) {
                subnet.setIpv6CidrBlockAssociationSet(new ListUnmarshaller<SubnetIpv6CidrBlockAssociation>(
                        SubnetIpv6CidrBlockAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                subnet.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetArn")) {
                subnet.setSubnetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                subnet.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return subnet;
    }

    private static SubnetJsonUnmarshaller instance;

    public static SubnetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubnetJsonUnmarshaller();
        return instance;
    }
}
