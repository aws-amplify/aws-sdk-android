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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO GatewayInfo
 */
class GatewayInfoJsonUnmarshaller implements Unmarshaller<GatewayInfo, JsonUnmarshallerContext> {

    public GatewayInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GatewayInfo gatewayInfo = new GatewayInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GatewayId")) {
                gatewayInfo.setGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayARN")) {
                gatewayInfo.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayType")) {
                gatewayInfo.setGatewayType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayOperationalState")) {
                gatewayInfo.setGatewayOperationalState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayName")) {
                gatewayInfo.setGatewayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2InstanceId")) {
                gatewayInfo.setEc2InstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2InstanceRegion")) {
                gatewayInfo.setEc2InstanceRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return gatewayInfo;
    }

    private static GatewayInfoJsonUnmarshaller instance;

    public static GatewayInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayInfoJsonUnmarshaller();
        return instance;
    }
}
