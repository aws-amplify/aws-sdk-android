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
 * JSON marshaller for POJO CustomerGateway
 */
class CustomerGatewayJsonMarshaller {

    public void marshall(CustomerGateway customerGateway, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customerGateway.getBgpAsn() != null) {
            String bgpAsn = customerGateway.getBgpAsn();
            jsonWriter.name("BgpAsn");
            jsonWriter.value(bgpAsn);
        }
        if (customerGateway.getCustomerGatewayId() != null) {
            String customerGatewayId = customerGateway.getCustomerGatewayId();
            jsonWriter.name("CustomerGatewayId");
            jsonWriter.value(customerGatewayId);
        }
        if (customerGateway.getIpAddress() != null) {
            String ipAddress = customerGateway.getIpAddress();
            jsonWriter.name("IpAddress");
            jsonWriter.value(ipAddress);
        }
        if (customerGateway.getCertificateArn() != null) {
            String certificateArn = customerGateway.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        if (customerGateway.getState() != null) {
            String state = customerGateway.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (customerGateway.getType() != null) {
            String type = customerGateway.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (customerGateway.getDeviceName() != null) {
            String deviceName = customerGateway.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (customerGateway.getTags() != null) {
            java.util.List<Tag> tags = customerGateway.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CustomerGatewayJsonMarshaller instance;

    public static CustomerGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomerGatewayJsonMarshaller();
        return instance;
    }
}
