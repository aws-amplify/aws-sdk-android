/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Assigns the specified security profiles to the specified user.
 * </p>
 */
public class UpdateUserSecurityProfilesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     */
    private java.util.List<String> securityProfileIds;

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     *
     * @return <p>
     *         The identifiers of the security profiles for the user.
     *         </p>
     */
    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     *
     * @param securityProfileIds <p>
     *            The identifiers of the security profiles for the user.
     *            </p>
     */
    public void setSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        if (securityProfileIds == null) {
            this.securityProfileIds = null;
            return;
        }

        this.securityProfileIds = new java.util.ArrayList<String>(securityProfileIds);
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifiers of the security profiles for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSecurityProfilesRequest withSecurityProfileIds(String... securityProfileIds) {
        if (getSecurityProfileIds() == null) {
            this.securityProfileIds = new java.util.ArrayList<String>(securityProfileIds.length);
        }
        for (String value : securityProfileIds) {
            this.securityProfileIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifiers of the security profiles for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSecurityProfilesRequest withSecurityProfileIds(
            java.util.Collection<String> securityProfileIds) {
        setSecurityProfileIds(securityProfileIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     *
     * @return <p>
     *         The identifier of the user account.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     *
     * @param userId <p>
     *            The identifier of the user account.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The identifier of the user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSecurityProfilesRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSecurityProfilesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getSecurityProfileIds() != null)
            sb.append("SecurityProfileIds: " + getSecurityProfileIds() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileIds() == null) ? 0 : getSecurityProfileIds().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserSecurityProfilesRequest == false)
            return false;
        UpdateUserSecurityProfilesRequest other = (UpdateUserSecurityProfilesRequest) obj;

        if (other.getSecurityProfileIds() == null ^ this.getSecurityProfileIds() == null)
            return false;
        if (other.getSecurityProfileIds() != null
                && other.getSecurityProfileIds().equals(this.getSecurityProfileIds()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
