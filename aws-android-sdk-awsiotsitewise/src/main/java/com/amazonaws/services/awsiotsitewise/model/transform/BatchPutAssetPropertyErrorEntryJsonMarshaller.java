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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchPutAssetPropertyErrorEntry
 */
class BatchPutAssetPropertyErrorEntryJsonMarshaller {

    public void marshall(BatchPutAssetPropertyErrorEntry batchPutAssetPropertyErrorEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchPutAssetPropertyErrorEntry.getEntryId() != null) {
            String entryId = batchPutAssetPropertyErrorEntry.getEntryId();
            jsonWriter.name("entryId");
            jsonWriter.value(entryId);
        }
        if (batchPutAssetPropertyErrorEntry.getErrors() != null) {
            java.util.List<BatchPutAssetPropertyError> errors = batchPutAssetPropertyErrorEntry
                    .getErrors();
            jsonWriter.name("errors");
            jsonWriter.beginArray();
            for (BatchPutAssetPropertyError errorsItem : errors) {
                if (errorsItem != null) {
                    BatchPutAssetPropertyErrorJsonMarshaller.getInstance().marshall(errorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BatchPutAssetPropertyErrorEntryJsonMarshaller instance;

    public static BatchPutAssetPropertyErrorEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchPutAssetPropertyErrorEntryJsonMarshaller();
        return instance;
    }
}
