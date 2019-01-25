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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProvisionedThroughputDescription
 */
class ProvisionedThroughputDescriptionJsonUnmarshaller implements
        Unmarshaller<ProvisionedThroughputDescription, JsonUnmarshallerContext> {

    public ProvisionedThroughputDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProvisionedThroughputDescription provisionedThroughputDescription = new ProvisionedThroughputDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LastIncreaseDateTime")) {
                provisionedThroughputDescription.setLastIncreaseDateTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastDecreaseDateTime")) {
                provisionedThroughputDescription.setLastDecreaseDateTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfDecreasesToday")) {
                provisionedThroughputDescription.setNumberOfDecreasesToday(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReadCapacityUnits")) {
                provisionedThroughputDescription.setReadCapacityUnits(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("WriteCapacityUnits")) {
                provisionedThroughputDescription.setWriteCapacityUnits(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return provisionedThroughputDescription;
    }

    private static ProvisionedThroughputDescriptionJsonUnmarshaller instance;

    public static ProvisionedThroughputDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedThroughputDescriptionJsonUnmarshaller();
        return instance;
    }
}
