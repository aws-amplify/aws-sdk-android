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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Address
 */
class AddressJsonUnmarshaller implements Unmarshaller<Address, JsonUnmarshallerContext> {

    public Address unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Address address = new Address();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AddressId")) {
                address.setAddressId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                address.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Company")) {
                address.setCompany(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Street1")) {
                address.setStreet1(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Street2")) {
                address.setStreet2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Street3")) {
                address.setStreet3(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("City")) {
                address.setCity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateOrProvince")) {
                address.setStateOrProvince(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrefectureOrDistrict")) {
                address.setPrefectureOrDistrict(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Landmark")) {
                address.setLandmark(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Country")) {
                address.setCountry(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostalCode")) {
                address.setPostalCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumber")) {
                address.setPhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsRestricted")) {
                address.setIsRestricted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return address;
    }

    private static AddressJsonUnmarshaller instance;

    public static AddressJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonUnmarshaller();
        return instance;
    }
}
