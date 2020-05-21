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
 * JSON marshaller for POJO ExportToS3Task
 */
class ExportToS3TaskJsonMarshaller {

    public void marshall(ExportToS3Task exportToS3Task, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportToS3Task.getContainerFormat() != null) {
            String containerFormat = exportToS3Task.getContainerFormat();
            jsonWriter.name("ContainerFormat");
            jsonWriter.value(containerFormat);
        }
        if (exportToS3Task.getDiskImageFormat() != null) {
            String diskImageFormat = exportToS3Task.getDiskImageFormat();
            jsonWriter.name("DiskImageFormat");
            jsonWriter.value(diskImageFormat);
        }
        if (exportToS3Task.getS3Bucket() != null) {
            String s3Bucket = exportToS3Task.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (exportToS3Task.getS3Key() != null) {
            String s3Key = exportToS3Task.getS3Key();
            jsonWriter.name("S3Key");
            jsonWriter.value(s3Key);
        }
        jsonWriter.endObject();
    }

    private static ExportToS3TaskJsonMarshaller instance;

    public static ExportToS3TaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportToS3TaskJsonMarshaller();
        return instance;
    }
}
