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
 * JSON marshaller for POJO UsageByAccount
 */
class UsageByAccountJsonMarshaller {

    public void marshall(UsageByAccount usageByAccount, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (usageByAccount.getCurrency() != null) {
            String currency = usageByAccount.getCurrency();
            jsonWriter.name("currency");
            jsonWriter.value(currency);
        }
        if (usageByAccount.getEstimatedCost() != null) {
            String estimatedCost = usageByAccount.getEstimatedCost();
            jsonWriter.name("estimatedCost");
            jsonWriter.value(estimatedCost);
        }
        if (usageByAccount.getServiceLimit() != null) {
            ServiceLimit serviceLimit = usageByAccount.getServiceLimit();
            jsonWriter.name("serviceLimit");
            ServiceLimitJsonMarshaller.getInstance().marshall(serviceLimit, jsonWriter);
        }
        if (usageByAccount.getType() != null) {
            String type = usageByAccount.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static UsageByAccountJsonMarshaller instance;

    public static UsageByAccountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageByAccountJsonMarshaller();
        return instance;
    }
}
