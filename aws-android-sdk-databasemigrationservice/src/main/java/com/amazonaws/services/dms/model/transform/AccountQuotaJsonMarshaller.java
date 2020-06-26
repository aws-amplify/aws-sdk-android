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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccountQuota
 */
class AccountQuotaJsonMarshaller {

    public void marshall(AccountQuota accountQuota, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (accountQuota.getAccountQuotaName() != null) {
            String accountQuotaName = accountQuota.getAccountQuotaName();
            jsonWriter.name("AccountQuotaName");
            jsonWriter.value(accountQuotaName);
        }
        if (accountQuota.getUsed() != null) {
            Long used = accountQuota.getUsed();
            jsonWriter.name("Used");
            jsonWriter.value(used);
        }
        if (accountQuota.getMax() != null) {
            Long max = accountQuota.getMax();
            jsonWriter.name("Max");
            jsonWriter.value(max);
        }
        jsonWriter.endObject();
    }

    private static AccountQuotaJsonMarshaller instance;

    public static AccountQuotaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountQuotaJsonMarshaller();
        return instance;
    }
}
