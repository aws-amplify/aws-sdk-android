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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RemoteIpDetails
 */
class RemoteIpDetailsJsonUnmarshaller implements
        Unmarshaller<RemoteIpDetails, JsonUnmarshallerContext> {

    public RemoteIpDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RemoteIpDetails remoteIpDetails = new RemoteIpDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("City")) {
                remoteIpDetails.setCity(CityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Country")) {
                remoteIpDetails.setCountry(CountryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GeoLocation")) {
                remoteIpDetails.setGeoLocation(GeoLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpAddressV4")) {
                remoteIpDetails.setIpAddressV4(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Organization")) {
                remoteIpDetails.setOrganization(OrganizationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return remoteIpDetails;
    }

    private static RemoteIpDetailsJsonUnmarshaller instance;

    public static RemoteIpDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemoteIpDetailsJsonUnmarshaller();
        return instance;
    }
}
