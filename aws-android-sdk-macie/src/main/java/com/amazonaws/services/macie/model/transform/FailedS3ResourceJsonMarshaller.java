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

package com.amazonaws.services.macie.model.transform;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FailedS3Resource
 */
class FailedS3ResourceJsonMarshaller {

    public void marshall(FailedS3Resource failedS3Resource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (failedS3Resource.getFailedItem() != null) {
            S3Resource failedItem = failedS3Resource.getFailedItem();
            jsonWriter.name("failedItem");
            S3ResourceJsonMarshaller.getInstance().marshall(failedItem, jsonWriter);
        }
        if (failedS3Resource.getErrorCode() != null) {
            String errorCode = failedS3Resource.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (failedS3Resource.getErrorMessage() != null) {
            String errorMessage = failedS3Resource.getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static FailedS3ResourceJsonMarshaller instance;

    public static FailedS3ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FailedS3ResourceJsonMarshaller();
        return instance;
    }
}
