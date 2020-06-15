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
 * JSON unmarshaller for POJO ConferenceProvider
 */
class ConferenceProviderJsonUnmarshaller implements
        Unmarshaller<ConferenceProvider, JsonUnmarshallerContext> {

    public ConferenceProvider unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ConferenceProvider conferenceProvider = new ConferenceProvider();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                conferenceProvider.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                conferenceProvider.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                conferenceProvider.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IPDialIn")) {
                conferenceProvider.setIPDialIn(IPDialInJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PSTNDialIn")) {
                conferenceProvider.setPSTNDialIn(PSTNDialInJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MeetingSetting")) {
                conferenceProvider.setMeetingSetting(MeetingSettingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return conferenceProvider;
    }

    private static ConferenceProviderJsonUnmarshaller instance;

    public static ConferenceProviderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConferenceProviderJsonUnmarshaller();
        return instance;
    }
}
