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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResolvedAttributes
 */
class ResolvedAttributesJsonMarshaller {

    public void marshall(ResolvedAttributes resolvedAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resolvedAttributes.getAutoMLJobObjective() != null) {
            AutoMLJobObjective autoMLJobObjective = resolvedAttributes.getAutoMLJobObjective();
            jsonWriter.name("AutoMLJobObjective");
            AutoMLJobObjectiveJsonMarshaller.getInstance().marshall(autoMLJobObjective, jsonWriter);
        }
        if (resolvedAttributes.getProblemType() != null) {
            String problemType = resolvedAttributes.getProblemType();
            jsonWriter.name("ProblemType");
            jsonWriter.value(problemType);
        }
        if (resolvedAttributes.getCompletionCriteria() != null) {
            AutoMLJobCompletionCriteria completionCriteria = resolvedAttributes
                    .getCompletionCriteria();
            jsonWriter.name("CompletionCriteria");
            AutoMLJobCompletionCriteriaJsonMarshaller.getInstance().marshall(completionCriteria,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResolvedAttributesJsonMarshaller instance;

    public static ResolvedAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResolvedAttributesJsonMarshaller();
        return instance;
    }
}
