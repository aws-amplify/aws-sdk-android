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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Creates a connection that can then be given to other AWS services like CodePipeline so that it can access third-party code repositories. The connection is in pending status until the third-party connection handshake is completed from the console.</p>
 */
public class CreateConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bitbucket
     */
    private String providerType;

    /**
     * <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     */
    private String connectionName;

    /**
     * <p>The key-value pair to use when tagging the resource.</p>
     */
    private java.util.List<Tag> tags;

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
    public CreateConnectionRequest withProviderType(String providerType) {
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
    public CreateConnectionRequest withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @return <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param connectionName <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param connectionName <p>The name of the connection to be created. The name must be unique in the calling AWS account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateConnectionRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * <p>The key-value pair to use when tagging the resource.</p>
     *
     * @return <p>The key-value pair to use when tagging the resource.</p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>The key-value pair to use when tagging the resource.</p>
     *
     * @param tags <p>The key-value pair to use when tagging the resource.</p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>The key-value pair to use when tagging the resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The key-value pair to use when tagging the resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateConnectionRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>The key-value pair to use when tagging the resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The key-value pair to use when tagging the resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateConnectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getProviderType() != null) sb.append("ProviderType: " + getProviderType() + ",");
        if (getConnectionName() != null) sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateConnectionRequest == false) return false;
        CreateConnectionRequest other = (CreateConnectionRequest)obj;

        if (other.getProviderType() == null ^ this.getProviderType() == null) return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false) return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null) return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
