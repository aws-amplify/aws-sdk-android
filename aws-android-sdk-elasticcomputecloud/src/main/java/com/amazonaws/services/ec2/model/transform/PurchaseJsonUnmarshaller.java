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
 * JSON unmarshaller for POJO Purchase
 */
class PurchaseJsonUnmarshaller implements Unmarshaller<Purchase, JsonUnmarshallerContext> {

    public Purchase unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Purchase purchase = new Purchase();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CurrencyCode")) {
                purchase.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                purchase.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostIdSet")) {
                purchase.setHostIdSet(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HostReservationId")) {
                purchase.setHostReservationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HourlyPrice")) {
                purchase.setHourlyPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceFamily")) {
                purchase.setInstanceFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaymentOption")) {
                purchase.setPaymentOption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpfrontPrice")) {
                purchase.setUpfrontPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return purchase;
    }

    private static PurchaseJsonUnmarshaller instance;

    public static PurchaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PurchaseJsonUnmarshaller();
        return instance;
    }
}
