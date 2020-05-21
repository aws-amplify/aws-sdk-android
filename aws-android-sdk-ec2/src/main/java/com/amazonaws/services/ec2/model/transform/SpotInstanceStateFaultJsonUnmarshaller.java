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
 * JSON unmarshaller for POJO SpotInstanceStateFault
 */
class SpotInstanceStateFaultJsonUnmarshaller implements
        Unmarshaller<SpotInstanceStateFault, JsonUnmarshallerContext> {

    public SpotInstanceStateFault unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SpotInstanceStateFault spotInstanceStateFault = new SpotInstanceStateFault();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Code")) {
                spotInstanceStateFault.setCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                spotInstanceStateFault.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return spotInstanceStateFault;
    }

    private static SpotInstanceStateFaultJsonUnmarshaller instance;

    public static SpotInstanceStateFaultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotInstanceStateFaultJsonUnmarshaller();
        return instance;
    }
}
