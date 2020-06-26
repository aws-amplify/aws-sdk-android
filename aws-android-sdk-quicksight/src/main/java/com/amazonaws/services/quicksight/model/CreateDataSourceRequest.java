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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a data source.
 * </p>
 */
public class CreateDataSourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this
     * operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     */
    private String type;

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     */
    private DataSourceParameters dataSourceParameters;

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     */
    private DataSourceCredentials credentials;

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection
     * when connecting to your underlying source.
     * </p>
     */
    private VpcConnectionProperties vpcConnectionProperties;

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects
     * to your underlying source.
     * </p>
     */
    private SslProperties sslProperties;

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the data source.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     *
     * @return <p>
     *         An ID for the data source. This ID is unique per AWS Region for
     *         each AWS account.
     *         </p>
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     *
     * @param dataSourceId <p>
     *            An ID for the data source. This ID is unique per AWS Region
     *            for each AWS account.
     *            </p>
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceId <p>
     *            An ID for the data source. This ID is unique per AWS Region
     *            for each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A display name for the data source.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            A display name for the data source.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            A display name for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this
     * operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @return <p>
     *         The type of the data source. Currently, the supported types for
     *         this operation are:
     *         <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *         . Use <code>ListDataSources</code> to return a list of all data
     *         sources.
     *         </p>
     * @see DataSourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this
     * operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @param type <p>
     *            The type of the data source. Currently, the supported types
     *            for this operation are:
     *            <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *            . Use <code>ListDataSources</code> to return a list of all
     *            data sources.
     *            </p>
     * @see DataSourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this
     * operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @param type <p>
     *            The type of the data source. Currently, the supported types
     *            for this operation are:
     *            <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *            . Use <code>ListDataSources</code> to return a list of all
     *            data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public CreateDataSourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this
     * operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @param type <p>
     *            The type of the data source. Currently, the supported types
     *            for this operation are:
     *            <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *            . Use <code>ListDataSources</code> to return a list of all
     *            data sources.
     *            </p>
     * @see DataSourceType
     */
    public void setType(DataSourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this
     * operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @param type <p>
     *            The type of the data source. Currently, the supported types
     *            for this operation are:
     *            <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *            . Use <code>ListDataSources</code> to return a list of all
     *            data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public CreateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     *
     * @return <p>
     *         The parameters that QuickSight uses to connect to your underlying
     *         source.
     *         </p>
     */
    public DataSourceParameters getDataSourceParameters() {
        return dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     *
     * @param dataSourceParameters <p>
     *            The parameters that QuickSight uses to connect to your
     *            underlying source.
     *            </p>
     */
    public void setDataSourceParameters(DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceParameters <p>
     *            The parameters that QuickSight uses to connect to your
     *            underlying source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withDataSourceParameters(
            DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
        return this;
    }

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     *
     * @return <p>
     *         The credentials QuickSight that uses to connect to your
     *         underlying source. Currently, only credentials based on user name
     *         and password are supported.
     *         </p>
     */
    public DataSourceCredentials getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     *
     * @param credentials <p>
     *            The credentials QuickSight that uses to connect to your
     *            underlying source. Currently, only credentials based on user
     *            name and password are supported.
     *            </p>
     */
    public void setCredentials(DataSourceCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentials <p>
     *            The credentials QuickSight that uses to connect to your
     *            underlying source. Currently, only credentials based on user
     *            name and password are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withCredentials(DataSourceCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     *
     * @return <p>
     *         A list of resource permissions on the data source.
     *         </p>
     */
    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     *
     * @param permissions <p>
     *            A list of resource permissions on the data source.
     *            </p>
     */
    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            A list of resource permissions on the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withPermissions(ResourcePermission... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<ResourcePermission>(permissions.length);
        }
        for (ResourcePermission value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            A list of resource permissions on the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withPermissions(
            java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection
     * when connecting to your underlying source.
     * </p>
     *
     * @return <p>
     *         Use this parameter only when you want QuickSight to use a VPC
     *         connection when connecting to your underlying source.
     *         </p>
     */
    public VpcConnectionProperties getVpcConnectionProperties() {
        return vpcConnectionProperties;
    }

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection
     * when connecting to your underlying source.
     * </p>
     *
     * @param vpcConnectionProperties <p>
     *            Use this parameter only when you want QuickSight to use a VPC
     *            connection when connecting to your underlying source.
     *            </p>
     */
    public void setVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection
     * when connecting to your underlying source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConnectionProperties <p>
     *            Use this parameter only when you want QuickSight to use a VPC
     *            connection when connecting to your underlying source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withVpcConnectionProperties(
            VpcConnectionProperties vpcConnectionProperties) {
        this.vpcConnectionProperties = vpcConnectionProperties;
        return this;
    }

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects
     * to your underlying source.
     * </p>
     *
     * @return <p>
     *         Secure Socket Layer (SSL) properties that apply when QuickSight
     *         connects to your underlying source.
     *         </p>
     */
    public SslProperties getSslProperties() {
        return sslProperties;
    }

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects
     * to your underlying source.
     * </p>
     *
     * @param sslProperties <p>
     *            Secure Socket Layer (SSL) properties that apply when
     *            QuickSight connects to your underlying source.
     *            </p>
     */
    public void setSslProperties(SslProperties sslProperties) {
        this.sslProperties = sslProperties;
    }

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects
     * to your underlying source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sslProperties <p>
     *            Secure Socket Layer (SSL) properties that apply when
     *            QuickSight connects to your underlying source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withSslProperties(SslProperties sslProperties) {
        this.sslProperties = sslProperties;
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the data source.
     * </p>
     *
     * @return <p>
     *         Contains a map of the key-value pairs for the resource tag or
     *         tags assigned to the data source.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the data source.
     * </p>
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the data source.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: " + getDataSourceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: " + getDataSourceParameters() + ",");
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions() + ",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: " + getVpcConnectionProperties() + ",");
        if (getSslProperties() != null)
            sb.append("SslProperties: " + getSslProperties() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null
                && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDataSourceParameters() == null ^ this.getDataSourceParameters() == null)
            return false;
        if (other.getDataSourceParameters() != null
                && other.getDataSourceParameters().equals(this.getDataSourceParameters()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getVpcConnectionProperties() == null ^ this.getVpcConnectionProperties() == null)
            return false;
        if (other.getVpcConnectionProperties() != null
                && other.getVpcConnectionProperties().equals(this.getVpcConnectionProperties()) == false)
            return false;
        if (other.getSslProperties() == null ^ this.getSslProperties() == null)
            return false;
        if (other.getSslProperties() != null
                && other.getSslProperties().equals(this.getSslProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
