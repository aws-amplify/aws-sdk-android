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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DomainDescriptionType
 */
class DomainDescriptionTypeJsonUnmarshaller implements
        Unmarshaller<DomainDescriptionType, JsonUnmarshallerContext> {

    public DomainDescriptionType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DomainDescriptionType domainDescriptionType = new DomainDescriptionType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserPoolId")) {
                domainDescriptionType.setUserPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AWSAccountId")) {
                domainDescriptionType.setAWSAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Domain")) {
                domainDescriptionType.setDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Bucket")) {
                domainDescriptionType.setS3Bucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CloudFrontDistribution")) {
                domainDescriptionType.setCloudFrontDistribution(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                domainDescriptionType.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                domainDescriptionType.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomDomainConfig")) {
                domainDescriptionType.setCustomDomainConfig(CustomDomainConfigTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return domainDescriptionType;
    }

    private static DomainDescriptionTypeJsonUnmarshaller instance;

    public static DomainDescriptionTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainDescriptionTypeJsonUnmarshaller();
        return instance;
    }
}
