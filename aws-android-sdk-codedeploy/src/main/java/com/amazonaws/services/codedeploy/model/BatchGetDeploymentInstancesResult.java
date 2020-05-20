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

/**
 * <p>
 * Represents the output of a <code>BatchGetDeploymentInstances</code>
 * operation.
 * </p>
 */
public class BatchGetDeploymentInstancesResult implements Serializable {
    /**
     * <p>
     * Information about the instance.
     * </p>
     */
    private java.util.List<InstanceSummary> instancesSummary;

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Information about the instance.
     * </p>
     *
     * @return <p>
     *         Information about the instance.
     *         </p>
     */
    public java.util.List<InstanceSummary> getInstancesSummary() {
        return instancesSummary;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     *
     * @param instancesSummary <p>
     *            Information about the instance.
     *            </p>
     */
    public void setInstancesSummary(java.util.Collection<InstanceSummary> instancesSummary) {
        if (instancesSummary == null) {
            this.instancesSummary = null;
            return;
        }

        this.instancesSummary = new java.util.ArrayList<InstanceSummary>(instancesSummary);
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesSummary <p>
     *            Information about the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentInstancesResult withInstancesSummary(
            InstanceSummary... instancesSummary) {
        if (getInstancesSummary() == null) {
            this.instancesSummary = new java.util.ArrayList<InstanceSummary>(
                    instancesSummary.length);
        }
        for (InstanceSummary value : instancesSummary) {
            this.instancesSummary.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesSummary <p>
     *            Information about the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentInstancesResult withInstancesSummary(
            java.util.Collection<InstanceSummary> instancesSummary) {
        setInstancesSummary(instancesSummary);
        return this;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     *
     * @return <p>
     *         Information about errors that might have occurred during the API
     *         call.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     *
     * @param errorMessage <p>
     *            Information about errors that might have occurred during the
     *            API call.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            Information about errors that might have occurred during the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentInstancesResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getInstancesSummary() != null)
            sb.append("instancesSummary: " + getInstancesSummary() + ",");
        if (getErrorMessage() != null)
            sb.append("errorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstancesSummary() == null) ? 0 : getInstancesSummary().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentInstancesResult == false)
            return false;
        BatchGetDeploymentInstancesResult other = (BatchGetDeploymentInstancesResult) obj;

        if (other.getInstancesSummary() == null ^ this.getInstancesSummary() == null)
            return false;
        if (other.getInstancesSummary() != null
                && other.getInstancesSummary().equals(this.getInstancesSummary()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
