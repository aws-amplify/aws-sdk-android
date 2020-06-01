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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UnprocessedNamedQueryId
 */
class UnprocessedNamedQueryIdJsonMarshaller {

    public void marshall(UnprocessedNamedQueryId unprocessedNamedQueryId, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (unprocessedNamedQueryId.getNamedQueryId() != null) {
            String namedQueryId = unprocessedNamedQueryId.getNamedQueryId();
            jsonWriter.name("NamedQueryId");
            jsonWriter.value(namedQueryId);
        }
        if (unprocessedNamedQueryId.getErrorCode() != null) {
            String errorCode = unprocessedNamedQueryId.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (unprocessedNamedQueryId.getErrorMessage() != null) {
            String errorMessage = unprocessedNamedQueryId.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static UnprocessedNamedQueryIdJsonMarshaller instance;

    public static UnprocessedNamedQueryIdJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnprocessedNamedQueryIdJsonMarshaller();
        return instance;
    }
}
