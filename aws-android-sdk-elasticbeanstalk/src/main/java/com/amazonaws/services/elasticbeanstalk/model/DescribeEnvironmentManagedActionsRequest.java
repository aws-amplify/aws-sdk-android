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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists an environment's upcoming and in-progress managed actions.
 * </p>
 */
public class DescribeEnvironmentManagedActionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the target environment.
     * </p>
     */
    private String environmentName;

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     */
    private String status;

    /**
     * <p>
     * The name of the target environment.
     * </p>
     *
     * @return <p>
     *         The name of the target environment.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     *
     * @param environmentName <p>
     *            The name of the target environment.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentName <p>
     *            The name of the target environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     *
     * @return <p>
     *         The environment ID of the target environment.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     *
     * @param environmentId <p>
     *            The environment ID of the target environment.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            The environment ID of the target environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionsRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @return <p>
     *         To show only actions with a particular status, specify a status.
     *         </p>
     * @see ActionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            To show only actions with a particular status, specify a
     *            status.
     *            </p>
     * @see ActionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            To show only actions with a particular status, specify a
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionStatus
     */
    public DescribeEnvironmentManagedActionsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            To show only actions with a particular status, specify a
     *            status.
     *            </p>
     * @see ActionStatus
     */
    public void setStatus(ActionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * To show only actions with a particular status, specify a status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Pending, Running, Unknown
     *
     * @param status <p>
     *            To show only actions with a particular status, specify a
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionStatus
     */
    public DescribeEnvironmentManagedActionsRequest withStatus(ActionStatus status) {
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentManagedActionsRequest == false)
            return false;
        DescribeEnvironmentManagedActionsRequest other = (DescribeEnvironmentManagedActionsRequest) obj;

        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
