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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * An origin in an origin group.
 * </p>
 */
public class OriginGroupMember implements Serializable {
    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     */
    private String originId;

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     *
     * @return <p>
     *         The ID for an origin in an origin group.
     *         </p>
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     *
     * @param originId <p>
     *            The ID for an origin in an origin group.
     *            </p>
     */
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originId <p>
     *            The ID for an origin in an origin group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginGroupMember withOriginId(String originId) {
        this.originId = originId;
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
        if (getOriginId() != null)
            sb.append("OriginId: " + getOriginId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginId() == null) ? 0 : getOriginId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroupMember == false)
            return false;
        OriginGroupMember other = (OriginGroupMember) obj;

        if (other.getOriginId() == null ^ this.getOriginId() == null)
            return false;
        if (other.getOriginId() != null && other.getOriginId().equals(this.getOriginId()) == false)
            return false;
        return true;
    }
}
