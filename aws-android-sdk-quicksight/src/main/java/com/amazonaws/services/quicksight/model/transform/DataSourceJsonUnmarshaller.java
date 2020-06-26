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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataSource
 */
class DataSourceJsonUnmarshaller implements Unmarshaller<DataSource, JsonUnmarshallerContext> {

    public DataSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataSource dataSource = new DataSource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                dataSource.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSourceId")) {
                dataSource.setDataSourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                dataSource.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                dataSource.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                dataSource.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                dataSource.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                dataSource.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSourceParameters")) {
                dataSource.setDataSourceParameters(DataSourceParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlternateDataSourceParameters")) {
                dataSource
                        .setAlternateDataSourceParameters(new ListUnmarshaller<DataSourceParameters>(
                                DataSourceParametersJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcConnectionProperties")) {
                dataSource.setVpcConnectionProperties(VpcConnectionPropertiesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SslProperties")) {
                dataSource.setSslProperties(SslPropertiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorInfo")) {
                dataSource.setErrorInfo(DataSourceErrorInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataSource;
    }

    private static DataSourceJsonUnmarshaller instance;

    public static DataSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceJsonUnmarshaller();
        return instance;
    }
}
