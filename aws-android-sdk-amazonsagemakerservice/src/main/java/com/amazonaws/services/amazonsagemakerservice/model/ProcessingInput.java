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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The inputs for a processing job.
 * </p>
 */
public class ProcessingInput implements Serializable {
    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     */
    private String inputName;

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     */
    private ProcessingS3Input s3Input;

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     *
     * @return <p>
     *         The name of the inputs for the processing job.
     *         </p>
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     *
     * @param inputName <p>
     *            The name of the inputs for the processing job.
     *            </p>
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the inputs for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputName <p>
     *            The name of the inputs for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingInput withInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     *
     * @return <p>
     *         The S3 inputs for the processing job.
     *         </p>
     */
    public ProcessingS3Input getS3Input() {
        return s3Input;
    }

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     *
     * @param s3Input <p>
     *            The S3 inputs for the processing job.
     *            </p>
     */
    public void setS3Input(ProcessingS3Input s3Input) {
        this.s3Input = s3Input;
    }

    /**
     * <p>
     * The S3 inputs for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Input <p>
     *            The S3 inputs for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingInput withS3Input(ProcessingS3Input s3Input) {
        this.s3Input = s3Input;
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
        if (getInputName() != null)
            sb.append("InputName: " + getInputName() + ",");
        if (getS3Input() != null)
            sb.append("S3Input: " + getS3Input());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getS3Input() == null) ? 0 : getS3Input().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingInput == false)
            return false;
        ProcessingInput other = (ProcessingInput) obj;

        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null
                && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getS3Input() == null ^ this.getS3Input() == null)
            return false;
        if (other.getS3Input() != null && other.getS3Input().equals(this.getS3Input()) == false)
            return false;
        return true;
    }
}
