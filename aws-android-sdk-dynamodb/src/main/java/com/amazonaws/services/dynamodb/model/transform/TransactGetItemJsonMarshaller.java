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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TransactGetItem
 */
class TransactGetItemJsonMarshaller {

    public void marshall(TransactGetItem transactGetItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transactGetItem.getGet() != null) {
            Get get = transactGetItem.getGet();
            jsonWriter.name("Get");
            GetJsonMarshaller.getInstance().marshall(get, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TransactGetItemJsonMarshaller instance;

    public static TransactGetItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransactGetItemJsonMarshaller();
        return instance;
    }
}
