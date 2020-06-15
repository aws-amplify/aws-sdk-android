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
 * JSON unmarshaller for POJO PhoneNumber
 */
class PhoneNumberJsonUnmarshaller implements Unmarshaller<PhoneNumber, JsonUnmarshallerContext> {

    public PhoneNumber unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PhoneNumber phoneNumber = new PhoneNumber();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PhoneNumberId")) {
                phoneNumber.setPhoneNumberId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("E164PhoneNumber")) {
                phoneNumber.setE164PhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                phoneNumber.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductType")) {
                phoneNumber.setProductType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                phoneNumber.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Capabilities")) {
                phoneNumber.setCapabilities(PhoneNumberCapabilitiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Associations")) {
                phoneNumber.setAssociations(new ListUnmarshaller<PhoneNumberAssociation>(
                        PhoneNumberAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CallingName")) {
                phoneNumber.setCallingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CallingNameStatus")) {
                phoneNumber.setCallingNameStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                phoneNumber.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedTimestamp")) {
                phoneNumber.setUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionTimestamp")) {
                phoneNumber.setDeletionTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return phoneNumber;
    }

    private static PhoneNumberJsonUnmarshaller instance;

    public static PhoneNumberJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberJsonUnmarshaller();
        return instance;
    }
}
