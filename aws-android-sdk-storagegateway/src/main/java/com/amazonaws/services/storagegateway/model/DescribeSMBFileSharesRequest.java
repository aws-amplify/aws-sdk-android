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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a description for one or more Server Message Block (SMB) file shares
 * from a file gateway. This operation is only supported for file gateways.
 * </p>
 */
public class DescribeSMBFileSharesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to
     * be described.
     * </p>
     */
    private java.util.List<String> fileShareARNList;

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to
     * be described.
     * </p>
     *
     * @return <p>
     *         An array containing the Amazon Resource Name (ARN) of each file
     *         share to be described.
     *         </p>
     */
    public java.util.List<String> getFileShareARNList() {
        return fileShareARNList;
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to
     * be described.
     * </p>
     *
     * @param fileShareARNList <p>
     *            An array containing the Amazon Resource Name (ARN) of each
     *            file share to be described.
     *            </p>
     */
    public void setFileShareARNList(java.util.Collection<String> fileShareARNList) {
        if (fileShareARNList == null) {
            this.fileShareARNList = null;
            return;
        }

        this.fileShareARNList = new java.util.ArrayList<String>(fileShareARNList);
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to
     * be described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileShareARNList <p>
     *            An array containing the Amazon Resource Name (ARN) of each
     *            file share to be described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBFileSharesRequest withFileShareARNList(String... fileShareARNList) {
        if (getFileShareARNList() == null) {
            this.fileShareARNList = new java.util.ArrayList<String>(fileShareARNList.length);
        }
        for (String value : fileShareARNList) {
            this.fileShareARNList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to
     * be described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileShareARNList <p>
     *            An array containing the Amazon Resource Name (ARN) of each
     *            file share to be described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBFileSharesRequest withFileShareARNList(
            java.util.Collection<String> fileShareARNList) {
        setFileShareARNList(fileShareARNList);
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
        if (getFileShareARNList() != null)
            sb.append("FileShareARNList: " + getFileShareARNList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileShareARNList() == null) ? 0 : getFileShareARNList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSMBFileSharesRequest == false)
            return false;
        DescribeSMBFileSharesRequest other = (DescribeSMBFileSharesRequest) obj;

        if (other.getFileShareARNList() == null ^ this.getFileShareARNList() == null)
            return false;
        if (other.getFileShareARNList() != null
                && other.getFileShareARNList().equals(this.getFileShareARNList()) == false)
            return false;
        return true;
    }
}
