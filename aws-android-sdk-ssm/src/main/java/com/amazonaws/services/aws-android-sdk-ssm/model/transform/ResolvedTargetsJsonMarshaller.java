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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResolvedTargets
 */
class ResolvedTargetsJsonMarshaller {

    public void marshall(ResolvedTargets resolvedTargets, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resolvedTargets.getParameterValues() != null) {
            java.util.List<String> parameterValues = resolvedTargets.getParameterValues();
            jsonWriter.name("ParameterValues");
            jsonWriter.beginArray();
            for (String parameterValuesItem : parameterValues) {
                if (parameterValuesItem != null) {
            jsonWriter.value(parameterValuesItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (resolvedTargets.getTruncated() != null) {
            Boolean truncated = resolvedTargets.getTruncated();
            jsonWriter.name("Truncated");
            jsonWriter.value(truncated);
        }
        jsonWriter.endObject();
    }

    private static ResolvedTargetsJsonMarshaller instance;
    public static ResolvedTargetsJsonMarshaller getInstance() {
        if (instance == null) instance = new ResolvedTargetsJsonMarshaller();
        return instance;
    }
}
