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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataSource
 */
class DataSourceJsonMarshaller {

    public void marshall(DataSource dataSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataSource.getArn() != null) {
            String arn = dataSource.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dataSource.getDataSourceId() != null) {
            String dataSourceId = dataSource.getDataSourceId();
            jsonWriter.name("DataSourceId");
            jsonWriter.value(dataSourceId);
        }
        if (dataSource.getName() != null) {
            String name = dataSource.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dataSource.getType() != null) {
            String type = dataSource.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (dataSource.getStatus() != null) {
            String status = dataSource.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (dataSource.getCreatedTime() != null) {
            java.util.Date createdTime = dataSource.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dataSource.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = dataSource.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (dataSource.getDataSourceParameters() != null) {
            DataSourceParameters dataSourceParameters = dataSource.getDataSourceParameters();
            jsonWriter.name("DataSourceParameters");
            DataSourceParametersJsonMarshaller.getInstance().marshall(dataSourceParameters,
                    jsonWriter);
        }
        if (dataSource.getAlternateDataSourceParameters() != null) {
            java.util.List<DataSourceParameters> alternateDataSourceParameters = dataSource
                    .getAlternateDataSourceParameters();
            jsonWriter.name("AlternateDataSourceParameters");
            jsonWriter.beginArray();
            for (DataSourceParameters alternateDataSourceParametersItem : alternateDataSourceParameters) {
                if (alternateDataSourceParametersItem != null) {
                    DataSourceParametersJsonMarshaller.getInstance().marshall(
                            alternateDataSourceParametersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dataSource.getVpcConnectionProperties() != null) {
            VpcConnectionProperties vpcConnectionProperties = dataSource
                    .getVpcConnectionProperties();
            jsonWriter.name("VpcConnectionProperties");
            VpcConnectionPropertiesJsonMarshaller.getInstance().marshall(vpcConnectionProperties,
                    jsonWriter);
        }
        if (dataSource.getSslProperties() != null) {
            SslProperties sslProperties = dataSource.getSslProperties();
            jsonWriter.name("SslProperties");
            SslPropertiesJsonMarshaller.getInstance().marshall(sslProperties, jsonWriter);
        }
        if (dataSource.getErrorInfo() != null) {
            DataSourceErrorInfo errorInfo = dataSource.getErrorInfo();
            jsonWriter.name("ErrorInfo");
            DataSourceErrorInfoJsonMarshaller.getInstance().marshall(errorInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSourceJsonMarshaller instance;

    public static DataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceJsonMarshaller();
        return instance;
    }
}
