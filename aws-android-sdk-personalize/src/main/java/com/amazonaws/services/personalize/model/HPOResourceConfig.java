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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the resource configuration for hyperparameter optimization (HPO).
 * </p>
 */
public class HPOResourceConfig implements Serializable {
    /**
     * <p>
     * The maximum number of training jobs when you create a solution version.
     * The maximum value for <code>maxNumberOfTrainingJobs</code> is
     * <code>40</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String maxNumberOfTrainingJobs;

    /**
     * <p>
     * The maximum number of parallel training jobs when you create a solution
     * version. The maximum value for <code>maxParallelTrainingJobs</code> is
     * <code>10</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String maxParallelTrainingJobs;

    /**
     * <p>
     * The maximum number of training jobs when you create a solution version.
     * The maximum value for <code>maxNumberOfTrainingJobs</code> is
     * <code>40</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The maximum number of training jobs when you create a solution
     *         version. The maximum value for
     *         <code>maxNumberOfTrainingJobs</code> is <code>40</code>.
     *         </p>
     */
    public String getMaxNumberOfTrainingJobs() {
        return maxNumberOfTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of training jobs when you create a solution version.
     * The maximum value for <code>maxNumberOfTrainingJobs</code> is
     * <code>40</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param maxNumberOfTrainingJobs <p>
     *            The maximum number of training jobs when you create a solution
     *            version. The maximum value for
     *            <code>maxNumberOfTrainingJobs</code> is <code>40</code>.
     *            </p>
     */
    public void setMaxNumberOfTrainingJobs(String maxNumberOfTrainingJobs) {
        this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of training jobs when you create a solution version.
     * The maximum value for <code>maxNumberOfTrainingJobs</code> is
     * <code>40</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param maxNumberOfTrainingJobs <p>
     *            The maximum number of training jobs when you create a solution
     *            version. The maximum value for
     *            <code>maxNumberOfTrainingJobs</code> is <code>40</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOResourceConfig withMaxNumberOfTrainingJobs(String maxNumberOfTrainingJobs) {
        this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel training jobs when you create a solution
     * version. The maximum value for <code>maxParallelTrainingJobs</code> is
     * <code>10</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The maximum number of parallel training jobs when you create a
     *         solution version. The maximum value for
     *         <code>maxParallelTrainingJobs</code> is <code>10</code>.
     *         </p>
     */
    public String getMaxParallelTrainingJobs() {
        return maxParallelTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of parallel training jobs when you create a solution
     * version. The maximum value for <code>maxParallelTrainingJobs</code> is
     * <code>10</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param maxParallelTrainingJobs <p>
     *            The maximum number of parallel training jobs when you create a
     *            solution version. The maximum value for
     *            <code>maxParallelTrainingJobs</code> is <code>10</code>.
     *            </p>
     */
    public void setMaxParallelTrainingJobs(String maxParallelTrainingJobs) {
        this.maxParallelTrainingJobs = maxParallelTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of parallel training jobs when you create a solution
     * version. The maximum value for <code>maxParallelTrainingJobs</code> is
     * <code>10</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param maxParallelTrainingJobs <p>
     *            The maximum number of parallel training jobs when you create a
     *            solution version. The maximum value for
     *            <code>maxParallelTrainingJobs</code> is <code>10</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOResourceConfig withMaxParallelTrainingJobs(String maxParallelTrainingJobs) {
        this.maxParallelTrainingJobs = maxParallelTrainingJobs;
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
        if (getMaxNumberOfTrainingJobs() != null)
            sb.append("maxNumberOfTrainingJobs: " + getMaxNumberOfTrainingJobs() + ",");
        if (getMaxParallelTrainingJobs() != null)
            sb.append("maxParallelTrainingJobs: " + getMaxParallelTrainingJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaxNumberOfTrainingJobs() == null) ? 0 : getMaxNumberOfTrainingJobs()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxParallelTrainingJobs() == null) ? 0 : getMaxParallelTrainingJobs()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HPOResourceConfig == false)
            return false;
        HPOResourceConfig other = (HPOResourceConfig) obj;

        if (other.getMaxNumberOfTrainingJobs() == null ^ this.getMaxNumberOfTrainingJobs() == null)
            return false;
        if (other.getMaxNumberOfTrainingJobs() != null
                && other.getMaxNumberOfTrainingJobs().equals(this.getMaxNumberOfTrainingJobs()) == false)
            return false;
        if (other.getMaxParallelTrainingJobs() == null ^ this.getMaxParallelTrainingJobs() == null)
            return false;
        if (other.getMaxParallelTrainingJobs() != null
                && other.getMaxParallelTrainingJobs().equals(this.getMaxParallelTrainingJobs()) == false)
            return false;
        return true;
    }
}
