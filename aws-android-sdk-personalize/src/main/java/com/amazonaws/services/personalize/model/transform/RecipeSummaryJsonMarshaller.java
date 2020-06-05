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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecipeSummary
 */
class RecipeSummaryJsonMarshaller {

    public void marshall(RecipeSummary recipeSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recipeSummary.getName() != null) {
            String name = recipeSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (recipeSummary.getRecipeArn() != null) {
            String recipeArn = recipeSummary.getRecipeArn();
            jsonWriter.name("recipeArn");
            jsonWriter.value(recipeArn);
        }
        if (recipeSummary.getStatus() != null) {
            String status = recipeSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (recipeSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = recipeSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (recipeSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = recipeSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static RecipeSummaryJsonMarshaller instance;

    public static RecipeSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecipeSummaryJsonMarshaller();
        return instance;
    }
}
