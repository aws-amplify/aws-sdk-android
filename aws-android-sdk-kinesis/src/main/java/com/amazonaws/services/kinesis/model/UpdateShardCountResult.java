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

public class UpdateShardCountResult implements Serializable {
    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The current number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     */
    private Integer currentShardCount;

    /**
     * <p>
     * The updated number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     */
    private Integer targetShardCount;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateShardCountResult withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The current number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The current number of shards.
     *         </p>
     */
    public Integer getCurrentShardCount() {
        return currentShardCount;
    }

    /**
     * <p>
     * The current number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param currentShardCount <p>
     *            The current number of shards.
     *            </p>
     */
    public void setCurrentShardCount(Integer currentShardCount) {
        this.currentShardCount = currentShardCount;
    }

    /**
     * <p>
     * The current number of shards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param currentShardCount <p>
     *            The current number of shards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateShardCountResult withCurrentShardCount(Integer currentShardCount) {
        this.currentShardCount = currentShardCount;
        return this;
    }

    /**
     * <p>
     * The updated number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The updated number of shards.
     *         </p>
     */
    public Integer getTargetShardCount() {
        return targetShardCount;
    }

    /**
     * <p>
     * The updated number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param targetShardCount <p>
     *            The updated number of shards.
     *            </p>
     */
    public void setTargetShardCount(Integer targetShardCount) {
        this.targetShardCount = targetShardCount;
    }

    /**
     * <p>
     * The updated number of shards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param targetShardCount <p>
     *            The updated number of shards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateShardCountResult withTargetShardCount(Integer targetShardCount) {
        this.targetShardCount = targetShardCount;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getCurrentShardCount() != null)
            sb.append("CurrentShardCount: " + getCurrentShardCount() + ",");
        if (getTargetShardCount() != null)
            sb.append("TargetShardCount: " + getTargetShardCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentShardCount() == null) ? 0 : getCurrentShardCount().hashCode());
        hashCode = prime * hashCode
                + ((getTargetShardCount() == null) ? 0 : getTargetShardCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateShardCountResult == false)
            return false;
        UpdateShardCountResult other = (UpdateShardCountResult) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getCurrentShardCount() == null ^ this.getCurrentShardCount() == null)
            return false;
        if (other.getCurrentShardCount() != null
                && other.getCurrentShardCount().equals(this.getCurrentShardCount()) == false)
            return false;
        if (other.getTargetShardCount() == null ^ this.getTargetShardCount() == null)
            return false;
        if (other.getTargetShardCount() != null
                && other.getTargetShardCount().equals(this.getTargetShardCount()) == false)
            return false;
        return true;
    }
}
