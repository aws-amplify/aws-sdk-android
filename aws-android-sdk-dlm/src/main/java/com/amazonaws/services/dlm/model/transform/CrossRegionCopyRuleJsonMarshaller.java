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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CrossRegionCopyRule
 */
class CrossRegionCopyRuleJsonMarshaller {

    public void marshall(CrossRegionCopyRule crossRegionCopyRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (crossRegionCopyRule.getTargetRegion() != null) {
            String targetRegion = crossRegionCopyRule.getTargetRegion();
            jsonWriter.name("TargetRegion");
            jsonWriter.value(targetRegion);
        }
        if (crossRegionCopyRule.getEncrypted() != null) {
            Boolean encrypted = crossRegionCopyRule.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (crossRegionCopyRule.getCmkArn() != null) {
            String cmkArn = crossRegionCopyRule.getCmkArn();
            jsonWriter.name("CmkArn");
            jsonWriter.value(cmkArn);
        }
        if (crossRegionCopyRule.getCopyTags() != null) {
            Boolean copyTags = crossRegionCopyRule.getCopyTags();
            jsonWriter.name("CopyTags");
            jsonWriter.value(copyTags);
        }
        if (crossRegionCopyRule.getRetainRule() != null) {
            CrossRegionCopyRetainRule retainRule = crossRegionCopyRule.getRetainRule();
            jsonWriter.name("RetainRule");
            CrossRegionCopyRetainRuleJsonMarshaller.getInstance().marshall(retainRule, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CrossRegionCopyRuleJsonMarshaller instance;

    public static CrossRegionCopyRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrossRegionCopyRuleJsonMarshaller();
        return instance;
    }
}
