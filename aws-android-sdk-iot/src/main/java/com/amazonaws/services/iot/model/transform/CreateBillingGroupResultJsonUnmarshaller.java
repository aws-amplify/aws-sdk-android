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
 * JSON unmarshaller for response CreateBillingGroupResult
 */
public class CreateBillingGroupResultJsonUnmarshaller implements
        Unmarshaller<CreateBillingGroupResult, JsonUnmarshallerContext> {

    public CreateBillingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateBillingGroupResult createBillingGroupResult = new CreateBillingGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("billingGroupName")) {
                createBillingGroupResult.setBillingGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("billingGroupArn")) {
                createBillingGroupResult.setBillingGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("billingGroupId")) {
                createBillingGroupResult.setBillingGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createBillingGroupResult;
    }

    private static CreateBillingGroupResultJsonUnmarshaller instance;

    public static CreateBillingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateBillingGroupResultJsonUnmarshaller();
        return instance;
    }
}
