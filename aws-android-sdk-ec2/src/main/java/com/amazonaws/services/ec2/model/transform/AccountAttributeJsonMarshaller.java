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
 * JSON marshaller for POJO AccountAttribute
 */
class AccountAttributeJsonMarshaller {

    public void marshall(AccountAttribute accountAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accountAttribute.getAttributeName() != null) {
            String attributeName = accountAttribute.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        if (accountAttribute.getAttributeValues() != null) {
            java.util.List<AccountAttributeValue> attributeValues = accountAttribute
                    .getAttributeValues();
            jsonWriter.name("AttributeValues");
            jsonWriter.beginArray();
            for (AccountAttributeValue attributeValuesItem : attributeValues) {
                if (attributeValuesItem != null) {
                    AccountAttributeValueJsonMarshaller.getInstance().marshall(attributeValuesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
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
