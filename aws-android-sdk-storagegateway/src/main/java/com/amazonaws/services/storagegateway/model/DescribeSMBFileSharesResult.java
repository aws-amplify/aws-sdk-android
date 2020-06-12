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
 * DescribeSMBFileSharesOutput
 * </p>
 */
public class DescribeSMBFileSharesResult implements Serializable {
    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     */
    private java.util.List<SMBFileShareInfo> sMBFileShareInfoList;

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     *
     * @return <p>
     *         An array containing a description for each requested file share.
     *         </p>
     */
    public java.util.List<SMBFileShareInfo> getSMBFileShareInfoList() {
        return sMBFileShareInfoList;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     *
     * @param sMBFileShareInfoList <p>
     *            An array containing a description for each requested file
     *            share.
     *            </p>
     */
    public void setSMBFileShareInfoList(java.util.Collection<SMBFileShareInfo> sMBFileShareInfoList) {
        if (sMBFileShareInfoList == null) {
            this.sMBFileShareInfoList = null;
            return;
        }

        this.sMBFileShareInfoList = new java.util.ArrayList<SMBFileShareInfo>(sMBFileShareInfoList);
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMBFileShareInfoList <p>
     *            An array containing a description for each requested file
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBFileSharesResult withSMBFileShareInfoList(
            SMBFileShareInfo... sMBFileShareInfoList) {
        if (getSMBFileShareInfoList() == null) {
            this.sMBFileShareInfoList = new java.util.ArrayList<SMBFileShareInfo>(
                    sMBFileShareInfoList.length);
        }
        for (SMBFileShareInfo value : sMBFileShareInfoList) {
            this.sMBFileShareInfoList.add(value);
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
     * @param sMBFileShareInfoList <p>
     *            An array containing a description for each requested file
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBFileSharesResult withSMBFileShareInfoList(
            java.util.Collection<SMBFileShareInfo> sMBFileShareInfoList) {
        setSMBFileShareInfoList(sMBFileShareInfoList);
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
        if (getSMBFileShareInfoList() != null)
            sb.append("SMBFileShareInfoList: " + getSMBFileShareInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSMBFileShareInfoList() == null) ? 0 : getSMBFileShareInfoList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSMBFileSharesResult == false)
            return false;
        DescribeSMBFileSharesResult other = (DescribeSMBFileSharesResult) obj;

        if (other.getSMBFileShareInfoList() == null ^ this.getSMBFileShareInfoList() == null)
            return false;
        if (other.getSMBFileShareInfoList() != null
                && other.getSMBFileShareInfoList().equals(this.getSMBFileShareInfoList()) == false)
            return false;
        return true;
    }
}
