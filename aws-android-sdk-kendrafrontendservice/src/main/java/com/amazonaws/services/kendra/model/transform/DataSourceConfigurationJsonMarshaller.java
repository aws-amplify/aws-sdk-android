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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataSourceConfiguration
 */
class DataSourceConfigurationJsonMarshaller {

    public void marshall(DataSourceConfiguration dataSourceConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataSourceConfiguration.getS3Configuration() != null) {
            S3DataSourceConfiguration s3Configuration = dataSourceConfiguration
                    .getS3Configuration();
            jsonWriter.name("S3Configuration");
            S3DataSourceConfigurationJsonMarshaller.getInstance().marshall(s3Configuration,
                    jsonWriter);
        }
        if (dataSourceConfiguration.getSharePointConfiguration() != null) {
            SharePointConfiguration sharePointConfiguration = dataSourceConfiguration
                    .getSharePointConfiguration();
            jsonWriter.name("SharePointConfiguration");
            SharePointConfigurationJsonMarshaller.getInstance().marshall(sharePointConfiguration,
                    jsonWriter);
        }
        if (dataSourceConfiguration.getDatabaseConfiguration() != null) {
            DatabaseConfiguration databaseConfiguration = dataSourceConfiguration
                    .getDatabaseConfiguration();
            jsonWriter.name("DatabaseConfiguration");
            DatabaseConfigurationJsonMarshaller.getInstance().marshall(databaseConfiguration,
                    jsonWriter);
        }
        if (dataSourceConfiguration.getSalesforceConfiguration() != null) {
            SalesforceConfiguration salesforceConfiguration = dataSourceConfiguration
                    .getSalesforceConfiguration();
            jsonWriter.name("SalesforceConfiguration");
            SalesforceConfigurationJsonMarshaller.getInstance().marshall(salesforceConfiguration,
                    jsonWriter);
        }
        if (dataSourceConfiguration.getOneDriveConfiguration() != null) {
            OneDriveConfiguration oneDriveConfiguration = dataSourceConfiguration
                    .getOneDriveConfiguration();
            jsonWriter.name("OneDriveConfiguration");
            OneDriveConfigurationJsonMarshaller.getInstance().marshall(oneDriveConfiguration,
                    jsonWriter);
        }
        if (dataSourceConfiguration.getServiceNowConfiguration() != null) {
            ServiceNowConfiguration serviceNowConfiguration = dataSourceConfiguration
                    .getServiceNowConfiguration();
            jsonWriter.name("ServiceNowConfiguration");
            ServiceNowConfigurationJsonMarshaller.getInstance().marshall(serviceNowConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSourceConfigurationJsonMarshaller instance;

    public static DataSourceConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceConfigurationJsonMarshaller();
        return instance;
    }
}
