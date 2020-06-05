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
 * JSON unmarshaller for response GetDomainNameResult
 */
public class GetDomainNameResultJsonUnmarshaller implements
        Unmarshaller<GetDomainNameResult, JsonUnmarshallerContext> {

    public GetDomainNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDomainNameResult getDomainNameResult = new GetDomainNameResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainName")) {
                getDomainNameResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateName")) {
                getDomainNameResult.setCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateArn")) {
                getDomainNameResult.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateUploadDate")) {
                getDomainNameResult.setCertificateUploadDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalDomainName")) {
                getDomainNameResult.setRegionalDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalHostedZoneId")) {
                getDomainNameResult.setRegionalHostedZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateName")) {
                getDomainNameResult.setRegionalCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateArn")) {
                getDomainNameResult.setRegionalCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionDomainName")) {
                getDomainNameResult.setDistributionDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionHostedZoneId")) {
                getDomainNameResult.setDistributionHostedZoneId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpointConfiguration")) {
                getDomainNameResult.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainNameStatus")) {
                getDomainNameResult.setDomainNameStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainNameStatusMessage")) {
                getDomainNameResult.setDomainNameStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityPolicy")) {
                getDomainNameResult.setSecurityPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                getDomainNameResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDomainNameResult;
    }

    private static GetDomainNameResultJsonUnmarshaller instance;

    public static GetDomainNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDomainNameResultJsonUnmarshaller();
        return instance;
    }
}
