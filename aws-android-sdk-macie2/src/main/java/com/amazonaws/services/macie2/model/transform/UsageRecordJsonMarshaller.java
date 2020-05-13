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
 * JSON marshaller for POJO UsageRecord
 */
class UsageRecordJsonMarshaller {

    public void marshall(UsageRecord usageRecord, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (usageRecord.getAccountId() != null) {
            String accountId = usageRecord.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (usageRecord.getFreeTrialStartDate() != null) {
            java.util.Date freeTrialStartDate = usageRecord.getFreeTrialStartDate();
            jsonWriter.name("freeTrialStartDate");
            jsonWriter.value(freeTrialStartDate);
        }
        if (usageRecord.getUsage() != null) {
            java.util.List<UsageByAccount> usage = usageRecord.getUsage();
            jsonWriter.name("usage");
            jsonWriter.beginArray();
            for (UsageByAccount usageItem : usage) {
                if (usageItem != null) {
                    UsageByAccountJsonMarshaller.getInstance().marshall(usageItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UsageRecordJsonMarshaller instance;

    public static UsageRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageRecordJsonMarshaller();
        return instance;
    }
}
