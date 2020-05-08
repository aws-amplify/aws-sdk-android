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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A time limit for how long the monitoring job is allowed to run before
 * stopping.
 * </p>
 */
public class MonitoringStoppingCondition implements Serializable {
    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     */
    private Integer maxRuntimeInSeconds;

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @return <p>
     *         The maximum runtime allowed in seconds.
     *         </p>
     */
    public Integer getMaxRuntimeInSeconds() {
        return maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param maxRuntimeInSeconds <p>
     *            The maximum runtime allowed in seconds.
     *            </p>
     */
    public void setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param maxRuntimeInSeconds <p>
     *            The maximum runtime allowed in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringStoppingCondition withMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
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
        if (getMaxRuntimeInSeconds() != null)
            sb.append("MaxRuntimeInSeconds: " + getMaxRuntimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxRuntimeInSeconds() == null) ? 0 : getMaxRuntimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringStoppingCondition == false)
            return false;
        MonitoringStoppingCondition other = (MonitoringStoppingCondition) obj;

        if (other.getMaxRuntimeInSeconds() == null ^ this.getMaxRuntimeInSeconds() == null)
            return false;
        if (other.getMaxRuntimeInSeconds() != null
                && other.getMaxRuntimeInSeconds().equals(this.getMaxRuntimeInSeconds()) == false)
            return false;
        return true;
    }
}
