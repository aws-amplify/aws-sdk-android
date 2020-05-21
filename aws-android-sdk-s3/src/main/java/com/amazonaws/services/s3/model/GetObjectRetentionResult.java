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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetObjectRetentionResult implements Serializable {
    /**
     * <p>
     * The container element for an object's retention settings.
     * </p>
     */
    private ObjectLockRetention retention;

    /**
     * <p>
     * The container element for an object's retention settings.
     * </p>
     *
     * @return <p>
     *         The container element for an object's retention settings.
     *         </p>
     */
    public ObjectLockRetention getRetention() {
        return retention;
    }

    /**
     * <p>
     * The container element for an object's retention settings.
     * </p>
     *
     * @param retention <p>
     *            The container element for an object's retention settings.
     *            </p>
     */
    public void setRetention(ObjectLockRetention retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * The container element for an object's retention settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retention <p>
     *            The container element for an object's retention settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRetentionResult withRetention(ObjectLockRetention retention) {
        this.retention = retention;
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
        if (getRetention() != null)
            sb.append("Retention: " + getRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectRetentionResult == false)
            return false;
        GetObjectRetentionResult other = (GetObjectRetentionResult) obj;

        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null
                && other.getRetention().equals(this.getRetention()) == false)
            return false;
        return true;
    }
}
