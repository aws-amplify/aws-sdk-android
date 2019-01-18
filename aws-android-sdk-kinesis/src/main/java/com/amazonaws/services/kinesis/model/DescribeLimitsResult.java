/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

public class DescribeLimitsResult implements Serializable {
    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     */
    private Integer shardLimit;

    /**
     * <p>
     * The number of open shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     */
    private Integer openShardCount;

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @return <p>
     *         The maximum number of shards.
     *         </p>
     */
    public Integer getShardLimit() {
        return shardLimit;
    }

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param shardLimit <p>
     *            The maximum number of shards.
     *            </p>
     */
    public void setShardLimit(Integer shardLimit) {
        this.shardLimit = shardLimit;
    }

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param shardLimit <p>
     *            The maximum number of shards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLimitsResult withShardLimit(Integer shardLimit) {
        this.shardLimit = shardLimit;
        return this;
    }

    /**
     * <p>
     * The number of open shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @return <p>
     *         The number of open shards.
     *         </p>
     */
    public Integer getOpenShardCount() {
        return openShardCount;
    }

    /**
     * <p>
     * The number of open shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param openShardCount <p>
     *            The number of open shards.
     *            </p>
     */
    public void setOpenShardCount(Integer openShardCount) {
        this.openShardCount = openShardCount;
    }

    /**
     * <p>
     * The number of open shards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param openShardCount <p>
     *            The number of open shards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLimitsResult withOpenShardCount(Integer openShardCount) {
        this.openShardCount = openShardCount;
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
        if (getShardLimit() != null)
            sb.append("ShardLimit: " + getShardLimit() + ",");
        if (getOpenShardCount() != null)
            sb.append("OpenShardCount: " + getOpenShardCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardLimit() == null) ? 0 : getShardLimit().hashCode());
        hashCode = prime * hashCode
                + ((getOpenShardCount() == null) ? 0 : getOpenShardCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLimitsResult == false)
            return false;
        DescribeLimitsResult other = (DescribeLimitsResult) obj;

        if (other.getShardLimit() == null ^ this.getShardLimit() == null)
            return false;
        if (other.getShardLimit() != null
                && other.getShardLimit().equals(this.getShardLimit()) == false)
            return false;
        if (other.getOpenShardCount() == null ^ this.getOpenShardCount() == null)
            return false;
        if (other.getOpenShardCount() != null
                && other.getOpenShardCount().equals(this.getOpenShardCount()) == false)
            return false;
        return true;
    }
}
