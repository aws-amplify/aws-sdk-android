/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
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
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
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
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
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
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
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
            sb.append("GenerateSecret: " + getGenerateSecret());
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
        return true;
    }
}
