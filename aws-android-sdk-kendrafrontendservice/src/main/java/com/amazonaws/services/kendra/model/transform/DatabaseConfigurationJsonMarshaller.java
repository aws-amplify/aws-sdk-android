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
 * JSON marshaller for POJO DatabaseConfiguration
 */
class DatabaseConfigurationJsonMarshaller {

    public void marshall(DatabaseConfiguration databaseConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (databaseConfiguration.getDatabaseEngineType() != null) {
            String databaseEngineType = databaseConfiguration.getDatabaseEngineType();
            jsonWriter.name("DatabaseEngineType");
            jsonWriter.value(databaseEngineType);
        }
        if (databaseConfiguration.getConnectionConfiguration() != null) {
            ConnectionConfiguration connectionConfiguration = databaseConfiguration
                    .getConnectionConfiguration();
            jsonWriter.name("ConnectionConfiguration");
            ConnectionConfigurationJsonMarshaller.getInstance().marshall(connectionConfiguration,
                    jsonWriter);
        }
        if (databaseConfiguration.getVpcConfiguration() != null) {
            DataSourceVpcConfiguration vpcConfiguration = databaseConfiguration
                    .getVpcConfiguration();
            jsonWriter.name("VpcConfiguration");
            DataSourceVpcConfigurationJsonMarshaller.getInstance().marshall(vpcConfiguration,
                    jsonWriter);
        }
        if (databaseConfiguration.getColumnConfiguration() != null) {
            ColumnConfiguration columnConfiguration = databaseConfiguration
                    .getColumnConfiguration();
            jsonWriter.name("ColumnConfiguration");
            ColumnConfigurationJsonMarshaller.getInstance().marshall(columnConfiguration,
                    jsonWriter);
        }
        if (databaseConfiguration.getAclConfiguration() != null) {
            AclConfiguration aclConfiguration = databaseConfiguration.getAclConfiguration();
            jsonWriter.name("AclConfiguration");
            AclConfigurationJsonMarshaller.getInstance().marshall(aclConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DatabaseConfigurationJsonMarshaller instance;

    public static DatabaseConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatabaseConfigurationJsonMarshaller();
        return instance;
    }
}
