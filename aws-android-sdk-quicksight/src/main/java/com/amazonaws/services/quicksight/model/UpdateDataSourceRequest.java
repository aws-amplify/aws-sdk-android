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
 * Updates a data source.
 * </p>
 */
public class UpdateDataSourceRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     */
    private DataSourceParameters dataSourceParameters;

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     */
    private DataSourceCredentials credentials;

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
    public UpdateDataSourceRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
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
    public UpdateDataSourceRequest withDataSourceId(String dataSourceId) {
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
    public UpdateDataSourceRequest withName(String name) {
        this.name = name;
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
    public UpdateDataSourceRequest withDataSourceParameters(
            DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
        return this;
    }

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     *
     * @return <p>
     *         The credentials that QuickSight that uses to connect to your
     *         underlying source. Currently, only credentials based on user name
     *         and password are supported.
     *         </p>
     */
    public DataSourceCredentials getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     *
     * @param credentials <p>
     *            The credentials that QuickSight that uses to connect to your
     *            underlying source. Currently, only credentials based on user
     *            name and password are supported.
     *            </p>
     */
    public void setCredentials(DataSourceCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying
     * source. Currently, only credentials based on user name and password are
     * supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentials <p>
     *            The credentials that QuickSight that uses to connect to your
     *            underlying source. Currently, only credentials based on user
     *            name and password are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourceRequest withCredentials(DataSourceCredentials credentials) {
        this.credentials = credentials;
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
    public UpdateDataSourceRequest withVpcConnectionProperties(
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
    public UpdateDataSourceRequest withSslProperties(SslProperties sslProperties) {
        this.sslProperties = sslProperties;
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
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: " + getDataSourceParameters() + ",");
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: " + getVpcConnectionProperties() + ",");
        if (getSslProperties() != null)
            sb.append("SslProperties: " + getSslProperties());
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
        hashCode = prime * hashCode
                + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;

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
        return true;
    }
}
