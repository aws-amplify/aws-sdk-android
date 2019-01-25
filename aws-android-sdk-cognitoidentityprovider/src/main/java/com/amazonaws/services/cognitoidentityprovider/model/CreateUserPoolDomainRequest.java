/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new domain for a user pool.
 * </p>
 */
public class CreateUserPoolDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     */
    private String domain;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use own custom domain for your
     * user pool. Otherwise, you can exclude this parameter and use the Amazon
     * Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     */
    private CustomDomainConfigType customDomainConfig;

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         The domain string.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            The domain string.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            The domain string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolDomainRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
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
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolDomainRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use own custom domain for your
     * user pool. Otherwise, you can exclude this parameter and use the Amazon
     * Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     *
     * @return <p>
     *         The configuration for a custom domain that hosts the sign-up and
     *         sign-in webpages for your application.
     *         </p>
     *         <p>
     *         Provide this parameter only if you want to use own custom domain
     *         for your user pool. Otherwise, you can exclude this parameter and
     *         use the Amazon Cognito hosted domain instead.
     *         </p>
     *         <p>
     *         For more information about the hosted domain and custom domains,
     *         see <a href=
     *         "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     *         >Configuring a User Pool Domain</a>.
     *         </p>
     */
    public CustomDomainConfigType getCustomDomainConfig() {
        return customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use own custom domain for your
     * user pool. Otherwise, you can exclude this parameter and use the Amazon
     * Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     *
     * @param customDomainConfig <p>
     *            The configuration for a custom domain that hosts the sign-up
     *            and sign-in webpages for your application.
     *            </p>
     *            <p>
     *            Provide this parameter only if you want to use own custom
     *            domain for your user pool. Otherwise, you can exclude this
     *            parameter and use the Amazon Cognito hosted domain instead.
     *            </p>
     *            <p>
     *            For more information about the hosted domain and custom
     *            domains, see <a href=
     *            "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     *            >Configuring a User Pool Domain</a>.
     *            </p>
     */
    public void setCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use own custom domain for your
     * user pool. Otherwise, you can exclude this parameter and use the Amazon
     * Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDomainConfig <p>
     *            The configuration for a custom domain that hosts the sign-up
     *            and sign-in webpages for your application.
     *            </p>
     *            <p>
     *            Provide this parameter only if you want to use own custom
     *            domain for your user pool. Otherwise, you can exclude this
     *            parameter and use the Amazon Cognito hosted domain instead.
     *            </p>
     *            <p>
     *            For more information about the hosted domain and custom
     *            domains, see <a href=
     *            "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     *            >Configuring a User Pool Domain</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolDomainRequest withCustomDomainConfig(
            CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getCustomDomainConfig() != null)
            sb.append("CustomDomainConfig: " + getCustomDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getCustomDomainConfig() == null) ? 0 : getCustomDomainConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolDomainRequest == false)
            return false;
        CreateUserPoolDomainRequest other = (CreateUserPoolDomainRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCustomDomainConfig() == null ^ this.getCustomDomainConfig() == null)
            return false;
        if (other.getCustomDomainConfig() != null
                && other.getCustomDomainConfig().equals(this.getCustomDomainConfig()) == false)
            return false;
        return true;
    }
}
