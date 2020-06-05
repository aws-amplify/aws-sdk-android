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
 * JSON marshaller for POJO ProvisioningArtifactView
 */
class ProvisioningArtifactViewJsonMarshaller {

    public void marshall(ProvisioningArtifactView provisioningArtifactView, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (provisioningArtifactView.getProductViewSummary() != null) {
            ProductViewSummary productViewSummary = provisioningArtifactView
                    .getProductViewSummary();
            jsonWriter.name("ProductViewSummary");
            ProductViewSummaryJsonMarshaller.getInstance().marshall(productViewSummary, jsonWriter);
        }
        if (provisioningArtifactView.getProvisioningArtifact() != null) {
            ProvisioningArtifact provisioningArtifact = provisioningArtifactView
                    .getProvisioningArtifact();
            jsonWriter.name("ProvisioningArtifact");
            ProvisioningArtifactJsonMarshaller.getInstance().marshall(provisioningArtifact,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningArtifactViewJsonMarshaller instance;

    public static ProvisioningArtifactViewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningArtifactViewJsonMarshaller();
        return instance;
    }
}
