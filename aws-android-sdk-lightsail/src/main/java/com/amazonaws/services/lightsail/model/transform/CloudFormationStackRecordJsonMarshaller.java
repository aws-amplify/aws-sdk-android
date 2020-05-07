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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudFormationStackRecord
 */
class CloudFormationStackRecordJsonMarshaller {

    public void marshall(CloudFormationStackRecord cloudFormationStackRecord,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cloudFormationStackRecord.getName() != null) {
            String name = cloudFormationStackRecord.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (cloudFormationStackRecord.getArn() != null) {
            String arn = cloudFormationStackRecord.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (cloudFormationStackRecord.getCreatedAt() != null) {
            java.util.Date createdAt = cloudFormationStackRecord.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (cloudFormationStackRecord.getLocation() != null) {
            ResourceLocation location = cloudFormationStackRecord.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (cloudFormationStackRecord.getResourceType() != null) {
            String resourceType = cloudFormationStackRecord.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (cloudFormationStackRecord.getState() != null) {
            String state = cloudFormationStackRecord.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (cloudFormationStackRecord.getSourceInfo() != null) {
            java.util.List<CloudFormationStackRecordSourceInfo> sourceInfo = cloudFormationStackRecord
                    .getSourceInfo();
            jsonWriter.name("sourceInfo");
            jsonWriter.beginArray();
            for (CloudFormationStackRecordSourceInfo sourceInfoItem : sourceInfo) {
                if (sourceInfoItem != null) {
                    CloudFormationStackRecordSourceInfoJsonMarshaller.getInstance().marshall(
                            sourceInfoItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cloudFormationStackRecord.getDestinationInfo() != null) {
            DestinationInfo destinationInfo = cloudFormationStackRecord.getDestinationInfo();
            jsonWriter.name("destinationInfo");
            DestinationInfoJsonMarshaller.getInstance().marshall(destinationInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CloudFormationStackRecordJsonMarshaller instance;

    public static CloudFormationStackRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFormationStackRecordJsonMarshaller();
        return instance;
    }
}
