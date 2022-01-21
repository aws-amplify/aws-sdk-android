/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO PhoneNumberSummary
 */
class PhoneNumberSummaryJsonUnmarshaller implements
        Unmarshaller<PhoneNumberSummary, JsonUnmarshallerContext> {

    public PhoneNumberSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PhoneNumberSummary phoneNumberSummary = new PhoneNumberSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                phoneNumberSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                phoneNumberSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumber")) {
                phoneNumberSummary.setPhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumberType")) {
                phoneNumberSummary.setPhoneNumberType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumberCountryCode")) {
                phoneNumberSummary.setPhoneNumberCountryCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return phoneNumberSummary;
    }

    private static PhoneNumberSummaryJsonUnmarshaller instance;

    public static PhoneNumberSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberSummaryJsonUnmarshaller();
        return instance;
    }
}
