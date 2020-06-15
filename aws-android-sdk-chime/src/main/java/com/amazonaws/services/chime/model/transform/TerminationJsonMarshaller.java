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
 * JSON marshaller for POJO Termination
 */
class TerminationJsonMarshaller {

    public void marshall(Termination termination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (termination.getCpsLimit() != null) {
            Integer cpsLimit = termination.getCpsLimit();
            jsonWriter.name("CpsLimit");
            jsonWriter.value(cpsLimit);
        }
        if (termination.getDefaultPhoneNumber() != null) {
            String defaultPhoneNumber = termination.getDefaultPhoneNumber();
            jsonWriter.name("DefaultPhoneNumber");
            jsonWriter.value(defaultPhoneNumber);
        }
        if (termination.getCallingRegions() != null) {
            java.util.List<String> callingRegions = termination.getCallingRegions();
            jsonWriter.name("CallingRegions");
            jsonWriter.beginArray();
            for (String callingRegionsItem : callingRegions) {
                if (callingRegionsItem != null) {
                    jsonWriter.value(callingRegionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (termination.getCidrAllowedList() != null) {
            java.util.List<String> cidrAllowedList = termination.getCidrAllowedList();
            jsonWriter.name("CidrAllowedList");
            jsonWriter.beginArray();
            for (String cidrAllowedListItem : cidrAllowedList) {
                if (cidrAllowedListItem != null) {
                    jsonWriter.value(cidrAllowedListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (termination.getDisabled() != null) {
            Boolean disabled = termination.getDisabled();
            jsonWriter.name("Disabled");
            jsonWriter.value(disabled);
        }
        jsonWriter.endObject();
    }

    private static TerminationJsonMarshaller instance;

    public static TerminationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TerminationJsonMarshaller();
        return instance;
    }
}
