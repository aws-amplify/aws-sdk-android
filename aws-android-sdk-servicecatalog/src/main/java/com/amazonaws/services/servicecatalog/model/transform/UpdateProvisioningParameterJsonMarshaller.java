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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateProvisioningParameter
 */
class UpdateProvisioningParameterJsonMarshaller {

    public void marshall(UpdateProvisioningParameter updateProvisioningParameter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateProvisioningParameter.getKey() != null) {
            String key = updateProvisioningParameter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (updateProvisioningParameter.getValue() != null) {
            String value = updateProvisioningParameter.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (updateProvisioningParameter.getUsePreviousValue() != null) {
            Boolean usePreviousValue = updateProvisioningParameter.getUsePreviousValue();
            jsonWriter.name("UsePreviousValue");
            jsonWriter.value(usePreviousValue);
        }
        jsonWriter.endObject();
    }

    private static UpdateProvisioningParameterJsonMarshaller instance;

    public static UpdateProvisioningParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateProvisioningParameterJsonMarshaller();
        return instance;
    }
}
