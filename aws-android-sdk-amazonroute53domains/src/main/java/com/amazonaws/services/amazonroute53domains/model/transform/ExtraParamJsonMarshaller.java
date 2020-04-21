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

package com.amazonaws.services.amazonroute53domains.model.transform;

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExtraParam
 */
class ExtraParamJsonMarshaller {

    public void marshall(ExtraParam extraParam, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (extraParam.getName() != null) {
            String name = extraParam.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (extraParam.getValue() != null) {
            String value = extraParam.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static ExtraParamJsonMarshaller instance;

    public static ExtraParamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExtraParamJsonMarshaller();
        return instance;
    }
}
