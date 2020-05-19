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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UpdatePhoneNumberRequestItem
 */
class UpdatePhoneNumberRequestItemJsonUnmarshaller implements
        Unmarshaller<UpdatePhoneNumberRequestItem, JsonUnmarshallerContext> {

    public UpdatePhoneNumberRequestItem unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UpdatePhoneNumberRequestItem updatePhoneNumberRequestItem = new UpdatePhoneNumberRequestItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PhoneNumberId")) {
                updatePhoneNumberRequestItem.setPhoneNumberId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductType")) {
                updatePhoneNumberRequestItem.setProductType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CallingName")) {
                updatePhoneNumberRequestItem.setCallingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updatePhoneNumberRequestItem;
    }

    private static UpdatePhoneNumberRequestItemJsonUnmarshaller instance;

    public static UpdatePhoneNumberRequestItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePhoneNumberRequestItemJsonUnmarshaller();
        return instance;
    }
}
