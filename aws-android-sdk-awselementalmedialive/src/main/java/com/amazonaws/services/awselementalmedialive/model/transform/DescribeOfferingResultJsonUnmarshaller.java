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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeOfferingResult
 */
public class DescribeOfferingResultJsonUnmarshaller implements
        Unmarshaller<DescribeOfferingResult, JsonUnmarshallerContext> {

    public DescribeOfferingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeOfferingResult describeOfferingResult = new DescribeOfferingResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describeOfferingResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                describeOfferingResult.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Duration")) {
                describeOfferingResult.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationUnits")) {
                describeOfferingResult.setDurationUnits(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedPrice")) {
                describeOfferingResult.setFixedPrice(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingDescription")) {
                describeOfferingResult.setOfferingDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingId")) {
                describeOfferingResult.setOfferingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfferingType")) {
                describeOfferingResult.setOfferingType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                describeOfferingResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceSpecification")) {
                describeOfferingResult
                        .setResourceSpecification(ReservationResourceSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("UsagePrice")) {
                describeOfferingResult.setUsagePrice(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeOfferingResult;
    }

    private static DescribeOfferingResultJsonUnmarshaller instance;

    public static DescribeOfferingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeOfferingResultJsonUnmarshaller();
        return instance;
    }
}
