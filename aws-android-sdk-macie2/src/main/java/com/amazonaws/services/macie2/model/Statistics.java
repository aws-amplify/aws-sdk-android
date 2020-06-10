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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides processing statistics for a classification job.
 * </p>
 */
public class Statistics implements Serializable {
    /**
     * <p>
     * The approximate number of objects that the job has yet to process during
     * its current run.
     * </p>
     */
    private Double approximateNumberOfObjectsToProcess;

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     */
    private Double numberOfRuns;

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during
     * its current run.
     * </p>
     *
     * @return <p>
     *         The approximate number of objects that the job has yet to process
     *         during its current run.
     *         </p>
     */
    public Double getApproximateNumberOfObjectsToProcess() {
        return approximateNumberOfObjectsToProcess;
    }

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during
     * its current run.
     * </p>
     *
     * @param approximateNumberOfObjectsToProcess <p>
     *            The approximate number of objects that the job has yet to
     *            process during its current run.
     *            </p>
     */
    public void setApproximateNumberOfObjectsToProcess(Double approximateNumberOfObjectsToProcess) {
        this.approximateNumberOfObjectsToProcess = approximateNumberOfObjectsToProcess;
    }

    /**
     * <p>
     * The approximate number of objects that the job has yet to process during
     * its current run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateNumberOfObjectsToProcess <p>
     *            The approximate number of objects that the job has yet to
     *            process during its current run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withApproximateNumberOfObjectsToProcess(
            Double approximateNumberOfObjectsToProcess) {
        this.approximateNumberOfObjectsToProcess = approximateNumberOfObjectsToProcess;
        return this;
    }

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     *
     * @return <p>
     *         The number of times that the job has run.
     *         </p>
     */
    public Double getNumberOfRuns() {
        return numberOfRuns;
    }

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     *
     * @param numberOfRuns <p>
     *            The number of times that the job has run.
     *            </p>
     */
    public void setNumberOfRuns(Double numberOfRuns) {
        this.numberOfRuns = numberOfRuns;
    }

    /**
     * <p>
     * The number of times that the job has run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfRuns <p>
     *            The number of times that the job has run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withNumberOfRuns(Double numberOfRuns) {
        this.numberOfRuns = numberOfRuns;
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
        if (getApproximateNumberOfObjectsToProcess() != null)
            sb.append("approximateNumberOfObjectsToProcess: "
                    + getApproximateNumberOfObjectsToProcess() + ",");
        if (getNumberOfRuns() != null)
            sb.append("numberOfRuns: " + getNumberOfRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApproximateNumberOfObjectsToProcess() == null) ? 0
                        : getApproximateNumberOfObjectsToProcess().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfRuns() == null) ? 0 : getNumberOfRuns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;

        if (other.getApproximateNumberOfObjectsToProcess() == null
                ^ this.getApproximateNumberOfObjectsToProcess() == null)
            return false;
        if (other.getApproximateNumberOfObjectsToProcess() != null
                && other.getApproximateNumberOfObjectsToProcess().equals(
                        this.getApproximateNumberOfObjectsToProcess()) == false)
            return false;
        if (other.getNumberOfRuns() == null ^ this.getNumberOfRuns() == null)
            return false;
        if (other.getNumberOfRuns() != null
                && other.getNumberOfRuns().equals(this.getNumberOfRuns()) == false)
            return false;
        return true;
    }
}
