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
 * JSON marshaller for POJO PortfolioDetail
 */
class PortfolioDetailJsonMarshaller {

    public void marshall(PortfolioDetail portfolioDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (portfolioDetail.getId() != null) {
            String id = portfolioDetail.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (portfolioDetail.getARN() != null) {
            String aRN = portfolioDetail.getARN();
            jsonWriter.name("ARN");
            jsonWriter.value(aRN);
        }
        if (portfolioDetail.getDisplayName() != null) {
            String displayName = portfolioDetail.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (portfolioDetail.getDescription() != null) {
            String description = portfolioDetail.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (portfolioDetail.getCreatedTime() != null) {
            java.util.Date createdTime = portfolioDetail.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (portfolioDetail.getProviderName() != null) {
            String providerName = portfolioDetail.getProviderName();
            jsonWriter.name("ProviderName");
            jsonWriter.value(providerName);
        }
        jsonWriter.endObject();
    }

    private static PortfolioDetailJsonMarshaller instance;

    public static PortfolioDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortfolioDetailJsonMarshaller();
        return instance;
    }
}
