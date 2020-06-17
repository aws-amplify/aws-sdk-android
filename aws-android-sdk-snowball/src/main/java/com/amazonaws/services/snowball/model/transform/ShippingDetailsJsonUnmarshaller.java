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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ShippingDetails
 */
class ShippingDetailsJsonUnmarshaller implements
        Unmarshaller<ShippingDetails, JsonUnmarshallerContext> {

    public ShippingDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ShippingDetails shippingDetails = new ShippingDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ShippingOption")) {
                shippingDetails.setShippingOption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InboundShipment")) {
                shippingDetails.setInboundShipment(ShipmentJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutboundShipment")) {
                shippingDetails.setOutboundShipment(ShipmentJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return shippingDetails;
    }

    private static ShippingDetailsJsonUnmarshaller instance;

    public static ShippingDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ShippingDetailsJsonUnmarshaller();
        return instance;
    }
}
