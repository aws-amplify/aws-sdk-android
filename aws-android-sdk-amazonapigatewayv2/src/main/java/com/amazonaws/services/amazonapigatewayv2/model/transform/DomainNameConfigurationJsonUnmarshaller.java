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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DomainNameConfiguration
 */
class DomainNameConfigurationJsonUnmarshaller implements
        Unmarshaller<DomainNameConfiguration, JsonUnmarshallerContext> {

    public DomainNameConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DomainNameConfiguration domainNameConfiguration = new DomainNameConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiGatewayDomainName")) {
                domainNameConfiguration.setApiGatewayDomainName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateArn")) {
                domainNameConfiguration.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateName")) {
                domainNameConfiguration.setCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateUploadDate")) {
                domainNameConfiguration.setCertificateUploadDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainNameStatus")) {
                domainNameConfiguration.setDomainNameStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainNameStatusMessage")) {
                domainNameConfiguration.setDomainNameStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointType")) {
                domainNameConfiguration.setEndpointType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostedZoneId")) {
                domainNameConfiguration.setHostedZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityPolicy")) {
                domainNameConfiguration.setSecurityPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return domainNameConfiguration;
    }

    private static DomainNameConfigurationJsonUnmarshaller instance;

    public static DomainNameConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainNameConfigurationJsonUnmarshaller();
        return instance;
    }
}
