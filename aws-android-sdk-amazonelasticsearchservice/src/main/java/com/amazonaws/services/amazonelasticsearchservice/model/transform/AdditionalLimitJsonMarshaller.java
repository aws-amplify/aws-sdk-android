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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdditionalLimit
 */
class AdditionalLimitJsonMarshaller {

    public void marshall(AdditionalLimit additionalLimit, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (additionalLimit.getLimitName() != null) {
            String limitName = additionalLimit.getLimitName();
            jsonWriter.name("LimitName");
            jsonWriter.value(limitName);
        }
        if (additionalLimit.getLimitValues() != null) {
            java.util.List<String> limitValues = additionalLimit.getLimitValues();
            jsonWriter.name("LimitValues");
            jsonWriter.beginArray();
            for (String limitValuesItem : limitValues) {
                if (limitValuesItem != null) {
                    jsonWriter.value(limitValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AdditionalLimitJsonMarshaller instance;

    public static AdditionalLimitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdditionalLimitJsonMarshaller();
        return instance;
    }
}
