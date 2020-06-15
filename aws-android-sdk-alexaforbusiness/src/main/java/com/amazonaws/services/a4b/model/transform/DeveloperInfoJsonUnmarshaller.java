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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DeveloperInfo
 */
class DeveloperInfoJsonUnmarshaller implements Unmarshaller<DeveloperInfo, JsonUnmarshallerContext> {

    public DeveloperInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeveloperInfo developerInfo = new DeveloperInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeveloperName")) {
                developerInfo.setDeveloperName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivacyPolicy")) {
                developerInfo.setPrivacyPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Email")) {
                developerInfo.setEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                developerInfo.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return developerInfo;
    }

    private static DeveloperInfoJsonUnmarshaller instance;

    public static DeveloperInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeveloperInfoJsonUnmarshaller();
        return instance;
    }
}
