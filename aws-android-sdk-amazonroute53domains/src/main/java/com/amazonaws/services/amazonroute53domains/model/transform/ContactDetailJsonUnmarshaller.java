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

package com.amazonaws.services.amazonroute53domains.model.transform;

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ContactDetail
 */
class ContactDetailJsonUnmarshaller implements Unmarshaller<ContactDetail, JsonUnmarshallerContext> {

    public ContactDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContactDetail contactDetail = new ContactDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FirstName")) {
                contactDetail.setFirstName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastName")) {
                contactDetail.setLastName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContactType")) {
                contactDetail.setContactType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OrganizationName")) {
                contactDetail.setOrganizationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AddressLine1")) {
                contactDetail.setAddressLine1(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AddressLine2")) {
                contactDetail.setAddressLine2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("City")) {
                contactDetail.setCity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                contactDetail.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CountryCode")) {
                contactDetail.setCountryCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ZipCode")) {
                contactDetail.setZipCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumber")) {
                contactDetail.setPhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Email")) {
                contactDetail.setEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Fax")) {
                contactDetail.setFax(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExtraParams")) {
                contactDetail.setExtraParams(new ListUnmarshaller<ExtraParam>(
                        ExtraParamJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return contactDetail;
    }

    private static ContactDetailJsonUnmarshaller instance;

    public static ContactDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactDetailJsonUnmarshaller();
        return instance;
    }
}
