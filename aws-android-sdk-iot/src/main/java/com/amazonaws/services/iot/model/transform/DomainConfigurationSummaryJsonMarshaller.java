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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainConfigurationSummary
 */
class DomainConfigurationSummaryJsonMarshaller {

    public void marshall(DomainConfigurationSummary domainConfigurationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainConfigurationSummary.getDomainConfigurationName() != null) {
            String domainConfigurationName = domainConfigurationSummary
                    .getDomainConfigurationName();
            jsonWriter.name("domainConfigurationName");
            jsonWriter.value(domainConfigurationName);
        }
        if (domainConfigurationSummary.getDomainConfigurationArn() != null) {
            String domainConfigurationArn = domainConfigurationSummary.getDomainConfigurationArn();
            jsonWriter.name("domainConfigurationArn");
            jsonWriter.value(domainConfigurationArn);
        }
        if (domainConfigurationSummary.getServiceType() != null) {
            String serviceType = domainConfigurationSummary.getServiceType();
            jsonWriter.name("serviceType");
            jsonWriter.value(serviceType);
        }
        jsonWriter.endObject();
    }

    private static DomainConfigurationSummaryJsonMarshaller instance;

    public static DomainConfigurationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainConfigurationSummaryJsonMarshaller();
        return instance;
    }
}
