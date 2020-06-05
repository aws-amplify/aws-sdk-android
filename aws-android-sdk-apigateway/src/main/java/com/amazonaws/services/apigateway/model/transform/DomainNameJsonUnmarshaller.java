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
 * JSON unmarshaller for POJO DomainName
 */
class DomainNameJsonUnmarshaller implements Unmarshaller<DomainName, JsonUnmarshallerContext> {

    public DomainName unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DomainName domainName = new DomainName();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainName")) {
                domainName.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateName")) {
                domainName.setCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateArn")) {
                domainName.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateUploadDate")) {
                domainName.setCertificateUploadDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalDomainName")) {
                domainName.setRegionalDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalHostedZoneId")) {
                domainName.setRegionalHostedZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateName")) {
                domainName.setRegionalCertificateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regionalCertificateArn")) {
                domainName.setRegionalCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionDomainName")) {
                domainName.setDistributionDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionHostedZoneId")) {
                domainName.setDistributionHostedZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpointConfiguration")) {
                domainName.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainNameStatus")) {
                domainName.setDomainNameStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainNameStatusMessage")) {
                domainName.setDomainNameStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityPolicy")) {
                domainName.setSecurityPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                domainName.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return domainName;
    }

    private static DomainNameJsonUnmarshaller instance;

    public static DomainNameJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainNameJsonUnmarshaller();
        return instance;
    }
}
