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

package com.amazonaws.services.awsopsworkscm.model.transform;

import com.amazonaws.services.awsopsworkscm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccountAttribute
 */
class AccountAttributeJsonMarshaller {

    public void marshall(AccountAttribute accountAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accountAttribute.getName() != null) {
            String name = accountAttribute.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (accountAttribute.getMaximum() != null) {
            Integer maximum = accountAttribute.getMaximum();
            jsonWriter.name("Maximum");
            jsonWriter.value(maximum);
        }
        if (accountAttribute.getUsed() != null) {
            Integer used = accountAttribute.getUsed();
            jsonWriter.name("Used");
            jsonWriter.value(used);
        }
        jsonWriter.endObject();
    }

    private static AccountAttributeJsonMarshaller instance;

    public static AccountAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountAttributeJsonMarshaller();
        return instance;
    }
}
