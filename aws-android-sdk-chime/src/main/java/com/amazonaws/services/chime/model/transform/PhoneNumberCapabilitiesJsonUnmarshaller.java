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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PhoneNumberCapabilities
 */
class PhoneNumberCapabilitiesJsonUnmarshaller implements
        Unmarshaller<PhoneNumberCapabilities, JsonUnmarshallerContext> {

    public PhoneNumberCapabilities unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PhoneNumberCapabilities phoneNumberCapabilities = new PhoneNumberCapabilities();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InboundCall")) {
                phoneNumberCapabilities.setInboundCall(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutboundCall")) {
                phoneNumberCapabilities.setOutboundCall(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InboundSMS")) {
                phoneNumberCapabilities.setInboundSMS(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutboundSMS")) {
                phoneNumberCapabilities.setOutboundSMS(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InboundMMS")) {
                phoneNumberCapabilities.setInboundMMS(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutboundMMS")) {
                phoneNumberCapabilities.setOutboundMMS(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return phoneNumberCapabilities;
    }

    private static PhoneNumberCapabilitiesJsonUnmarshaller instance;

    public static PhoneNumberCapabilitiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberCapabilitiesJsonUnmarshaller();
        return instance;
    }
}
