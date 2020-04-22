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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a parameter group.
 * </p>
 */
public class ClusterParameterStatus implements Serializable {
    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered an
     * error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after
     * the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the
     * database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because
     * it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property
     * changes. The changes are deferred until the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter
     * change will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now.
     * The change will be applied after the cluster reboots.
     * </p>
     * </li>
     * </ul>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * The error that prevented the parameter from being applied to the
     * database.
     * </p>
     */
    private String parameterApplyErrorDescription;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     *
     * @return <p>
     *         The name of the parameter.
     *         </p>
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     *
     * @param parameterName <p>
     *            The name of the parameter.
     *            </p>
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterName <p>
     *            The name of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterStatus withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered an
     * error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after
     * the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the
     * database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because
     * it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property
     * changes. The changes are deferred until the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter
     * change will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now.
     * The change will be applied after the cluster reboots.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the parameter that indicates whether the parameter
     *         is in sync with the database, waiting for a cluster reboot, or
     *         encountered an error when being applied.
     *         </p>
     *         <p>
     *         The following are possible statuses and descriptions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>in-sync</code>: The parameter value is in sync with the
     *         database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending-reboot</code>: The parameter value will be applied
     *         after the cluster reboots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>applying</code>: The parameter value is being applied to
     *         the database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>invalid-parameter</code>: Cannot apply the parameter value
     *         because it has an invalid value or syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>apply-deferred</code>: The parameter contains static
     *         property changes. The changes are deferred until the cluster
     *         reboots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>apply-error</code>: Cannot connect to the cluster. The
     *         parameter change will be applied after the cluster reboots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown-error</code>: Cannot apply the parameter change
     *         right now. The change will be applied after the cluster reboots.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered an
     * error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after
     * the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the
     * database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because
     * it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property
     * changes. The changes are deferred until the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter
     * change will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now.
     * The change will be applied after the cluster reboots.
     * </p>
     * </li>
     * </ul>
     *
     * @param parameterApplyStatus <p>
     *            The status of the parameter that indicates whether the
     *            parameter is in sync with the database, waiting for a cluster
     *            reboot, or encountered an error when being applied.
     *            </p>
     *            <p>
     *            The following are possible statuses and descriptions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>in-sync</code>: The parameter value is in sync with the
     *            database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending-reboot</code>: The parameter value will be
     *            applied after the cluster reboots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>applying</code>: The parameter value is being applied to
     *            the database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>invalid-parameter</code>: Cannot apply the parameter
     *            value because it has an invalid value or syntax.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>apply-deferred</code>: The parameter contains static
     *            property changes. The changes are deferred until the cluster
     *            reboots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>apply-error</code>: Cannot connect to the cluster. The
     *            parameter change will be applied after the cluster reboots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown-error</code>: Cannot apply the parameter change
     *            right now. The change will be applied after the cluster
     *            reboots.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered an
     * error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after
     * the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the
     * database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because
     * it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property
     * changes. The changes are deferred until the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter
     * change will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now.
     * The change will be applied after the cluster reboots.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterApplyStatus <p>
     *            The status of the parameter that indicates whether the
     *            parameter is in sync with the database, waiting for a cluster
     *            reboot, or encountered an error when being applied.
     *            </p>
     *            <p>
     *            The following are possible statuses and descriptions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>in-sync</code>: The parameter value is in sync with the
     *            database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending-reboot</code>: The parameter value will be
     *            applied after the cluster reboots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>applying</code>: The parameter value is being applied to
     *            the database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>invalid-parameter</code>: Cannot apply the parameter
     *            value because it has an invalid value or syntax.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>apply-deferred</code>: The parameter contains static
     *            property changes. The changes are deferred until the cluster
     *            reboots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>apply-error</code>: Cannot connect to the cluster. The
     *            parameter change will be applied after the cluster reboots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown-error</code>: Cannot apply the parameter change
     *            right now. The change will be applied after the cluster
     *            reboots.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
        return this;
    }

    /**
     * <p>
     * The error that prevented the parameter from being applied to the
     * database.
     * </p>
     *
     * @return <p>
     *         The error that prevented the parameter from being applied to the
     *         database.
     *         </p>
     */
    public String getParameterApplyErrorDescription() {
        return parameterApplyErrorDescription;
    }

    /**
     * <p>
     * The error that prevented the parameter from being applied to the
     * database.
     * </p>
     *
     * @param parameterApplyErrorDescription <p>
     *            The error that prevented the parameter from being applied to
     *            the database.
     *            </p>
     */
    public void setParameterApplyErrorDescription(String parameterApplyErrorDescription) {
        this.parameterApplyErrorDescription = parameterApplyErrorDescription;
    }

    /**
     * <p>
     * The error that prevented the parameter from being applied to the
     * database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterApplyErrorDescription <p>
     *            The error that prevented the parameter from being applied to
     *            the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterStatus withParameterApplyErrorDescription(
            String parameterApplyErrorDescription) {
        this.parameterApplyErrorDescription = parameterApplyErrorDescription;
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
        if (getParameterName() != null)
            sb.append("ParameterName: " + getParameterName() + ",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: " + getParameterApplyStatus() + ",");
        if (getParameterApplyErrorDescription() != null)
            sb.append("ParameterApplyErrorDescription: " + getParameterApplyErrorDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getParameterApplyErrorDescription() == null) ? 0
                        : getParameterApplyErrorDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterParameterStatus == false)
            return false;
        ClusterParameterStatus other = (ClusterParameterStatus) obj;

        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null
                && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null
                && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getParameterApplyErrorDescription() == null
                ^ this.getParameterApplyErrorDescription() == null)
            return false;
        if (other.getParameterApplyErrorDescription() != null
                && other.getParameterApplyErrorDescription().equals(
                        this.getParameterApplyErrorDescription()) == false)
            return false;
        return true;
    }
}
