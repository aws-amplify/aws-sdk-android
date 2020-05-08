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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SortCriteria
 */
class SortCriteriaJsonMarshaller {

    public void marshall(SortCriteria sortCriteria, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sortCriteria.getAttributeName() != null) {
            String attributeName = sortCriteria.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        if (sortCriteria.getOrderBy() != null) {
            String orderBy = sortCriteria.getOrderBy();
            jsonWriter.name("OrderBy");
            jsonWriter.value(orderBy);
        }
        jsonWriter.endObject();
    }

    private static SortCriteriaJsonMarshaller instance;

    public static SortCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SortCriteriaJsonMarshaller();
        return instance;
    }
}
