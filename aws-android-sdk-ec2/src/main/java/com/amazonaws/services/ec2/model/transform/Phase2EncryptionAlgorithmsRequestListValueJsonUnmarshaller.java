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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Phase2EncryptionAlgorithmsRequestListValue
 */
class Phase2EncryptionAlgorithmsRequestListValueJsonUnmarshaller implements
        Unmarshaller<Phase2EncryptionAlgorithmsRequestListValue, JsonUnmarshallerContext> {

    public Phase2EncryptionAlgorithmsRequestListValue unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Phase2EncryptionAlgorithmsRequestListValue phase2EncryptionAlgorithmsRequestListValue = new Phase2EncryptionAlgorithmsRequestListValue();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Value")) {
                phase2EncryptionAlgorithmsRequestListValue.setValue(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return phase2EncryptionAlgorithmsRequestListValue;
    }

    private static Phase2EncryptionAlgorithmsRequestListValueJsonUnmarshaller instance;

    public static Phase2EncryptionAlgorithmsRequestListValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Phase2EncryptionAlgorithmsRequestListValueJsonUnmarshaller();
        return instance;
    }
}
