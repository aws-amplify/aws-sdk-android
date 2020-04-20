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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that contains information for a canary run.
 * </p>
 */
public class CanaryRunConfigOutput implements Serializable {
    /**
     * <p>
     * How long the canary is allowed to run before it must stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 900<br/>
     */
    private Integer timeoutInSeconds;

    /**
     * <p>
     * How long the canary is allowed to run before it must stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 900<br/>
     *
     * @return <p>
     *         How long the canary is allowed to run before it must stop.
     *         </p>
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * <p>
     * How long the canary is allowed to run before it must stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 900<br/>
     *
     * @param timeoutInSeconds <p>
     *            How long the canary is allowed to run before it must stop.
     *            </p>
     */
    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * How long the canary is allowed to run before it must stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 900<br/>
     *
     * @param timeoutInSeconds <p>
     *            How long the canary is allowed to run before it must stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRunConfigOutput withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
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
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: " + getTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRunConfigOutput == false)
            return false;
        CanaryRunConfigOutput other = (CanaryRunConfigOutput) obj;

        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null
                && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        return true;
    }
}
