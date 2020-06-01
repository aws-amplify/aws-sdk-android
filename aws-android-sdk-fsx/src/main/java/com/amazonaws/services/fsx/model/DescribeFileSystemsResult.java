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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * The response object for <code>DescribeFileSystems</code> operation.
 * </p>
 */
public class DescribeFileSystemsResult implements Serializable {
    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     */
    private java.util.List<FileSystem> fileSystems;

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextToken</code> value in the later
     * request to fetch the descriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     *
     * @return <p>
     *         An array of file system descriptions.
     *         </p>
     */
    public java.util.List<FileSystem> getFileSystems() {
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
    public void setFileSystems(java.util.Collection<FileSystem> fileSystems) {
        if (fileSystems == null) {
            this.fileSystems = null;
            return;
        }

        this.fileSystems = new java.util.ArrayList<FileSystem>(fileSystems);
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
    public DescribeFileSystemsResult withFileSystems(FileSystem... fileSystems) {
        if (getFileSystems() == null) {
            this.fileSystems = new java.util.ArrayList<FileSystem>(fileSystems.length);
        }
        for (FileSystem value : fileSystems) {
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
    public DescribeFileSystemsResult withFileSystems(java.util.Collection<FileSystem> fileSystems) {
        setFileSystems(fileSystems);
        return this;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextToken</code> value in the later
     * request to fetch the descriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @return <p>
     *         Present if there are more file systems than returned in the
     *         response (String). You can use the <code>NextToken</code> value
     *         in the later request to fetch the descriptions.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextToken</code> value in the later
     * request to fetch the descriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            Present if there are more file systems than returned in the
     *            response (String). You can use the <code>NextToken</code>
     *            value in the later request to fetch the descriptions.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response
     * (String). You can use the <code>NextToken</code> value in the later
     * request to fetch the descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            Present if there are more file systems than returned in the
     *            response (String). You can use the <code>NextToken</code>
     *            value in the later request to fetch the descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getFileSystems() != null)
            sb.append("FileSystems: " + getFileSystems() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystems() == null) ? 0 : getFileSystems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

        if (other.getFileSystems() == null ^ this.getFileSystems() == null)
            return false;
        if (other.getFileSystems() != null
                && other.getFileSystems().equals(this.getFileSystems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
