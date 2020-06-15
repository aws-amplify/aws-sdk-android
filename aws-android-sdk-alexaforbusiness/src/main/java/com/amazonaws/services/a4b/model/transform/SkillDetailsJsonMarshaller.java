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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SkillDetails
 */
class SkillDetailsJsonMarshaller {

    public void marshall(SkillDetails skillDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (skillDetails.getProductDescription() != null) {
            String productDescription = skillDetails.getProductDescription();
            jsonWriter.name("ProductDescription");
            jsonWriter.value(productDescription);
        }
        if (skillDetails.getInvocationPhrase() != null) {
            String invocationPhrase = skillDetails.getInvocationPhrase();
            jsonWriter.name("InvocationPhrase");
            jsonWriter.value(invocationPhrase);
        }
        if (skillDetails.getReleaseDate() != null) {
            String releaseDate = skillDetails.getReleaseDate();
            jsonWriter.name("ReleaseDate");
            jsonWriter.value(releaseDate);
        }
        if (skillDetails.getEndUserLicenseAgreement() != null) {
            String endUserLicenseAgreement = skillDetails.getEndUserLicenseAgreement();
            jsonWriter.name("EndUserLicenseAgreement");
            jsonWriter.value(endUserLicenseAgreement);
        }
        if (skillDetails.getGenericKeywords() != null) {
            java.util.List<String> genericKeywords = skillDetails.getGenericKeywords();
            jsonWriter.name("GenericKeywords");
            jsonWriter.beginArray();
            for (String genericKeywordsItem : genericKeywords) {
                if (genericKeywordsItem != null) {
                    jsonWriter.value(genericKeywordsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skillDetails.getBulletPoints() != null) {
            java.util.List<String> bulletPoints = skillDetails.getBulletPoints();
            jsonWriter.name("BulletPoints");
            jsonWriter.beginArray();
            for (String bulletPointsItem : bulletPoints) {
                if (bulletPointsItem != null) {
                    jsonWriter.value(bulletPointsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skillDetails.getNewInThisVersionBulletPoints() != null) {
            java.util.List<String> newInThisVersionBulletPoints = skillDetails
                    .getNewInThisVersionBulletPoints();
            jsonWriter.name("NewInThisVersionBulletPoints");
            jsonWriter.beginArray();
            for (String newInThisVersionBulletPointsItem : newInThisVersionBulletPoints) {
                if (newInThisVersionBulletPointsItem != null) {
                    jsonWriter.value(newInThisVersionBulletPointsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skillDetails.getSkillTypes() != null) {
            java.util.List<String> skillTypes = skillDetails.getSkillTypes();
            jsonWriter.name("SkillTypes");
            jsonWriter.beginArray();
            for (String skillTypesItem : skillTypes) {
                if (skillTypesItem != null) {
                    jsonWriter.value(skillTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skillDetails.getReviews() != null) {
            java.util.Map<String, String> reviews = skillDetails.getReviews();
            jsonWriter.name("Reviews");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> reviewsEntry : reviews.entrySet()) {
                String reviewsValue = reviewsEntry.getValue();
                if (reviewsValue != null) {
                    jsonWriter.name(reviewsEntry.getKey());
                    jsonWriter.value(reviewsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (skillDetails.getDeveloperInfo() != null) {
            DeveloperInfo developerInfo = skillDetails.getDeveloperInfo();
            jsonWriter.name("DeveloperInfo");
            DeveloperInfoJsonMarshaller.getInstance().marshall(developerInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SkillDetailsJsonMarshaller instance;

    public static SkillDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SkillDetailsJsonMarshaller();
        return instance;
    }
}
