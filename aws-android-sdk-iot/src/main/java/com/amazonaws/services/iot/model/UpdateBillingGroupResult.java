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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class UpdateBillingGroupResult implements Serializable {
    /**
     * <p>
     * The latest version of the billing group.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The latest version of the billing group.
     * </p>
     *
     * @return <p>
     *         The latest version of the billing group.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The latest version of the billing group.
     * </p>
     *
     * @param version <p>
     *            The latest version of the billing group.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The latest version of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The latest version of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBillingGroupResult withVersion(Long version) {
        this.version = version;
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
        if (getVersion() != null)
            sb.append("version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBillingGroupResult == false)
            return false;
        UpdateBillingGroupResult other = (UpdateBillingGroupResult) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
