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
 * JSON unmarshaller for POJO TransitGatewayRequestOptions
 */
class TransitGatewayRequestOptionsJsonUnmarshaller implements
        Unmarshaller<TransitGatewayRequestOptions, JsonUnmarshallerContext> {

    public TransitGatewayRequestOptions unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitGatewayRequestOptions transitGatewayRequestOptions = new TransitGatewayRequestOptions();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AmazonSideAsn")) {
                transitGatewayRequestOptions.setAmazonSideAsn(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoAcceptSharedAttachments")) {
                transitGatewayRequestOptions.setAutoAcceptSharedAttachments(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultRouteTableAssociation")) {
                transitGatewayRequestOptions.setDefaultRouteTableAssociation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultRouteTablePropagation")) {
                transitGatewayRequestOptions.setDefaultRouteTablePropagation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpnEcmpSupport")) {
                transitGatewayRequestOptions.setVpnEcmpSupport(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsSupport")) {
                transitGatewayRequestOptions.setDnsSupport(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MulticastSupport")) {
                transitGatewayRequestOptions.setMulticastSupport(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitGatewayRequestOptions;
    }

    private static TransitGatewayRequestOptionsJsonUnmarshaller instance;

    public static TransitGatewayRequestOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRequestOptionsJsonUnmarshaller();
        return instance;
    }
}
