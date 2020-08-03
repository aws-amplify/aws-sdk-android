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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDataSyncS3Destination
 */
class ResourceDataSyncS3DestinationJsonMarshaller {

    public void marshall(ResourceDataSyncS3Destination resourceDataSyncS3Destination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceDataSyncS3Destination.getBucketName() != null) {
            String bucketName = resourceDataSyncS3Destination.getBucketName();
            jsonWriter.name("BucketName");
            jsonWriter.value(bucketName);
        }
        if (resourceDataSyncS3Destination.getPrefix() != null) {
            String prefix = resourceDataSyncS3Destination.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        if (resourceDataSyncS3Destination.getSyncFormat() != null) {
            String syncFormat = resourceDataSyncS3Destination.getSyncFormat();
            jsonWriter.name("SyncFormat");
            jsonWriter.value(syncFormat);
        }
        if (resourceDataSyncS3Destination.getRegion() != null) {
            String region = resourceDataSyncS3Destination.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (resourceDataSyncS3Destination.getAWSKMSKeyARN() != null) {
            String aWSKMSKeyARN = resourceDataSyncS3Destination.getAWSKMSKeyARN();
            jsonWriter.name("AWSKMSKeyARN");
            jsonWriter.value(aWSKMSKeyARN);
        }
        if (resourceDataSyncS3Destination.getDestinationDataSharing() != null) {
            ResourceDataSyncDestinationDataSharing destinationDataSharing = resourceDataSyncS3Destination.getDestinationDataSharing();
            jsonWriter.name("DestinationDataSharing");
            ResourceDataSyncDestinationDataSharingJsonMarshaller.getInstance().marshall(destinationDataSharing, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResourceDataSyncS3DestinationJsonMarshaller instance;
    public static ResourceDataSyncS3DestinationJsonMarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncS3DestinationJsonMarshaller();
        return instance;
    }
}
