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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * An execution property of a job.
 * </p>
 */
public class ExecutionProperty implements Serializable {
    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is
     * 1. An error is returned when this threshold is reached. The maximum value
     * you can specify is controlled by a service limit.
     * </p>
     */
    private Integer maxConcurrentRuns;

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is
     * 1. An error is returned when this threshold is reached. The maximum value
     * you can specify is controlled by a service limit.
     * </p>
     *
     * @return <p>
     *         The maximum number of concurrent runs allowed for the job. The
     *         default is 1. An error is returned when this threshold is
     *         reached. The maximum value you can specify is controlled by a
     *         service limit.
     *         </p>
     */
    public Integer getMaxConcurrentRuns() {
        return maxConcurrentRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is
     * 1. An error is returned when this threshold is reached. The maximum value
     * you can specify is controlled by a service limit.
     * </p>
     *
     * @param maxConcurrentRuns <p>
     *            The maximum number of concurrent runs allowed for the job. The
     *            default is 1. An error is returned when this threshold is
     *            reached. The maximum value you can specify is controlled by a
     *            service limit.
     *            </p>
     */
    public void setMaxConcurrentRuns(Integer maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is
     * 1. An error is returned when this threshold is reached. The maximum value
     * you can specify is controlled by a service limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxConcurrentRuns <p>
     *            The maximum number of concurrent runs allowed for the job. The
     *            default is 1. An error is returned when this threshold is
     *            reached. The maximum value you can specify is controlled by a
     *            service limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutionProperty withMaxConcurrentRuns(Integer maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
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
        if (getMaxConcurrentRuns() != null)
            sb.append("MaxConcurrentRuns: " + getMaxConcurrentRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxConcurrentRuns() == null) ? 0 : getMaxConcurrentRuns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionProperty == false)
            return false;
        ExecutionProperty other = (ExecutionProperty) obj;

        if (other.getMaxConcurrentRuns() == null ^ this.getMaxConcurrentRuns() == null)
            return false;
        if (other.getMaxConcurrentRuns() != null
                && other.getMaxConcurrentRuns().equals(this.getMaxConcurrentRuns()) == false)
            return false;
        return true;
    }
}
