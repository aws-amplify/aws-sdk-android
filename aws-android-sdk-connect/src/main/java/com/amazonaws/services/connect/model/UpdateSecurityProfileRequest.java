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
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Updates a security profile.
 * </p>
 */
public class UpdateSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     */
    private java.util.List<String> permissions;

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     */
    private String securityProfileId;

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
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @return <p>
     *         The description of the security profile.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @param description <p>
     *            The description of the security profile.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @param description <p>
     *            The description of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     *
     * @return <p>
     *         The permissions granted to a security profile.
     *         </p>
     */
    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     *
     * @param permissions <p>
     *            The permissions granted to a security profile.
     *            </p>
     */
    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            The permissions granted to a security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withPermissions(String... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<String>(permissions.length);
        }
        for (String value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            The permissions granted to a security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     *
     * @return <p>
     *         The identifier for the security profle.
     *         </p>
     */
    public String getSecurityProfileId() {
        return securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     *
     * @param securityProfileId <p>
     *            The identifier for the security profle.
     *            </p>
     */
    public void setSecurityProfileId(String securityProfileId) {
        this.securityProfileId = securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileId <p>
     *            The identifier for the security profle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withSecurityProfileId(String securityProfileId) {
        this.securityProfileId = securityProfileId;
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
    public UpdateSecurityProfileRequest withInstanceId(String instanceId) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions() + ",");
        if (getSecurityProfileId() != null)
            sb.append("SecurityProfileId: " + getSecurityProfileId() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileId() == null) ? 0 : getSecurityProfileId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileRequest == false)
            return false;
        UpdateSecurityProfileRequest other = (UpdateSecurityProfileRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSecurityProfileId() == null ^ this.getSecurityProfileId() == null)
            return false;
        if (other.getSecurityProfileId() != null
                && other.getSecurityProfileId().equals(this.getSecurityProfileId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
