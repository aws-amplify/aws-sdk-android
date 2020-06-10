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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class DescribeCopyProductStatusResult implements Serializable {
    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED
     */
    private String copyProductStatus;

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String targetProductId;

    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusDetail;

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED
     *
     * @return <p>
     *         The status of the copy product operation.
     *         </p>
     * @see CopyProductStatus
     */
    public String getCopyProductStatus() {
        return copyProductStatus;
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED
     *
     * @param copyProductStatus <p>
     *            The status of the copy product operation.
     *            </p>
     * @see CopyProductStatus
     */
    public void setCopyProductStatus(String copyProductStatus) {
        this.copyProductStatus = copyProductStatus;
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED
     *
     * @param copyProductStatus <p>
     *            The status of the copy product operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyProductStatus
     */
    public DescribeCopyProductStatusResult withCopyProductStatus(String copyProductStatus) {
        this.copyProductStatus = copyProductStatus;
        return this;
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED
     *
     * @param copyProductStatus <p>
     *            The status of the copy product operation.
     *            </p>
     * @see CopyProductStatus
     */
    public void setCopyProductStatus(CopyProductStatus copyProductStatus) {
        this.copyProductStatus = copyProductStatus.toString();
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED
     *
     * @param copyProductStatus <p>
     *            The status of the copy product operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyProductStatus
     */
    public DescribeCopyProductStatusResult withCopyProductStatus(CopyProductStatus copyProductStatus) {
        this.copyProductStatus = copyProductStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the copied product.
     *         </p>
     */
    public String getTargetProductId() {
        return targetProductId;
    }

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param targetProductId <p>
     *            The identifier of the copied product.
     *            </p>
     */
    public void setTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
    }

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param targetProductId <p>
     *            The identifier of the copied product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCopyProductStatusResult withTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     *
     * @return <p>
     *         The status message.
     *         </p>
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * <p>
     * The status message.
     * </p>
     *
     * @param statusDetail <p>
     *            The status message.
     *            </p>
     */
    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusDetail <p>
     *            The status message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCopyProductStatusResult withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
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
        if (getCopyProductStatus() != null)
            sb.append("CopyProductStatus: " + getCopyProductStatus() + ",");
        if (getTargetProductId() != null)
            sb.append("TargetProductId: " + getTargetProductId() + ",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: " + getStatusDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCopyProductStatus() == null) ? 0 : getCopyProductStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTargetProductId() == null) ? 0 : getTargetProductId().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCopyProductStatusResult == false)
            return false;
        DescribeCopyProductStatusResult other = (DescribeCopyProductStatusResult) obj;

        if (other.getCopyProductStatus() == null ^ this.getCopyProductStatus() == null)
            return false;
        if (other.getCopyProductStatus() != null
                && other.getCopyProductStatus().equals(this.getCopyProductStatus()) == false)
            return false;
        if (other.getTargetProductId() == null ^ this.getTargetProductId() == null)
            return false;
        if (other.getTargetProductId() != null
                && other.getTargetProductId().equals(this.getTargetProductId()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null
                && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        return true;
    }
}
