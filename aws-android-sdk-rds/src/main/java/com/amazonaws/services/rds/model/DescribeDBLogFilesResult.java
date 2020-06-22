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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * The response from a call to <code>DescribeDBLogFiles</code>.
 * </p>
 */
public class DescribeDBLogFilesResult implements Serializable {
    /**
     * <p>
     * The DB log files returned.
     * </p>
     */
    private java.util.List<DescribeDBLogFilesDetails> describeDBLogFiles;

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBLogFiles
     * request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The DB log files returned.
     * </p>
     *
     * @return <p>
     *         The DB log files returned.
     *         </p>
     */
    public java.util.List<DescribeDBLogFilesDetails> getDescribeDBLogFiles() {
        return describeDBLogFiles;
    }

    /**
     * <p>
     * The DB log files returned.
     * </p>
     *
     * @param describeDBLogFiles <p>
     *            The DB log files returned.
     *            </p>
     */
    public void setDescribeDBLogFiles(
            java.util.Collection<DescribeDBLogFilesDetails> describeDBLogFiles) {
        if (describeDBLogFiles == null) {
            this.describeDBLogFiles = null;
            return;
        }

        this.describeDBLogFiles = new java.util.ArrayList<DescribeDBLogFilesDetails>(
                describeDBLogFiles);
    }

    /**
     * <p>
     * The DB log files returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param describeDBLogFiles <p>
     *            The DB log files returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesResult withDescribeDBLogFiles(
            DescribeDBLogFilesDetails... describeDBLogFiles) {
        if (getDescribeDBLogFiles() == null) {
            this.describeDBLogFiles = new java.util.ArrayList<DescribeDBLogFilesDetails>(
                    describeDBLogFiles.length);
        }
        for (DescribeDBLogFilesDetails value : describeDBLogFiles) {
            this.describeDBLogFiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The DB log files returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param describeDBLogFiles <p>
     *            The DB log files returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesResult withDescribeDBLogFiles(
            java.util.Collection<DescribeDBLogFilesDetails> describeDBLogFiles) {
        setDescribeDBLogFiles(describeDBLogFiles);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBLogFiles
     * request.
     * </p>
     *
     * @return <p>
     *         A pagination token that can be used in a later DescribeDBLogFiles
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBLogFiles
     * request.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            DescribeDBLogFiles request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeDBLogFiles
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            DescribeDBLogFiles request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBLogFilesResult withMarker(String marker) {
        this.marker = marker;
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
        if (getDescribeDBLogFiles() != null)
            sb.append("DescribeDBLogFiles: " + getDescribeDBLogFiles() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescribeDBLogFiles() == null) ? 0 : getDescribeDBLogFiles().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBLogFilesResult == false)
            return false;
        DescribeDBLogFilesResult other = (DescribeDBLogFilesResult) obj;

        if (other.getDescribeDBLogFiles() == null ^ this.getDescribeDBLogFiles() == null)
            return false;
        if (other.getDescribeDBLogFiles() != null
                && other.getDescribeDBLogFiles().equals(this.getDescribeDBLogFiles()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
