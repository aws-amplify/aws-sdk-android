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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Location
 */
class LocationJsonMarshaller {

    public void marshall(Location location, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (location.getJdbc() != null) {
            java.util.List<CodeGenNodeArg> jdbc = location.getJdbc();
            jsonWriter.name("Jdbc");
            jsonWriter.beginArray();
            for (CodeGenNodeArg jdbcItem : jdbc) {
                if (jdbcItem != null) {
                    CodeGenNodeArgJsonMarshaller.getInstance().marshall(jdbcItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (location.getS3() != null) {
            java.util.List<CodeGenNodeArg> s3 = location.getS3();
            jsonWriter.name("S3");
            jsonWriter.beginArray();
            for (CodeGenNodeArg s3Item : s3) {
                if (s3Item != null) {
                    CodeGenNodeArgJsonMarshaller.getInstance().marshall(s3Item, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (location.getDynamoDB() != null) {
            java.util.List<CodeGenNodeArg> dynamoDB = location.getDynamoDB();
            jsonWriter.name("DynamoDB");
            jsonWriter.beginArray();
            for (CodeGenNodeArg dynamoDBItem : dynamoDB) {
                if (dynamoDBItem != null) {
                    CodeGenNodeArgJsonMarshaller.getInstance().marshall(dynamoDBItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LocationJsonMarshaller instance;

    public static LocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocationJsonMarshaller();
        return instance;
    }
}
