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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AttackDetail
 */
class AttackDetailJsonUnmarshaller implements Unmarshaller<AttackDetail, JsonUnmarshallerContext> {

    public AttackDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AttackDetail attackDetail = new AttackDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttackId")) {
                attackDetail.setAttackId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceArn")) {
                attackDetail.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubResources")) {
                attackDetail.setSubResources(new ListUnmarshaller<SubResourceSummary>(
                        SubResourceSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StartTime")) {
                attackDetail.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                attackDetail.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttackCounters")) {
                attackDetail.setAttackCounters(new ListUnmarshaller<SummarizedCounter>(
                        SummarizedCounterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AttackProperties")) {
                attackDetail.setAttackProperties(new ListUnmarshaller<AttackProperty>(
                        AttackPropertyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Mitigations")) {
                attackDetail.setMitigations(new ListUnmarshaller<Mitigation>(
                        MitigationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attackDetail;
    }

    private static AttackDetailJsonUnmarshaller instance;

    public static AttackDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttackDetailJsonUnmarshaller();
        return instance;
    }
}
