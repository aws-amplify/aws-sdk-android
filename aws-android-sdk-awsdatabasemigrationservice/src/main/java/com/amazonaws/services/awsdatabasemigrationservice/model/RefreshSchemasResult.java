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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class RefreshSchemasResult implements Serializable {
    /**
     * <p>
     * The status of the refreshed schema.
     * </p>
     */
    private RefreshSchemasStatus refreshSchemasStatus;

    /**
     * <p>
     * The status of the refreshed schema.
     * </p>
     *
     * @return <p>
     *         The status of the refreshed schema.
     *         </p>
     */
    public RefreshSchemasStatus getRefreshSchemasStatus() {
        return refreshSchemasStatus;
    }

    /**
     * <p>
     * The status of the refreshed schema.
     * </p>
     *
     * @param refreshSchemasStatus <p>
     *            The status of the refreshed schema.
     *            </p>
     */
    public void setRefreshSchemasStatus(RefreshSchemasStatus refreshSchemasStatus) {
        this.refreshSchemasStatus = refreshSchemasStatus;
    }

    /**
     * <p>
     * The status of the refreshed schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshSchemasStatus <p>
     *            The status of the refreshed schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshSchemasResult withRefreshSchemasStatus(RefreshSchemasStatus refreshSchemasStatus) {
        this.refreshSchemasStatus = refreshSchemasStatus;
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
        if (getRefreshSchemasStatus() != null)
            sb.append("RefreshSchemasStatus: " + getRefreshSchemasStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRefreshSchemasStatus() == null) ? 0 : getRefreshSchemasStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshSchemasResult == false)
            return false;
        RefreshSchemasResult other = (RefreshSchemasResult) obj;

        if (other.getRefreshSchemasStatus() == null ^ this.getRefreshSchemasStatus() == null)
            return false;
        if (other.getRefreshSchemasStatus() != null
                && other.getRefreshSchemasStatus().equals(this.getRefreshSchemasStatus()) == false)
            return false;
        return true;
    }
}
