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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DynamoDBv2Action
 */
class DynamoDBv2ActionJsonMarshaller {

    public void marshall(DynamoDBv2Action dynamoDBv2Action, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dynamoDBv2Action.getRoleArn() != null) {
            String roleArn = dynamoDBv2Action.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (dynamoDBv2Action.getPutItem() != null) {
            PutItemInput putItem = dynamoDBv2Action.getPutItem();
            jsonWriter.name("putItem");
            PutItemInputJsonMarshaller.getInstance().marshall(putItem, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DynamoDBv2ActionJsonMarshaller instance;

    public static DynamoDBv2ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBv2ActionJsonMarshaller();
        return instance;
    }
}
