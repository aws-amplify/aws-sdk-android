/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ClaimedPhoneNumberSummary
 */
class ClaimedPhoneNumberSummaryJsonUnmarshaller implements
        Unmarshaller<ClaimedPhoneNumberSummary, JsonUnmarshallerContext> {

    public ClaimedPhoneNumberSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClaimedPhoneNumberSummary claimedPhoneNumberSummary = new ClaimedPhoneNumberSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PhoneNumberId")) {
                claimedPhoneNumberSummary.setPhoneNumberId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumberArn")) {
                claimedPhoneNumberSummary.setPhoneNumberArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumber")) {
                claimedPhoneNumberSummary.setPhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumberCountryCode")) {
                claimedPhoneNumberSummary.setPhoneNumberCountryCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumberType")) {
                claimedPhoneNumberSummary.setPhoneNumberType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumberDescription")) {
                claimedPhoneNumberSummary.setPhoneNumberDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetArn")) {
                claimedPhoneNumberSummary.setTargetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                claimedPhoneNumberSummary.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PhoneNumberStatus")) {
                claimedPhoneNumberSummary.setPhoneNumberStatus(PhoneNumberStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return claimedPhoneNumberSummary;
    }

    private static ClaimedPhoneNumberSummaryJsonUnmarshaller instance;

    public static ClaimedPhoneNumberSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClaimedPhoneNumberSummaryJsonUnmarshaller();
        return instance;
    }
}
