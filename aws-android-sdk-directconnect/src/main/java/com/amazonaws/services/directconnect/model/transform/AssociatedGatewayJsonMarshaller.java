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
 * JSON marshaller for POJO AssociatedGateway
 */
class AssociatedGatewayJsonMarshaller {

    public void marshall(AssociatedGateway associatedGateway, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (associatedGateway.getId() != null) {
            String id = associatedGateway.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (associatedGateway.getType() != null) {
            String type = associatedGateway.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (associatedGateway.getOwnerAccount() != null) {
            String ownerAccount = associatedGateway.getOwnerAccount();
            jsonWriter.name("ownerAccount");
            jsonWriter.value(ownerAccount);
        }
        if (associatedGateway.getRegion() != null) {
            String region = associatedGateway.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        jsonWriter.endObject();
    }

    private static AssociatedGatewayJsonMarshaller instance;

    public static AssociatedGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssociatedGatewayJsonMarshaller();
        return instance;
    }
}
