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
 * JSON marshaller for POJO PhoneNumberAssociation
 */
class PhoneNumberAssociationJsonMarshaller {

    public void marshall(PhoneNumberAssociation phoneNumberAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (phoneNumberAssociation.getValue() != null) {
            String value = phoneNumberAssociation.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (phoneNumberAssociation.getName() != null) {
            String name = phoneNumberAssociation.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (phoneNumberAssociation.getAssociatedTimestamp() != null) {
            java.util.Date associatedTimestamp = phoneNumberAssociation.getAssociatedTimestamp();
            jsonWriter.name("AssociatedTimestamp");
            jsonWriter.value(associatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberAssociationJsonMarshaller instance;

    public static PhoneNumberAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberAssociationJsonMarshaller();
        return instance;
    }
}
