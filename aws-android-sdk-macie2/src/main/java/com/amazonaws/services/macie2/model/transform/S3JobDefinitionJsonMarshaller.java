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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3JobDefinition
 */
class S3JobDefinitionJsonMarshaller {

    public void marshall(S3JobDefinition s3JobDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3JobDefinition.getBucketDefinitions() != null) {
            java.util.List<S3BucketDefinitionForJob> bucketDefinitions = s3JobDefinition
                    .getBucketDefinitions();
            jsonWriter.name("bucketDefinitions");
            jsonWriter.beginArray();
            for (S3BucketDefinitionForJob bucketDefinitionsItem : bucketDefinitions) {
                if (bucketDefinitionsItem != null) {
                    S3BucketDefinitionForJobJsonMarshaller.getInstance().marshall(
                            bucketDefinitionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (s3JobDefinition.getScoping() != null) {
            Scoping scoping = s3JobDefinition.getScoping();
            jsonWriter.name("scoping");
            ScopingJsonMarshaller.getInstance().marshall(scoping, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3JobDefinitionJsonMarshaller instance;

    public static S3JobDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3JobDefinitionJsonMarshaller();
        return instance;
    }
}
