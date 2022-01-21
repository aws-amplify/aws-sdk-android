/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO QuickConnect
 */
class QuickConnectJsonUnmarshaller implements Unmarshaller<QuickConnect, JsonUnmarshallerContext> {

    public QuickConnect unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        QuickConnect quickConnect = new QuickConnect();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("QuickConnectARN")) {
                quickConnect.setQuickConnectARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuickConnectId")) {
                quickConnect.setQuickConnectId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                quickConnect.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                quickConnect.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuickConnectConfig")) {
                quickConnect.setQuickConnectConfig(QuickConnectConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                quickConnect.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return quickConnect;
    }

    private static QuickConnectJsonUnmarshaller instance;

    public static QuickConnectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QuickConnectJsonUnmarshaller();
        return instance;
    }
}
