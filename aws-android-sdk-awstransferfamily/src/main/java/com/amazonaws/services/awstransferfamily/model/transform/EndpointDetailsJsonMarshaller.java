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

package com.amazonaws.services.awstransferfamily.model.transform;

import com.amazonaws.services.awstransferfamily.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointDetails
 */
class EndpointDetailsJsonMarshaller {

    public void marshall(EndpointDetails endpointDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointDetails.getAddressAllocationIds() != null) {
            java.util.List<String> addressAllocationIds = endpointDetails.getAddressAllocationIds();
            jsonWriter.name("AddressAllocationIds");
            jsonWriter.beginArray();
            for (String addressAllocationIdsItem : addressAllocationIds) {
                if (addressAllocationIdsItem != null) {
                    jsonWriter.value(addressAllocationIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (endpointDetails.getSubnetIds() != null) {
            java.util.List<String> subnetIds = endpointDetails.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (endpointDetails.getVpcEndpointId() != null) {
            String vpcEndpointId = endpointDetails.getVpcEndpointId();
            jsonWriter.name("VpcEndpointId");
            jsonWriter.value(vpcEndpointId);
        }
        if (endpointDetails.getVpcId() != null) {
            String vpcId = endpointDetails.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static EndpointDetailsJsonMarshaller instance;

    public static EndpointDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointDetailsJsonMarshaller();
        return instance;
    }
}
