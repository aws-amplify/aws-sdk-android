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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetInstanceAccessDetailsResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about a get instance
     * access request.
     * </p>
     */
    private InstanceAccessDetails accessDetails;

    /**
     * <p>
     * An array of key-value pairs containing information about a get instance
     * access request.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about a get
     *         instance access request.
     *         </p>
     */
    public InstanceAccessDetails getAccessDetails() {
        return accessDetails;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about a get instance
     * access request.
     * </p>
     *
     * @param accessDetails <p>
     *            An array of key-value pairs containing information about a get
     *            instance access request.
     *            </p>
     */
    public void setAccessDetails(InstanceAccessDetails accessDetails) {
        this.accessDetails = accessDetails;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about a get instance
     * access request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessDetails <p>
     *            An array of key-value pairs containing information about a get
     *            instance access request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceAccessDetailsResult withAccessDetails(InstanceAccessDetails accessDetails) {
        this.accessDetails = accessDetails;
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
        if (getAccessDetails() != null)
            sb.append("accessDetails: " + getAccessDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessDetails() == null) ? 0 : getAccessDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceAccessDetailsResult == false)
            return false;
        GetInstanceAccessDetailsResult other = (GetInstanceAccessDetailsResult) obj;

        if (other.getAccessDetails() == null ^ this.getAccessDetails() == null)
            return false;
        if (other.getAccessDetails() != null
                && other.getAccessDetails().equals(this.getAccessDetails()) == false)
            return false;
        return true;
    }
}
