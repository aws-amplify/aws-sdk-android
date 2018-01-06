/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates the user pool client.
 * </p>
 */
public class CreateUserPoolClientRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String clientName;

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     */
    private Boolean generateSecret;

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     */
    private Integer refreshTokenValidity;

    /**
     * <p>
     * The read attributes.
     * </p>
     */
    private java.util.List<String> readAttributes;

    /**
     * <p>
     * The write attributes.
     * </p>
     */
    private java.util.List<String> writeAttributes;

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     */
    private java.util.List<String> explicitAuthFlows;

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to create a
     *         user pool client.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to create a
     *            user pool client.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to create a
     *            user pool client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         The client name for the user pool client you would like to
     *         create.
     *         </p>
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName <p>
     *            The client name for the user pool client you would like to
     *            create.
     *            </p>
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName <p>
     *            The client name for the user pool client you would like to
     *            create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     *
     * @return <p>
     *         Boolean to specify whether you want to generate a secret for the
     *         user pool client being created.
     *         </p>
     */
    public Boolean isGenerateSecret() {
        return generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     *
     * @return <p>
     *         Boolean to specify whether you want to generate a secret for the
     *         user pool client being created.
     *         </p>
     */
    public Boolean getGenerateSecret() {
        return generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     *
     * @param generateSecret <p>
     *            Boolean to specify whether you want to generate a secret for
     *            the user pool client being created.
     *            </p>
     */
    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generateSecret <p>
     *            Boolean to specify whether you want to generate a secret for
     *            the user pool client being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
        return this;
    }

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     *
     * @return <p>
     *         Refreshes the token validity.
     *         </p>
     */
    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     *
     * @param refreshTokenValidity <p>
     *            Refreshes the token validity.
     *            </p>
     */
    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     *
     * @param refreshTokenValidity <p>
     *            Refreshes the token validity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     *
     * @return <p>
     *         The read attributes.
     *         </p>
     */
    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     *
     * @param readAttributes <p>
     *            The read attributes.
     *            </p>
     */
    public void setReadAttributes(java.util.Collection<String> readAttributes) {
        if (readAttributes == null) {
            this.readAttributes = null;
            return;
        }

        this.readAttributes = new java.util.ArrayList<String>(readAttributes);
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readAttributes <p>
     *            The read attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withReadAttributes(String... readAttributes) {
        if (getReadAttributes() == null) {
            this.readAttributes = new java.util.ArrayList<String>(readAttributes.length);
        }
        for (String value : readAttributes) {
            this.readAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readAttributes <p>
     *            The read attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withReadAttributes(
            java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The write attributes.
     * </p>
     *
     * @return <p>
     *         The write attributes.
     *         </p>
     */
    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The write attributes.
     * </p>
     *
     * @param writeAttributes <p>
     *            The write attributes.
     *            </p>
     */
    public void setWriteAttributes(java.util.Collection<String> writeAttributes) {
        if (writeAttributes == null) {
            this.writeAttributes = null;
            return;
        }

        this.writeAttributes = new java.util.ArrayList<String>(writeAttributes);
    }

    /**
     * <p>
     * The write attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeAttributes <p>
     *            The write attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withWriteAttributes(String... writeAttributes) {
        if (getWriteAttributes() == null) {
            this.writeAttributes = new java.util.ArrayList<String>(writeAttributes.length);
        }
        for (String value : writeAttributes) {
            this.writeAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The write attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeAttributes <p>
     *            The write attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withWriteAttributes(
            java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     *
     * @return <p>
     *         The explicit authentication flows.
     *         </p>
     */
    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     *
     * @param explicitAuthFlows <p>
     *            The explicit authentication flows.
     *            </p>
     */
    public void setExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        if (explicitAuthFlows == null) {
            this.explicitAuthFlows = null;
            return;
        }

        this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows);
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitAuthFlows <p>
     *            The explicit authentication flows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withExplicitAuthFlows(String... explicitAuthFlows) {
        if (getExplicitAuthFlows() == null) {
            this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows.length);
        }
        for (String value : explicitAuthFlows) {
            this.explicitAuthFlows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitAuthFlows <p>
     *            The explicit authentication flows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withExplicitAuthFlows(
            java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientName() != null)
            sb.append("ClientName: " + getClientName() + ",");
        if (getGenerateSecret() != null)
            sb.append("GenerateSecret: " + getGenerateSecret() + ",");
        if (getRefreshTokenValidity() != null)
            sb.append("RefreshTokenValidity: " + getRefreshTokenValidity() + ",");
        if (getReadAttributes() != null)
            sb.append("ReadAttributes: " + getReadAttributes() + ",");
        if (getWriteAttributes() != null)
            sb.append("WriteAttributes: " + getWriteAttributes() + ",");
        if (getExplicitAuthFlows() != null)
            sb.append("ExplicitAuthFlows: " + getExplicitAuthFlows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode
                + ((getGenerateSecret() == null) ? 0 : getGenerateSecret().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode
                + ((getReadAttributes() == null) ? 0 : getReadAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getWriteAttributes() == null) ? 0 : getWriteAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getExplicitAuthFlows() == null) ? 0 : getExplicitAuthFlows().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolClientRequest == false)
            return false;
        CreateUserPoolClientRequest other = (CreateUserPoolClientRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null
                && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getGenerateSecret() == null ^ this.getGenerateSecret() == null)
            return false;
        if (other.getGenerateSecret() != null
                && other.getGenerateSecret().equals(this.getGenerateSecret()) == false)
            return false;
        if (other.getRefreshTokenValidity() == null ^ this.getRefreshTokenValidity() == null)
            return false;
        if (other.getRefreshTokenValidity() != null
                && other.getRefreshTokenValidity().equals(this.getRefreshTokenValidity()) == false)
            return false;
        if (other.getReadAttributes() == null ^ this.getReadAttributes() == null)
            return false;
        if (other.getReadAttributes() != null
                && other.getReadAttributes().equals(this.getReadAttributes()) == false)
            return false;
        if (other.getWriteAttributes() == null ^ this.getWriteAttributes() == null)
            return false;
        if (other.getWriteAttributes() != null
                && other.getWriteAttributes().equals(this.getWriteAttributes()) == false)
            return false;
        if (other.getExplicitAuthFlows() == null ^ this.getExplicitAuthFlows() == null)
            return false;
        if (other.getExplicitAuthFlows() != null
                && other.getExplicitAuthFlows().equals(this.getExplicitAuthFlows()) == false)
            return false;
        return true;
    }
}
