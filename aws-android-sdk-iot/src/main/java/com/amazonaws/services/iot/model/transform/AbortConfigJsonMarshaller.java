/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AbortConfig
 */
class AbortConfigJsonMarshaller {

    public void marshall(AbortConfig abortConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (abortConfig.getCriteriaList() != null) {
            java.util.List<AbortCriteria> criteriaList = abortConfig.getCriteriaList();
            jsonWriter.name("criteriaList");
            jsonWriter.beginArray();
            for (AbortCriteria criteriaListItem : criteriaList) {
                if (criteriaListItem != null) {
                    AbortCriteriaJsonMarshaller.getInstance()
                            .marshall(criteriaListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AbortConfigJsonMarshaller instance;

    public static AbortConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AbortConfigJsonMarshaller();
        return instance;
    }
}
