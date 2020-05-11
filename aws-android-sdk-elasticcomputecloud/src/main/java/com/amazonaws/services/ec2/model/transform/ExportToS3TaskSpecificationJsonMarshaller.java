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
 * JSON marshaller for POJO ExportToS3TaskSpecification
 */
class ExportToS3TaskSpecificationJsonMarshaller {

    public void marshall(ExportToS3TaskSpecification exportToS3TaskSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportToS3TaskSpecification.getContainerFormat() != null) {
            String containerFormat = exportToS3TaskSpecification.getContainerFormat();
            jsonWriter.name("ContainerFormat");
            jsonWriter.value(containerFormat);
        }
        if (exportToS3TaskSpecification.getDiskImageFormat() != null) {
            String diskImageFormat = exportToS3TaskSpecification.getDiskImageFormat();
            jsonWriter.name("DiskImageFormat");
            jsonWriter.value(diskImageFormat);
        }
        if (exportToS3TaskSpecification.getS3Bucket() != null) {
            String s3Bucket = exportToS3TaskSpecification.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (exportToS3TaskSpecification.getS3Prefix() != null) {
            String s3Prefix = exportToS3TaskSpecification.getS3Prefix();
            jsonWriter.name("S3Prefix");
            jsonWriter.value(s3Prefix);
        }
        jsonWriter.endObject();
    }

    private static ExportToS3TaskSpecificationJsonMarshaller instance;

    public static ExportToS3TaskSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportToS3TaskSpecificationJsonMarshaller();
        return instance;
    }
}
