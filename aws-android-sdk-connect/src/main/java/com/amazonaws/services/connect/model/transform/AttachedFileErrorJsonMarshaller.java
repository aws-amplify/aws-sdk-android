/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttachedFileError
 */
class AttachedFileErrorJsonMarshaller {

    public void marshall(AttachedFileError attachedFileError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attachedFileError.getErrorCode() != null) {
            String errorCode = attachedFileError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (attachedFileError.getErrorMessage() != null) {
            String errorMessage = attachedFileError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (attachedFileError.getFileId() != null) {
            String fileId = attachedFileError.getFileId();
            jsonWriter.name("FileId");
            jsonWriter.value(fileId);
        }
        jsonWriter.endObject();
    }

    private static AttachedFileErrorJsonMarshaller instance;

    public static AttachedFileErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttachedFileErrorJsonMarshaller();
        return instance;
    }
}
