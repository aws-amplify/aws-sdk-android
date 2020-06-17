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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BucketCriteriaAdditionalProperties
 */
class BucketCriteriaAdditionalPropertiesJsonMarshaller {

    public void marshall(BucketCriteriaAdditionalProperties bucketCriteriaAdditionalProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketCriteriaAdditionalProperties.getEq() != null) {
            java.util.List<String> eq = bucketCriteriaAdditionalProperties.getEq();
            jsonWriter.name("eq");
            jsonWriter.beginArray();
            for (String eqItem : eq) {
                if (eqItem != null) {
                    jsonWriter.value(eqItem);
                }
            }
            jsonWriter.endArray();
        }
        if (bucketCriteriaAdditionalProperties.getGt() != null) {
            Long gt = bucketCriteriaAdditionalProperties.getGt();
            jsonWriter.name("gt");
            jsonWriter.value(gt);
        }
        if (bucketCriteriaAdditionalProperties.getGte() != null) {
            Long gte = bucketCriteriaAdditionalProperties.getGte();
            jsonWriter.name("gte");
            jsonWriter.value(gte);
        }
        if (bucketCriteriaAdditionalProperties.getLt() != null) {
            Long lt = bucketCriteriaAdditionalProperties.getLt();
            jsonWriter.name("lt");
            jsonWriter.value(lt);
        }
        if (bucketCriteriaAdditionalProperties.getLte() != null) {
            Long lte = bucketCriteriaAdditionalProperties.getLte();
            jsonWriter.name("lte");
            jsonWriter.value(lte);
        }
        if (bucketCriteriaAdditionalProperties.getNeq() != null) {
            java.util.List<String> neq = bucketCriteriaAdditionalProperties.getNeq();
            jsonWriter.name("neq");
            jsonWriter.beginArray();
            for (String neqItem : neq) {
                if (neqItem != null) {
                    jsonWriter.value(neqItem);
                }
            }
            jsonWriter.endArray();
        }
        if (bucketCriteriaAdditionalProperties.getPrefix() != null) {
            String prefix = bucketCriteriaAdditionalProperties.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        jsonWriter.endObject();
    }

    private static BucketCriteriaAdditionalPropertiesJsonMarshaller instance;

    public static BucketCriteriaAdditionalPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketCriteriaAdditionalPropertiesJsonMarshaller();
        return instance;
    }
}
