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
 * JSON unmarshaller for POJO APNSMessage
 */
class APNSMessageJsonUnmarshaller implements Unmarshaller<APNSMessage, JsonUnmarshallerContext> {

    public APNSMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        APNSMessage aPNSMessage = new APNSMessage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Action")) {
                aPNSMessage.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Badge")) {
                aPNSMessage.setBadge(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Body")) {
                aPNSMessage.setBody(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Category")) {
                aPNSMessage.setCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CollapseId")) {
                aPNSMessage.setCollapseId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Data")) {
                aPNSMessage.setData(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MediaUrl")) {
                aPNSMessage.setMediaUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreferredAuthenticationMethod")) {
                aPNSMessage.setPreferredAuthenticationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Priority")) {
                aPNSMessage.setPriority(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RawContent")) {
                aPNSMessage.setRawContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SilentPush")) {
                aPNSMessage.setSilentPush(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sound")) {
                aPNSMessage.setSound(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Substitutions")) {
                aPNSMessage.setSubstitutions(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreadId")) {
                aPNSMessage.setThreadId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeToLive")) {
                aPNSMessage.setTimeToLive(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                aPNSMessage.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                aPNSMessage.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aPNSMessage;
    }

    private static APNSMessageJsonUnmarshaller instance;

    public static APNSMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSMessageJsonUnmarshaller();
        return instance;
    }
}
