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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SpotFleetRequestConfig
 */
class SpotFleetRequestConfigJsonMarshaller {

    public void marshall(SpotFleetRequestConfig spotFleetRequestConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spotFleetRequestConfig.getActivityStatus() != null) {
            String activityStatus = spotFleetRequestConfig.getActivityStatus();
            jsonWriter.name("ActivityStatus");
            jsonWriter.value(activityStatus);
        }
        if (spotFleetRequestConfig.getCreateTime() != null) {
            java.util.Date createTime = spotFleetRequestConfig.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (spotFleetRequestConfig.getSpotFleetRequestConfig() != null) {
            SpotFleetRequestConfigData spotFleetRequestConfig = spotFleetRequestConfig
                    .getSpotFleetRequestConfig();
            jsonWriter.name("SpotFleetRequestConfig");
            SpotFleetRequestConfigDataJsonMarshaller.getInstance().marshall(spotFleetRequestConfig,
                    jsonWriter);
        }
        if (spotFleetRequestConfig.getSpotFleetRequestId() != null) {
            String spotFleetRequestId = spotFleetRequestConfig.getSpotFleetRequestId();
            jsonWriter.name("SpotFleetRequestId");
            jsonWriter.value(spotFleetRequestId);
        }
        if (spotFleetRequestConfig.getSpotFleetRequestState() != null) {
            String spotFleetRequestState = spotFleetRequestConfig.getSpotFleetRequestState();
            jsonWriter.name("SpotFleetRequestState");
            jsonWriter.value(spotFleetRequestState);
        }
        if (spotFleetRequestConfig.getTags() != null) {
            java.util.List<Tag> tags = spotFleetRequestConfig.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SpotFleetRequestConfigJsonMarshaller instance;

    public static SpotFleetRequestConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetRequestConfigJsonMarshaller();
        return instance;
    }
}
