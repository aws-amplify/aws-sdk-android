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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Options to specify the Cognito user and identity pools for Kibana
 * authentication. For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
 * target="_blank">Amazon Cognito Authentication for Kibana</a>.
 * </p>
 */
public class CognitoOptions implements Serializable {
    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for
     * accessing Cognito resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     *
     * @return <p>
     *         Specifies the option to enable Cognito for Kibana authentication.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     *
     * @return <p>
     *         Specifies the option to enable Cognito for Kibana authentication.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     *
     * @param enabled <p>
     *            Specifies the option to enable Cognito for Kibana
     *            authentication.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies the option to enable Cognito for Kibana
     *            authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         Specifies the Cognito user pool ID for Kibana authentication.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            Specifies the Cognito user pool ID for Kibana authentication.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
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
     *            Specifies the Cognito user pool ID for Kibana authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoOptions withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return <p>
     *         Specifies the Cognito identity pool ID for Kibana authentication.
     *         </p>
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            Specifies the Cognito identity pool ID for Kibana
     *            authentication.
     *            </p>
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            Specifies the Cognito identity pool ID for Kibana
     *            authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoOptions withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for
     * accessing Cognito resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         Specifies the role ARN that provides Elasticsearch permissions
     *         for accessing Cognito resources.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for
     * accessing Cognito resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            Specifies the role ARN that provides Elasticsearch permissions
     *            for accessing Cognito resources.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for
     * accessing Cognito resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            Specifies the role ARN that provides Elasticsearch permissions
     *            for accessing Cognito resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoOptions withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoOptions == false)
            return false;
        CognitoOptions other = (CognitoOptions) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
