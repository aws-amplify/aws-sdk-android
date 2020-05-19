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
 * JSON marshaller for POJO PhoneNumberCapabilities
 */
class PhoneNumberCapabilitiesJsonMarshaller {

    public void marshall(PhoneNumberCapabilities phoneNumberCapabilities, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (phoneNumberCapabilities.getInboundCall() != null) {
            Boolean inboundCall = phoneNumberCapabilities.getInboundCall();
            jsonWriter.name("InboundCall");
            jsonWriter.value(inboundCall);
        }
        if (phoneNumberCapabilities.getOutboundCall() != null) {
            Boolean outboundCall = phoneNumberCapabilities.getOutboundCall();
            jsonWriter.name("OutboundCall");
            jsonWriter.value(outboundCall);
        }
        if (phoneNumberCapabilities.getInboundSMS() != null) {
            Boolean inboundSMS = phoneNumberCapabilities.getInboundSMS();
            jsonWriter.name("InboundSMS");
            jsonWriter.value(inboundSMS);
        }
        if (phoneNumberCapabilities.getOutboundSMS() != null) {
            Boolean outboundSMS = phoneNumberCapabilities.getOutboundSMS();
            jsonWriter.name("OutboundSMS");
            jsonWriter.value(outboundSMS);
        }
        if (phoneNumberCapabilities.getInboundMMS() != null) {
            Boolean inboundMMS = phoneNumberCapabilities.getInboundMMS();
            jsonWriter.name("InboundMMS");
            jsonWriter.value(inboundMMS);
        }
        if (phoneNumberCapabilities.getOutboundMMS() != null) {
            Boolean outboundMMS = phoneNumberCapabilities.getOutboundMMS();
            jsonWriter.name("OutboundMMS");
            jsonWriter.value(outboundMMS);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberCapabilitiesJsonMarshaller instance;

    public static PhoneNumberCapabilitiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberCapabilitiesJsonMarshaller();
        return instance;
    }
}
