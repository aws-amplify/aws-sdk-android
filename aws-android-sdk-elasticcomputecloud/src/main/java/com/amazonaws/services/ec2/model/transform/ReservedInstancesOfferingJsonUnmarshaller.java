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
 * JSON unmarshaller for POJO ReservedInstancesOffering
 */
class ReservedInstancesOfferingJsonUnmarshaller implements
        Unmarshaller<ReservedInstancesOffering, JsonUnmarshallerContext> {

    public ReservedInstancesOffering unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservedInstancesOffering reservedInstancesOffering = new ReservedInstancesOffering();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                reservedInstancesOffering.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                reservedInstancesOffering.setDuration(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedPrice")) {
                reservedInstancesOffering.setFixedPrice(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                reservedInstancesOffering.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductDescription")) {
                reservedInstancesOffering.setProductDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservedInstancesOfferingId")) {
                reservedInstancesOffering.setReservedInstancesOfferingId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UsagePrice")) {
                reservedInstancesOffering.setUsagePrice(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                reservedInstancesOffering.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceTenancy")) {
                reservedInstancesOffering.setInstanceTenancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Marketplace")) {
                reservedInstancesOffering.setMarketplace(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingClass")) {
                reservedInstancesOffering.setOfferingClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingType")) {
                reservedInstancesOffering.setOfferingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingDetails")) {
                reservedInstancesOffering.setPricingDetails(new ListUnmarshaller<PricingDetail>(
                        PricingDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RecurringCharges")) {
                reservedInstancesOffering
                        .setRecurringCharges(new ListUnmarshaller<RecurringCharge>(
                                RecurringChargeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Scope")) {
                reservedInstancesOffering.setScope(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservedInstancesOffering;
    }

    private static ReservedInstancesOfferingJsonUnmarshaller instance;

    public static ReservedInstancesOfferingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesOfferingJsonUnmarshaller();
        return instance;
    }
}
