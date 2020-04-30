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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TapeArchive
 */
class TapeArchiveJsonMarshaller {

    public void marshall(TapeArchive tapeArchive, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tapeArchive.getTapeARN() != null) {
            String tapeARN = tapeArchive.getTapeARN();
            jsonWriter.name("TapeARN");
            jsonWriter.value(tapeARN);
        }
        if (tapeArchive.getTapeBarcode() != null) {
            String tapeBarcode = tapeArchive.getTapeBarcode();
            jsonWriter.name("TapeBarcode");
            jsonWriter.value(tapeBarcode);
        }
        if (tapeArchive.getTapeCreatedDate() != null) {
            java.util.Date tapeCreatedDate = tapeArchive.getTapeCreatedDate();
            jsonWriter.name("TapeCreatedDate");
            jsonWriter.value(tapeCreatedDate);
        }
        if (tapeArchive.getTapeSizeInBytes() != null) {
            Long tapeSizeInBytes = tapeArchive.getTapeSizeInBytes();
            jsonWriter.name("TapeSizeInBytes");
            jsonWriter.value(tapeSizeInBytes);
        }
        if (tapeArchive.getCompletionTime() != null) {
            java.util.Date completionTime = tapeArchive.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (tapeArchive.getRetrievedTo() != null) {
            String retrievedTo = tapeArchive.getRetrievedTo();
            jsonWriter.name("RetrievedTo");
            jsonWriter.value(retrievedTo);
        }
        if (tapeArchive.getTapeStatus() != null) {
            String tapeStatus = tapeArchive.getTapeStatus();
            jsonWriter.name("TapeStatus");
            jsonWriter.value(tapeStatus);
        }
        if (tapeArchive.getTapeUsedInBytes() != null) {
            Long tapeUsedInBytes = tapeArchive.getTapeUsedInBytes();
            jsonWriter.name("TapeUsedInBytes");
            jsonWriter.value(tapeUsedInBytes);
        }
        if (tapeArchive.getKMSKey() != null) {
            String kMSKey = tapeArchive.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (tapeArchive.getPoolId() != null) {
            String poolId = tapeArchive.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        jsonWriter.endObject();
    }

    private static TapeArchiveJsonMarshaller instance;

    public static TapeArchiveJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeArchiveJsonMarshaller();
        return instance;
    }
}
