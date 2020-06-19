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
 * JSON marshaller for POJO TransitGatewayRequestOptions
 */
class TransitGatewayRequestOptionsJsonMarshaller {

    public void marshall(TransitGatewayRequestOptions transitGatewayRequestOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayRequestOptions.getAmazonSideAsn() != null) {
            Long amazonSideAsn = transitGatewayRequestOptions.getAmazonSideAsn();
            jsonWriter.name("AmazonSideAsn");
            jsonWriter.value(amazonSideAsn);
        }
        if (transitGatewayRequestOptions.getAutoAcceptSharedAttachments() != null) {
            String autoAcceptSharedAttachments = transitGatewayRequestOptions
                    .getAutoAcceptSharedAttachments();
            jsonWriter.name("AutoAcceptSharedAttachments");
            jsonWriter.value(autoAcceptSharedAttachments);
        }
        if (transitGatewayRequestOptions.getDefaultRouteTableAssociation() != null) {
            String defaultRouteTableAssociation = transitGatewayRequestOptions
                    .getDefaultRouteTableAssociation();
            jsonWriter.name("DefaultRouteTableAssociation");
            jsonWriter.value(defaultRouteTableAssociation);
        }
        if (transitGatewayRequestOptions.getDefaultRouteTablePropagation() != null) {
            String defaultRouteTablePropagation = transitGatewayRequestOptions
                    .getDefaultRouteTablePropagation();
            jsonWriter.name("DefaultRouteTablePropagation");
            jsonWriter.value(defaultRouteTablePropagation);
        }
        if (transitGatewayRequestOptions.getVpnEcmpSupport() != null) {
            String vpnEcmpSupport = transitGatewayRequestOptions.getVpnEcmpSupport();
            jsonWriter.name("VpnEcmpSupport");
            jsonWriter.value(vpnEcmpSupport);
        }
        if (transitGatewayRequestOptions.getDnsSupport() != null) {
            String dnsSupport = transitGatewayRequestOptions.getDnsSupport();
            jsonWriter.name("DnsSupport");
            jsonWriter.value(dnsSupport);
        }
        if (transitGatewayRequestOptions.getMulticastSupport() != null) {
            String multicastSupport = transitGatewayRequestOptions.getMulticastSupport();
            jsonWriter.name("MulticastSupport");
            jsonWriter.value(multicastSupport);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayRequestOptionsJsonMarshaller instance;

    public static TransitGatewayRequestOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRequestOptionsJsonMarshaller();
        return instance;
    }
}
