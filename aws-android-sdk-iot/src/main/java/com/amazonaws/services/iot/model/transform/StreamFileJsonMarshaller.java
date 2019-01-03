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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamFile
 */
class StreamFileJsonMarshaller {

    public void marshall(StreamFile streamFile, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (streamFile.getFileId() != null) {
            Integer fileId = streamFile.getFileId();
            jsonWriter.name("fileId");
            jsonWriter.value(fileId);
        }
        if (streamFile.getS3Location() != null) {
            S3Location s3Location = streamFile.getS3Location();
            jsonWriter.name("s3Location");
            S3LocationJsonMarshaller.getInstance().marshall(s3Location, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StreamFileJsonMarshaller instance;

    public static StreamFileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamFileJsonMarshaller();
        return instance;
    }
}
