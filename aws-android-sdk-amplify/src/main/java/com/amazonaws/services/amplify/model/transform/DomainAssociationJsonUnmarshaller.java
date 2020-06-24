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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DomainAssociation
 */
class DomainAssociationJsonUnmarshaller implements
        Unmarshaller<DomainAssociation, JsonUnmarshallerContext> {

    public DomainAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DomainAssociation domainAssociation = new DomainAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainAssociationArn")) {
                domainAssociation.setDomainAssociationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainName")) {
                domainAssociation.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableAutoSubDomain")) {
                domainAssociation.setEnableAutoSubDomain(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoSubDomainCreationPatterns")) {
                domainAssociation.setAutoSubDomainCreationPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("autoSubDomainIAMRole")) {
                domainAssociation.setAutoSubDomainIAMRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainStatus")) {
                domainAssociation.setDomainStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusReason")) {
                domainAssociation.setStatusReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateVerificationDNSRecord")) {
                domainAssociation.setCertificateVerificationDNSRecord(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("subDomains")) {
                domainAssociation.setSubDomains(new ListUnmarshaller<SubDomain>(
                        SubDomainJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return domainAssociation;
    }

    private static DomainAssociationJsonUnmarshaller instance;

    public static DomainAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainAssociationJsonUnmarshaller();
        return instance;
    }
}
