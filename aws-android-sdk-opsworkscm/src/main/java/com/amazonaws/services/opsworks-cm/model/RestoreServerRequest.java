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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p> Restores a backup to a server that is in a <code>CONNECTION_LOST</code>, <code>HEALTHY</code>, <code>RUNNING</code>, <code>UNHEALTHY</code>, or <code>TERMINATED</code> state. When you run RestoreServer, the server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing server endpoint, so configuration management of the server's client devices (nodes) should continue to work. </p> <p>Restoring from a backup is performed by creating a new EC2 instance. If restoration is successful, and the server is in a <code>HEALTHY</code> state, AWS OpsWorks CM switches traffic over to the new instance. After restoration is finished, the old EC2 instance is maintained in a <code>Running</code> or <code>Stopped</code> state, but is eventually terminated.</p> <p> This operation is asynchronous. </p> <p> An <code>InvalidStateException</code> is thrown when the server is not in a valid state. A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. </p>
 */
public class RestoreServerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p> The ID of the backup that you want to use to restore a server. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     */
    private String backupId;

    /**
     * <p> The name of the server that you want to restore. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String instanceType;

    /**
     * <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String keyPair;

    /**
     * <p> The ID of the backup that you want to use to restore a server. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @return <p> The ID of the backup that you want to use to restore a server. </p>
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * <p> The ID of the backup that you want to use to restore a server. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @param backupId <p> The ID of the backup that you want to use to restore a server. </p>
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p> The ID of the backup that you want to use to restore a server. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @param backupId <p> The ID of the backup that you want to use to restore a server. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RestoreServerRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * <p> The name of the server that you want to restore. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p> The name of the server that you want to restore. </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p> The name of the server that you want to restore. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p> The name of the server that you want to restore. </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p> The name of the server that you want to restore. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p> The name of the server that you want to restore. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RestoreServerRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param instanceType <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param instanceType <p> The type of instance to restore. Valid values must be specified in the following format: <code>^([cm][34]|t2).*</code> For example, <code>m5.large</code>. Valid values are <code>m5.large</code>, <code>r5.xlarge</code>, and <code>r5.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RestoreServerRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     */
    public String getKeyPair() {
        return keyPair;
    }

    /**
     * <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param keyPair <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     */
    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param keyPair <p> The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RestoreServerRequest withKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupId() != null) sb.append("BackupId: " + getBackupId() + ",");
        if (getServerName() != null) sb.append("ServerName: " + getServerName() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKeyPair() != null) sb.append("KeyPair: " + getKeyPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreServerRequest == false) return false;
        RestoreServerRequest other = (RestoreServerRequest)obj;

        if (other.getBackupId() == null ^ this.getBackupId() == null) return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false) return false;
        if (other.getServerName() == null ^ this.getServerName() == null) return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false) return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null) return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false) return false;
        return true;
    }
}
