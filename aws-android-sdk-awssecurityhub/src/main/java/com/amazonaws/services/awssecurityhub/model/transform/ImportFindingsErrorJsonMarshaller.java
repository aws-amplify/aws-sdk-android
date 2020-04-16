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
 * JSON marshaller for POJO ImportFindingsError
 */
class ImportFindingsErrorJsonMarshaller {

    public void marshall(ImportFindingsError importFindingsError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (importFindingsError.getId() != null) {
            String id = importFindingsError.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (importFindingsError.getErrorCode() != null) {
            String errorCode = importFindingsError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (importFindingsError.getErrorMessage() != null) {
            String errorMessage = importFindingsError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static ImportFindingsErrorJsonMarshaller instance;

    public static ImportFindingsErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportFindingsErrorJsonMarshaller();
        return instance;
    }
}
