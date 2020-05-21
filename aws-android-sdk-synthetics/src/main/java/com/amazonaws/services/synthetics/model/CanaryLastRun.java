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
 * This structure contains information about the most recent run of a single
 * canary.
 * </p>
 */
public class CanaryLastRun implements Serializable {
    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     */
    private String canaryName;

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     */
    private CanaryRun lastRun;

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @return <p>
     *         The name of the canary.
     *         </p>
     */
    public String getCanaryName() {
        return canaryName;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param canaryName <p>
     *            The name of the canary.
     *            </p>
     */
    public void setCanaryName(String canaryName) {
        this.canaryName = canaryName;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param canaryName <p>
     *            The name of the canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryLastRun withCanaryName(String canaryName) {
        this.canaryName = canaryName;
        return this;
    }

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     *
     * @return <p>
     *         The results from this canary's most recent run.
     *         </p>
     */
    public CanaryRun getLastRun() {
        return lastRun;
    }

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     *
     * @param lastRun <p>
     *            The results from this canary's most recent run.
     *            </p>
     */
    public void setLastRun(CanaryRun lastRun) {
        this.lastRun = lastRun;
    }

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastRun <p>
     *            The results from this canary's most recent run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryLastRun withLastRun(CanaryRun lastRun) {
        this.lastRun = lastRun;
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
        if (getCanaryName() != null)
            sb.append("CanaryName: " + getCanaryName() + ",");
        if (getLastRun() != null)
            sb.append("LastRun: " + getLastRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanaryName() == null) ? 0 : getCanaryName().hashCode());
        hashCode = prime * hashCode + ((getLastRun() == null) ? 0 : getLastRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryLastRun == false)
            return false;
        CanaryLastRun other = (CanaryLastRun) obj;

        if (other.getCanaryName() == null ^ this.getCanaryName() == null)
            return false;
        if (other.getCanaryName() != null
                && other.getCanaryName().equals(this.getCanaryName()) == false)
            return false;
        if (other.getLastRun() == null ^ this.getLastRun() == null)
            return false;
        if (other.getLastRun() != null && other.getLastRun().equals(this.getLastRun()) == false)
            return false;
        return true;
    }
}
