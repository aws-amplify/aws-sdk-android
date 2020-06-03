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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DirectConnectGateway
 */
class DirectConnectGatewayJsonUnmarshaller implements
        Unmarshaller<DirectConnectGateway, JsonUnmarshallerContext> {

    public DirectConnectGateway unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DirectConnectGateway directConnectGateway = new DirectConnectGateway();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("directConnectGatewayId")) {
                directConnectGateway.setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayName")) {
                directConnectGateway.setDirectConnectGatewayName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonSideAsn")) {
                directConnectGateway.setAmazonSideAsn(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownerAccount")) {
                directConnectGateway.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayState")) {
                directConnectGateway.setDirectConnectGatewayState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("stateChangeError")) {
                directConnectGateway.setStateChangeError(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return directConnectGateway;
    }

    private static DirectConnectGatewayJsonUnmarshaller instance;

    public static DirectConnectGatewayJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayJsonUnmarshaller();
        return instance;
    }
}
