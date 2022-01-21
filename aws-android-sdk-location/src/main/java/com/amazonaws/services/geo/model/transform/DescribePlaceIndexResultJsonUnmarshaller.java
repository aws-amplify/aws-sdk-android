/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribePlaceIndexResult
 */
public class DescribePlaceIndexResultJsonUnmarshaller implements
        Unmarshaller<DescribePlaceIndexResult, JsonUnmarshallerContext> {

    public DescribePlaceIndexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePlaceIndexResult describePlaceIndexResult = new DescribePlaceIndexResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreateTime")) {
                describePlaceIndexResult.setCreateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("DataSource")) {
                describePlaceIndexResult.setDataSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSourceConfiguration")) {
                describePlaceIndexResult
                        .setDataSourceConfiguration(DataSourceConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                describePlaceIndexResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexArn")) {
                describePlaceIndexResult.setIndexArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexName")) {
                describePlaceIndexResult.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingPlan")) {
                describePlaceIndexResult.setPricingPlan(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describePlaceIndexResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                describePlaceIndexResult.setUpdateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describePlaceIndexResult;
    }

    private static DescribePlaceIndexResultJsonUnmarshaller instance;

    public static DescribePlaceIndexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePlaceIndexResultJsonUnmarshaller();
        return instance;
    }
}
