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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * This data type contains information about the progress event of an operation.
 * </p>
 */
public class ProgressEvent implements Serializable {
    /**
     * <p>
     * The Progress event details.
     * </p>
     */
    private Progress details;

    /**
     * <p>
     * The Progress event details.
     * </p>
     *
     * @return <p>
     *         The Progress event details.
     *         </p>
     */
    public Progress getDetails() {
        return details;
    }

    /**
     * <p>
     * The Progress event details.
     * </p>
     *
     * @param details <p>
     *            The Progress event details.
     *            </p>
     */
    public void setDetails(Progress details) {
        this.details = details;
    }

    /**
     * <p>
     * The Progress event details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            The Progress event details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProgressEvent withDetails(Progress details) {
        this.details = details;
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
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProgressEvent == false)
            return false;
        ProgressEvent other = (ProgressEvent) obj;

        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
