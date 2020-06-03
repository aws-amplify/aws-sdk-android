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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VirtualGateway
 */
class VirtualGatewayJsonMarshaller {

    public void marshall(VirtualGateway virtualGateway, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (virtualGateway.getVirtualGatewayId() != null) {
            String virtualGatewayId = virtualGateway.getVirtualGatewayId();
            jsonWriter.name("virtualGatewayId");
            jsonWriter.value(virtualGatewayId);
        }
        if (virtualGateway.getVirtualGatewayState() != null) {
            String virtualGatewayState = virtualGateway.getVirtualGatewayState();
            jsonWriter.name("virtualGatewayState");
            jsonWriter.value(virtualGatewayState);
        }
        jsonWriter.endObject();
    }

    private static VirtualGatewayJsonMarshaller instance;

    public static VirtualGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualGatewayJsonMarshaller();
        return instance;
    }
}
