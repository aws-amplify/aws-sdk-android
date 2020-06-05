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
 * JSON marshaller for POJO Recipe
 */
class RecipeJsonMarshaller {

    public void marshall(Recipe recipe, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recipe.getName() != null) {
            String name = recipe.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (recipe.getRecipeArn() != null) {
            String recipeArn = recipe.getRecipeArn();
            jsonWriter.name("recipeArn");
            jsonWriter.value(recipeArn);
        }
        if (recipe.getAlgorithmArn() != null) {
            String algorithmArn = recipe.getAlgorithmArn();
            jsonWriter.name("algorithmArn");
            jsonWriter.value(algorithmArn);
        }
        if (recipe.getFeatureTransformationArn() != null) {
            String featureTransformationArn = recipe.getFeatureTransformationArn();
            jsonWriter.name("featureTransformationArn");
            jsonWriter.value(featureTransformationArn);
        }
        if (recipe.getStatus() != null) {
            String status = recipe.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (recipe.getDescription() != null) {
            String description = recipe.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (recipe.getCreationDateTime() != null) {
            java.util.Date creationDateTime = recipe.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (recipe.getRecipeType() != null) {
            String recipeType = recipe.getRecipeType();
            jsonWriter.name("recipeType");
            jsonWriter.value(recipeType);
        }
        if (recipe.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = recipe.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static RecipeJsonMarshaller instance;

    public static RecipeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecipeJsonMarshaller();
        return instance;
    }
}
