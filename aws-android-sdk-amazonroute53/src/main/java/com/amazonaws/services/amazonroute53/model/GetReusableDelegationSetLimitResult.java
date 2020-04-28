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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the requested limit.
 * </p>
 */
public class GetReusableDelegationSetLimitResult implements Serializable {
    /**
     * <p>
     * The current setting for the limit on hosted zones that you can associate
     * with the specified reusable delegation set.
     * </p>
     */
    private ReusableDelegationSetLimit limit;

    /**
     * <p>
     * The current number of hosted zones that you can associate with the
     * specified reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long count;

    /**
     * <p>
     * The current setting for the limit on hosted zones that you can associate
     * with the specified reusable delegation set.
     * </p>
     *
     * @return <p>
     *         The current setting for the limit on hosted zones that you can
     *         associate with the specified reusable delegation set.
     *         </p>
     */
    public ReusableDelegationSetLimit getLimit() {
        return limit;
    }

    /**
     * <p>
     * The current setting for the limit on hosted zones that you can associate
     * with the specified reusable delegation set.
     * </p>
     *
     * @param limit <p>
     *            The current setting for the limit on hosted zones that you can
     *            associate with the specified reusable delegation set.
     *            </p>
     */
    public void setLimit(ReusableDelegationSetLimit limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The current setting for the limit on hosted zones that you can associate
     * with the specified reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit <p>
     *            The current setting for the limit on hosted zones that you can
     *            associate with the specified reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReusableDelegationSetLimitResult withLimit(ReusableDelegationSetLimit limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The current number of hosted zones that you can associate with the
     * specified reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The current number of hosted zones that you can associate with
     *         the specified reusable delegation set.
     *         </p>
     */
    public Long getCount() {
        return count;
    }

    /**
     * <p>
     * The current number of hosted zones that you can associate with the
     * specified reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param count <p>
     *            The current number of hosted zones that you can associate with
     *            the specified reusable delegation set.
     *            </p>
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The current number of hosted zones that you can associate with the
     * specified reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param count <p>
     *            The current number of hosted zones that you can associate with
     *            the specified reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReusableDelegationSetLimitResult withCount(Long count) {
        this.count = count;
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReusableDelegationSetLimitResult == false)
            return false;
        GetReusableDelegationSetLimitResult other = (GetReusableDelegationSetLimitResult) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
