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
 * JSON marshaller for POJO TransitGatewayOptions
 */
class TransitGatewayOptionsJsonMarshaller {

    public void marshall(TransitGatewayOptions transitGatewayOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayOptions.getAmazonSideAsn() != null) {
            Long amazonSideAsn = transitGatewayOptions.getAmazonSideAsn();
            jsonWriter.name("AmazonSideAsn");
            jsonWriter.value(amazonSideAsn);
        }
        if (transitGatewayOptions.getAutoAcceptSharedAttachments() != null) {
            String autoAcceptSharedAttachments = transitGatewayOptions
                    .getAutoAcceptSharedAttachments();
            jsonWriter.name("AutoAcceptSharedAttachments");
            jsonWriter.value(autoAcceptSharedAttachments);
        }
        if (transitGatewayOptions.getDefaultRouteTableAssociation() != null) {
            String defaultRouteTableAssociation = transitGatewayOptions
                    .getDefaultRouteTableAssociation();
            jsonWriter.name("DefaultRouteTableAssociation");
            jsonWriter.value(defaultRouteTableAssociation);
        }
        if (transitGatewayOptions.getAssociationDefaultRouteTableId() != null) {
            String associationDefaultRouteTableId = transitGatewayOptions
                    .getAssociationDefaultRouteTableId();
            jsonWriter.name("AssociationDefaultRouteTableId");
            jsonWriter.value(associationDefaultRouteTableId);
        }
        if (transitGatewayOptions.getDefaultRouteTablePropagation() != null) {
            String defaultRouteTablePropagation = transitGatewayOptions
                    .getDefaultRouteTablePropagation();
            jsonWriter.name("DefaultRouteTablePropagation");
            jsonWriter.value(defaultRouteTablePropagation);
        }
        if (transitGatewayOptions.getPropagationDefaultRouteTableId() != null) {
            String propagationDefaultRouteTableId = transitGatewayOptions
                    .getPropagationDefaultRouteTableId();
            jsonWriter.name("PropagationDefaultRouteTableId");
            jsonWriter.value(propagationDefaultRouteTableId);
        }
        if (transitGatewayOptions.getVpnEcmpSupport() != null) {
            String vpnEcmpSupport = transitGatewayOptions.getVpnEcmpSupport();
            jsonWriter.name("VpnEcmpSupport");
            jsonWriter.value(vpnEcmpSupport);
        }
        if (transitGatewayOptions.getDnsSupport() != null) {
            String dnsSupport = transitGatewayOptions.getDnsSupport();
            jsonWriter.name("DnsSupport");
            jsonWriter.value(dnsSupport);
        }
        if (transitGatewayOptions.getMulticastSupport() != null) {
            String multicastSupport = transitGatewayOptions.getMulticastSupport();
            jsonWriter.name("MulticastSupport");
            jsonWriter.value(multicastSupport);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayOptionsJsonMarshaller instance;

    public static TransitGatewayOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayOptionsJsonMarshaller();
        return instance;
    }
}
