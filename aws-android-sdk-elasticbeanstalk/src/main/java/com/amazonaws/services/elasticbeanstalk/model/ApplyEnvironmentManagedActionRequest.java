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
 * Applies a scheduled managed action immediately. A managed action can be
 * applied only if its status is <code>Scheduled</code>. Get the status and
 * action ID of a managed action with <a>DescribeEnvironmentManagedActions</a>.
 * </p>
 */
public class ApplyEnvironmentManagedActionRequest extends AmazonWebServiceRequest implements
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
     * The action ID of the scheduled managed action to execute.
     * </p>
     */
    private String actionId;

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
    public ApplyEnvironmentManagedActionRequest withEnvironmentName(String environmentName) {
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
    public ApplyEnvironmentManagedActionRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * The action ID of the scheduled managed action to execute.
     * </p>
     *
     * @return <p>
     *         The action ID of the scheduled managed action to execute.
     *         </p>
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * <p>
     * The action ID of the scheduled managed action to execute.
     * </p>
     *
     * @param actionId <p>
     *            The action ID of the scheduled managed action to execute.
     *            </p>
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The action ID of the scheduled managed action to execute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionId <p>
     *            The action ID of the scheduled managed action to execute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplyEnvironmentManagedActionRequest withActionId(String actionId) {
        this.actionId = actionId;
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
        if (getActionId() != null)
            sb.append("ActionId: " + getActionId());
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
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplyEnvironmentManagedActionRequest == false)
            return false;
        ApplyEnvironmentManagedActionRequest other = (ApplyEnvironmentManagedActionRequest) obj;

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
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        return true;
    }
}
