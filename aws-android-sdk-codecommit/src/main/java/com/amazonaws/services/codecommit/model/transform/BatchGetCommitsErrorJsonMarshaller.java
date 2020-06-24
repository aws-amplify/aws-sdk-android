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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchGetCommitsError
 */
class BatchGetCommitsErrorJsonMarshaller {

    public void marshall(BatchGetCommitsError batchGetCommitsError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (batchGetCommitsError.getCommitId() != null) {
            String commitId = batchGetCommitsError.getCommitId();
            jsonWriter.name("commitId");
            jsonWriter.value(commitId);
        }
        if (batchGetCommitsError.getErrorCode() != null) {
            String errorCode = batchGetCommitsError.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (batchGetCommitsError.getErrorMessage() != null) {
            String errorMessage = batchGetCommitsError.getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static BatchGetCommitsErrorJsonMarshaller instance;

    public static BatchGetCommitsErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetCommitsErrorJsonMarshaller();
        return instance;
    }
}
