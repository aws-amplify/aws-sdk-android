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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PatchBaselineIdentity
 */
class PatchBaselineIdentityJsonMarshaller {

    public void marshall(PatchBaselineIdentity patchBaselineIdentity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (patchBaselineIdentity.getBaselineId() != null) {
            String baselineId = patchBaselineIdentity.getBaselineId();
            jsonWriter.name("BaselineId");
            jsonWriter.value(baselineId);
        }
        if (patchBaselineIdentity.getBaselineName() != null) {
            String baselineName = patchBaselineIdentity.getBaselineName();
            jsonWriter.name("BaselineName");
            jsonWriter.value(baselineName);
        }
        if (patchBaselineIdentity.getOperatingSystem() != null) {
            String operatingSystem = patchBaselineIdentity.getOperatingSystem();
            jsonWriter.name("OperatingSystem");
            jsonWriter.value(operatingSystem);
        }
        if (patchBaselineIdentity.getBaselineDescription() != null) {
            String baselineDescription = patchBaselineIdentity.getBaselineDescription();
            jsonWriter.name("BaselineDescription");
            jsonWriter.value(baselineDescription);
        }
        if (patchBaselineIdentity.getDefaultBaseline() != null) {
            Boolean defaultBaseline = patchBaselineIdentity.getDefaultBaseline();
            jsonWriter.name("DefaultBaseline");
            jsonWriter.value(defaultBaseline);
        }
        jsonWriter.endObject();
    }

    private static PatchBaselineIdentityJsonMarshaller instance;

    public static PatchBaselineIdentityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchBaselineIdentityJsonMarshaller();
        return instance;
    }
}
