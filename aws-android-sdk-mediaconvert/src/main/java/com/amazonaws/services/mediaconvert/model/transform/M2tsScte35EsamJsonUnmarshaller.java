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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO M2tsScte35Esam
 */
class M2tsScte35EsamJsonUnmarshaller implements
        Unmarshaller<M2tsScte35Esam, JsonUnmarshallerContext> {

    public M2tsScte35Esam unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        M2tsScte35Esam m2tsScte35Esam = new M2tsScte35Esam();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Scte35EsamPid")) {
                m2tsScte35Esam.setScte35EsamPid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return m2tsScte35Esam;
    }

    private static M2tsScte35EsamJsonUnmarshaller instance;

    public static M2tsScte35EsamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M2tsScte35EsamJsonUnmarshaller();
        return instance;
    }
}
