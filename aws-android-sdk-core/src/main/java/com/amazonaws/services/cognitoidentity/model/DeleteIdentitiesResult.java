/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * Returned in response to a successful <code>DeleteIdentities</code> operation.
 * </p>
 */
public class DeleteIdentitiesResult implements Serializable {
    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an
     * ErrorCode and IdentityId.
     * </p>
     */
    private java.util.List<UnprocessedIdentityId> unprocessedIdentityIds;

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an
     * ErrorCode and IdentityId.
     * </p>
     *
     * @return <p>
     *         An array of UnprocessedIdentityId objects, each of which contains
     *         an ErrorCode and IdentityId.
     *         </p>
     */
    public java.util.List<UnprocessedIdentityId> getUnprocessedIdentityIds() {
        return unprocessedIdentityIds;
    }

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an
     * ErrorCode and IdentityId.
     * </p>
     *
     * @param unprocessedIdentityIds <p>
     *            An array of UnprocessedIdentityId objects, each of which
     *            contains an ErrorCode and IdentityId.
     *            </p>
     */
    public void setUnprocessedIdentityIds(
            java.util.Collection<UnprocessedIdentityId> unprocessedIdentityIds) {
        if (unprocessedIdentityIds == null) {
            this.unprocessedIdentityIds = null;
            return;
        }

        this.unprocessedIdentityIds = new java.util.ArrayList<UnprocessedIdentityId>(
                unprocessedIdentityIds);
    }

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an
     * ErrorCode and IdentityId.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedIdentityIds <p>
     *            An array of UnprocessedIdentityId objects, each of which
     *            contains an ErrorCode and IdentityId.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteIdentitiesResult withUnprocessedIdentityIds(
            UnprocessedIdentityId... unprocessedIdentityIds) {
        if (getUnprocessedIdentityIds() == null) {
            this.unprocessedIdentityIds = new java.util.ArrayList<UnprocessedIdentityId>(
                    unprocessedIdentityIds.length);
        }
        for (UnprocessedIdentityId value : unprocessedIdentityIds) {
            this.unprocessedIdentityIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an
     * ErrorCode and IdentityId.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedIdentityIds <p>
     *            An array of UnprocessedIdentityId objects, each of which
     *            contains an ErrorCode and IdentityId.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteIdentitiesResult withUnprocessedIdentityIds(
            java.util.Collection<UnprocessedIdentityId> unprocessedIdentityIds) {
        setUnprocessedIdentityIds(unprocessedIdentityIds);
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
        if (getUnprocessedIdentityIds() != null)
            sb.append("UnprocessedIdentityIds: " + getUnprocessedIdentityIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getUnprocessedIdentityIds() == null) ? 0 : getUnprocessedIdentityIds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdentitiesResult == false)
            return false;
        DeleteIdentitiesResult other = (DeleteIdentitiesResult) obj;

        if (other.getUnprocessedIdentityIds() == null ^ this.getUnprocessedIdentityIds() == null)
            return false;
        if (other.getUnprocessedIdentityIds() != null
                && other.getUnprocessedIdentityIds().equals(this.getUnprocessedIdentityIds()) == false)
            return false;
        return true;
    }
}
