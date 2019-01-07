/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeBillingGroupResult
 */
public class DescribeBillingGroupResultJsonUnmarshaller implements
        Unmarshaller<DescribeBillingGroupResult, JsonUnmarshallerContext> {

    public DescribeBillingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBillingGroupResult describeBillingGroupResult = new DescribeBillingGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("billingGroupName")) {
                describeBillingGroupResult.setBillingGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("billingGroupId")) {
                describeBillingGroupResult.setBillingGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("billingGroupArn")) {
                describeBillingGroupResult.setBillingGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                describeBillingGroupResult.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("billingGroupProperties")) {
                describeBillingGroupResult
                        .setBillingGroupProperties(BillingGroupPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("billingGroupMetadata")) {
                describeBillingGroupResult
                        .setBillingGroupMetadata(BillingGroupMetadataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeBillingGroupResult;
    }

    private static DescribeBillingGroupResultJsonUnmarshaller instance;

    public static DescribeBillingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBillingGroupResultJsonUnmarshaller();
        return instance;
    }
}
