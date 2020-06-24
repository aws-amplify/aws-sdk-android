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
 * JSON marshaller for POJO Target
 */
class TargetJsonMarshaller {

    public void marshall(Target target, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (target.getRepositoryName() != null) {
            String repositoryName = target.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (target.getSourceReference() != null) {
            String sourceReference = target.getSourceReference();
            jsonWriter.name("sourceReference");
            jsonWriter.value(sourceReference);
        }
        if (target.getDestinationReference() != null) {
            String destinationReference = target.getDestinationReference();
            jsonWriter.name("destinationReference");
            jsonWriter.value(destinationReference);
        }
        jsonWriter.endObject();
    }

    private static TargetJsonMarshaller instance;

    public static TargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetJsonMarshaller();
        return instance;
    }
}
