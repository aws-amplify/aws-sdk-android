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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PeeringConnectionOptions
 */
class PeeringConnectionOptionsJsonMarshaller {

    public void marshall(PeeringConnectionOptions peeringConnectionOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (peeringConnectionOptions.getAllowDnsResolutionFromRemoteVpc() != null) {
            Boolean allowDnsResolutionFromRemoteVpc = peeringConnectionOptions
                    .getAllowDnsResolutionFromRemoteVpc();
            jsonWriter.name("AllowDnsResolutionFromRemoteVpc");
            jsonWriter.value(allowDnsResolutionFromRemoteVpc);
        }
        if (peeringConnectionOptions.getAllowEgressFromLocalClassicLinkToRemoteVpc() != null) {
            Boolean allowEgressFromLocalClassicLinkToRemoteVpc = peeringConnectionOptions
                    .getAllowEgressFromLocalClassicLinkToRemoteVpc();
            jsonWriter.name("AllowEgressFromLocalClassicLinkToRemoteVpc");
            jsonWriter.value(allowEgressFromLocalClassicLinkToRemoteVpc);
        }
        if (peeringConnectionOptions.getAllowEgressFromLocalVpcToRemoteClassicLink() != null) {
            Boolean allowEgressFromLocalVpcToRemoteClassicLink = peeringConnectionOptions
                    .getAllowEgressFromLocalVpcToRemoteClassicLink();
            jsonWriter.name("AllowEgressFromLocalVpcToRemoteClassicLink");
            jsonWriter.value(allowEgressFromLocalVpcToRemoteClassicLink);
        }
        jsonWriter.endObject();
    }

    private static PeeringConnectionOptionsJsonMarshaller instance;

    public static PeeringConnectionOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PeeringConnectionOptionsJsonMarshaller();
        return instance;
    }
}
