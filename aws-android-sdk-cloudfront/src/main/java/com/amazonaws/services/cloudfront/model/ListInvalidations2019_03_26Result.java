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
 * The returned result of the corresponding request.
 * </p>
 */
public class ListInvalidations2019_03_26Result implements Serializable {
    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     */
    private InvalidationList invalidationList;

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     *
     * @return <p>
     *         Information about invalidation batches.
     *         </p>
     */
    public InvalidationList getInvalidationList() {
        return invalidationList;
    }

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     *
     * @param invalidationList <p>
     *            Information about invalidation batches.
     *            </p>
     */
    public void setInvalidationList(InvalidationList invalidationList) {
        this.invalidationList = invalidationList;
    }

    /**
     * <p>
     * Information about invalidation batches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidationList <p>
     *            Information about invalidation batches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInvalidations2019_03_26Result withInvalidationList(InvalidationList invalidationList) {
        this.invalidationList = invalidationList;
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
        if (getInvalidationList() != null)
            sb.append("InvalidationList: " + getInvalidationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInvalidationList() == null) ? 0 : getInvalidationList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInvalidations2019_03_26Result == false)
            return false;
        ListInvalidations2019_03_26Result other = (ListInvalidations2019_03_26Result) obj;

        if (other.getInvalidationList() == null ^ this.getInvalidationList() == null)
            return false;
        if (other.getInvalidationList() != null
                && other.getInvalidationList().equals(this.getInvalidationList()) == false)
            return false;
        return true;
    }
}
