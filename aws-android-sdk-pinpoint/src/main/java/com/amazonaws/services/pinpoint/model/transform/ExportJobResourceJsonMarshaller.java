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
 * JSON marshaller for POJO ExportJobResource
 */
class ExportJobResourceJsonMarshaller {

    public void marshall(ExportJobResource exportJobResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exportJobResource.getRoleArn() != null) {
            String roleArn = exportJobResource.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (exportJobResource.getS3UrlPrefix() != null) {
            String s3UrlPrefix = exportJobResource.getS3UrlPrefix();
            jsonWriter.name("S3UrlPrefix");
            jsonWriter.value(s3UrlPrefix);
        }
        if (exportJobResource.getSegmentId() != null) {
            String segmentId = exportJobResource.getSegmentId();
            jsonWriter.name("SegmentId");
            jsonWriter.value(segmentId);
        }
        if (exportJobResource.getSegmentVersion() != null) {
            Integer segmentVersion = exportJobResource.getSegmentVersion();
            jsonWriter.name("SegmentVersion");
            jsonWriter.value(segmentVersion);
        }
        jsonWriter.endObject();
    }

    private static ExportJobResourceJsonMarshaller instance;

    public static ExportJobResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportJobResourceJsonMarshaller();
        return instance;
    }
}
