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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsApiCallAction
 */
class AwsApiCallActionJsonMarshaller {

    public void marshall(AwsApiCallAction awsApiCallAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsApiCallAction.getApi() != null) {
            String api = awsApiCallAction.getApi();
            jsonWriter.name("Api");
            jsonWriter.value(api);
        }
        if (awsApiCallAction.getCallerType() != null) {
            String callerType = awsApiCallAction.getCallerType();
            jsonWriter.name("CallerType");
            jsonWriter.value(callerType);
        }
        if (awsApiCallAction.getDomainDetails() != null) {
            DomainDetails domainDetails = awsApiCallAction.getDomainDetails();
            jsonWriter.name("DomainDetails");
            DomainDetailsJsonMarshaller.getInstance().marshall(domainDetails, jsonWriter);
        }
        if (awsApiCallAction.getRemoteIpDetails() != null) {
            RemoteIpDetails remoteIpDetails = awsApiCallAction.getRemoteIpDetails();
            jsonWriter.name("RemoteIpDetails");
            RemoteIpDetailsJsonMarshaller.getInstance().marshall(remoteIpDetails, jsonWriter);
        }
        if (awsApiCallAction.getServiceName() != null) {
            String serviceName = awsApiCallAction.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        jsonWriter.endObject();
    }

    private static AwsApiCallActionJsonMarshaller instance;

    public static AwsApiCallActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsApiCallActionJsonMarshaller();
        return instance;
    }
}
