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
 * The structure of a data source.
 * </p>
 */
public class DataSource implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
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
     * The type of the data source. This type indicates which database engine
     * the data source connects to.
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
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     */
    private String status;

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying
     * source. This is a variant type structure. For this structure to be valid,
     * only one of the attributes can be non-null.
     * </p>
     */
    private DataSourceParameters dataSourceParameters;

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when
     * you want QuickSight to use a VPC connection when connecting to your
     * underlying source.
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
     * Error information from the last update or the creation of the data
     * source.
     * </p>
     */
    private DataSourceErrorInfo errorInfo;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the data source.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the data source.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The ID of the data source. This ID is unique per AWS Region for
     *         each AWS account.
     *         </p>
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     *
     * @param dataSourceId <p>
     *            The ID of the data source. This ID is unique per AWS Region
     *            for each AWS account.
     *            </p>
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceId <p>
     *            The ID of the data source. This ID is unique per AWS Region
     *            for each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withDataSourceId(String dataSourceId) {
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
    public DataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine
     * the data source connects to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @return <p>
     *         The type of the data source. This type indicates which database
     *         engine the data source connects to.
     *         </p>
     * @see DataSourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine
     * the data source connects to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @param type <p>
     *            The type of the data source. This type indicates which
     *            database engine the data source connects to.
     *            </p>
     * @see DataSourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine
     * the data source connects to.
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
     *            The type of the data source. This type indicates which
     *            database engine the data source connects to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public DataSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine
     * the data source connects to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADOBE_ANALYTICS, AMAZON_ELASTICSEARCH, ATHENA,
     * AURORA, AURORA_POSTGRESQL, AWS_IOT_ANALYTICS, GITHUB, JIRA, MARIADB,
     * MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SALESFORCE, SERVICENOW,
     * SNOWFLAKE, SPARK, SQLSERVER, TERADATA, TWITTER
     *
     * @param type <p>
     *            The type of the data source. This type indicates which
     *            database engine the data source connects to.
     *            </p>
     * @see DataSourceType
     */
    public void setType(DataSourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine
     * the data source connects to.
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
     *            The type of the data source. This type indicates which
     *            database engine the data source connects to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public DataSource withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     * @see ResourceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public DataSource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(ResourceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public DataSource withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     *
     * @return <p>
     *         The time that this data source was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time that this data source was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that this data source was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     *
     * @return <p>
     *         The last time that this data source was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The last time that this data source was updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The last time that this data source was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying
     * source. This is a variant type structure. For this structure to be valid,
     * only one of the attributes can be non-null.
     * </p>
     *
     * @return <p>
     *         The parameters that Amazon QuickSight uses to connect to your
     *         underlying source. This is a variant type structure. For this
     *         structure to be valid, only one of the attributes can be
     *         non-null.
     *         </p>
     */
    public DataSourceParameters getDataSourceParameters() {
        return dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying
     * source. This is a variant type structure. For this structure to be valid,
     * only one of the attributes can be non-null.
     * </p>
     *
     * @param dataSourceParameters <p>
     *            The parameters that Amazon QuickSight uses to connect to your
     *            underlying source. This is a variant type structure. For this
     *            structure to be valid, only one of the attributes can be
     *            non-null.
     *            </p>
     */
    public void setDataSourceParameters(DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying
     * source. This is a variant type structure. For this structure to be valid,
     * only one of the attributes can be non-null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceParameters <p>
     *            The parameters that Amazon QuickSight uses to connect to your
     *            underlying source. This is a variant type structure. For this
     *            structure to be valid, only one of the attributes can be
     *            non-null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withDataSourceParameters(DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
        return this;
    }

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when
     * you want QuickSight to use a VPC connection when connecting to your
     * underlying source.
     * </p>
     *
     * @return <p>
     *         The VPC connection information. You need to use this parameter
     *         only when you want QuickSight to use a VPC connection when
     *         connecting to your underlying source.
     *         </p>
     */
    public VpcConnectionProperties getVpcConnectionProperties() {
        return vpcConnectionProperties;
    }

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when
     * you want QuickSight to use a VPC connection when connecting to your
     * underlying source.
     * </p>
     *
     * @param vpcConnectionProperties <p>
     *            The VPC connection information. You need to use this parameter
     *            only when you want QuickSight to use a VPC connection when
     *            connecting to your underlying source.
     *            </p>
     */
    public void setVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when
     * you want QuickSight to use a VPC connection when connecting to your
     * underlying source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConnectionProperties <p>
     *            The VPC connection information. You need to use this parameter
     *            only when you want QuickSight to use a VPC connection when
     *            connecting to your underlying source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
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
    public DataSource withSslProperties(SslProperties sslProperties) {
        this.sslProperties = sslProperties;
        return this;
    }

    /**
     * <p>
     * Error information from the last update or the creation of the data
     * source.
     * </p>
     *
     * @return <p>
     *         Error information from the last update or the creation of the
     *         data source.
     *         </p>
     */
    public DataSourceErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * <p>
     * Error information from the last update or the creation of the data
     * source.
     * </p>
     *
     * @param errorInfo <p>
     *            Error information from the last update or the creation of the
     *            data source.
     *            </p>
     */
    public void setErrorInfo(DataSourceErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information from the last update or the creation of the data
     * source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorInfo <p>
     *            Error information from the last update or the creation of the
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSource withErrorInfo(DataSourceErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: " + getDataSourceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: " + getDataSourceParameters() + ",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: " + getVpcConnectionProperties() + ",");
        if (getSslProperties() != null)
            sb.append("SslProperties: " + getSslProperties() + ",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: " + getErrorInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getDataSourceParameters() == null ^ this.getDataSourceParameters() == null)
            return false;
        if (other.getDataSourceParameters() != null
                && other.getDataSourceParameters().equals(this.getDataSourceParameters()) == false)
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
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null
                && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        return true;
    }
}
