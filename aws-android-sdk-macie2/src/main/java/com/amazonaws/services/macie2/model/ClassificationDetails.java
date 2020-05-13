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
 * Provides information about a sensitive data finding, including the
 * classification job that produced the finding.
 * </p>
 */
public class ClassificationDetails implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file that contains the detailed
     * record, including offsets, for the finding.
     * </p>
     */
    private String detailedResultsLocation;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced
     * the finding.
     * </p>
     */
    private String jobArn;

    /**
     * <p>
     * The unique identifier for the classification job that produced the
     * finding.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The status and detailed results of the finding.
     * </p>
     */
    private ClassificationResult result;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file that contains the detailed
     * record, including offsets, for the finding.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file that contains the
     *         detailed record, including offsets, for the finding.
     *         </p>
     */
    public String getDetailedResultsLocation() {
        return detailedResultsLocation;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file that contains the detailed
     * record, including offsets, for the finding.
     * </p>
     *
     * @param detailedResultsLocation <p>
     *            The Amazon Resource Name (ARN) of the file that contains the
     *            detailed record, including offsets, for the finding.
     *            </p>
     */
    public void setDetailedResultsLocation(String detailedResultsLocation) {
        this.detailedResultsLocation = detailedResultsLocation;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file that contains the detailed
     * record, including offsets, for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detailedResultsLocation <p>
     *            The Amazon Resource Name (ARN) of the file that contains the
     *            detailed record, including offsets, for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationDetails withDetailedResultsLocation(String detailedResultsLocation) {
        this.detailedResultsLocation = detailedResultsLocation;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced
     * the finding.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the classification job that
     *         produced the finding.
     *         </p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced
     * the finding.
     * </p>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) of the classification job that
     *            produced the finding.
     *            </p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced
     * the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) of the classification job that
     *            produced the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationDetails withJobArn(String jobArn) {
        this.jobArn = jobArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the classification job that produced the
     * finding.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the classification job that produced
     *         the finding.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job that produced the
     * finding.
     * </p>
     *
     * @param jobId <p>
     *            The unique identifier for the classification job that produced
     *            the finding.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job that produced the
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobId <p>
     *            The unique identifier for the classification job that produced
     *            the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationDetails withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The status and detailed results of the finding.
     * </p>
     *
     * @return <p>
     *         The status and detailed results of the finding.
     *         </p>
     */
    public ClassificationResult getResult() {
        return result;
    }

    /**
     * <p>
     * The status and detailed results of the finding.
     * </p>
     *
     * @param result <p>
     *            The status and detailed results of the finding.
     *            </p>
     */
    public void setResult(ClassificationResult result) {
        this.result = result;
    }

    /**
     * <p>
     * The status and detailed results of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param result <p>
     *            The status and detailed results of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationDetails withResult(ClassificationResult result) {
        this.result = result;
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
        if (getDetailedResultsLocation() != null)
            sb.append("detailedResultsLocation: " + getDetailedResultsLocation() + ",");
        if (getJobArn() != null)
            sb.append("jobArn: " + getJobArn() + ",");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getResult() != null)
            sb.append("result: " + getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDetailedResultsLocation() == null) ? 0 : getDetailedResultsLocation()
                        .hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationDetails == false)
            return false;
        ClassificationDetails other = (ClassificationDetails) obj;

        if (other.getDetailedResultsLocation() == null ^ this.getDetailedResultsLocation() == null)
            return false;
        if (other.getDetailedResultsLocation() != null
                && other.getDetailedResultsLocation().equals(this.getDetailedResultsLocation()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }
}
