/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration details that include the maximum size of the media (
 * <code>MaxLocalMediaSizeInMB</code>) that you want to store for a stream on
 * the Edge Agent, as well as the strategy that should be used (
 * <code>StrategyOnFullSize</code>) when a stream's maximum size has been
 * reached.
 * </p>
 */
public class LocalSizeConfig implements Serializable {
    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream
     * on the Edge Agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 2000000<br/>
     */
    private Integer maxLocalMediaSizeInMB;

    /**
     * <p>
     * The strategy to perform when a stream’s
     * <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_OLDEST_MEDIA, DENY_NEW_MEDIA
     */
    private String strategyOnFullSize;

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream
     * on the Edge Agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 2000000<br/>
     *
     * @return <p>
     *         The overall maximum size of the media that you want to store for
     *         a stream on the Edge Agent.
     *         </p>
     */
    public Integer getMaxLocalMediaSizeInMB() {
        return maxLocalMediaSizeInMB;
    }

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream
     * on the Edge Agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 2000000<br/>
     *
     * @param maxLocalMediaSizeInMB <p>
     *            The overall maximum size of the media that you want to store
     *            for a stream on the Edge Agent.
     *            </p>
     */
    public void setMaxLocalMediaSizeInMB(Integer maxLocalMediaSizeInMB) {
        this.maxLocalMediaSizeInMB = maxLocalMediaSizeInMB;
    }

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream
     * on the Edge Agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 2000000<br/>
     *
     * @param maxLocalMediaSizeInMB <p>
     *            The overall maximum size of the media that you want to store
     *            for a stream on the Edge Agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSizeConfig withMaxLocalMediaSizeInMB(Integer maxLocalMediaSizeInMB) {
        this.maxLocalMediaSizeInMB = maxLocalMediaSizeInMB;
        return this;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s
     * <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_OLDEST_MEDIA, DENY_NEW_MEDIA
     *
     * @return <p>
     *         The strategy to perform when a stream’s
     *         <code>MaxLocalMediaSizeInMB</code> limit is reached.
     *         </p>
     * @see StrategyOnFullSize
     */
    public String getStrategyOnFullSize() {
        return strategyOnFullSize;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s
     * <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_OLDEST_MEDIA, DENY_NEW_MEDIA
     *
     * @param strategyOnFullSize <p>
     *            The strategy to perform when a stream’s
     *            <code>MaxLocalMediaSizeInMB</code> limit is reached.
     *            </p>
     * @see StrategyOnFullSize
     */
    public void setStrategyOnFullSize(String strategyOnFullSize) {
        this.strategyOnFullSize = strategyOnFullSize;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s
     * <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_OLDEST_MEDIA, DENY_NEW_MEDIA
     *
     * @param strategyOnFullSize <p>
     *            The strategy to perform when a stream’s
     *            <code>MaxLocalMediaSizeInMB</code> limit is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StrategyOnFullSize
     */
    public LocalSizeConfig withStrategyOnFullSize(String strategyOnFullSize) {
        this.strategyOnFullSize = strategyOnFullSize;
        return this;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s
     * <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_OLDEST_MEDIA, DENY_NEW_MEDIA
     *
     * @param strategyOnFullSize <p>
     *            The strategy to perform when a stream’s
     *            <code>MaxLocalMediaSizeInMB</code> limit is reached.
     *            </p>
     * @see StrategyOnFullSize
     */
    public void setStrategyOnFullSize(StrategyOnFullSize strategyOnFullSize) {
        this.strategyOnFullSize = strategyOnFullSize.toString();
    }

    /**
     * <p>
     * The strategy to perform when a stream’s
     * <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_OLDEST_MEDIA, DENY_NEW_MEDIA
     *
     * @param strategyOnFullSize <p>
     *            The strategy to perform when a stream’s
     *            <code>MaxLocalMediaSizeInMB</code> limit is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StrategyOnFullSize
     */
    public LocalSizeConfig withStrategyOnFullSize(StrategyOnFullSize strategyOnFullSize) {
        this.strategyOnFullSize = strategyOnFullSize.toString();
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
        if (getMaxLocalMediaSizeInMB() != null)
            sb.append("MaxLocalMediaSizeInMB: " + getMaxLocalMediaSizeInMB() + ",");
        if (getStrategyOnFullSize() != null)
            sb.append("StrategyOnFullSize: " + getStrategyOnFullSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaxLocalMediaSizeInMB() == null) ? 0 : getMaxLocalMediaSizeInMB().hashCode());
        hashCode = prime * hashCode
                + ((getStrategyOnFullSize() == null) ? 0 : getStrategyOnFullSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalSizeConfig == false)
            return false;
        LocalSizeConfig other = (LocalSizeConfig) obj;

        if (other.getMaxLocalMediaSizeInMB() == null ^ this.getMaxLocalMediaSizeInMB() == null)
            return false;
        if (other.getMaxLocalMediaSizeInMB() != null
                && other.getMaxLocalMediaSizeInMB().equals(this.getMaxLocalMediaSizeInMB()) == false)
            return false;
        if (other.getStrategyOnFullSize() == null ^ this.getStrategyOnFullSize() == null)
            return false;
        if (other.getStrategyOnFullSize() != null
                && other.getStrategyOnFullSize().equals(this.getStrategyOnFullSize()) == false)
            return false;
        return true;
    }
}
