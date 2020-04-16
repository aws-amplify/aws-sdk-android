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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdatePatchBaselineResult
 */
public class UpdatePatchBaselineResultJsonUnmarshaller implements
        Unmarshaller<UpdatePatchBaselineResult, JsonUnmarshallerContext> {

    public UpdatePatchBaselineResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePatchBaselineResult updatePatchBaselineResult = new UpdatePatchBaselineResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BaselineId")) {
                updatePatchBaselineResult.setBaselineId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updatePatchBaselineResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperatingSystem")) {
                updatePatchBaselineResult.setOperatingSystem(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlobalFilters")) {
                updatePatchBaselineResult.setGlobalFilters(PatchFilterGroupJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApprovalRules")) {
                updatePatchBaselineResult.setApprovalRules(PatchRuleGroupJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApprovedPatches")) {
                updatePatchBaselineResult.setApprovedPatches(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ApprovedPatchesComplianceLevel")) {
                updatePatchBaselineResult.setApprovedPatchesComplianceLevel(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApprovedPatchesEnableNonSecurity")) {
                updatePatchBaselineResult
                        .setApprovedPatchesEnableNonSecurity(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RejectedPatches")) {
                updatePatchBaselineResult.setRejectedPatches(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RejectedPatchesAction")) {
                updatePatchBaselineResult.setRejectedPatchesAction(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                updatePatchBaselineResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModifiedDate")) {
                updatePatchBaselineResult.setModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updatePatchBaselineResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sources")) {
                updatePatchBaselineResult.setSources(new ListUnmarshaller<PatchSource>(
                        PatchSourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updatePatchBaselineResult;
    }

    private static UpdatePatchBaselineResultJsonUnmarshaller instance;

    public static UpdatePatchBaselineResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePatchBaselineResultJsonUnmarshaller();
        return instance;
    }
}
