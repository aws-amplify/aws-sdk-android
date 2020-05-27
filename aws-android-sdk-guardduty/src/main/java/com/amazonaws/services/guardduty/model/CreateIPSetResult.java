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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

public class CreateIPSetResult implements Serializable {
    /**
     * <p>
     * The ID of the IPSet resource.
     * </p>
     */
    private String ipSetId;

    /**
     * <p>
     * The ID of the IPSet resource.
     * </p>
     *
     * @return <p>
     *         The ID of the IPSet resource.
     *         </p>
     */
    public String getIpSetId() {
        return ipSetId;
    }

    /**
     * <p>
     * The ID of the IPSet resource.
     * </p>
     *
     * @param ipSetId <p>
     *            The ID of the IPSet resource.
     *            </p>
     */
    public void setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
    }

    /**
     * <p>
     * The ID of the IPSet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipSetId <p>
     *            The ID of the IPSet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetResult withIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
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
        if (getIpSetId() != null)
            sb.append("IpSetId: " + getIpSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpSetId() == null) ? 0 : getIpSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIPSetResult == false)
            return false;
        CreateIPSetResult other = (CreateIPSetResult) obj;

        if (other.getIpSetId() == null ^ this.getIpSetId() == null)
            return false;
        if (other.getIpSetId() != null && other.getIpSetId().equals(this.getIpSetId()) == false)
            return false;
        return true;
    }
}
