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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AttachmentsSource
 */
class AttachmentsSourceJsonUnmarshaller implements
        Unmarshaller<AttachmentsSource, JsonUnmarshallerContext> {

    public AttachmentsSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AttachmentsSource attachmentsSource = new AttachmentsSource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Key")) {
                attachmentsSource.setKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Values")) {
                attachmentsSource.setValues(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                attachmentsSource.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attachmentsSource;
    }

    private static AttachmentsSourceJsonUnmarshaller instance;

    public static AttachmentsSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentsSourceJsonUnmarshaller();
        return instance;
    }
}
