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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * The parameters that Amazon QuickSight uses to connect to your underlying data
 * source. This is a variant type structure. For this structure to be valid,
 * only one of the attributes can be non-null.
 * </p>
 */
public class DataSourceParameters implements Serializable {
    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     */
    private AmazonElasticsearchParameters amazonElasticsearchParameters;

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     */
    private AthenaParameters athenaParameters;

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     */
    private AuroraParameters auroraParameters;

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     */
    private AuroraPostgreSqlParameters auroraPostgreSqlParameters;

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     */
    private AwsIotAnalyticsParameters awsIotAnalyticsParameters;

    /**
     * <p>
     * Jira parameters.
     * </p>
     */
    private JiraParameters jiraParameters;

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     */
    private MariaDbParameters mariaDbParameters;

    /**
     * <p>
     * MySQL parameters.
     * </p>
     */
    private MySqlParameters mySqlParameters;

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     */
    private PostgreSqlParameters postgreSqlParameters;

    /**
     * <p>
     * Presto parameters.
     * </p>
     */
    private PrestoParameters prestoParameters;

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     */
    private RdsParameters rdsParameters;

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     */
    private RedshiftParameters redshiftParameters;

    /**
     * <p>
     * S3 parameters.
     * </p>
     */
    private S3Parameters s3Parameters;

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     */
    private ServiceNowParameters serviceNowParameters;

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     */
    private SnowflakeParameters snowflakeParameters;

    /**
     * <p>
     * Spark parameters.
     * </p>
     */
    private SparkParameters sparkParameters;

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     */
    private SqlServerParameters sqlServerParameters;

    /**
     * <p>
     * Teradata parameters.
     * </p>
     */
    private TeradataParameters teradataParameters;

    /**
     * <p>
     * Twitter parameters.
     * </p>
     */
    private TwitterParameters twitterParameters;

    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     *
     * @return <p>
     *         Amazon Elasticsearch Service parameters.
     *         </p>
     */
    public AmazonElasticsearchParameters getAmazonElasticsearchParameters() {
        return amazonElasticsearchParameters;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     *
     * @param amazonElasticsearchParameters <p>
     *            Amazon Elasticsearch Service parameters.
     *            </p>
     */
    public void setAmazonElasticsearchParameters(
            AmazonElasticsearchParameters amazonElasticsearchParameters) {
        this.amazonElasticsearchParameters = amazonElasticsearchParameters;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonElasticsearchParameters <p>
     *            Amazon Elasticsearch Service parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withAmazonElasticsearchParameters(
            AmazonElasticsearchParameters amazonElasticsearchParameters) {
        this.amazonElasticsearchParameters = amazonElasticsearchParameters;
        return this;
    }

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     *
     * @return <p>
     *         Amazon Athena parameters.
     *         </p>
     */
    public AthenaParameters getAthenaParameters() {
        return athenaParameters;
    }

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     *
     * @param athenaParameters <p>
     *            Amazon Athena parameters.
     *            </p>
     */
    public void setAthenaParameters(AthenaParameters athenaParameters) {
        this.athenaParameters = athenaParameters;
    }

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param athenaParameters <p>
     *            Amazon Athena parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withAthenaParameters(AthenaParameters athenaParameters) {
        this.athenaParameters = athenaParameters;
        return this;
    }

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     *
     * @return <p>
     *         Amazon Aurora MySQL parameters.
     *         </p>
     */
    public AuroraParameters getAuroraParameters() {
        return auroraParameters;
    }

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     *
     * @param auroraParameters <p>
     *            Amazon Aurora MySQL parameters.
     *            </p>
     */
    public void setAuroraParameters(AuroraParameters auroraParameters) {
        this.auroraParameters = auroraParameters;
    }

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auroraParameters <p>
     *            Amazon Aurora MySQL parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withAuroraParameters(AuroraParameters auroraParameters) {
        this.auroraParameters = auroraParameters;
        return this;
    }

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     *
     * @return <p>
     *         Aurora PostgreSQL parameters.
     *         </p>
     */
    public AuroraPostgreSqlParameters getAuroraPostgreSqlParameters() {
        return auroraPostgreSqlParameters;
    }

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     *
     * @param auroraPostgreSqlParameters <p>
     *            Aurora PostgreSQL parameters.
     *            </p>
     */
    public void setAuroraPostgreSqlParameters(AuroraPostgreSqlParameters auroraPostgreSqlParameters) {
        this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
    }

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auroraPostgreSqlParameters <p>
     *            Aurora PostgreSQL parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withAuroraPostgreSqlParameters(
            AuroraPostgreSqlParameters auroraPostgreSqlParameters) {
        this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
        return this;
    }

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     *
     * @return <p>
     *         AWS IoT Analytics parameters.
     *         </p>
     */
    public AwsIotAnalyticsParameters getAwsIotAnalyticsParameters() {
        return awsIotAnalyticsParameters;
    }

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     *
     * @param awsIotAnalyticsParameters <p>
     *            AWS IoT Analytics parameters.
     *            </p>
     */
    public void setAwsIotAnalyticsParameters(AwsIotAnalyticsParameters awsIotAnalyticsParameters) {
        this.awsIotAnalyticsParameters = awsIotAnalyticsParameters;
    }

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIotAnalyticsParameters <p>
     *            AWS IoT Analytics parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withAwsIotAnalyticsParameters(
            AwsIotAnalyticsParameters awsIotAnalyticsParameters) {
        this.awsIotAnalyticsParameters = awsIotAnalyticsParameters;
        return this;
    }

    /**
     * <p>
     * Jira parameters.
     * </p>
     *
     * @return <p>
     *         Jira parameters.
     *         </p>
     */
    public JiraParameters getJiraParameters() {
        return jiraParameters;
    }

    /**
     * <p>
     * Jira parameters.
     * </p>
     *
     * @param jiraParameters <p>
     *            Jira parameters.
     *            </p>
     */
    public void setJiraParameters(JiraParameters jiraParameters) {
        this.jiraParameters = jiraParameters;
    }

    /**
     * <p>
     * Jira parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jiraParameters <p>
     *            Jira parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withJiraParameters(JiraParameters jiraParameters) {
        this.jiraParameters = jiraParameters;
        return this;
    }

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     *
     * @return <p>
     *         MariaDB parameters.
     *         </p>
     */
    public MariaDbParameters getMariaDbParameters() {
        return mariaDbParameters;
    }

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     *
     * @param mariaDbParameters <p>
     *            MariaDB parameters.
     *            </p>
     */
    public void setMariaDbParameters(MariaDbParameters mariaDbParameters) {
        this.mariaDbParameters = mariaDbParameters;
    }

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mariaDbParameters <p>
     *            MariaDB parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withMariaDbParameters(MariaDbParameters mariaDbParameters) {
        this.mariaDbParameters = mariaDbParameters;
        return this;
    }

    /**
     * <p>
     * MySQL parameters.
     * </p>
     *
     * @return <p>
     *         MySQL parameters.
     *         </p>
     */
    public MySqlParameters getMySqlParameters() {
        return mySqlParameters;
    }

    /**
     * <p>
     * MySQL parameters.
     * </p>
     *
     * @param mySqlParameters <p>
     *            MySQL parameters.
     *            </p>
     */
    public void setMySqlParameters(MySqlParameters mySqlParameters) {
        this.mySqlParameters = mySqlParameters;
    }

    /**
     * <p>
     * MySQL parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mySqlParameters <p>
     *            MySQL parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withMySqlParameters(MySqlParameters mySqlParameters) {
        this.mySqlParameters = mySqlParameters;
        return this;
    }

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     *
     * @return <p>
     *         PostgreSQL parameters.
     *         </p>
     */
    public PostgreSqlParameters getPostgreSqlParameters() {
        return postgreSqlParameters;
    }

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     *
     * @param postgreSqlParameters <p>
     *            PostgreSQL parameters.
     *            </p>
     */
    public void setPostgreSqlParameters(PostgreSqlParameters postgreSqlParameters) {
        this.postgreSqlParameters = postgreSqlParameters;
    }

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param postgreSqlParameters <p>
     *            PostgreSQL parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withPostgreSqlParameters(PostgreSqlParameters postgreSqlParameters) {
        this.postgreSqlParameters = postgreSqlParameters;
        return this;
    }

    /**
     * <p>
     * Presto parameters.
     * </p>
     *
     * @return <p>
     *         Presto parameters.
     *         </p>
     */
    public PrestoParameters getPrestoParameters() {
        return prestoParameters;
    }

    /**
     * <p>
     * Presto parameters.
     * </p>
     *
     * @param prestoParameters <p>
     *            Presto parameters.
     *            </p>
     */
    public void setPrestoParameters(PrestoParameters prestoParameters) {
        this.prestoParameters = prestoParameters;
    }

    /**
     * <p>
     * Presto parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prestoParameters <p>
     *            Presto parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withPrestoParameters(PrestoParameters prestoParameters) {
        this.prestoParameters = prestoParameters;
        return this;
    }

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     *
     * @return <p>
     *         Amazon RDS parameters.
     *         </p>
     */
    public RdsParameters getRdsParameters() {
        return rdsParameters;
    }

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     *
     * @param rdsParameters <p>
     *            Amazon RDS parameters.
     *            </p>
     */
    public void setRdsParameters(RdsParameters rdsParameters) {
        this.rdsParameters = rdsParameters;
    }

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rdsParameters <p>
     *            Amazon RDS parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withRdsParameters(RdsParameters rdsParameters) {
        this.rdsParameters = rdsParameters;
        return this;
    }

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     *
     * @return <p>
     *         Amazon Redshift parameters.
     *         </p>
     */
    public RedshiftParameters getRedshiftParameters() {
        return redshiftParameters;
    }

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     *
     * @param redshiftParameters <p>
     *            Amazon Redshift parameters.
     *            </p>
     */
    public void setRedshiftParameters(RedshiftParameters redshiftParameters) {
        this.redshiftParameters = redshiftParameters;
    }

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redshiftParameters <p>
     *            Amazon Redshift parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withRedshiftParameters(RedshiftParameters redshiftParameters) {
        this.redshiftParameters = redshiftParameters;
        return this;
    }

    /**
     * <p>
     * S3 parameters.
     * </p>
     *
     * @return <p>
     *         S3 parameters.
     *         </p>
     */
    public S3Parameters getS3Parameters() {
        return s3Parameters;
    }

    /**
     * <p>
     * S3 parameters.
     * </p>
     *
     * @param s3Parameters <p>
     *            S3 parameters.
     *            </p>
     */
    public void setS3Parameters(S3Parameters s3Parameters) {
        this.s3Parameters = s3Parameters;
    }

    /**
     * <p>
     * S3 parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Parameters <p>
     *            S3 parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withS3Parameters(S3Parameters s3Parameters) {
        this.s3Parameters = s3Parameters;
        return this;
    }

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     *
     * @return <p>
     *         ServiceNow parameters.
     *         </p>
     */
    public ServiceNowParameters getServiceNowParameters() {
        return serviceNowParameters;
    }

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     *
     * @param serviceNowParameters <p>
     *            ServiceNow parameters.
     *            </p>
     */
    public void setServiceNowParameters(ServiceNowParameters serviceNowParameters) {
        this.serviceNowParameters = serviceNowParameters;
    }

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceNowParameters <p>
     *            ServiceNow parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withServiceNowParameters(ServiceNowParameters serviceNowParameters) {
        this.serviceNowParameters = serviceNowParameters;
        return this;
    }

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     *
     * @return <p>
     *         Snowflake parameters.
     *         </p>
     */
    public SnowflakeParameters getSnowflakeParameters() {
        return snowflakeParameters;
    }

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     *
     * @param snowflakeParameters <p>
     *            Snowflake parameters.
     *            </p>
     */
    public void setSnowflakeParameters(SnowflakeParameters snowflakeParameters) {
        this.snowflakeParameters = snowflakeParameters;
    }

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snowflakeParameters <p>
     *            Snowflake parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withSnowflakeParameters(SnowflakeParameters snowflakeParameters) {
        this.snowflakeParameters = snowflakeParameters;
        return this;
    }

    /**
     * <p>
     * Spark parameters.
     * </p>
     *
     * @return <p>
     *         Spark parameters.
     *         </p>
     */
    public SparkParameters getSparkParameters() {
        return sparkParameters;
    }

    /**
     * <p>
     * Spark parameters.
     * </p>
     *
     * @param sparkParameters <p>
     *            Spark parameters.
     *            </p>
     */
    public void setSparkParameters(SparkParameters sparkParameters) {
        this.sparkParameters = sparkParameters;
    }

    /**
     * <p>
     * Spark parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sparkParameters <p>
     *            Spark parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withSparkParameters(SparkParameters sparkParameters) {
        this.sparkParameters = sparkParameters;
        return this;
    }

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     *
     * @return <p>
     *         SQL Server parameters.
     *         </p>
     */
    public SqlServerParameters getSqlServerParameters() {
        return sqlServerParameters;
    }

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     *
     * @param sqlServerParameters <p>
     *            SQL Server parameters.
     *            </p>
     */
    public void setSqlServerParameters(SqlServerParameters sqlServerParameters) {
        this.sqlServerParameters = sqlServerParameters;
    }

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sqlServerParameters <p>
     *            SQL Server parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withSqlServerParameters(SqlServerParameters sqlServerParameters) {
        this.sqlServerParameters = sqlServerParameters;
        return this;
    }

    /**
     * <p>
     * Teradata parameters.
     * </p>
     *
     * @return <p>
     *         Teradata parameters.
     *         </p>
     */
    public TeradataParameters getTeradataParameters() {
        return teradataParameters;
    }

    /**
     * <p>
     * Teradata parameters.
     * </p>
     *
     * @param teradataParameters <p>
     *            Teradata parameters.
     *            </p>
     */
    public void setTeradataParameters(TeradataParameters teradataParameters) {
        this.teradataParameters = teradataParameters;
    }

    /**
     * <p>
     * Teradata parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param teradataParameters <p>
     *            Teradata parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withTeradataParameters(TeradataParameters teradataParameters) {
        this.teradataParameters = teradataParameters;
        return this;
    }

    /**
     * <p>
     * Twitter parameters.
     * </p>
     *
     * @return <p>
     *         Twitter parameters.
     *         </p>
     */
    public TwitterParameters getTwitterParameters() {
        return twitterParameters;
    }

    /**
     * <p>
     * Twitter parameters.
     * </p>
     *
     * @param twitterParameters <p>
     *            Twitter parameters.
     *            </p>
     */
    public void setTwitterParameters(TwitterParameters twitterParameters) {
        this.twitterParameters = twitterParameters;
    }

    /**
     * <p>
     * Twitter parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param twitterParameters <p>
     *            Twitter parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceParameters withTwitterParameters(TwitterParameters twitterParameters) {
        this.twitterParameters = twitterParameters;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAmazonElasticsearchParameters() != null)
            sb.append("AmazonElasticsearchParameters: " + getAmazonElasticsearchParameters() + ",");
        if (getAthenaParameters() != null)
            sb.append("AthenaParameters: " + getAthenaParameters() + ",");
        if (getAuroraParameters() != null)
            sb.append("AuroraParameters: " + getAuroraParameters() + ",");
        if (getAuroraPostgreSqlParameters() != null)
            sb.append("AuroraPostgreSqlParameters: " + getAuroraPostgreSqlParameters() + ",");
        if (getAwsIotAnalyticsParameters() != null)
            sb.append("AwsIotAnalyticsParameters: " + getAwsIotAnalyticsParameters() + ",");
        if (getJiraParameters() != null)
            sb.append("JiraParameters: " + getJiraParameters() + ",");
        if (getMariaDbParameters() != null)
            sb.append("MariaDbParameters: " + getMariaDbParameters() + ",");
        if (getMySqlParameters() != null)
            sb.append("MySqlParameters: " + getMySqlParameters() + ",");
        if (getPostgreSqlParameters() != null)
            sb.append("PostgreSqlParameters: " + getPostgreSqlParameters() + ",");
        if (getPrestoParameters() != null)
            sb.append("PrestoParameters: " + getPrestoParameters() + ",");
        if (getRdsParameters() != null)
            sb.append("RdsParameters: " + getRdsParameters() + ",");
        if (getRedshiftParameters() != null)
            sb.append("RedshiftParameters: " + getRedshiftParameters() + ",");
        if (getS3Parameters() != null)
            sb.append("S3Parameters: " + getS3Parameters() + ",");
        if (getServiceNowParameters() != null)
            sb.append("ServiceNowParameters: " + getServiceNowParameters() + ",");
        if (getSnowflakeParameters() != null)
            sb.append("SnowflakeParameters: " + getSnowflakeParameters() + ",");
        if (getSparkParameters() != null)
            sb.append("SparkParameters: " + getSparkParameters() + ",");
        if (getSqlServerParameters() != null)
            sb.append("SqlServerParameters: " + getSqlServerParameters() + ",");
        if (getTeradataParameters() != null)
            sb.append("TeradataParameters: " + getTeradataParameters() + ",");
        if (getTwitterParameters() != null)
            sb.append("TwitterParameters: " + getTwitterParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAmazonElasticsearchParameters() == null) ? 0
                        : getAmazonElasticsearchParameters().hashCode());
        hashCode = prime * hashCode
                + ((getAthenaParameters() == null) ? 0 : getAthenaParameters().hashCode());
        hashCode = prime * hashCode
                + ((getAuroraParameters() == null) ? 0 : getAuroraParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuroraPostgreSqlParameters() == null) ? 0 : getAuroraPostgreSqlParameters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsIotAnalyticsParameters() == null) ? 0 : getAwsIotAnalyticsParameters()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getJiraParameters() == null) ? 0 : getJiraParameters().hashCode());
        hashCode = prime * hashCode
                + ((getMariaDbParameters() == null) ? 0 : getMariaDbParameters().hashCode());
        hashCode = prime * hashCode
                + ((getMySqlParameters() == null) ? 0 : getMySqlParameters().hashCode());
        hashCode = prime * hashCode
                + ((getPostgreSqlParameters() == null) ? 0 : getPostgreSqlParameters().hashCode());
        hashCode = prime * hashCode
                + ((getPrestoParameters() == null) ? 0 : getPrestoParameters().hashCode());
        hashCode = prime * hashCode
                + ((getRdsParameters() == null) ? 0 : getRdsParameters().hashCode());
        hashCode = prime * hashCode
                + ((getRedshiftParameters() == null) ? 0 : getRedshiftParameters().hashCode());
        hashCode = prime * hashCode
                + ((getS3Parameters() == null) ? 0 : getS3Parameters().hashCode());
        hashCode = prime * hashCode
                + ((getServiceNowParameters() == null) ? 0 : getServiceNowParameters().hashCode());
        hashCode = prime * hashCode
                + ((getSnowflakeParameters() == null) ? 0 : getSnowflakeParameters().hashCode());
        hashCode = prime * hashCode
                + ((getSparkParameters() == null) ? 0 : getSparkParameters().hashCode());
        hashCode = prime * hashCode
                + ((getSqlServerParameters() == null) ? 0 : getSqlServerParameters().hashCode());
        hashCode = prime * hashCode
                + ((getTeradataParameters() == null) ? 0 : getTeradataParameters().hashCode());
        hashCode = prime * hashCode
                + ((getTwitterParameters() == null) ? 0 : getTwitterParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceParameters == false)
            return false;
        DataSourceParameters other = (DataSourceParameters) obj;

        if (other.getAmazonElasticsearchParameters() == null
                ^ this.getAmazonElasticsearchParameters() == null)
            return false;
        if (other.getAmazonElasticsearchParameters() != null
                && other.getAmazonElasticsearchParameters().equals(
                        this.getAmazonElasticsearchParameters()) == false)
            return false;
        if (other.getAthenaParameters() == null ^ this.getAthenaParameters() == null)
            return false;
        if (other.getAthenaParameters() != null
                && other.getAthenaParameters().equals(this.getAthenaParameters()) == false)
            return false;
        if (other.getAuroraParameters() == null ^ this.getAuroraParameters() == null)
            return false;
        if (other.getAuroraParameters() != null
                && other.getAuroraParameters().equals(this.getAuroraParameters()) == false)
            return false;
        if (other.getAuroraPostgreSqlParameters() == null
                ^ this.getAuroraPostgreSqlParameters() == null)
            return false;
        if (other.getAuroraPostgreSqlParameters() != null
                && other.getAuroraPostgreSqlParameters().equals(
                        this.getAuroraPostgreSqlParameters()) == false)
            return false;
        if (other.getAwsIotAnalyticsParameters() == null
                ^ this.getAwsIotAnalyticsParameters() == null)
            return false;
        if (other.getAwsIotAnalyticsParameters() != null
                && other.getAwsIotAnalyticsParameters().equals(this.getAwsIotAnalyticsParameters()) == false)
            return false;
        if (other.getJiraParameters() == null ^ this.getJiraParameters() == null)
            return false;
        if (other.getJiraParameters() != null
                && other.getJiraParameters().equals(this.getJiraParameters()) == false)
            return false;
        if (other.getMariaDbParameters() == null ^ this.getMariaDbParameters() == null)
            return false;
        if (other.getMariaDbParameters() != null
                && other.getMariaDbParameters().equals(this.getMariaDbParameters()) == false)
            return false;
        if (other.getMySqlParameters() == null ^ this.getMySqlParameters() == null)
            return false;
        if (other.getMySqlParameters() != null
                && other.getMySqlParameters().equals(this.getMySqlParameters()) == false)
            return false;
        if (other.getPostgreSqlParameters() == null ^ this.getPostgreSqlParameters() == null)
            return false;
        if (other.getPostgreSqlParameters() != null
                && other.getPostgreSqlParameters().equals(this.getPostgreSqlParameters()) == false)
            return false;
        if (other.getPrestoParameters() == null ^ this.getPrestoParameters() == null)
            return false;
        if (other.getPrestoParameters() != null
                && other.getPrestoParameters().equals(this.getPrestoParameters()) == false)
            return false;
        if (other.getRdsParameters() == null ^ this.getRdsParameters() == null)
            return false;
        if (other.getRdsParameters() != null
                && other.getRdsParameters().equals(this.getRdsParameters()) == false)
            return false;
        if (other.getRedshiftParameters() == null ^ this.getRedshiftParameters() == null)
            return false;
        if (other.getRedshiftParameters() != null
                && other.getRedshiftParameters().equals(this.getRedshiftParameters()) == false)
            return false;
        if (other.getS3Parameters() == null ^ this.getS3Parameters() == null)
            return false;
        if (other.getS3Parameters() != null
                && other.getS3Parameters().equals(this.getS3Parameters()) == false)
            return false;
        if (other.getServiceNowParameters() == null ^ this.getServiceNowParameters() == null)
            return false;
        if (other.getServiceNowParameters() != null
                && other.getServiceNowParameters().equals(this.getServiceNowParameters()) == false)
            return false;
        if (other.getSnowflakeParameters() == null ^ this.getSnowflakeParameters() == null)
            return false;
        if (other.getSnowflakeParameters() != null
                && other.getSnowflakeParameters().equals(this.getSnowflakeParameters()) == false)
            return false;
        if (other.getSparkParameters() == null ^ this.getSparkParameters() == null)
            return false;
        if (other.getSparkParameters() != null
                && other.getSparkParameters().equals(this.getSparkParameters()) == false)
            return false;
        if (other.getSqlServerParameters() == null ^ this.getSqlServerParameters() == null)
            return false;
        if (other.getSqlServerParameters() != null
                && other.getSqlServerParameters().equals(this.getSqlServerParameters()) == false)
            return false;
        if (other.getTeradataParameters() == null ^ this.getTeradataParameters() == null)
            return false;
        if (other.getTeradataParameters() != null
                && other.getTeradataParameters().equals(this.getTeradataParameters()) == false)
            return false;
        if (other.getTwitterParameters() == null ^ this.getTwitterParameters() == null)
            return false;
        if (other.getTwitterParameters() != null
                && other.getTwitterParameters().equals(this.getTwitterParameters()) == false)
            return false;
        return true;
    }
}
