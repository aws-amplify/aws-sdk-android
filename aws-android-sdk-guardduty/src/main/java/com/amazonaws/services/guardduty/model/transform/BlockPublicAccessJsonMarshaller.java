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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlockPublicAccess
 */
class BlockPublicAccessJsonMarshaller {

    public void marshall(BlockPublicAccess blockPublicAccess, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (blockPublicAccess.getIgnorePublicAcls() != null) {
            Boolean ignorePublicAcls = blockPublicAccess.getIgnorePublicAcls();
            jsonWriter.name("IgnorePublicAcls");
            jsonWriter.value(ignorePublicAcls);
        }
        if (blockPublicAccess.getRestrictPublicBuckets() != null) {
            Boolean restrictPublicBuckets = blockPublicAccess.getRestrictPublicBuckets();
            jsonWriter.name("RestrictPublicBuckets");
            jsonWriter.value(restrictPublicBuckets);
        }
        if (blockPublicAccess.getBlockPublicAcls() != null) {
            Boolean blockPublicAcls = blockPublicAccess.getBlockPublicAcls();
            jsonWriter.name("BlockPublicAcls");
            jsonWriter.value(blockPublicAcls);
        }
        if (blockPublicAccess.getBlockPublicPolicy() != null) {
            Boolean blockPublicPolicy = blockPublicAccess.getBlockPublicPolicy();
            jsonWriter.name("BlockPublicPolicy");
            jsonWriter.value(blockPublicPolicy);
        }
        jsonWriter.endObject();
    }

    private static BlockPublicAccessJsonMarshaller instance;

    public static BlockPublicAccessJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlockPublicAccessJsonMarshaller();
        return instance;
    }
}
