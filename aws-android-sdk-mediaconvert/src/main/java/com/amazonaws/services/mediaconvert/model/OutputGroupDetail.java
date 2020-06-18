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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Contains details about the output groups specified in the job settings.
 */
public class OutputGroupDetail implements Serializable {
    /**
     * Details about the output
     */
    private java.util.List<OutputDetail> outputDetails;

    /**
     * Details about the output
     *
     * @return Details about the output
     */
    public java.util.List<OutputDetail> getOutputDetails() {
        return outputDetails;
    }

    /**
     * Details about the output
     *
     * @param outputDetails Details about the output
     */
    public void setOutputDetails(java.util.Collection<OutputDetail> outputDetails) {
        if (outputDetails == null) {
            this.outputDetails = null;
            return;
        }

        this.outputDetails = new java.util.ArrayList<OutputDetail>(outputDetails);
    }

    /**
     * Details about the output
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDetails Details about the output
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupDetail withOutputDetails(OutputDetail... outputDetails) {
        if (getOutputDetails() == null) {
            this.outputDetails = new java.util.ArrayList<OutputDetail>(outputDetails.length);
        }
        for (OutputDetail value : outputDetails) {
            this.outputDetails.add(value);
        }
        return this;
    }

    /**
     * Details about the output
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDetails Details about the output
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupDetail withOutputDetails(java.util.Collection<OutputDetail> outputDetails) {
        setOutputDetails(outputDetails);
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
        if (getOutputDetails() != null)
            sb.append("OutputDetails: " + getOutputDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputDetails() == null) ? 0 : getOutputDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroupDetail == false)
            return false;
        OutputGroupDetail other = (OutputGroupDetail) obj;

        if (other.getOutputDetails() == null ^ this.getOutputDetails() == null)
            return false;
        if (other.getOutputDetails() != null
                && other.getOutputDetails().equals(this.getOutputDetails()) == false)
            return false;
        return true;
    }
}
