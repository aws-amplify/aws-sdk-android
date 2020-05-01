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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

public class DescribeFileSystemsResult implements Serializable {
    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     */
    private java.util.List<FileSystemDescription> fileSystems;

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     *
     * @return <p>
     *         Present if provided by caller in the request (String).
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     *
     * @param marker <p>
     *            Present if provided by caller in the request (String).
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Present if provided by caller in the request (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     *
     * @return <p>
     *         An array of file system descriptions.
     *         </p>
     */
    public java.util.List<FileSystemDescription> getFileSystems() {
        return fileSystems;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     *
     * @param fileSystems <p>
     *            An array of file system descriptions.
     *            </p>
     */
    public void setFileSystems(java.util.Collection<FileSystemDescription> fileSystems) {
        if (fileSystems == null) {
            this.fileSystems = null;
            return;
        }

        this.fileSystems = new java.util.ArrayList<FileSystemDescription>(fileSystems);
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystems <p>
     *            An array of file system descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsResult withFileSystems(FileSystemDescription... fileSystems) {
        if (getFileSystems() == null) {
            this.fileSystems = new java.util.ArrayList<FileSystemDescription>(fileSystems.length);
        }
        for (FileSystemDescription value : fileSystems) {
            this.fileSystems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystems <p>
     *            An array of file system descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsResult withFileSystems(
            java.util.Collection<FileSystemDescription> fileSystems) {
        setFileSystems(fileSystems);
        return this;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     * </p>
     *
     * @return <p>
     *         Present if there are more file systems than returned in the
     *         response (String). You can use the <code>NextMarker</code> in the
     *         subsequent request to fetch the descriptions.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     * </p>
     *
     * @param nextMarker <p>
     *            Present if there are more file systems than returned in the
     *            response (String). You can use the <code>NextMarker</code> in
     *            the subsequent request to fetch the descriptions.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            Present if there are more file systems than returned in the
     *            response (String). You can use the <code>NextMarker</code> in
     *            the subsequent request to fetch the descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getFileSystems() != null)
            sb.append("FileSystems: " + getFileSystems() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystems() == null) ? 0 : getFileSystems().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemsResult == false)
            return false;
        DescribeFileSystemsResult other = (DescribeFileSystemsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getFileSystems() == null ^ this.getFileSystems() == null)
            return false;
        if (other.getFileSystems() != null
                && other.getFileSystems().equals(this.getFileSystems()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
