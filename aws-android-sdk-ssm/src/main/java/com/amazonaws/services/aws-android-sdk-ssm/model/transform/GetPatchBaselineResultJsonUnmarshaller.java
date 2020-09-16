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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response GetPatchBaselineResult
 */
public class GetPatchBaselineResultJsonUnmarshaller implements Unmarshaller<GetPatchBaselineResult, JsonUnmarshallerContext> {

    public GetPatchBaselineResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPatchBaselineResult getPatchBaselineResult = new GetPatchBaselineResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BaselineId")) {
                getPatchBaselineResult.setBaselineId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                getPatchBaselineResult.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OperatingSystem")) {
                getPatchBaselineResult.setOperatingSystem(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("GlobalFilters")) {
                getPatchBaselineResult.setGlobalFilters(PatchFilterGroupJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ApprovalRules")) {
                getPatchBaselineResult.setApprovalRules(PatchRuleGroupJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ApprovedPatches")) {
                getPatchBaselineResult.setApprovedPatches(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ApprovedPatchesComplianceLevel")) {
                getPatchBaselineResult.setApprovedPatchesComplianceLevel(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ApprovedPatchesEnableNonSecurity")) {
                getPatchBaselineResult.setApprovedPatchesEnableNonSecurity(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RejectedPatches")) {
                getPatchBaselineResult.setRejectedPatches(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("RejectedPatchesAction")) {
                getPatchBaselineResult.setRejectedPatchesAction(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PatchGroups")) {
                getPatchBaselineResult.setPatchGroups(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                getPatchBaselineResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ModifiedDate")) {
                getPatchBaselineResult.setModifiedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                getPatchBaselineResult.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Sources")) {
                getPatchBaselineResult.setSources(new ListUnmarshaller<PatchSource>(PatchSourceJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getPatchBaselineResult;
    }

    private static GetPatchBaselineResultJsonUnmarshaller instance;
    public static GetPatchBaselineResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetPatchBaselineResultJsonUnmarshaller();
        return instance;
    }
}
