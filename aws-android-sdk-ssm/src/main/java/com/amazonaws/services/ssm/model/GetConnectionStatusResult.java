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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class GetConnectionStatusResult implements Serializable {
    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     */
    private String target;

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or
     * 'Not Connected'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, NotConnected
     */
    private String status;

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @return <p>
     *         The ID of the instance to check connection status.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param target <p>
     *            The ID of the instance to check connection status.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ID of the instance to check connection status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param target <p>
     *            The ID of the instance to check connection status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionStatusResult withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or
     * 'Not Connected'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, NotConnected
     *
     * @return <p>
     *         The status of the connection to the instance. For example,
     *         'Connected' or 'Not Connected'.
     *         </p>
     * @see ConnectionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or
     * 'Not Connected'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, NotConnected
     *
     * @param status <p>
     *            The status of the connection to the instance. For example,
     *            'Connected' or 'Not Connected'.
     *            </p>
     * @see ConnectionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or
     * 'Not Connected'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, NotConnected
     *
     * @param status <p>
     *            The status of the connection to the instance. For example,
     *            'Connected' or 'Not Connected'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionStatus
     */
    public GetConnectionStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or
     * 'Not Connected'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, NotConnected
     *
     * @param status <p>
     *            The status of the connection to the instance. For example,
     *            'Connected' or 'Not Connected'.
     *            </p>
     * @see ConnectionStatus
     */
    public void setStatus(ConnectionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the connection to the instance. For example, 'Connected' or
     * 'Not Connected'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, NotConnected
     *
     * @param status <p>
     *            The status of the connection to the instance. For example,
     *            'Connected' or 'Not Connected'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionStatus
     */
    public GetConnectionStatusResult withStatus(ConnectionStatus status) {
        this.status = status.toString();
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
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionStatusResult == false)
            return false;
        GetConnectionStatusResult other = (GetConnectionStatusResult) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
