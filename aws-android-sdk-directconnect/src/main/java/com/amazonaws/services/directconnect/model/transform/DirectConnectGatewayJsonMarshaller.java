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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DirectConnectGateway
 */
class DirectConnectGatewayJsonMarshaller {

    public void marshall(DirectConnectGateway directConnectGateway, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (directConnectGateway.getDirectConnectGatewayId() != null) {
            String directConnectGatewayId = directConnectGateway.getDirectConnectGatewayId();
            jsonWriter.name("directConnectGatewayId");
            jsonWriter.value(directConnectGatewayId);
        }
        if (directConnectGateway.getDirectConnectGatewayName() != null) {
            String directConnectGatewayName = directConnectGateway.getDirectConnectGatewayName();
            jsonWriter.name("directConnectGatewayName");
            jsonWriter.value(directConnectGatewayName);
        }
        if (directConnectGateway.getAmazonSideAsn() != null) {
            Long amazonSideAsn = directConnectGateway.getAmazonSideAsn();
            jsonWriter.name("amazonSideAsn");
            jsonWriter.value(amazonSideAsn);
        }
        if (directConnectGateway.getOwnerAccount() != null) {
            String ownerAccount = directConnectGateway.getOwnerAccount();
            jsonWriter.name("ownerAccount");
            jsonWriter.value(ownerAccount);
        }
        if (directConnectGateway.getDirectConnectGatewayState() != null) {
            String directConnectGatewayState = directConnectGateway.getDirectConnectGatewayState();
            jsonWriter.name("directConnectGatewayState");
            jsonWriter.value(directConnectGatewayState);
        }
        if (directConnectGateway.getStateChangeError() != null) {
            String stateChangeError = directConnectGateway.getStateChangeError();
            jsonWriter.name("stateChangeError");
            jsonWriter.value(stateChangeError);
        }
        jsonWriter.endObject();
    }

    private static DirectConnectGatewayJsonMarshaller instance;

    public static DirectConnectGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayJsonMarshaller();
        return instance;
    }
}
