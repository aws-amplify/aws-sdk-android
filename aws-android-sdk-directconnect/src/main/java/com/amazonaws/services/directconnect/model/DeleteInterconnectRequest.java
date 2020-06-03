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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified interconnect.
 * </p>
 * <note>
 * <p>
 * Intended for use by AWS Direct Connect Partners only.
 * </p>
 * </note>
 */
public class DeleteInterconnectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     */
    private String interconnectId;

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     *
     * @return <p>
     *         The ID of the interconnect.
     *         </p>
     */
    public String getInterconnectId() {
        return interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     *
     * @param interconnectId <p>
     *            The ID of the interconnect.
     *            </p>
     */
    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnectId <p>
     *            The ID of the interconnect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInterconnectRequest withInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
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
        if (getInterconnectId() != null)
            sb.append("interconnectId: " + getInterconnectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInterconnectRequest == false)
            return false;
        DeleteInterconnectRequest other = (DeleteInterconnectRequest) obj;

        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null
                && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        return true;
    }
}
