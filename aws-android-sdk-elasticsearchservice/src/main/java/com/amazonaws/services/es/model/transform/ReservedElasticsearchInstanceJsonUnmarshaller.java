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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservedElasticsearchInstance
 */
class ReservedElasticsearchInstanceJsonUnmarshaller implements
        Unmarshaller<ReservedElasticsearchInstance, JsonUnmarshallerContext> {

    public ReservedElasticsearchInstance unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservedElasticsearchInstance reservedElasticsearchInstance = new ReservedElasticsearchInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReservationName")) {
                reservedElasticsearchInstance.setReservationName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservedElasticsearchInstanceId")) {
                reservedElasticsearchInstance
                        .setReservedElasticsearchInstanceId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ReservedElasticsearchInstanceOfferingId")) {
                reservedElasticsearchInstance
                        .setReservedElasticsearchInstanceOfferingId(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ElasticsearchInstanceType")) {
                reservedElasticsearchInstance.setElasticsearchInstanceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                reservedElasticsearchInstance.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                reservedElasticsearchInstance.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedPrice")) {
                reservedElasticsearchInstance.setFixedPrice(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UsagePrice")) {
                reservedElasticsearchInstance.setUsagePrice(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                reservedElasticsearchInstance.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticsearchInstanceCount")) {
                reservedElasticsearchInstance.setElasticsearchInstanceCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                reservedElasticsearchInstance.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaymentOption")) {
                reservedElasticsearchInstance.setPaymentOption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecurringCharges")) {
                reservedElasticsearchInstance
                        .setRecurringCharges(new ListUnmarshaller<RecurringCharge>(
                                RecurringChargeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservedElasticsearchInstance;
    }

    private static ReservedElasticsearchInstanceJsonUnmarshaller instance;

    public static ReservedElasticsearchInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedElasticsearchInstanceJsonUnmarshaller();
        return instance;
    }
}
