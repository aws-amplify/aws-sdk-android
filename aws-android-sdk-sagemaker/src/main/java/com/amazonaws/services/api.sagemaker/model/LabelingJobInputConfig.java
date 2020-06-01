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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Input configuration information for a labeling job.
 * </p>
 */
public class LabelingJobInputConfig implements Serializable {
    /**
     * <p>
     * The location of the input data.
     * </p>
     */
    private LabelingJobDataSource dataSource;

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     */
    private LabelingJobDataAttributes dataAttributes;

    /**
     * <p>
     * The location of the input data.
     * </p>
     *
     * @return <p>
     *         The location of the input data.
     *         </p>
     */
    public LabelingJobDataSource getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The location of the input data.
     * </p>
     *
     * @param dataSource <p>
     *            The location of the input data.
     *            </p>
     */
    public void setDataSource(LabelingJobDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The location of the input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The location of the input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobInputConfig withDataSource(LabelingJobDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     *
     * @return <p>
     *         Attributes of the data specified by the customer.
     *         </p>
     */
    public LabelingJobDataAttributes getDataAttributes() {
        return dataAttributes;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     *
     * @param dataAttributes <p>
     *            Attributes of the data specified by the customer.
     *            </p>
     */
    public void setDataAttributes(LabelingJobDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataAttributes <p>
     *            Attributes of the data specified by the customer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobInputConfig withDataAttributes(LabelingJobDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
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
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getDataAttributes() != null)
            sb.append("DataAttributes: " + getDataAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDataAttributes() == null) ? 0 : getDataAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobInputConfig == false)
            return false;
        LabelingJobInputConfig other = (LabelingJobInputConfig) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDataAttributes() == null ^ this.getDataAttributes() == null)
            return false;
        if (other.getDataAttributes() != null
                && other.getDataAttributes().equals(this.getDataAttributes()) == false)
            return false;
        return true;
    }
}
