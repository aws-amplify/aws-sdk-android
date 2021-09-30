/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AugmentedManifestsListItem
 */
class AugmentedManifestsListItemJsonMarshaller {

    public void marshall(AugmentedManifestsListItem augmentedManifestsListItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (augmentedManifestsListItem.getS3Uri() != null) {
            String s3Uri = augmentedManifestsListItem.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        if (augmentedManifestsListItem.getSplit() != null) {
            String split = augmentedManifestsListItem.getSplit();
            jsonWriter.name("Split");
            jsonWriter.value(split);
        }
        if (augmentedManifestsListItem.getAttributeNames() != null) {
            java.util.List<String> attributeNames = augmentedManifestsListItem.getAttributeNames();
            jsonWriter.name("AttributeNames");
            jsonWriter.beginArray();
            for (String attributeNamesItem : attributeNames) {
                if (attributeNamesItem != null) {
                    jsonWriter.value(attributeNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (augmentedManifestsListItem.getAnnotationDataS3Uri() != null) {
            String annotationDataS3Uri = augmentedManifestsListItem.getAnnotationDataS3Uri();
            jsonWriter.name("AnnotationDataS3Uri");
            jsonWriter.value(annotationDataS3Uri);
        }
        if (augmentedManifestsListItem.getSourceDocumentsS3Uri() != null) {
            String sourceDocumentsS3Uri = augmentedManifestsListItem.getSourceDocumentsS3Uri();
            jsonWriter.name("SourceDocumentsS3Uri");
            jsonWriter.value(sourceDocumentsS3Uri);
        }
        if (augmentedManifestsListItem.getDocumentType() != null) {
            String documentType = augmentedManifestsListItem.getDocumentType();
            jsonWriter.name("DocumentType");
            jsonWriter.value(documentType);
        }
        jsonWriter.endObject();
    }

    private static AugmentedManifestsListItemJsonMarshaller instance;

    public static AugmentedManifestsListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AugmentedManifestsListItemJsonMarshaller();
        return instance;
    }
}
