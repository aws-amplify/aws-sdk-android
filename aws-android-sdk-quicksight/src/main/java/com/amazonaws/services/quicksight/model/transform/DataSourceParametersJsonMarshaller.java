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
 * JSON marshaller for POJO DataSourceParameters
 */
class DataSourceParametersJsonMarshaller {

    public void marshall(DataSourceParameters dataSourceParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataSourceParameters.getAmazonElasticsearchParameters() != null) {
            AmazonElasticsearchParameters amazonElasticsearchParameters = dataSourceParameters
                    .getAmazonElasticsearchParameters();
            jsonWriter.name("AmazonElasticsearchParameters");
            AmazonElasticsearchParametersJsonMarshaller.getInstance().marshall(
                    amazonElasticsearchParameters, jsonWriter);
        }
        if (dataSourceParameters.getAthenaParameters() != null) {
            AthenaParameters athenaParameters = dataSourceParameters.getAthenaParameters();
            jsonWriter.name("AthenaParameters");
            AthenaParametersJsonMarshaller.getInstance().marshall(athenaParameters, jsonWriter);
        }
        if (dataSourceParameters.getAuroraParameters() != null) {
            AuroraParameters auroraParameters = dataSourceParameters.getAuroraParameters();
            jsonWriter.name("AuroraParameters");
            AuroraParametersJsonMarshaller.getInstance().marshall(auroraParameters, jsonWriter);
        }
        if (dataSourceParameters.getAuroraPostgreSqlParameters() != null) {
            AuroraPostgreSqlParameters auroraPostgreSqlParameters = dataSourceParameters
                    .getAuroraPostgreSqlParameters();
            jsonWriter.name("AuroraPostgreSqlParameters");
            AuroraPostgreSqlParametersJsonMarshaller.getInstance().marshall(
                    auroraPostgreSqlParameters, jsonWriter);
        }
        if (dataSourceParameters.getAwsIotAnalyticsParameters() != null) {
            AwsIotAnalyticsParameters awsIotAnalyticsParameters = dataSourceParameters
                    .getAwsIotAnalyticsParameters();
            jsonWriter.name("AwsIotAnalyticsParameters");
            AwsIotAnalyticsParametersJsonMarshaller.getInstance().marshall(
                    awsIotAnalyticsParameters, jsonWriter);
        }
        if (dataSourceParameters.getJiraParameters() != null) {
            JiraParameters jiraParameters = dataSourceParameters.getJiraParameters();
            jsonWriter.name("JiraParameters");
            JiraParametersJsonMarshaller.getInstance().marshall(jiraParameters, jsonWriter);
        }
        if (dataSourceParameters.getMariaDbParameters() != null) {
            MariaDbParameters mariaDbParameters = dataSourceParameters.getMariaDbParameters();
            jsonWriter.name("MariaDbParameters");
            MariaDbParametersJsonMarshaller.getInstance().marshall(mariaDbParameters, jsonWriter);
        }
        if (dataSourceParameters.getMySqlParameters() != null) {
            MySqlParameters mySqlParameters = dataSourceParameters.getMySqlParameters();
            jsonWriter.name("MySqlParameters");
            MySqlParametersJsonMarshaller.getInstance().marshall(mySqlParameters, jsonWriter);
        }
        if (dataSourceParameters.getPostgreSqlParameters() != null) {
            PostgreSqlParameters postgreSqlParameters = dataSourceParameters
                    .getPostgreSqlParameters();
            jsonWriter.name("PostgreSqlParameters");
            PostgreSqlParametersJsonMarshaller.getInstance().marshall(postgreSqlParameters,
                    jsonWriter);
        }
        if (dataSourceParameters.getPrestoParameters() != null) {
            PrestoParameters prestoParameters = dataSourceParameters.getPrestoParameters();
            jsonWriter.name("PrestoParameters");
            PrestoParametersJsonMarshaller.getInstance().marshall(prestoParameters, jsonWriter);
        }
        if (dataSourceParameters.getRdsParameters() != null) {
            RdsParameters rdsParameters = dataSourceParameters.getRdsParameters();
            jsonWriter.name("RdsParameters");
            RdsParametersJsonMarshaller.getInstance().marshall(rdsParameters, jsonWriter);
        }
        if (dataSourceParameters.getRedshiftParameters() != null) {
            RedshiftParameters redshiftParameters = dataSourceParameters.getRedshiftParameters();
            jsonWriter.name("RedshiftParameters");
            RedshiftParametersJsonMarshaller.getInstance().marshall(redshiftParameters, jsonWriter);
        }
        if (dataSourceParameters.getS3Parameters() != null) {
            S3Parameters s3Parameters = dataSourceParameters.getS3Parameters();
            jsonWriter.name("S3Parameters");
            S3ParametersJsonMarshaller.getInstance().marshall(s3Parameters, jsonWriter);
        }
        if (dataSourceParameters.getServiceNowParameters() != null) {
            ServiceNowParameters serviceNowParameters = dataSourceParameters
                    .getServiceNowParameters();
            jsonWriter.name("ServiceNowParameters");
            ServiceNowParametersJsonMarshaller.getInstance().marshall(serviceNowParameters,
                    jsonWriter);
        }
        if (dataSourceParameters.getSnowflakeParameters() != null) {
            SnowflakeParameters snowflakeParameters = dataSourceParameters.getSnowflakeParameters();
            jsonWriter.name("SnowflakeParameters");
            SnowflakeParametersJsonMarshaller.getInstance().marshall(snowflakeParameters,
                    jsonWriter);
        }
        if (dataSourceParameters.getSparkParameters() != null) {
            SparkParameters sparkParameters = dataSourceParameters.getSparkParameters();
            jsonWriter.name("SparkParameters");
            SparkParametersJsonMarshaller.getInstance().marshall(sparkParameters, jsonWriter);
        }
        if (dataSourceParameters.getSqlServerParameters() != null) {
            SqlServerParameters sqlServerParameters = dataSourceParameters.getSqlServerParameters();
            jsonWriter.name("SqlServerParameters");
            SqlServerParametersJsonMarshaller.getInstance().marshall(sqlServerParameters,
                    jsonWriter);
        }
        if (dataSourceParameters.getTeradataParameters() != null) {
            TeradataParameters teradataParameters = dataSourceParameters.getTeradataParameters();
            jsonWriter.name("TeradataParameters");
            TeradataParametersJsonMarshaller.getInstance().marshall(teradataParameters, jsonWriter);
        }
        if (dataSourceParameters.getTwitterParameters() != null) {
            TwitterParameters twitterParameters = dataSourceParameters.getTwitterParameters();
            jsonWriter.name("TwitterParameters");
            TwitterParametersJsonMarshaller.getInstance().marshall(twitterParameters, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSourceParametersJsonMarshaller instance;

    public static DataSourceParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceParametersJsonMarshaller();
        return instance;
    }
}
