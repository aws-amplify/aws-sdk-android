/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NumberValidateResponse
 */
class NumberValidateResponseJsonUnmarshaller implements
        Unmarshaller<NumberValidateResponse, JsonUnmarshallerContext> {

    public NumberValidateResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NumberValidateResponse numberValidateResponse = new NumberValidateResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Carrier")) {
                numberValidateResponse.setCarrier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("City")) {
                numberValidateResponse.setCity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CleansedPhoneNumberE164")) {
                numberValidateResponse.setCleansedPhoneNumberE164(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CleansedPhoneNumberNational")) {
                numberValidateResponse.setCleansedPhoneNumberNational(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Country")) {
                numberValidateResponse.setCountry(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CountryCodeIso2")) {
                numberValidateResponse.setCountryCodeIso2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CountryCodeNumeric")) {
                numberValidateResponse.setCountryCodeNumeric(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("County")) {
                numberValidateResponse.setCounty(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginalCountryCodeIso2")) {
                numberValidateResponse.setOriginalCountryCodeIso2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginalPhoneNumber")) {
                numberValidateResponse.setOriginalPhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneType")) {
                numberValidateResponse.setPhoneType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneTypeCode")) {
                numberValidateResponse.setPhoneTypeCode(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timezone")) {
                numberValidateResponse.setTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ZipCode")) {
                numberValidateResponse.setZipCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return numberValidateResponse;
    }

    private static NumberValidateResponseJsonUnmarshaller instance;

    public static NumberValidateResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NumberValidateResponseJsonUnmarshaller();
        return instance;
    }
}
