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
 * JSON unmarshaller for POJO GCMMessage
 */
class GCMMessageJsonUnmarshaller implements Unmarshaller<GCMMessage, JsonUnmarshallerContext> {

    public GCMMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GCMMessage gCMMessage = new GCMMessage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Action")) {
                gCMMessage.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Body")) {
                gCMMessage.setBody(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CollapseKey")) {
                gCMMessage.setCollapseKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Data")) {
                gCMMessage.setData(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IconReference")) {
                gCMMessage.setIconReference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageIconUrl")) {
                gCMMessage.setImageIconUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageUrl")) {
                gCMMessage.setImageUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Priority")) {
                gCMMessage.setPriority(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RawContent")) {
                gCMMessage.setRawContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RestrictedPackageName")) {
                gCMMessage.setRestrictedPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SilentPush")) {
                gCMMessage.setSilentPush(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SmallImageIconUrl")) {
                gCMMessage.setSmallImageIconUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sound")) {
                gCMMessage.setSound(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Substitutions")) {
                gCMMessage.setSubstitutions(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("TimeToLive")) {
                gCMMessage.setTimeToLive(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                gCMMessage.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                gCMMessage.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return gCMMessage;
    }

    private static GCMMessageJsonUnmarshaller instance;

    public static GCMMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GCMMessageJsonUnmarshaller();
        return instance;
    }
}
