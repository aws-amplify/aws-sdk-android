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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attempts to stop an ongoing deployment.
 * </p>
 */
public class StopDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been
     * updated should be rolled back to the previous version of the application
     * revision.
     * </p>
     */
    private Boolean autoRollbackEnabled;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been
     * updated should be rolled back to the previous version of the application
     * revision.
     * </p>
     *
     * @return <p>
     *         Indicates, when a deployment is stopped, whether instances that
     *         have been updated should be rolled back to the previous version
     *         of the application revision.
     *         </p>
     */
    public Boolean isAutoRollbackEnabled() {
        return autoRollbackEnabled;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been
     * updated should be rolled back to the previous version of the application
     * revision.
     * </p>
     *
     * @return <p>
     *         Indicates, when a deployment is stopped, whether instances that
     *         have been updated should be rolled back to the previous version
     *         of the application revision.
     *         </p>
     */
    public Boolean getAutoRollbackEnabled() {
        return autoRollbackEnabled;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been
     * updated should be rolled back to the previous version of the application
     * revision.
     * </p>
     *
     * @param autoRollbackEnabled <p>
     *            Indicates, when a deployment is stopped, whether instances
     *            that have been updated should be rolled back to the previous
     *            version of the application revision.
     *            </p>
     */
    public void setAutoRollbackEnabled(Boolean autoRollbackEnabled) {
        this.autoRollbackEnabled = autoRollbackEnabled;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been
     * updated should be rolled back to the previous version of the application
     * revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRollbackEnabled <p>
     *            Indicates, when a deployment is stopped, whether instances
     *            that have been updated should be rolled back to the previous
     *            version of the application revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentRequest withAutoRollbackEnabled(Boolean autoRollbackEnabled) {
        this.autoRollbackEnabled = autoRollbackEnabled;
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getAutoRollbackEnabled() != null)
            sb.append("autoRollbackEnabled: " + getAutoRollbackEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getAutoRollbackEnabled() == null) ? 0 : getAutoRollbackEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDeploymentRequest == false)
            return false;
        StopDeploymentRequest other = (StopDeploymentRequest) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getAutoRollbackEnabled() == null ^ this.getAutoRollbackEnabled() == null)
            return false;
        if (other.getAutoRollbackEnabled() != null
                && other.getAutoRollbackEnabled().equals(this.getAutoRollbackEnabled()) == false)
            return false;
        return true;
    }
}
