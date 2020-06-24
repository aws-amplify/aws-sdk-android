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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>CreateInstanceProfile</a> request.
 * </p>
 */
public class CreateInstanceProfileResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the new instance profile.
     * </p>
     */
    private InstanceProfile instanceProfile;

    /**
     * <p>
     * A structure containing details about the new instance profile.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the new instance profile.
     *         </p>
     */
    public InstanceProfile getInstanceProfile() {
        return instanceProfile;
    }

    /**
     * <p>
     * A structure containing details about the new instance profile.
     * </p>
     *
     * @param instanceProfile <p>
     *            A structure containing details about the new instance profile.
     *            </p>
     */
    public void setInstanceProfile(InstanceProfile instanceProfile) {
        this.instanceProfile = instanceProfile;
    }

    /**
     * <p>
     * A structure containing details about the new instance profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceProfile <p>
     *            A structure containing details about the new instance profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceProfileResult withInstanceProfile(InstanceProfile instanceProfile) {
        this.instanceProfile = instanceProfile;
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
        if (getInstanceProfile() != null)
            sb.append("InstanceProfile: " + getInstanceProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceProfile() == null) ? 0 : getInstanceProfile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceProfileResult == false)
            return false;
        CreateInstanceProfileResult other = (CreateInstanceProfileResult) obj;

        if (other.getInstanceProfile() == null ^ this.getInstanceProfile() == null)
            return false;
        if (other.getInstanceProfile() != null
                && other.getInstanceProfile().equals(this.getInstanceProfile()) == false)
            return false;
        return true;
    }
}
