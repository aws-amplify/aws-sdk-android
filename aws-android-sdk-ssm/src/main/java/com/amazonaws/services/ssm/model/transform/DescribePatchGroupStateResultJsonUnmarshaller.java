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
 * JSON unmarshaller for response DescribePatchGroupStateResult
 */
public class DescribePatchGroupStateResultJsonUnmarshaller implements
        Unmarshaller<DescribePatchGroupStateResult, JsonUnmarshallerContext> {

    public DescribePatchGroupStateResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribePatchGroupStateResult describePatchGroupStateResult = new DescribePatchGroupStateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Instances")) {
                describePatchGroupStateResult.setInstances(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstancesWithInstalledPatches")) {
                describePatchGroupStateResult
                        .setInstancesWithInstalledPatches(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancesWithInstalledOtherPatches")) {
                describePatchGroupStateResult
                        .setInstancesWithInstalledOtherPatches(IntegerJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancesWithInstalledPendingRebootPatches")) {
                describePatchGroupStateResult
                        .setInstancesWithInstalledPendingRebootPatches(IntegerJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancesWithInstalledRejectedPatches")) {
                describePatchGroupStateResult
                        .setInstancesWithInstalledRejectedPatches(IntegerJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancesWithMissingPatches")) {
                describePatchGroupStateResult
                        .setInstancesWithMissingPatches(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancesWithFailedPatches")) {
                describePatchGroupStateResult.setInstancesWithFailedPatches(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstancesWithNotApplicablePatches")) {
                describePatchGroupStateResult
                        .setInstancesWithNotApplicablePatches(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancesWithUnreportedNotApplicablePatches")) {
                describePatchGroupStateResult
                        .setInstancesWithUnreportedNotApplicablePatches(IntegerJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describePatchGroupStateResult;
    }

    private static DescribePatchGroupStateResultJsonUnmarshaller instance;

    public static DescribePatchGroupStateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePatchGroupStateResultJsonUnmarshaller();
        return instance;
    }
}
