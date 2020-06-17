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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

public class GetSnowballUsageResult implements Serializable {
    /**
     * <p>
     * The service limit for number of Snowballs this account can have at once.
     * The default service limit is 1 (one).
     * </p>
     */
    private Integer snowballLimit;

    /**
     * <p>
     * The number of Snowballs that this account is currently using.
     * </p>
     */
    private Integer snowballsInUse;

    /**
     * <p>
     * The service limit for number of Snowballs this account can have at once.
     * The default service limit is 1 (one).
     * </p>
     *
     * @return <p>
     *         The service limit for number of Snowballs this account can have
     *         at once. The default service limit is 1 (one).
     *         </p>
     */
    public Integer getSnowballLimit() {
        return snowballLimit;
    }

    /**
     * <p>
     * The service limit for number of Snowballs this account can have at once.
     * The default service limit is 1 (one).
     * </p>
     *
     * @param snowballLimit <p>
     *            The service limit for number of Snowballs this account can
     *            have at once. The default service limit is 1 (one).
     *            </p>
     */
    public void setSnowballLimit(Integer snowballLimit) {
        this.snowballLimit = snowballLimit;
    }

    /**
     * <p>
     * The service limit for number of Snowballs this account can have at once.
     * The default service limit is 1 (one).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snowballLimit <p>
     *            The service limit for number of Snowballs this account can
     *            have at once. The default service limit is 1 (one).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSnowballUsageResult withSnowballLimit(Integer snowballLimit) {
        this.snowballLimit = snowballLimit;
        return this;
    }

    /**
     * <p>
     * The number of Snowballs that this account is currently using.
     * </p>
     *
     * @return <p>
     *         The number of Snowballs that this account is currently using.
     *         </p>
     */
    public Integer getSnowballsInUse() {
        return snowballsInUse;
    }

    /**
     * <p>
     * The number of Snowballs that this account is currently using.
     * </p>
     *
     * @param snowballsInUse <p>
     *            The number of Snowballs that this account is currently using.
     *            </p>
     */
    public void setSnowballsInUse(Integer snowballsInUse) {
        this.snowballsInUse = snowballsInUse;
    }

    /**
     * <p>
     * The number of Snowballs that this account is currently using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snowballsInUse <p>
     *            The number of Snowballs that this account is currently using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSnowballUsageResult withSnowballsInUse(Integer snowballsInUse) {
        this.snowballsInUse = snowballsInUse;
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
        if (getSnowballLimit() != null)
            sb.append("SnowballLimit: " + getSnowballLimit() + ",");
        if (getSnowballsInUse() != null)
            sb.append("SnowballsInUse: " + getSnowballsInUse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnowballLimit() == null) ? 0 : getSnowballLimit().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballsInUse() == null) ? 0 : getSnowballsInUse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSnowballUsageResult == false)
            return false;
        GetSnowballUsageResult other = (GetSnowballUsageResult) obj;

        if (other.getSnowballLimit() == null ^ this.getSnowballLimit() == null)
            return false;
        if (other.getSnowballLimit() != null
                && other.getSnowballLimit().equals(this.getSnowballLimit()) == false)
            return false;
        if (other.getSnowballsInUse() == null ^ this.getSnowballsInUse() == null)
            return false;
        if (other.getSnowballsInUse() != null
                && other.getSnowballsInUse().equals(this.getSnowballsInUse()) == false)
            return false;
        return true;
    }
}
