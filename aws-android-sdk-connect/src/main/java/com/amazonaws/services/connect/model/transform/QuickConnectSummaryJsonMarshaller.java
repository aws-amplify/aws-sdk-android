/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QuickConnectSummary
 */
class QuickConnectSummaryJsonMarshaller {

    public void marshall(QuickConnectSummary quickConnectSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (quickConnectSummary.getId() != null) {
            String id = quickConnectSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (quickConnectSummary.getArn() != null) {
            String arn = quickConnectSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (quickConnectSummary.getName() != null) {
            String name = quickConnectSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (quickConnectSummary.getQuickConnectType() != null) {
            String quickConnectType = quickConnectSummary.getQuickConnectType();
            jsonWriter.name("QuickConnectType");
            jsonWriter.value(quickConnectType);
        }
        jsonWriter.endObject();
    }

    private static QuickConnectSummaryJsonMarshaller instance;

    public static QuickConnectSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QuickConnectSummaryJsonMarshaller();
        return instance;
    }
}
