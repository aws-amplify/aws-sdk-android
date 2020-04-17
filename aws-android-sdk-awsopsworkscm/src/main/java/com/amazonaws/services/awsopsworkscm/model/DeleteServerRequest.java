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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the server and the underlying AWS CloudFormation stacks (including
 * the server's EC2 instance). When you run this command, the server state is
 * updated to <code>DELETING</code>. After the server is deleted, it is no
 * longer returned by <code>DescribeServer</code> requests. If the AWS
 * CloudFormation stack cannot be deleted, the server cannot be deleted.
 * </p>
 * <p>
 * This operation is asynchronous.
 * </p>
 * <p>
 * An <code>InvalidStateException</code> is thrown when a server deletion is
 * already in progress. A <code>ResourceNotFoundException</code> is thrown when
 * the server does not exist. A <code>ValidationException</code> is raised when
 * parameters of the request are not valid.
 * </p>
 * <p>
 * </p>
 */
public class DeleteServerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the server to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>
     * The ID of the server to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The ID of the server to delete.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The ID of the server to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The ID of the server to delete.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The ID of the server to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The ID of the server to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteServerRequest withServerName(String serverName) {
        this.serverName = serverName;
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
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServerRequest == false)
            return false;
        DeleteServerRequest other = (DeleteServerRequest) obj;

        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }
}
