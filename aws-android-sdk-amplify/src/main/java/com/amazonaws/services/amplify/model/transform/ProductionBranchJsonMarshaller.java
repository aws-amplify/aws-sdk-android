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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProductionBranch
 */
class ProductionBranchJsonMarshaller {

    public void marshall(ProductionBranch productionBranch, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (productionBranch.getLastDeployTime() != null) {
            java.util.Date lastDeployTime = productionBranch.getLastDeployTime();
            jsonWriter.name("lastDeployTime");
            jsonWriter.value(lastDeployTime);
        }
        if (productionBranch.getStatus() != null) {
            String status = productionBranch.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (productionBranch.getThumbnailUrl() != null) {
            String thumbnailUrl = productionBranch.getThumbnailUrl();
            jsonWriter.name("thumbnailUrl");
            jsonWriter.value(thumbnailUrl);
        }
        if (productionBranch.getBranchName() != null) {
            String branchName = productionBranch.getBranchName();
            jsonWriter.name("branchName");
            jsonWriter.value(branchName);
        }
        jsonWriter.endObject();
    }

    private static ProductionBranchJsonMarshaller instance;

    public static ProductionBranchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductionBranchJsonMarshaller();
        return instance;
    }
}
