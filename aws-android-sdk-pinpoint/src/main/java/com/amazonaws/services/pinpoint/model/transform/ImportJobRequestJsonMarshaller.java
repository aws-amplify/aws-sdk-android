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
 * JSON marshaller for POJO ImportJobRequest
 */
class ImportJobRequestJsonMarshaller {

    public void marshall(ImportJobRequest importJobRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (importJobRequest.getDefineSegment() != null) {
            Boolean defineSegment = importJobRequest.getDefineSegment();
            jsonWriter.name("DefineSegment");
            jsonWriter.value(defineSegment);
        }
        if (importJobRequest.getExternalId() != null) {
            String externalId = importJobRequest.getExternalId();
            jsonWriter.name("ExternalId");
            jsonWriter.value(externalId);
        }
        if (importJobRequest.getFormat() != null) {
            String format = importJobRequest.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (importJobRequest.getRegisterEndpoints() != null) {
            Boolean registerEndpoints = importJobRequest.getRegisterEndpoints();
            jsonWriter.name("RegisterEndpoints");
            jsonWriter.value(registerEndpoints);
        }
        if (importJobRequest.getRoleArn() != null) {
            String roleArn = importJobRequest.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (importJobRequest.getS3Url() != null) {
            String s3Url = importJobRequest.getS3Url();
            jsonWriter.name("S3Url");
            jsonWriter.value(s3Url);
        }
        if (importJobRequest.getSegmentId() != null) {
            String segmentId = importJobRequest.getSegmentId();
            jsonWriter.name("SegmentId");
            jsonWriter.value(segmentId);
        }
        if (importJobRequest.getSegmentName() != null) {
            String segmentName = importJobRequest.getSegmentName();
            jsonWriter.name("SegmentName");
            jsonWriter.value(segmentName);
        }
        jsonWriter.endObject();
    }

    private static ImportJobRequestJsonMarshaller instance;

    public static ImportJobRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobRequestJsonMarshaller();
        return instance;
    }
}
