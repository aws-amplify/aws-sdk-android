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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ADMMessage
 */
class ADMMessageJsonUnmarshaller implements Unmarshaller<ADMMessage, JsonUnmarshallerContext> {

    public ADMMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ADMMessage aDMMessage = new ADMMessage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Action")) {
                aDMMessage.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Body")) {
                aDMMessage.setBody(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConsolidationKey")) {
                aDMMessage.setConsolidationKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Data")) {
                aDMMessage.setData(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExpiresAfter")) {
                aDMMessage.setExpiresAfter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IconReference")) {
                aDMMessage.setIconReference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageIconUrl")) {
                aDMMessage.setImageIconUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageUrl")) {
                aDMMessage.setImageUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MD5")) {
                aDMMessage.setMD5(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RawContent")) {
                aDMMessage.setRawContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SilentPush")) {
                aDMMessage.setSilentPush(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SmallImageIconUrl")) {
                aDMMessage.setSmallImageIconUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sound")) {
                aDMMessage.setSound(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Substitutions")) {
                aDMMessage.setSubstitutions(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("Title")) {
                aDMMessage.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                aDMMessage.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aDMMessage;
    }

    private static ADMMessageJsonUnmarshaller instance;

    public static ADMMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ADMMessageJsonUnmarshaller();
        return instance;
    }
}
