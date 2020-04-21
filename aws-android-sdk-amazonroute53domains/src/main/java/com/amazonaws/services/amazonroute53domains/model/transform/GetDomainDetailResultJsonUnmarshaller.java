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
 * JSON unmarshaller for response GetDomainDetailResult
 */
public class GetDomainDetailResultJsonUnmarshaller implements
        Unmarshaller<GetDomainDetailResult, JsonUnmarshallerContext> {

    public GetDomainDetailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDomainDetailResult getDomainDetailResult = new GetDomainDetailResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainName")) {
                getDomainDetailResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Nameservers")) {
                getDomainDetailResult.setNameservers(new ListUnmarshaller<Nameserver>(
                        NameserverJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AutoRenew")) {
                getDomainDetailResult.setAutoRenew(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdminContact")) {
                getDomainDetailResult.setAdminContact(ContactDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegistrantContact")) {
                getDomainDetailResult.setRegistrantContact(ContactDetailJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TechContact")) {
                getDomainDetailResult.setTechContact(ContactDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdminPrivacy")) {
                getDomainDetailResult.setAdminPrivacy(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegistrantPrivacy")) {
                getDomainDetailResult.setRegistrantPrivacy(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TechPrivacy")) {
                getDomainDetailResult.setTechPrivacy(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegistrarName")) {
                getDomainDetailResult.setRegistrarName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WhoIsServer")) {
                getDomainDetailResult.setWhoIsServer(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegistrarUrl")) {
                getDomainDetailResult.setRegistrarUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AbuseContactEmail")) {
                getDomainDetailResult.setAbuseContactEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AbuseContactPhone")) {
                getDomainDetailResult.setAbuseContactPhone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegistryDomainId")) {
                getDomainDetailResult.setRegistryDomainId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                getDomainDetailResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedDate")) {
                getDomainDetailResult.setUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpirationDate")) {
                getDomainDetailResult.setExpirationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Reseller")) {
                getDomainDetailResult.setReseller(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsSec")) {
                getDomainDetailResult.setDnsSec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusList")) {
                getDomainDetailResult.setStatusList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDomainDetailResult;
    }

    private static GetDomainDetailResultJsonUnmarshaller instance;

    public static GetDomainDetailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDomainDetailResultJsonUnmarshaller();
        return instance;
    }
}
