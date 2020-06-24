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
 * JSON marshaller for POJO MergeMetadata
 */
class MergeMetadataJsonMarshaller {

    public void marshall(MergeMetadata mergeMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mergeMetadata.getIsMerged() != null) {
            Boolean isMerged = mergeMetadata.getIsMerged();
            jsonWriter.name("isMerged");
            jsonWriter.value(isMerged);
        }
        if (mergeMetadata.getMergedBy() != null) {
            String mergedBy = mergeMetadata.getMergedBy();
            jsonWriter.name("mergedBy");
            jsonWriter.value(mergedBy);
        }
        if (mergeMetadata.getMergeCommitId() != null) {
            String mergeCommitId = mergeMetadata.getMergeCommitId();
            jsonWriter.name("mergeCommitId");
            jsonWriter.value(mergeCommitId);
        }
        if (mergeMetadata.getMergeOption() != null) {
            String mergeOption = mergeMetadata.getMergeOption();
            jsonWriter.name("mergeOption");
            jsonWriter.value(mergeOption);
        }
        jsonWriter.endObject();
    }

    private static MergeMetadataJsonMarshaller instance;

    public static MergeMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MergeMetadataJsonMarshaller();
        return instance;
    }
}
