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
 * JSON marshaller for POJO UsageStatisticsSortBy
 */
class UsageStatisticsSortByJsonMarshaller {

    public void marshall(UsageStatisticsSortBy usageStatisticsSortBy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (usageStatisticsSortBy.getKey() != null) {
            String key = usageStatisticsSortBy.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (usageStatisticsSortBy.getOrderBy() != null) {
            String orderBy = usageStatisticsSortBy.getOrderBy();
            jsonWriter.name("orderBy");
            jsonWriter.value(orderBy);
        }
        jsonWriter.endObject();
    }

    private static UsageStatisticsSortByJsonMarshaller instance;

    public static UsageStatisticsSortByJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageStatisticsSortByJsonMarshaller();
        return instance;
    }
}
