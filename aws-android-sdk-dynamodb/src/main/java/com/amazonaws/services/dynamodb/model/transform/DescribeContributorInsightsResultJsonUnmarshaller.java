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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeContributorInsightsResult
 */
public class DescribeContributorInsightsResultJsonUnmarshaller implements
        Unmarshaller<DescribeContributorInsightsResult, JsonUnmarshallerContext> {

    public DescribeContributorInsightsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeContributorInsightsResult describeContributorInsightsResult = new DescribeContributorInsightsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TableName")) {
                describeContributorInsightsResult.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexName")) {
                describeContributorInsightsResult.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContributorInsightsRuleList")) {
                describeContributorInsightsResult
                        .setContributorInsightsRuleList(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ContributorInsightsStatus")) {
                describeContributorInsightsResult
                        .setContributorInsightsStatus(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LastUpdateDateTime")) {
                describeContributorInsightsResult.setLastUpdateDateTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureException")) {
                describeContributorInsightsResult
                        .setFailureException(FailureExceptionJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeContributorInsightsResult;
    }

    private static DescribeContributorInsightsResultJsonUnmarshaller instance;

    public static DescribeContributorInsightsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeContributorInsightsResultJsonUnmarshaller();
        return instance;
    }
}
