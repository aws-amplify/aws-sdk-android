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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Participant
 */
class ParticipantJsonMarshaller {

    public void marshall(Participant participant, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (participant.getPhoneNumber() != null) {
            String phoneNumber = participant.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (participant.getProxyPhoneNumber() != null) {
            String proxyPhoneNumber = participant.getProxyPhoneNumber();
            jsonWriter.name("ProxyPhoneNumber");
            jsonWriter.value(proxyPhoneNumber);
        }
        jsonWriter.endObject();
    }

    private static ParticipantJsonMarshaller instance;

    public static ParticipantJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParticipantJsonMarshaller();
        return instance;
    }
}
