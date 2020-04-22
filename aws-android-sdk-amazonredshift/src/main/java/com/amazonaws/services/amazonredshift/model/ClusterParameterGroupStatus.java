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
public class ClusterParameterGroupStatus implements Serializable {
    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     */
    private String parameterGroupName;

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     */
    private java.util.List<ClusterParameterStatus> clusterParameterStatusList;

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     *
     * @return <p>
     *         The name of the cluster parameter group.
     *         </p>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group.
     *            </p>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroupStatus withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     *
     * @return <p>
     *         The status of parameter updates.
     *         </p>
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates.
     *            </p>
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
        return this;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of parameter statuses.
     *         </p>
     *         <p>
     *         For more information about parameters and parameter groups, go to
     *         <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *         >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift
     *         Cluster Management Guide</i>.
     *         </p>
     */
    public java.util.List<ClusterParameterStatus> getClusterParameterStatusList() {
        return clusterParameterStatusList;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     *
     * @param clusterParameterStatusList <p>
     *            The list of parameter statuses.
     *            </p>
     *            <p>
     *            For more information about parameters and parameter groups, go
     *            to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     */
    public void setClusterParameterStatusList(
            java.util.Collection<ClusterParameterStatus> clusterParameterStatusList) {
        if (clusterParameterStatusList == null) {
            this.clusterParameterStatusList = null;
            return;
        }

        this.clusterParameterStatusList = new java.util.ArrayList<ClusterParameterStatus>(
                clusterParameterStatusList);
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterStatusList <p>
     *            The list of parameter statuses.
     *            </p>
     *            <p>
     *            For more information about parameters and parameter groups, go
     *            to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroupStatus withClusterParameterStatusList(
            ClusterParameterStatus... clusterParameterStatusList) {
        if (getClusterParameterStatusList() == null) {
            this.clusterParameterStatusList = new java.util.ArrayList<ClusterParameterStatus>(
                    clusterParameterStatusList.length);
        }
        for (ClusterParameterStatus value : clusterParameterStatusList) {
            this.clusterParameterStatusList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterStatusList <p>
     *            The list of parameter statuses.
     *            </p>
     *            <p>
     *            For more information about parameters and parameter groups, go
     *            to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroupStatus withClusterParameterStatusList(
            java.util.Collection<ClusterParameterStatus> clusterParameterStatusList) {
        setClusterParameterStatusList(clusterParameterStatusList);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: " + getParameterApplyStatus() + ",");
        if (getClusterParameterStatusList() != null)
            sb.append("ClusterParameterStatusList: " + getClusterParameterStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterParameterStatusList() == null) ? 0 : getClusterParameterStatusList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterParameterGroupStatus == false)
            return false;
        ClusterParameterGroupStatus other = (ClusterParameterGroupStatus) obj;

        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null
                && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null
                && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getClusterParameterStatusList() == null
                ^ this.getClusterParameterStatusList() == null)
            return false;
        if (other.getClusterParameterStatusList() != null
                && other.getClusterParameterStatusList().equals(
                        this.getClusterParameterStatusList()) == false)
            return false;
        return true;
    }
}
