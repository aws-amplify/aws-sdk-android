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
 * JSON marshaller for POJO ImportJobResource
 */
class ImportJobResourceJsonMarshaller {

    public void marshall(ImportJobResource importJobResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (importJobResource.getDefineSegment() != null) {
            Boolean defineSegment = importJobResource.getDefineSegment();
            jsonWriter.name("DefineSegment");
            jsonWriter.value(defineSegment);
        }
        if (importJobResource.getExternalId() != null) {
            String externalId = importJobResource.getExternalId();
            jsonWriter.name("ExternalId");
            jsonWriter.value(externalId);
        }
        if (importJobResource.getFormat() != null) {
            String format = importJobResource.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (importJobResource.getRegisterEndpoints() != null) {
            Boolean registerEndpoints = importJobResource.getRegisterEndpoints();
            jsonWriter.name("RegisterEndpoints");
            jsonWriter.value(registerEndpoints);
        }
        if (importJobResource.getRoleArn() != null) {
            String roleArn = importJobResource.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (importJobResource.getS3Url() != null) {
            String s3Url = importJobResource.getS3Url();
            jsonWriter.name("S3Url");
            jsonWriter.value(s3Url);
        }
        if (importJobResource.getSegmentId() != null) {
            String segmentId = importJobResource.getSegmentId();
            jsonWriter.name("SegmentId");
            jsonWriter.value(segmentId);
        }
        if (importJobResource.getSegmentName() != null) {
            String segmentName = importJobResource.getSegmentName();
            jsonWriter.name("SegmentName");
            jsonWriter.value(segmentName);
        }
        jsonWriter.endObject();
    }

    private static ImportJobResourceJsonMarshaller instance;

    public static ImportJobResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobResourceJsonMarshaller();
        return instance;
    }
}
