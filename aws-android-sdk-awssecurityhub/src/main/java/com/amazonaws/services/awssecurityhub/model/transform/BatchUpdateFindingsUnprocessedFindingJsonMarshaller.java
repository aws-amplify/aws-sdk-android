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
 * JSON marshaller for POJO BatchUpdateFindingsUnprocessedFinding
 */
class BatchUpdateFindingsUnprocessedFindingJsonMarshaller {

    public void marshall(
            BatchUpdateFindingsUnprocessedFinding batchUpdateFindingsUnprocessedFinding,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchUpdateFindingsUnprocessedFinding.getFindingIdentifier() != null) {
            AwsSecurityFindingIdentifier findingIdentifier = batchUpdateFindingsUnprocessedFinding
                    .getFindingIdentifier();
            jsonWriter.name("FindingIdentifier");
            AwsSecurityFindingIdentifierJsonMarshaller.getInstance().marshall(findingIdentifier,
                    jsonWriter);
        }
        if (batchUpdateFindingsUnprocessedFinding.getErrorCode() != null) {
            String errorCode = batchUpdateFindingsUnprocessedFinding.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (batchUpdateFindingsUnprocessedFinding.getErrorMessage() != null) {
            String errorMessage = batchUpdateFindingsUnprocessedFinding.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static BatchUpdateFindingsUnprocessedFindingJsonMarshaller instance;

    public static BatchUpdateFindingsUnprocessedFindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchUpdateFindingsUnprocessedFindingJsonMarshaller();
        return instance;
    }
}
