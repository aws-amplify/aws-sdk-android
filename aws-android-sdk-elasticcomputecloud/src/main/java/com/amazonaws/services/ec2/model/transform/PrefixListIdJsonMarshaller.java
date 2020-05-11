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
 * JSON marshaller for POJO PrefixListId
 */
class PrefixListIdJsonMarshaller {

    public void marshall(PrefixListId prefixListId, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (prefixListId.getDescription() != null) {
            String description = prefixListId.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (prefixListId.getPrefixListId() != null) {
            String prefixListId = prefixListId.getPrefixListId();
            jsonWriter.name("PrefixListId");
            jsonWriter.value(prefixListId);
        }
        jsonWriter.endObject();
    }

    private static PrefixListIdJsonMarshaller instance;

    public static PrefixListIdJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrefixListIdJsonMarshaller();
        return instance;
    }
}
