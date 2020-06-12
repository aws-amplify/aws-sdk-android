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
 * JSON unmarshaller for response UpdateDomainNameResult
 */
public class UpdateDomainNameResultJsonUnmarshaller implements
        Unmarshaller<UpdateDomainNameResult, JsonUnmarshallerContext> {

    public UpdateDomainNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateDomainNameResult updateDomainNameResult = new UpdateDomainNameResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainName")) {
                updateDomainNameResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateName")) {
                updateDomainNameResult.setCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateArn")) {
                updateDomainNameResult.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateUploadDate")) {
                updateDomainNameResult.setCertificateUploadDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalDomainName")) {
                updateDomainNameResult.setRegionalDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalHostedZoneId")) {
                updateDomainNameResult.setRegionalHostedZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateName")) {
                updateDomainNameResult.setRegionalCertificateName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateArn")) {
                updateDomainNameResult.setRegionalCertificateArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionDomainName")) {
                updateDomainNameResult.setDistributionDomainName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionHostedZoneId")) {
                updateDomainNameResult.setDistributionHostedZoneId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpointConfiguration")) {
                updateDomainNameResult
                        .setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("domainNameStatus")) {
                updateDomainNameResult.setDomainNameStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainNameStatusMessage")) {
                updateDomainNameResult.setDomainNameStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityPolicy")) {
                updateDomainNameResult.setSecurityPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                updateDomainNameResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateDomainNameResult;
    }

    private static UpdateDomainNameResultJsonUnmarshaller instance;

    public static UpdateDomainNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDomainNameResultJsonUnmarshaller();
        return instance;
    }
}
