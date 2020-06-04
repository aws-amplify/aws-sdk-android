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
 * JSON marshaller for POJO Phase2EncryptionAlgorithmsRequestListValue
 */
class Phase2EncryptionAlgorithmsRequestListValueJsonMarshaller {

    public void marshall(
            Phase2EncryptionAlgorithmsRequestListValue phase2EncryptionAlgorithmsRequestListValue,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (phase2EncryptionAlgorithmsRequestListValue.getValue() != null) {
            String value = phase2EncryptionAlgorithmsRequestListValue.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static Phase2EncryptionAlgorithmsRequestListValueJsonMarshaller instance;

    public static Phase2EncryptionAlgorithmsRequestListValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Phase2EncryptionAlgorithmsRequestListValueJsonMarshaller();
        return instance;
    }
}
