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
 * JSON marshaller for POJO ListJobsSortCriteria
 */
class ListJobsSortCriteriaJsonMarshaller {

    public void marshall(ListJobsSortCriteria listJobsSortCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listJobsSortCriteria.getAttributeName() != null) {
            String attributeName = listJobsSortCriteria.getAttributeName();
            jsonWriter.name("attributeName");
            jsonWriter.value(attributeName);
        }
        if (listJobsSortCriteria.getOrderBy() != null) {
            String orderBy = listJobsSortCriteria.getOrderBy();
            jsonWriter.name("orderBy");
            jsonWriter.value(orderBy);
        }
        jsonWriter.endObject();
    }

    private static ListJobsSortCriteriaJsonMarshaller instance;

    public static ListJobsSortCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListJobsSortCriteriaJsonMarshaller();
        return instance;
    }
}
