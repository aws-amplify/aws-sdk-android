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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns metadata associated with creating a copy of a resource.
 * </p>
 */
public class DescribeCopyJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     */
    private String copyJobId;

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a copy job.
     *         </p>
     */
    public String getCopyJobId() {
        return copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     *
     * @param copyJobId <p>
     *            Uniquely identifies a copy job.
     *            </p>
     */
    public void setCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyJobId <p>
     *            Uniquely identifies a copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCopyJobRequest withCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
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
        if (getCopyJobId() != null)
            sb.append("CopyJobId: " + getCopyJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyJobId() == null) ? 0 : getCopyJobId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCopyJobRequest == false)
            return false;
        DescribeCopyJobRequest other = (DescribeCopyJobRequest) obj;

        if (other.getCopyJobId() == null ^ this.getCopyJobId() == null)
            return false;
        if (other.getCopyJobId() != null
                && other.getCopyJobId().equals(this.getCopyJobId()) == false)
            return false;
        return true;
    }
}
