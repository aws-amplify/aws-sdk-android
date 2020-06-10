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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the product created as the result of a request. For example,
 * the output for a CloudFormation-backed product that creates an S3 bucket
 * would include the S3 bucket URL.
 * </p>
 */
public class RecordOutput implements Serializable {
    /**
     * <p>
     * The output key.
     * </p>
     */
    private String outputKey;

    /**
     * <p>
     * The output value.
     * </p>
     */
    private String outputValue;

    /**
     * <p>
     * The description of the output.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The output key.
     * </p>
     *
     * @return <p>
     *         The output key.
     *         </p>
     */
    public String getOutputKey() {
        return outputKey;
    }

    /**
     * <p>
     * The output key.
     * </p>
     *
     * @param outputKey <p>
     *            The output key.
     *            </p>
     */
    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * The output key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputKey <p>
     *            The output key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordOutput withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * <p>
     * The output value.
     * </p>
     *
     * @return <p>
     *         The output value.
     *         </p>
     */
    public String getOutputValue() {
        return outputValue;
    }

    /**
     * <p>
     * The output value.
     * </p>
     *
     * @param outputValue <p>
     *            The output value.
     *            </p>
     */
    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputValue <p>
     *            The output value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordOutput withOutputValue(String outputValue) {
        this.outputValue = outputValue;
        return this;
    }

    /**
     * <p>
     * The description of the output.
     * </p>
     *
     * @return <p>
     *         The description of the output.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the output.
     * </p>
     *
     * @param description <p>
     *            The description of the output.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordOutput withDescription(String description) {
        this.description = description;
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
        if (getOutputKey() != null)
            sb.append("OutputKey: " + getOutputKey() + ",");
        if (getOutputValue() != null)
            sb.append("OutputValue: " + getOutputValue() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode
                + ((getOutputValue() == null) ? 0 : getOutputValue().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordOutput == false)
            return false;
        RecordOutput other = (RecordOutput) obj;

        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null
                && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputValue() == null ^ this.getOutputValue() == null)
            return false;
        if (other.getOutputValue() != null
                && other.getOutputValue().equals(this.getOutputValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
