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
 * Describes a file share.
 * </p>
 */
public class FileShareInfo implements Serializable {
    /**
     * <p>
     * The type of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NFS, SMB
     */
    private String fileShareType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String fileShareARN;

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String fileShareId;

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String fileShareStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The type of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NFS, SMB
     *
     * @return <p>
     *         The type of the file share.
     *         </p>
     * @see FileShareType
     */
    public String getFileShareType() {
        return fileShareType;
    }

    /**
     * <p>
     * The type of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NFS, SMB
     *
     * @param fileShareType <p>
     *            The type of the file share.
     *            </p>
     * @see FileShareType
     */
    public void setFileShareType(String fileShareType) {
        this.fileShareType = fileShareType;
    }

    /**
     * <p>
     * The type of the file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NFS, SMB
     *
     * @param fileShareType <p>
     *            The type of the file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileShareType
     */
    public FileShareInfo withFileShareType(String fileShareType) {
        this.fileShareType = fileShareType;
        return this;
    }

    /**
     * <p>
     * The type of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NFS, SMB
     *
     * @param fileShareType <p>
     *            The type of the file share.
     *            </p>
     * @see FileShareType
     */
    public void setFileShareType(FileShareType fileShareType) {
        this.fileShareType = fileShareType.toString();
    }

    /**
     * <p>
     * The type of the file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NFS, SMB
     *
     * @param fileShareType <p>
     *            The type of the file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileShareType
     */
    public FileShareInfo withFileShareType(FileShareType fileShareType) {
        this.fileShareType = fileShareType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file share.
     *         </p>
     */
    public String getFileShareARN() {
        return fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share.
     *            </p>
     */
    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileShareInfo withFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
        return this;
    }

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The ID of the file share.
     *         </p>
     */
    public String getFileShareId() {
        return fileShareId;
    }

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param fileShareId <p>
     *            The ID of the file share.
     *            </p>
     */
    public void setFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
    }

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param fileShareId <p>
     *            The ID of the file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileShareInfo withFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
        return this;
    }

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>
     *         The status of the file share. Possible values are
     *         <code>CREATING</code>, <code>UPDATING</code>,
     *         <code>AVAILABLE</code> and <code>DELETING</code>.
     *         </p>
     */
    public String getFileShareStatus() {
        return fileShareStatus;
    }

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param fileShareStatus <p>
     *            The status of the file share. Possible values are
     *            <code>CREATING</code>, <code>UPDATING</code>,
     *            <code>AVAILABLE</code> and <code>DELETING</code>.
     *            </p>
     */
    public void setFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
    }

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param fileShareStatus <p>
     *            The status of the file share. Possible values are
     *            <code>CREATING</code>, <code>UPDATING</code>,
     *            <code>AVAILABLE</code> and <code>DELETING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileShareInfo withFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileShareInfo withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
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
        if (getFileShareType() != null)
            sb.append("FileShareType: " + getFileShareType() + ",");
        if (getFileShareARN() != null)
            sb.append("FileShareARN: " + getFileShareARN() + ",");
        if (getFileShareId() != null)
            sb.append("FileShareId: " + getFileShareId() + ",");
        if (getFileShareStatus() != null)
            sb.append("FileShareStatus: " + getFileShareStatus() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileShareType() == null) ? 0 : getFileShareType().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareId() == null) ? 0 : getFileShareId().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareStatus() == null) ? 0 : getFileShareStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileShareInfo == false)
            return false;
        FileShareInfo other = (FileShareInfo) obj;

        if (other.getFileShareType() == null ^ this.getFileShareType() == null)
            return false;
        if (other.getFileShareType() != null
                && other.getFileShareType().equals(this.getFileShareType()) == false)
            return false;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null
                && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFileShareId() == null ^ this.getFileShareId() == null)
            return false;
        if (other.getFileShareId() != null
                && other.getFileShareId().equals(this.getFileShareId()) == false)
            return false;
        if (other.getFileShareStatus() == null ^ this.getFileShareStatus() == null)
            return false;
        if (other.getFileShareStatus() != null
                && other.getFileShareStatus().equals(this.getFileShareStatus()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        return true;
    }
}
