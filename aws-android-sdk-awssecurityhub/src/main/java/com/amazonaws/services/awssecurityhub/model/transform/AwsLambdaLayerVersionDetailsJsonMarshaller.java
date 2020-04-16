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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsLambdaLayerVersionDetails
 */
class AwsLambdaLayerVersionDetailsJsonMarshaller {

    public void marshall(AwsLambdaLayerVersionDetails awsLambdaLayerVersionDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsLambdaLayerVersionDetails.getVersion() != null) {
            Long version = awsLambdaLayerVersionDetails.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (awsLambdaLayerVersionDetails.getCompatibleRuntimes() != null) {
            java.util.List<String> compatibleRuntimes = awsLambdaLayerVersionDetails
                    .getCompatibleRuntimes();
            jsonWriter.name("CompatibleRuntimes");
            jsonWriter.beginArray();
            for (String compatibleRuntimesItem : compatibleRuntimes) {
                if (compatibleRuntimesItem != null) {
                    jsonWriter.value(compatibleRuntimesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsLambdaLayerVersionDetails.getCreatedDate() != null) {
            String createdDate = awsLambdaLayerVersionDetails.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        jsonWriter.endObject();
    }

    private static AwsLambdaLayerVersionDetailsJsonMarshaller instance;

    public static AwsLambdaLayerVersionDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaLayerVersionDetailsJsonMarshaller();
        return instance;
    }
}
