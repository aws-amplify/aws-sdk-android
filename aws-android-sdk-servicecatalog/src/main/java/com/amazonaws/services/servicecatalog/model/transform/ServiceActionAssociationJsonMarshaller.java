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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceActionAssociation
 */
class ServiceActionAssociationJsonMarshaller {

    public void marshall(ServiceActionAssociation serviceActionAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceActionAssociation.getServiceActionId() != null) {
            String serviceActionId = serviceActionAssociation.getServiceActionId();
            jsonWriter.name("ServiceActionId");
            jsonWriter.value(serviceActionId);
        }
        if (serviceActionAssociation.getProductId() != null) {
            String productId = serviceActionAssociation.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (serviceActionAssociation.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = serviceActionAssociation.getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        jsonWriter.endObject();
    }

    private static ServiceActionAssociationJsonMarshaller instance;

    public static ServiceActionAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceActionAssociationJsonMarshaller();
        return instance;
    }
}
