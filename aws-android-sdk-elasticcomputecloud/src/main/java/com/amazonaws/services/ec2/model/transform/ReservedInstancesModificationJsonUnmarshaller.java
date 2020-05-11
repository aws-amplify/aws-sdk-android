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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservedInstancesModification
 */
class ReservedInstancesModificationJsonUnmarshaller implements
        Unmarshaller<ReservedInstancesModification, JsonUnmarshallerContext> {

    public ReservedInstancesModification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservedInstancesModification reservedInstancesModification = new ReservedInstancesModification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientToken")) {
                reservedInstancesModification.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                reservedInstancesModification.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveDate")) {
                reservedInstancesModification.setEffectiveDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModificationResults")) {
                reservedInstancesModification
                        .setModificationResults(new ListUnmarshaller<ReservedInstancesModificationResult>(
                                ReservedInstancesModificationResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReservedInstancesIds")) {
                reservedInstancesModification
                        .setReservedInstancesIds(new ListUnmarshaller<ReservedInstancesId>(
                                ReservedInstancesIdJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReservedInstancesModificationId")) {
                reservedInstancesModification
                        .setReservedInstancesModificationId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                reservedInstancesModification.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                reservedInstancesModification.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateDate")) {
                reservedInstancesModification.setUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservedInstancesModification;
    }

    private static ReservedInstancesModificationJsonUnmarshaller instance;

    public static ReservedInstancesModificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesModificationJsonUnmarshaller();
        return instance;
    }
}
