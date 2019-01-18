/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResponseCard
 */
class ResponseCardJsonUnmarshaller implements Unmarshaller<ResponseCard, JsonUnmarshallerContext> {

    public ResponseCard unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResponseCard responseCard = new ResponseCard();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("version")) {
                responseCard.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentType")) {
                responseCard.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("genericAttachments")) {
                responseCard.setGenericAttachments(new ListUnmarshaller<GenericAttachment>(
                        GenericAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return responseCard;
    }

    private static ResponseCardJsonUnmarshaller instance;

    public static ResponseCardJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseCardJsonUnmarshaller();
        return instance;
    }
}
