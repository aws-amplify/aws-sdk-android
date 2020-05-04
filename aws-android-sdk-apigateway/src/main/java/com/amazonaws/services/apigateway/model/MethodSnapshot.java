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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a summary of a <a>Method</a> resource, given a particular date and
 * time.
 * </p>
 */
public class MethodSnapshot implements Serializable {
    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for
     * open access, <code>AWS_IAM</code> for using AWS IAM permissions,
     * <code>CUSTOM</code> for using a custom authorizer, or
     * <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     * </p>
     */
    private String authorizationType;

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     */
    private Boolean apiKeyRequired;

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for
     * open access, <code>AWS_IAM</code> for using AWS IAM permissions,
     * <code>CUSTOM</code> for using a custom authorizer, or
     * <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     * </p>
     *
     * @return <p>
     *         The method's authorization type. Valid values are
     *         <code>NONE</code> for open access, <code>AWS_IAM</code> for using
     *         AWS IAM permissions, <code>CUSTOM</code> for using a custom
     *         authorizer, or <code>COGNITO_USER_POOLS</code> for using a
     *         Cognito user pool.
     *         </p>
     */
    public String getAuthorizationType() {
        return authorizationType;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for
     * open access, <code>AWS_IAM</code> for using AWS IAM permissions,
     * <code>CUSTOM</code> for using a custom authorizer, or
     * <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     * </p>
     *
     * @param authorizationType <p>
     *            The method's authorization type. Valid values are
     *            <code>NONE</code> for open access, <code>AWS_IAM</code> for
     *            using AWS IAM permissions, <code>CUSTOM</code> for using a
     *            custom authorizer, or <code>COGNITO_USER_POOLS</code> for
     *            using a Cognito user pool.
     *            </p>
     */
    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for
     * open access, <code>AWS_IAM</code> for using AWS IAM permissions,
     * <code>CUSTOM</code> for using a custom authorizer, or
     * <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizationType <p>
     *            The method's authorization type. Valid values are
     *            <code>NONE</code> for open access, <code>AWS_IAM</code> for
     *            using AWS IAM permissions, <code>CUSTOM</code> for using a
     *            custom authorizer, or <code>COGNITO_USER_POOLS</code> for
     *            using a Cognito user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSnapshot withAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the method requires a valid <a>ApiKey</a>.
     *         </p>
     */
    public Boolean isApiKeyRequired() {
        return apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the method requires a valid <a>ApiKey</a>.
     *         </p>
     */
    public Boolean getApiKeyRequired() {
        return apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     *
     * @param apiKeyRequired <p>
     *            Specifies whether the method requires a valid <a>ApiKey</a>.
     *            </p>
     */
    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiKeyRequired <p>
     *            Specifies whether the method requires a valid <a>ApiKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSnapshot withApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
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
        if (getAuthorizationType() != null)
            sb.append("authorizationType: " + getAuthorizationType() + ",");
        if (getApiKeyRequired() != null)
            sb.append("apiKeyRequired: " + getApiKeyRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode
                + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MethodSnapshot == false)
            return false;
        MethodSnapshot other = (MethodSnapshot) obj;

        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null
                && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null
                && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        return true;
    }
}
