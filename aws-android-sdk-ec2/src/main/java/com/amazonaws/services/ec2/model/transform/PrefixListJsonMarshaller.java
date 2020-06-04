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
 * JSON marshaller for POJO PrefixList
 */
class PrefixListJsonMarshaller {

    public void marshall(PrefixList prefixList, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (prefixList.getCidrs() != null) {
            java.util.List<String> cidrs = prefixList.getCidrs();
            jsonWriter.name("Cidrs");
            jsonWriter.beginArray();
            for (String cidrsItem : cidrs) {
                if (cidrsItem != null) {
                    jsonWriter.value(cidrsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (prefixList.getPrefixListId() != null) {
            String prefixListId = prefixList.getPrefixListId();
            jsonWriter.name("PrefixListId");
            jsonWriter.value(prefixListId);
        }
        if (prefixList.getPrefixListName() != null) {
            String prefixListName = prefixList.getPrefixListName();
            jsonWriter.name("PrefixListName");
            jsonWriter.value(prefixListName);
        }
        jsonWriter.endObject();
    }

    private static PrefixListJsonMarshaller instance;

    public static PrefixListJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrefixListJsonMarshaller();
        return instance;
    }
}
