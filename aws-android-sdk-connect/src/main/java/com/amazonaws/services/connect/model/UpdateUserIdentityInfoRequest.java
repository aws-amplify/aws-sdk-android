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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the identity information for the specified user in a
 * <code>UserIdentityInfo</code> object, including email, first name, and last
 * name.
 * </p>
 */
public class UpdateUserIdentityInfoRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A <code>UserIdentityInfo</code> object.
     * </p>
     */
    private UserIdentityInfo identityInfo;

    /**
     * <p>
     * The identifier for the user account to update identity information for.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A <code>UserIdentityInfo</code> object.
     * </p>
     *
     * @return <p>
     *         A <code>UserIdentityInfo</code> object.
     *         </p>
     */
    public UserIdentityInfo getIdentityInfo() {
        return identityInfo;
    }

    /**
     * <p>
     * A <code>UserIdentityInfo</code> object.
     * </p>
     *
     * @param identityInfo <p>
     *            A <code>UserIdentityInfo</code> object.
     *            </p>
     */
    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * A <code>UserIdentityInfo</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityInfo <p>
     *            A <code>UserIdentityInfo</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserIdentityInfoRequest withIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * <p>
     * The identifier for the user account to update identity information for.
     * </p>
     *
     * @return <p>
     *         The identifier for the user account to update identity
     *         information for.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier for the user account to update identity information for.
     * </p>
     *
     * @param userId <p>
     *            The identifier for the user account to update identity
     *            information for.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user account to update identity information for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The identifier for the user account to update identity
     *            information for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserIdentityInfoRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier for your Amazon Connect instance. To find the ID
     *         of your instance, open the AWS console and select Amazon Connect.
     *         Select the alias of the instance in the Instance alias column.
     *         The instance ID is displayed in the Overview section of your
     *         instance settings. For example, the instance ID is the set of
     *         characters at the end of the instance ARN, after instance/, such
     *         as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserIdentityInfoRequest withInstanceId(String instanceId) {
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
        if (getIdentityInfo() != null)
            sb.append("IdentityInfo: " + getIdentityInfo() + ",");
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
                + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
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

        if (obj instanceof UpdateUserIdentityInfoRequest == false)
            return false;
        UpdateUserIdentityInfoRequest other = (UpdateUserIdentityInfoRequest) obj;

        if (other.getIdentityInfo() == null ^ this.getIdentityInfo() == null)
            return false;
        if (other.getIdentityInfo() != null
                && other.getIdentityInfo().equals(this.getIdentityInfo()) == false)
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
