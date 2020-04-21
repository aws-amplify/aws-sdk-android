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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdminAccount
 */
class AdminAccountJsonMarshaller {

    public void marshall(AdminAccount adminAccount, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (adminAccount.getAdminAccountId() != null) {
            String adminAccountId = adminAccount.getAdminAccountId();
            jsonWriter.name("AdminAccountId");
            jsonWriter.value(adminAccountId);
        }
        if (adminAccount.getAdminStatus() != null) {
            String adminStatus = adminAccount.getAdminStatus();
            jsonWriter.name("AdminStatus");
            jsonWriter.value(adminStatus);
        }
        jsonWriter.endObject();
    }

    private static AdminAccountJsonMarshaller instance;

    public static AdminAccountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdminAccountJsonMarshaller();
        return instance;
    }
}
