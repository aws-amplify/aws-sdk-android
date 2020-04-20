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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RightsizingRecommendation
 */
class RightsizingRecommendationJsonMarshaller {

    public void marshall(RightsizingRecommendation rightsizingRecommendation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rightsizingRecommendation.getAccountId() != null) {
            String accountId = rightsizingRecommendation.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (rightsizingRecommendation.getCurrentInstance() != null) {
            CurrentInstance currentInstance = rightsizingRecommendation.getCurrentInstance();
            jsonWriter.name("CurrentInstance");
            CurrentInstanceJsonMarshaller.getInstance().marshall(currentInstance, jsonWriter);
        }
        if (rightsizingRecommendation.getRightsizingType() != null) {
            String rightsizingType = rightsizingRecommendation.getRightsizingType();
            jsonWriter.name("RightsizingType");
            jsonWriter.value(rightsizingType);
        }
        if (rightsizingRecommendation.getModifyRecommendationDetail() != null) {
            ModifyRecommendationDetail modifyRecommendationDetail = rightsizingRecommendation
                    .getModifyRecommendationDetail();
            jsonWriter.name("ModifyRecommendationDetail");
            ModifyRecommendationDetailJsonMarshaller.getInstance().marshall(
                    modifyRecommendationDetail, jsonWriter);
        }
        if (rightsizingRecommendation.getTerminateRecommendationDetail() != null) {
            TerminateRecommendationDetail terminateRecommendationDetail = rightsizingRecommendation
                    .getTerminateRecommendationDetail();
            jsonWriter.name("TerminateRecommendationDetail");
            TerminateRecommendationDetailJsonMarshaller.getInstance().marshall(
                    terminateRecommendationDetail, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RightsizingRecommendationJsonMarshaller instance;

    public static RightsizingRecommendationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RightsizingRecommendationJsonMarshaller();
        return instance;
    }
}
