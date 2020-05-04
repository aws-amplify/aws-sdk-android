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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceUsage
 */
class InstanceUsageJsonMarshaller {

    public void marshall(InstanceUsage instanceUsage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceUsage.getAccountId() != null) {
            String accountId = instanceUsage.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (instanceUsage.getUsedInstanceCount() != null) {
            Integer usedInstanceCount = instanceUsage.getUsedInstanceCount();
            jsonWriter.name("UsedInstanceCount");
            jsonWriter.value(usedInstanceCount);
        }
        jsonWriter.endObject();
    }

    private static InstanceUsageJsonMarshaller instance;

    public static InstanceUsageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceUsageJsonMarshaller();
        return instance;
    }
}
