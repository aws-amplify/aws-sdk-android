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
 * JSON unmarshaller for POJO DataSourceParameters
 */
class DataSourceParametersJsonUnmarshaller implements
        Unmarshaller<DataSourceParameters, JsonUnmarshallerContext> {

    public DataSourceParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataSourceParameters dataSourceParameters = new DataSourceParameters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AmazonElasticsearchParameters")) {
                dataSourceParameters
                        .setAmazonElasticsearchParameters(AmazonElasticsearchParametersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AthenaParameters")) {
                dataSourceParameters.setAthenaParameters(AthenaParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuroraParameters")) {
                dataSourceParameters.setAuroraParameters(AuroraParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuroraPostgreSqlParameters")) {
                dataSourceParameters
                        .setAuroraPostgreSqlParameters(AuroraPostgreSqlParametersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AwsIotAnalyticsParameters")) {
                dataSourceParameters
                        .setAwsIotAnalyticsParameters(AwsIotAnalyticsParametersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("JiraParameters")) {
                dataSourceParameters.setJiraParameters(JiraParametersJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MariaDbParameters")) {
                dataSourceParameters.setMariaDbParameters(MariaDbParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MySqlParameters")) {
                dataSourceParameters.setMySqlParameters(MySqlParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PostgreSqlParameters")) {
                dataSourceParameters.setPostgreSqlParameters(PostgreSqlParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrestoParameters")) {
                dataSourceParameters.setPrestoParameters(PrestoParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RdsParameters")) {
                dataSourceParameters.setRdsParameters(RdsParametersJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RedshiftParameters")) {
                dataSourceParameters.setRedshiftParameters(RedshiftParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Parameters")) {
                dataSourceParameters.setS3Parameters(S3ParametersJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceNowParameters")) {
                dataSourceParameters.setServiceNowParameters(ServiceNowParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnowflakeParameters")) {
                dataSourceParameters.setSnowflakeParameters(SnowflakeParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SparkParameters")) {
                dataSourceParameters.setSparkParameters(SparkParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SqlServerParameters")) {
                dataSourceParameters.setSqlServerParameters(SqlServerParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TeradataParameters")) {
                dataSourceParameters.setTeradataParameters(TeradataParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TwitterParameters")) {
                dataSourceParameters.setTwitterParameters(TwitterParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataSourceParameters;
    }

    private static DataSourceParametersJsonUnmarshaller instance;

    public static DataSourceParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceParametersJsonUnmarshaller();
        return instance;
    }
}
