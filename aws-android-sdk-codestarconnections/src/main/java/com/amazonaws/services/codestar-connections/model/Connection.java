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
package com.amazonaws.services.codestar-connections.model;

import java.io.Serializable;


/**
 * <p>The AWS::CodeStarConnections::Connection resource can be used to connect external source providers with services like AWS CodePipeline.</p> <p>Note: A connection created through CloudFormation is in `PENDING` status by default. You can make its status `AVAILABLE` by editing the connection in the CodePipeline console.</p>
 */
public class Connection implements Serializable {
    /**
     * <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     */
    private String connectionName;

    /**
     * <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     */
    private String connectionArn;

    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     */
    private String providerType;

    /**
     * <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String ownerAccountId;

    /**
     * <p>The current status of the connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, ERROR
     */
    private String connectionStatus;

    /**
     * <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @return <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param connectionName <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param connectionName <p>The name of the connection. Connection names must be unique in an AWS user account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Connection withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     */
    public String getConnectionArn() {
        return connectionArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @param connectionArn <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     */
    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @param connectionArn <p>The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.</p> <note> <p>The ARN is never reused if the connection is deleted.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Connection withConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
        return this;
    }

    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @return <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     *
     * @see ProviderType
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerType <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     *
     * @see ProviderType
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerType <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ProviderType
     */
    public Connection withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerType <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     *
     * @see ProviderType
     */
    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
    }

    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     *
     * @param providerType <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ProviderType
     */
    public Connection withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     */
    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    /**
     * <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param ownerAccountId <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     */
    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param ownerAccountId <p>The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Connection withOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }

    /**
     * <p>The current status of the connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, ERROR
     *
     * @return <p>The current status of the connection. </p>
     *
     * @see ConnectionStatus
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * <p>The current status of the connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, ERROR
     *
     * @param connectionStatus <p>The current status of the connection. </p>
     *
     * @see ConnectionStatus
     */
    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>The current status of the connection. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, ERROR
     *
     * @param connectionStatus <p>The current status of the connection. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ConnectionStatus
     */
    public Connection withConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    /**
     * <p>The current status of the connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, ERROR
     *
     * @param connectionStatus <p>The current status of the connection. </p>
     *
     * @see ConnectionStatus
     */
    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
    }

    /**
     * <p>The current status of the connection. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, ERROR
     *
     * @param connectionStatus <p>The current status of the connection. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ConnectionStatus
     */
    public Connection withConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionName() != null) sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getConnectionArn() != null) sb.append("ConnectionArn: " + getConnectionArn() + ",");
        if (getProviderType() != null) sb.append("ProviderType: " + getProviderType() + ",");
        if (getOwnerAccountId() != null) sb.append("OwnerAccountId: " + getOwnerAccountId() + ",");
        if (getConnectionStatus() != null) sb.append("ConnectionStatus: " + getConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Connection == false) return false;
        Connection other = (Connection)obj;

        if (other.getConnectionName() == null ^ this.getConnectionName() == null) return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false) return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null) return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false) return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null) return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false) return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null) return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false) return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null) return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false) return false;
        return true;
    }
}
