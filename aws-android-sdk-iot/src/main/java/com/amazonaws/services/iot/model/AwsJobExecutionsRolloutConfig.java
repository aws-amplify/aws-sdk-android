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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration for the rollout of OTA updates.
 * </p>
 */
public class AwsJobExecutionsRolloutConfig implements Serializable {
    /**
     * <p>
     * The maximum number of OTA update job executions started per minute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maximumPerMinute;

    /**
     * <p>
     * The maximum number of OTA update job executions started per minute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of OTA update job executions started per
     *         minute.
     *         </p>
     */
    public Integer getMaximumPerMinute() {
        return maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of OTA update job executions started per minute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maximumPerMinute <p>
     *            The maximum number of OTA update job executions started per
     *            minute.
     *            </p>
     */
    public void setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of OTA update job executions started per minute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maximumPerMinute <p>
     *            The maximum number of OTA update job executions started per
     *            minute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsJobExecutionsRolloutConfig withMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
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
        if (getMaximumPerMinute() != null)
            sb.append("maximumPerMinute: " + getMaximumPerMinute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumPerMinute() == null) ? 0 : getMaximumPerMinute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsJobExecutionsRolloutConfig == false)
            return false;
        AwsJobExecutionsRolloutConfig other = (AwsJobExecutionsRolloutConfig) obj;

        if (other.getMaximumPerMinute() == null ^ this.getMaximumPerMinute() == null)
            return false;
        if (other.getMaximumPerMinute() != null
                && other.getMaximumPerMinute().equals(this.getMaximumPerMinute()) == false)
            return false;
        return true;
    }
}
