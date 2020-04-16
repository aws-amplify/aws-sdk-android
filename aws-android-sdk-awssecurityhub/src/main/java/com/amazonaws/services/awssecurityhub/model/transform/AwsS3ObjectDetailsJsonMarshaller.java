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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsS3ObjectDetails
 */
class AwsS3ObjectDetailsJsonMarshaller {

    public void marshall(AwsS3ObjectDetails awsS3ObjectDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsS3ObjectDetails.getLastModified() != null) {
            String lastModified = awsS3ObjectDetails.getLastModified();
            jsonWriter.name("LastModified");
            jsonWriter.value(lastModified);
        }
        if (awsS3ObjectDetails.getETag() != null) {
            String eTag = awsS3ObjectDetails.getETag();
            jsonWriter.name("ETag");
            jsonWriter.value(eTag);
        }
        if (awsS3ObjectDetails.getVersionId() != null) {
            String versionId = awsS3ObjectDetails.getVersionId();
            jsonWriter.name("VersionId");
            jsonWriter.value(versionId);
        }
        if (awsS3ObjectDetails.getContentType() != null) {
            String contentType = awsS3ObjectDetails.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (awsS3ObjectDetails.getServerSideEncryption() != null) {
            String serverSideEncryption = awsS3ObjectDetails.getServerSideEncryption();
            jsonWriter.name("ServerSideEncryption");
            jsonWriter.value(serverSideEncryption);
        }
        if (awsS3ObjectDetails.getSSEKMSKeyId() != null) {
            String sSEKMSKeyId = awsS3ObjectDetails.getSSEKMSKeyId();
            jsonWriter.name("SSEKMSKeyId");
            jsonWriter.value(sSEKMSKeyId);
        }
        jsonWriter.endObject();
    }

    private static AwsS3ObjectDetailsJsonMarshaller instance;

    public static AwsS3ObjectDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3ObjectDetailsJsonMarshaller();
        return instance;
    }
}
