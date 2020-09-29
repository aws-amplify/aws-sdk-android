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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OpsEntity
 */
class OpsEntityJsonMarshaller {

    public void marshall(OpsEntity opsEntity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opsEntity.getId() != null) {
            String id = opsEntity.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (opsEntity.getData() != null) {
            java.util.Map<String, OpsEntityItem> data = opsEntity.getData();
            jsonWriter.name("Data");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, OpsEntityItem> dataEntry : data.entrySet()) {
                OpsEntityItem dataValue = dataEntry.getValue();
                if (dataValue != null) {
                    jsonWriter.name(dataEntry.getKey());
            OpsEntityItemJsonMarshaller.getInstance().marshall(dataValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static OpsEntityJsonMarshaller instance;
    public static OpsEntityJsonMarshaller getInstance() {
        if (instance == null) instance = new OpsEntityJsonMarshaller();
        return instance;
    }
}
