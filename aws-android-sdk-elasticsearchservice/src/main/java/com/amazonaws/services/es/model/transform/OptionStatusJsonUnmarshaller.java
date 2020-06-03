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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO OptionStatus
 */
class OptionStatusJsonUnmarshaller implements Unmarshaller<OptionStatus, JsonUnmarshallerContext> {

    public OptionStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OptionStatus optionStatus = new OptionStatus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreationDate")) {
                optionStatus.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateDate")) {
                optionStatus.setUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateVersion")) {
                optionStatus.setUpdateVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                optionStatus.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PendingDeletion")) {
                optionStatus.setPendingDeletion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return optionStatus;
    }

    private static OptionStatusJsonUnmarshaller instance;

    public static OptionStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionStatusJsonUnmarshaller();
        return instance;
    }
}
