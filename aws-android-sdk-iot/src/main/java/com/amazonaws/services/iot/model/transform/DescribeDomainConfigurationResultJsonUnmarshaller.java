/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDomainConfigurationResult
 */
public class DescribeDomainConfigurationResultJsonUnmarshaller implements
        Unmarshaller<DescribeDomainConfigurationResult, JsonUnmarshallerContext> {

    public DescribeDomainConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeDomainConfigurationResult describeDomainConfigurationResult = new DescribeDomainConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainConfigurationName")) {
                describeDomainConfigurationResult.setDomainConfigurationName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainConfigurationArn")) {
                describeDomainConfigurationResult.setDomainConfigurationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainName")) {
                describeDomainConfigurationResult.setDomainName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("serverCertificates")) {
                describeDomainConfigurationResult
                        .setServerCertificates(new ListUnmarshaller<ServerCertificateSummary>(
                                ServerCertificateSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("authorizerConfig")) {
                describeDomainConfigurationResult
                        .setAuthorizerConfig(AuthorizerConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("domainConfigurationStatus")) {
                describeDomainConfigurationResult
                        .setDomainConfigurationStatus(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("serviceType")) {
                describeDomainConfigurationResult.setServiceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainType")) {
                describeDomainConfigurationResult.setDomainType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastStatusChangeDate")) {
                describeDomainConfigurationResult.setLastStatusChangeDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDomainConfigurationResult;
    }

    private static DescribeDomainConfigurationResultJsonUnmarshaller instance;

    public static DescribeDomainConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDomainConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
