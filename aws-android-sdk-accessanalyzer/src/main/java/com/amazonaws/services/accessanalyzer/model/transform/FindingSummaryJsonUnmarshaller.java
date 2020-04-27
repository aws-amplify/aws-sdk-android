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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FindingSummary
 */
class FindingSummaryJsonUnmarshaller implements
        Unmarshaller<FindingSummary, JsonUnmarshallerContext> {

    public FindingSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FindingSummary findingSummary = new FindingSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("action")) {
                findingSummary.setAction(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("analyzedAt")) {
                findingSummary.setAnalyzedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("condition")) {
                findingSummary.setCondition(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdAt")) {
                findingSummary.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("error")) {
                findingSummary.setError(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("id")) {
                findingSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isPublic")) {
                findingSummary.setIsPublic(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("principal")) {
                findingSummary.setPrincipal(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("resource")) {
                findingSummary.setResource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceOwnerAccount")) {
                findingSummary.setResourceOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                findingSummary.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sources")) {
                findingSummary.setSources(new ListUnmarshaller<FindingSource>(
                        FindingSourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                findingSummary.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updatedAt")) {
                findingSummary.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return findingSummary;
    }

    private static FindingSummaryJsonUnmarshaller instance;

    public static FindingSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindingSummaryJsonUnmarshaller();
        return instance;
    }
}
