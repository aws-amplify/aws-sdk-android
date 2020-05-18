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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeConversionTasksResult implements Serializable {
    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     */
    private java.util.List<ConversionTask> conversionTasks;

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     *
     * @return <p>
     *         Information about the conversion tasks.
     *         </p>
     */
    public java.util.List<ConversionTask> getConversionTasks() {
        return conversionTasks;
    }

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     *
     * @param conversionTasks <p>
     *            Information about the conversion tasks.
     *            </p>
     */
    public void setConversionTasks(java.util.Collection<ConversionTask> conversionTasks) {
        if (conversionTasks == null) {
            this.conversionTasks = null;
            return;
        }

        this.conversionTasks = new java.util.ArrayList<ConversionTask>(conversionTasks);
    }

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversionTasks <p>
     *            Information about the conversion tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConversionTasksResult withConversionTasks(ConversionTask... conversionTasks) {
        if (getConversionTasks() == null) {
            this.conversionTasks = new java.util.ArrayList<ConversionTask>(conversionTasks.length);
        }
        for (ConversionTask value : conversionTasks) {
            this.conversionTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversionTasks <p>
     *            Information about the conversion tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConversionTasksResult withConversionTasks(
            java.util.Collection<ConversionTask> conversionTasks) {
        setConversionTasks(conversionTasks);
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
        if (getConversionTasks() != null)
            sb.append("ConversionTasks: " + getConversionTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConversionTasks() == null) ? 0 : getConversionTasks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConversionTasksResult == false)
            return false;
        DescribeConversionTasksResult other = (DescribeConversionTasksResult) obj;

        if (other.getConversionTasks() == null ^ this.getConversionTasks() == null)
            return false;
        if (other.getConversionTasks() != null
                && other.getConversionTasks().equals(this.getConversionTasks()) == false)
            return false;
        return true;
    }
}
