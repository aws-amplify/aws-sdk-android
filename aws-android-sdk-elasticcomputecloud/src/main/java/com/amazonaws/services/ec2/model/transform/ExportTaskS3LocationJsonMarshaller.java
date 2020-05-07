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
 * JSON marshaller for POJO ExportTaskS3Location
 */
class ExportTaskS3LocationJsonMarshaller {

    public void marshall(ExportTaskS3Location exportTaskS3Location, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exportTaskS3Location.getS3Bucket() != null) {
            String s3Bucket = exportTaskS3Location.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (exportTaskS3Location.getS3Prefix() != null) {
            String s3Prefix = exportTaskS3Location.getS3Prefix();
            jsonWriter.name("S3Prefix");
            jsonWriter.value(s3Prefix);
        }
        jsonWriter.endObject();
    }

    private static ExportTaskS3LocationJsonMarshaller instance;

    public static ExportTaskS3LocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskS3LocationJsonMarshaller();
        return instance;
    }
}
