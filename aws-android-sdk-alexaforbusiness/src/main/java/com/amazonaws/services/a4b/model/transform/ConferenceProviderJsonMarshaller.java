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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConferenceProvider
 */
class ConferenceProviderJsonMarshaller {

    public void marshall(ConferenceProvider conferenceProvider, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (conferenceProvider.getArn() != null) {
            String arn = conferenceProvider.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (conferenceProvider.getName() != null) {
            String name = conferenceProvider.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (conferenceProvider.getType() != null) {
            String type = conferenceProvider.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (conferenceProvider.getIPDialIn() != null) {
            IPDialIn iPDialIn = conferenceProvider.getIPDialIn();
            jsonWriter.name("IPDialIn");
            IPDialInJsonMarshaller.getInstance().marshall(iPDialIn, jsonWriter);
        }
        if (conferenceProvider.getPSTNDialIn() != null) {
            PSTNDialIn pSTNDialIn = conferenceProvider.getPSTNDialIn();
            jsonWriter.name("PSTNDialIn");
            PSTNDialInJsonMarshaller.getInstance().marshall(pSTNDialIn, jsonWriter);
        }
        if (conferenceProvider.getMeetingSetting() != null) {
            MeetingSetting meetingSetting = conferenceProvider.getMeetingSetting();
            jsonWriter.name("MeetingSetting");
            MeetingSettingJsonMarshaller.getInstance().marshall(meetingSetting, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ConferenceProviderJsonMarshaller instance;

    public static ConferenceProviderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConferenceProviderJsonMarshaller();
        return instance;
    }
}
