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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SourceTableFeatureDetails
 */
class SourceTableFeatureDetailsJsonMarshaller {

    public void marshall(SourceTableFeatureDetails sourceTableFeatureDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sourceTableFeatureDetails.getLocalSecondaryIndexes() != null) {
            java.util.List<LocalSecondaryIndexInfo> localSecondaryIndexes = sourceTableFeatureDetails
                    .getLocalSecondaryIndexes();
            jsonWriter.name("LocalSecondaryIndexes");
            jsonWriter.beginArray();
            for (LocalSecondaryIndexInfo localSecondaryIndexesItem : localSecondaryIndexes) {
                if (localSecondaryIndexesItem != null) {
                    LocalSecondaryIndexInfoJsonMarshaller.getInstance().marshall(
                            localSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (sourceTableFeatureDetails.getGlobalSecondaryIndexes() != null) {
            java.util.List<GlobalSecondaryIndexInfo> globalSecondaryIndexes = sourceTableFeatureDetails
                    .getGlobalSecondaryIndexes();
            jsonWriter.name("GlobalSecondaryIndexes");
            jsonWriter.beginArray();
            for (GlobalSecondaryIndexInfo globalSecondaryIndexesItem : globalSecondaryIndexes) {
                if (globalSecondaryIndexesItem != null) {
                    GlobalSecondaryIndexInfoJsonMarshaller.getInstance().marshall(
                            globalSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (sourceTableFeatureDetails.getStreamDescription() != null) {
            StreamSpecification streamDescription = sourceTableFeatureDetails
                    .getStreamDescription();
            jsonWriter.name("StreamDescription");
            StreamSpecificationJsonMarshaller.getInstance().marshall(streamDescription, jsonWriter);
        }
        if (sourceTableFeatureDetails.getTimeToLiveDescription() != null) {
            TimeToLiveDescription timeToLiveDescription = sourceTableFeatureDetails
                    .getTimeToLiveDescription();
            jsonWriter.name("TimeToLiveDescription");
            TimeToLiveDescriptionJsonMarshaller.getInstance().marshall(timeToLiveDescription,
                    jsonWriter);
        }
        if (sourceTableFeatureDetails.getSSEDescription() != null) {
            SSEDescription sSEDescription = sourceTableFeatureDetails.getSSEDescription();
            jsonWriter.name("SSEDescription");
            SSEDescriptionJsonMarshaller.getInstance().marshall(sSEDescription, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SourceTableFeatureDetailsJsonMarshaller instance;

    public static SourceTableFeatureDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SourceTableFeatureDetailsJsonMarshaller();
        return instance;
    }
}
