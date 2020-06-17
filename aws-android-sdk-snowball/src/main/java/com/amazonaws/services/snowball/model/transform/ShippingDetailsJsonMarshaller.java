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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ShippingDetails
 */
class ShippingDetailsJsonMarshaller {

    public void marshall(ShippingDetails shippingDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (shippingDetails.getShippingOption() != null) {
            String shippingOption = shippingDetails.getShippingOption();
            jsonWriter.name("ShippingOption");
            jsonWriter.value(shippingOption);
        }
        if (shippingDetails.getInboundShipment() != null) {
            Shipment inboundShipment = shippingDetails.getInboundShipment();
            jsonWriter.name("InboundShipment");
            ShipmentJsonMarshaller.getInstance().marshall(inboundShipment, jsonWriter);
        }
        if (shippingDetails.getOutboundShipment() != null) {
            Shipment outboundShipment = shippingDetails.getOutboundShipment();
            jsonWriter.name("OutboundShipment");
            ShipmentJsonMarshaller.getInstance().marshall(outboundShipment, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ShippingDetailsJsonMarshaller instance;

    public static ShippingDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ShippingDetailsJsonMarshaller();
        return instance;
    }
}
