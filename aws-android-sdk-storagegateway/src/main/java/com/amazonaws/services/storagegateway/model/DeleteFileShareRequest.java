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
 * Deletes a file share from a file gateway. This operation is only supported
 * for file gateways.
 * </p>
 */
public class DeleteFileShareRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String fileShareARN;

    /**
     * <p>
     * If this value is set to <code>true</code>, the operation deletes a file
     * share immediately and aborts all data uploads to AWS. Otherwise, the file
     * share is not deleted until all data is uploaded to AWS. This process
     * aborts the data upload process, and the file share enters the
     * <code>FORCE_DELETING</code> status.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file share to be deleted.
     *         </p>
     */
    public String getFileShareARN() {
        return fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share to be
     *            deleted.
     *            </p>
     */
    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share to be
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileShareRequest withFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
        return this;
    }

    /**
     * <p>
     * If this value is set to <code>true</code>, the operation deletes a file
     * share immediately and aborts all data uploads to AWS. Otherwise, the file
     * share is not deleted until all data is uploaded to AWS. This process
     * aborts the data upload process, and the file share enters the
     * <code>FORCE_DELETING</code> status.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         If this value is set to <code>true</code>, the operation deletes
     *         a file share immediately and aborts all data uploads to AWS.
     *         Otherwise, the file share is not deleted until all data is
     *         uploaded to AWS. This process aborts the data upload process, and
     *         the file share enters the <code>FORCE_DELETING</code> status.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * If this value is set to <code>true</code>, the operation deletes a file
     * share immediately and aborts all data uploads to AWS. Otherwise, the file
     * share is not deleted until all data is uploaded to AWS. This process
     * aborts the data upload process, and the file share enters the
     * <code>FORCE_DELETING</code> status.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         If this value is set to <code>true</code>, the operation deletes
     *         a file share immediately and aborts all data uploads to AWS.
     *         Otherwise, the file share is not deleted until all data is
     *         uploaded to AWS. This process aborts the data upload process, and
     *         the file share enters the <code>FORCE_DELETING</code> status.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * If this value is set to <code>true</code>, the operation deletes a file
     * share immediately and aborts all data uploads to AWS. Otherwise, the file
     * share is not deleted until all data is uploaded to AWS. This process
     * aborts the data upload process, and the file share enters the
     * <code>FORCE_DELETING</code> status.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param forceDelete <p>
     *            If this value is set to <code>true</code>, the operation
     *            deletes a file share immediately and aborts all data uploads
     *            to AWS. Otherwise, the file share is not deleted until all
     *            data is uploaded to AWS. This process aborts the data upload
     *            process, and the file share enters the
     *            <code>FORCE_DELETING</code> status.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * If this value is set to <code>true</code>, the operation deletes a file
     * share immediately and aborts all data uploads to AWS. Otherwise, the file
     * share is not deleted until all data is uploaded to AWS. This process
     * aborts the data upload process, and the file share enters the
     * <code>FORCE_DELETING</code> status.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDelete <p>
     *            If this value is set to <code>true</code>, the operation
     *            deletes a file share immediately and aborts all data uploads
     *            to AWS. Otherwise, the file share is not deleted until all
     *            data is uploaded to AWS. This process aborts the data upload
     *            process, and the file share enters the
     *            <code>FORCE_DELETING</code> status.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileShareRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: " + getFileShareARN() + ",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: " + getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode
                + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileShareRequest == false)
            return false;
        DeleteFileShareRequest other = (DeleteFileShareRequest) obj;

        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null
                && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null
                && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }
}
