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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Identifies a Amazon Cognito user group. A user group can be used in on or
 * more work teams.
 * </p>
 */
public class CognitoMemberDefinition implements Serializable {
    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region
     * as the service that you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPool;

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String userGroup;

    /**
     * <p>
     * An identifier for an application client. You must create the app client
     * ID using Amazon Cognito.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region
     * as the service that you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         An identifier for a user pool. The user pool must be in the same
     *         region as the service that you are calling.
     *         </p>
     */
    public String getUserPool() {
        return userPool;
    }

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region
     * as the service that you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPool <p>
     *            An identifier for a user pool. The user pool must be in the
     *            same region as the service that you are calling.
     *            </p>
     */
    public void setUserPool(String userPool) {
        this.userPool = userPool;
    }

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region
     * as the service that you are calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPool <p>
     *            An identifier for a user pool. The user pool must be in the
     *            same region as the service that you are calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoMemberDefinition withUserPool(String userPool) {
        this.userPool = userPool;
        return this;
    }

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         An identifier for a user group.
     *         </p>
     */
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param userGroup <p>
     *            An identifier for a user group.
     *            </p>
     */
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param userGroup <p>
     *            An identifier for a user group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoMemberDefinition withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * <p>
     * An identifier for an application client. You must create the app client
     * ID using Amazon Cognito.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         An identifier for an application client. You must create the app
     *         client ID using Amazon Cognito.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * An identifier for an application client. You must create the app client
     * ID using Amazon Cognito.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            An identifier for an application client. You must create the
     *            app client ID using Amazon Cognito.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * An identifier for an application client. You must create the app client
     * ID using Amazon Cognito.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            An identifier for an application client. You must create the
     *            app client ID using Amazon Cognito.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoMemberDefinition withClientId(String clientId) {
        this.clientId = clientId;
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
        if (getUserPool() != null)
            sb.append("UserPool: " + getUserPool() + ",");
        if (getUserGroup() != null)
            sb.append("UserGroup: " + getUserGroup() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPool() == null) ? 0 : getUserPool().hashCode());
        hashCode = prime * hashCode + ((getUserGroup() == null) ? 0 : getUserGroup().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoMemberDefinition == false)
            return false;
        CognitoMemberDefinition other = (CognitoMemberDefinition) obj;

        if (other.getUserPool() == null ^ this.getUserPool() == null)
            return false;
        if (other.getUserPool() != null && other.getUserPool().equals(this.getUserPool()) == false)
            return false;
        if (other.getUserGroup() == null ^ this.getUserGroup() == null)
            return false;
        if (other.getUserGroup() != null
                && other.getUserGroup().equals(this.getUserGroup()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }
}
