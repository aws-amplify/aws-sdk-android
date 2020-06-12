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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateDomainNameResult
 */
public class CreateDomainNameResultJsonUnmarshaller implements
        Unmarshaller<CreateDomainNameResult, JsonUnmarshallerContext> {

    public CreateDomainNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDomainNameResult createDomainNameResult = new CreateDomainNameResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainName")) {
                createDomainNameResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateName")) {
                createDomainNameResult.setCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateArn")) {
                createDomainNameResult.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateUploadDate")) {
                createDomainNameResult.setCertificateUploadDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalDomainName")) {
                createDomainNameResult.setRegionalDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalHostedZoneId")) {
                createDomainNameResult.setRegionalHostedZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateName")) {
                createDomainNameResult.setRegionalCertificateName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateArn")) {
                createDomainNameResult.setRegionalCertificateArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionDomainName")) {
                createDomainNameResult.setDistributionDomainName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionHostedZoneId")) {
                createDomainNameResult.setDistributionHostedZoneId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpointConfiguration")) {
                createDomainNameResult
                        .setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("domainNameStatus")) {
                createDomainNameResult.setDomainNameStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainNameStatusMessage")) {
                createDomainNameResult.setDomainNameStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityPolicy")) {
                createDomainNameResult.setSecurityPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createDomainNameResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDomainNameResult;
    }

    private static CreateDomainNameResultJsonUnmarshaller instance;

    public static CreateDomainNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDomainNameResultJsonUnmarshaller();
        return instance;
    }
}
