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
 * Updates the phone configuration settings for the specified user.
 * </p>
 */
public class UpdateUserPhoneConfigRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Information about phone configuration settings for the user.
     * </p>
     */
    private UserPhoneConfig phoneConfig;

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
     * Information about phone configuration settings for the user.
     * </p>
     *
     * @return <p>
     *         Information about phone configuration settings for the user.
     *         </p>
     */
    public UserPhoneConfig getPhoneConfig() {
        return phoneConfig;
    }

    /**
     * <p>
     * Information about phone configuration settings for the user.
     * </p>
     *
     * @param phoneConfig <p>
     *            Information about phone configuration settings for the user.
     *            </p>
     */
    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * Information about phone configuration settings for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneConfig <p>
     *            Information about phone configuration settings for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPhoneConfigRequest withPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
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
    public UpdateUserPhoneConfigRequest withUserId(String userId) {
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
    public UpdateUserPhoneConfigRequest withInstanceId(String instanceId) {
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
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: " + getPhoneConfig() + ",");
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
                + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
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

        if (obj instanceof UpdateUserPhoneConfigRequest == false)
            return false;
        UpdateUserPhoneConfigRequest other = (UpdateUserPhoneConfigRequest) obj;

        if (other.getPhoneConfig() == null ^ this.getPhoneConfig() == null)
            return false;
        if (other.getPhoneConfig() != null
                && other.getPhoneConfig().equals(this.getPhoneConfig()) == false)
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
