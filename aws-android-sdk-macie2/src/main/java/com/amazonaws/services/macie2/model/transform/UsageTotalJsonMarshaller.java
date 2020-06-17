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
 * JSON marshaller for POJO UsageTotal
 */
class UsageTotalJsonMarshaller {

    public void marshall(UsageTotal usageTotal, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (usageTotal.getCurrency() != null) {
            String currency = usageTotal.getCurrency();
            jsonWriter.name("currency");
            jsonWriter.value(currency);
        }
        if (usageTotal.getEstimatedCost() != null) {
            String estimatedCost = usageTotal.getEstimatedCost();
            jsonWriter.name("estimatedCost");
            jsonWriter.value(estimatedCost);
        }
        if (usageTotal.getType() != null) {
            String type = usageTotal.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static UsageTotalJsonMarshaller instance;

    public static UsageTotalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageTotalJsonMarshaller();
        return instance;
    }
}
