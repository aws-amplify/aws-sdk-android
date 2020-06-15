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
 * JSON unmarshaller for POJO Content
 */
class ContentJsonUnmarshaller implements Unmarshaller<Content, JsonUnmarshallerContext> {

    public Content unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Content content = new Content();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TextList")) {
                content.setTextList(new ListUnmarshaller<Text>(TextJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SsmlList")) {
                content.setSsmlList(new ListUnmarshaller<Ssml>(SsmlJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AudioList")) {
                content.setAudioList(new ListUnmarshaller<Audio>(AudioJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return content;
    }

    private static ContentJsonUnmarshaller instance;

    public static ContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContentJsonUnmarshaller();
        return instance;
    }
}
