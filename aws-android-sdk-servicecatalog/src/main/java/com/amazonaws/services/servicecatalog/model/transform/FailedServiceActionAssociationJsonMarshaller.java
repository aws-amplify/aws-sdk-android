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
 * JSON marshaller for POJO FailedServiceActionAssociation
 */
class FailedServiceActionAssociationJsonMarshaller {

    public void marshall(FailedServiceActionAssociation failedServiceActionAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (failedServiceActionAssociation.getServiceActionId() != null) {
            String serviceActionId = failedServiceActionAssociation.getServiceActionId();
            jsonWriter.name("ServiceActionId");
            jsonWriter.value(serviceActionId);
        }
        if (failedServiceActionAssociation.getProductId() != null) {
            String productId = failedServiceActionAssociation.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (failedServiceActionAssociation.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = failedServiceActionAssociation
                    .getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        if (failedServiceActionAssociation.getErrorCode() != null) {
            String errorCode = failedServiceActionAssociation.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (failedServiceActionAssociation.getErrorMessage() != null) {
            String errorMessage = failedServiceActionAssociation.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static FailedServiceActionAssociationJsonMarshaller instance;

    public static FailedServiceActionAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FailedServiceActionAssociationJsonMarshaller();
        return instance;
    }
}
