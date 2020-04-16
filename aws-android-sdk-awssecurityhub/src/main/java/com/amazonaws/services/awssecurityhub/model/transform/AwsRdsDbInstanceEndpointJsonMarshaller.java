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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsRdsDbInstanceEndpoint
 */
class AwsRdsDbInstanceEndpointJsonMarshaller {

    public void marshall(AwsRdsDbInstanceEndpoint awsRdsDbInstanceEndpoint, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsRdsDbInstanceEndpoint.getAddress() != null) {
            String address = awsRdsDbInstanceEndpoint.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (awsRdsDbInstanceEndpoint.getPort() != null) {
            Integer port = awsRdsDbInstanceEndpoint.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (awsRdsDbInstanceEndpoint.getHostedZoneId() != null) {
            String hostedZoneId = awsRdsDbInstanceEndpoint.getHostedZoneId();
            jsonWriter.name("HostedZoneId");
            jsonWriter.value(hostedZoneId);
        }
        jsonWriter.endObject();
    }

    private static AwsRdsDbInstanceEndpointJsonMarshaller instance;

    public static AwsRdsDbInstanceEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbInstanceEndpointJsonMarshaller();
        return instance;
    }
}
