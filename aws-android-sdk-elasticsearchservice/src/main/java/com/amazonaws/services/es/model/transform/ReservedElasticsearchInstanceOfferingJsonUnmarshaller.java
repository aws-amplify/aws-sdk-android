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
 * JSON unmarshaller for POJO ReservedElasticsearchInstanceOffering
 */
class ReservedElasticsearchInstanceOfferingJsonUnmarshaller implements
        Unmarshaller<ReservedElasticsearchInstanceOffering, JsonUnmarshallerContext> {

    public ReservedElasticsearchInstanceOffering unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservedElasticsearchInstanceOffering reservedElasticsearchInstanceOffering = new ReservedElasticsearchInstanceOffering();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReservedElasticsearchInstanceOfferingId")) {
                reservedElasticsearchInstanceOffering
                        .setReservedElasticsearchInstanceOfferingId(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ElasticsearchInstanceType")) {
                reservedElasticsearchInstanceOffering
                        .setElasticsearchInstanceType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Duration")) {
                reservedElasticsearchInstanceOffering.setDuration(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedPrice")) {
                reservedElasticsearchInstanceOffering.setFixedPrice(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UsagePrice")) {
                reservedElasticsearchInstanceOffering.setUsagePrice(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                reservedElasticsearchInstanceOffering.setCurrencyCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaymentOption")) {
                reservedElasticsearchInstanceOffering.setPaymentOption(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecurringCharges")) {
                reservedElasticsearchInstanceOffering
                        .setRecurringCharges(new ListUnmarshaller<RecurringCharge>(
                                RecurringChargeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservedElasticsearchInstanceOffering;
    }

    private static ReservedElasticsearchInstanceOfferingJsonUnmarshaller instance;

    public static ReservedElasticsearchInstanceOfferingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedElasticsearchInstanceOfferingJsonUnmarshaller();
        return instance;
    }
}
