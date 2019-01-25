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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SegmentImportResource
 */
class SegmentImportResourceJsonMarshaller {

    public void marshall(SegmentImportResource segmentImportResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (segmentImportResource.getChannelCounts() != null) {
            java.util.Map<String, Integer> channelCounts = segmentImportResource.getChannelCounts();
            jsonWriter.name("ChannelCounts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> channelCountsEntry : channelCounts.entrySet()) {
                Integer channelCountsValue = channelCountsEntry.getValue();
                if (channelCountsValue != null) {
                    jsonWriter.name(channelCountsEntry.getKey());
                    jsonWriter.value(channelCountsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (segmentImportResource.getExternalId() != null) {
            String externalId = segmentImportResource.getExternalId();
            jsonWriter.name("ExternalId");
            jsonWriter.value(externalId);
        }
        if (segmentImportResource.getFormat() != null) {
            String format = segmentImportResource.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (segmentImportResource.getRoleArn() != null) {
            String roleArn = segmentImportResource.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (segmentImportResource.getS3Url() != null) {
            String s3Url = segmentImportResource.getS3Url();
            jsonWriter.name("S3Url");
            jsonWriter.value(s3Url);
        }
        if (segmentImportResource.getSize() != null) {
            Integer size = segmentImportResource.getSize();
            jsonWriter.name("Size");
            jsonWriter.value(size);
        }
        jsonWriter.endObject();
    }

    private static SegmentImportResourceJsonMarshaller instance;

    public static SegmentImportResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentImportResourceJsonMarshaller();
        return instance;
    }
}
