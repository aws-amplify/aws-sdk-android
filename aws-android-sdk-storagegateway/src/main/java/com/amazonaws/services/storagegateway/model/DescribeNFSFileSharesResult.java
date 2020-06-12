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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * DescribeNFSFileSharesOutput
 * </p>
 */
public class DescribeNFSFileSharesResult implements Serializable {
    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     */
    private java.util.List<NFSFileShareInfo> nFSFileShareInfoList;

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     *
     * @return <p>
     *         An array containing a description for each requested file share.
     *         </p>
     */
    public java.util.List<NFSFileShareInfo> getNFSFileShareInfoList() {
        return nFSFileShareInfoList;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     *
     * @param nFSFileShareInfoList <p>
     *            An array containing a description for each requested file
     *            share.
     *            </p>
     */
    public void setNFSFileShareInfoList(java.util.Collection<NFSFileShareInfo> nFSFileShareInfoList) {
        if (nFSFileShareInfoList == null) {
            this.nFSFileShareInfoList = null;
            return;
        }

        this.nFSFileShareInfoList = new java.util.ArrayList<NFSFileShareInfo>(nFSFileShareInfoList);
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nFSFileShareInfoList <p>
     *            An array containing a description for each requested file
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNFSFileSharesResult withNFSFileShareInfoList(
            NFSFileShareInfo... nFSFileShareInfoList) {
        if (getNFSFileShareInfoList() == null) {
            this.nFSFileShareInfoList = new java.util.ArrayList<NFSFileShareInfo>(
                    nFSFileShareInfoList.length);
        }
        for (NFSFileShareInfo value : nFSFileShareInfoList) {
            this.nFSFileShareInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nFSFileShareInfoList <p>
     *            An array containing a description for each requested file
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNFSFileSharesResult withNFSFileShareInfoList(
            java.util.Collection<NFSFileShareInfo> nFSFileShareInfoList) {
        setNFSFileShareInfoList(nFSFileShareInfoList);
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
        if (getNFSFileShareInfoList() != null)
            sb.append("NFSFileShareInfoList: " + getNFSFileShareInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNFSFileShareInfoList() == null) ? 0 : getNFSFileShareInfoList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNFSFileSharesResult == false)
            return false;
        DescribeNFSFileSharesResult other = (DescribeNFSFileSharesResult) obj;

        if (other.getNFSFileShareInfoList() == null ^ this.getNFSFileShareInfoList() == null)
            return false;
        if (other.getNFSFileShareInfoList() != null
                && other.getNFSFileShareInfoList().equals(this.getNFSFileShareInfoList()) == false)
            return false;
        return true;
    }
}
