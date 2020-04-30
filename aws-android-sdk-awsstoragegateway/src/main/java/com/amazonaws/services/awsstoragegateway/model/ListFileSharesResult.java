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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * ListFileShareOutput
 * </p>
 */
public class ListFileSharesResult implements Serializable {
    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a
     * subsequent request, use <code>NextMarker</code> as the value for
     * <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     */
    private java.util.List<FileShareInfo> fileShareInfoList;

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         If the request includes <code>Marker</code>, the response returns
     *         that value in this field.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            If the request includes <code>Marker</code>, the response
     *            returns that value in this field.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            If the request includes <code>Marker</code>, the response
     *            returns that value in this field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a
     * subsequent request, use <code>NextMarker</code> as the value for
     * <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         If a value is present, there are more file shares to return. In a
     *         subsequent request, use <code>NextMarker</code> as the value for
     *         <code>Marker</code> to retrieve the next set of file shares.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a
     * subsequent request, use <code>NextMarker</code> as the value for
     * <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param nextMarker <p>
     *            If a value is present, there are more file shares to return.
     *            In a subsequent request, use <code>NextMarker</code> as the
     *            value for <code>Marker</code> to retrieve the next set of file
     *            shares.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a
     * subsequent request, use <code>NextMarker</code> as the value for
     * <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param nextMarker <p>
     *            If a value is present, there are more file shares to return.
     *            In a subsequent request, use <code>NextMarker</code> as the
     *            value for <code>Marker</code> to retrieve the next set of file
     *            shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     *
     * @return <p>
     *         An array of information about the file gateway's file shares.
     *         </p>
     */
    public java.util.List<FileShareInfo> getFileShareInfoList() {
        return fileShareInfoList;
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     *
     * @param fileShareInfoList <p>
     *            An array of information about the file gateway's file shares.
     *            </p>
     */
    public void setFileShareInfoList(java.util.Collection<FileShareInfo> fileShareInfoList) {
        if (fileShareInfoList == null) {
            this.fileShareInfoList = null;
            return;
        }

        this.fileShareInfoList = new java.util.ArrayList<FileShareInfo>(fileShareInfoList);
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileShareInfoList <p>
     *            An array of information about the file gateway's file shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesResult withFileShareInfoList(FileShareInfo... fileShareInfoList) {
        if (getFileShareInfoList() == null) {
            this.fileShareInfoList = new java.util.ArrayList<FileShareInfo>(
                    fileShareInfoList.length);
        }
        for (FileShareInfo value : fileShareInfoList) {
            this.fileShareInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileShareInfoList <p>
     *            An array of information about the file gateway's file shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesResult withFileShareInfoList(
            java.util.Collection<FileShareInfo> fileShareInfoList) {
        setFileShareInfoList(fileShareInfoList);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getFileShareInfoList() != null)
            sb.append("FileShareInfoList: " + getFileShareInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareInfoList() == null) ? 0 : getFileShareInfoList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFileSharesResult == false)
            return false;
        ListFileSharesResult other = (ListFileSharesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getFileShareInfoList() == null ^ this.getFileShareInfoList() == null)
            return false;
        if (other.getFileShareInfoList() != null
                && other.getFileShareInfoList().equals(this.getFileShareInfoList()) == false)
            return false;
        return true;
    }
}
