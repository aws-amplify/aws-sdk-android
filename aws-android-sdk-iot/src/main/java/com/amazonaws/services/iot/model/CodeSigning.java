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
 * Describes the method to use when code signing a file.
 * </p>
 */
public class CodeSigning implements Serializable {
    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     */
    private String awsSignerJobId;

    /**
     * <p>
     * Describes the code-signing job.
     * </p>
     */
    private StartSigningJobParameter startSigningJobParameter;

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     */
    private CustomCodeSigning customCodeSigning;

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     *
     * @return <p>
     *         The ID of the AWSSignerJob which was created to sign the file.
     *         </p>
     */
    public String getAwsSignerJobId() {
        return awsSignerJobId;
    }

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     *
     * @param awsSignerJobId <p>
     *            The ID of the AWSSignerJob which was created to sign the file.
     *            </p>
     */
    public void setAwsSignerJobId(String awsSignerJobId) {
        this.awsSignerJobId = awsSignerJobId;
    }

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsSignerJobId <p>
     *            The ID of the AWSSignerJob which was created to sign the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeSigning withAwsSignerJobId(String awsSignerJobId) {
        this.awsSignerJobId = awsSignerJobId;
        return this;
    }

    /**
     * <p>
     * Describes the code-signing job.
     * </p>
     *
     * @return <p>
     *         Describes the code-signing job.
     *         </p>
     */
    public StartSigningJobParameter getStartSigningJobParameter() {
        return startSigningJobParameter;
    }

    /**
     * <p>
     * Describes the code-signing job.
     * </p>
     *
     * @param startSigningJobParameter <p>
     *            Describes the code-signing job.
     *            </p>
     */
    public void setStartSigningJobParameter(StartSigningJobParameter startSigningJobParameter) {
        this.startSigningJobParameter = startSigningJobParameter;
    }

    /**
     * <p>
     * Describes the code-signing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startSigningJobParameter <p>
     *            Describes the code-signing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeSigning withStartSigningJobParameter(
            StartSigningJobParameter startSigningJobParameter) {
        this.startSigningJobParameter = startSigningJobParameter;
        return this;
    }

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     *
     * @return <p>
     *         A custom method for code signing a file.
     *         </p>
     */
    public CustomCodeSigning getCustomCodeSigning() {
        return customCodeSigning;
    }

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     *
     * @param customCodeSigning <p>
     *            A custom method for code signing a file.
     *            </p>
     */
    public void setCustomCodeSigning(CustomCodeSigning customCodeSigning) {
        this.customCodeSigning = customCodeSigning;
    }

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customCodeSigning <p>
     *            A custom method for code signing a file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeSigning withCustomCodeSigning(CustomCodeSigning customCodeSigning) {
        this.customCodeSigning = customCodeSigning;
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
        if (getAwsSignerJobId() != null)
            sb.append("awsSignerJobId: " + getAwsSignerJobId() + ",");
        if (getStartSigningJobParameter() != null)
            sb.append("startSigningJobParameter: " + getStartSigningJobParameter() + ",");
        if (getCustomCodeSigning() != null)
            sb.append("customCodeSigning: " + getCustomCodeSigning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsSignerJobId() == null) ? 0 : getAwsSignerJobId().hashCode());
        hashCode = prime
                * hashCode
                + ((getStartSigningJobParameter() == null) ? 0 : getStartSigningJobParameter()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCustomCodeSigning() == null) ? 0 : getCustomCodeSigning().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigning == false)
            return false;
        CodeSigning other = (CodeSigning) obj;

        if (other.getAwsSignerJobId() == null ^ this.getAwsSignerJobId() == null)
            return false;
        if (other.getAwsSignerJobId() != null
                && other.getAwsSignerJobId().equals(this.getAwsSignerJobId()) == false)
            return false;
        if (other.getStartSigningJobParameter() == null
                ^ this.getStartSigningJobParameter() == null)
            return false;
        if (other.getStartSigningJobParameter() != null
                && other.getStartSigningJobParameter().equals(this.getStartSigningJobParameter()) == false)
            return false;
        if (other.getCustomCodeSigning() == null ^ this.getCustomCodeSigning() == null)
            return false;
        if (other.getCustomCodeSigning() != null
                && other.getCustomCodeSigning().equals(this.getCustomCodeSigning()) == false)
            return false;
        return true;
    }
}
