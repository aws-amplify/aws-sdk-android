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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HeaderMatchMethod
 */
class HeaderMatchMethodJsonUnmarshaller implements
        Unmarshaller<HeaderMatchMethod, JsonUnmarshallerContext> {

    public HeaderMatchMethod unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HeaderMatchMethod headerMatchMethod = new HeaderMatchMethod();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("exact")) {
                headerMatchMethod.setExact(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("prefix")) {
                headerMatchMethod.setPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("range")) {
                headerMatchMethod.setRange(MatchRangeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regex")) {
                headerMatchMethod.setRegex(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("suffix")) {
                headerMatchMethod.setSuffix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return headerMatchMethod;
    }

    private static HeaderMatchMethodJsonUnmarshaller instance;

    public static HeaderMatchMethodJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HeaderMatchMethodJsonUnmarshaller();
        return instance;
    }
}
