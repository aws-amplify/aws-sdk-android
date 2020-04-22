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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a previously provisioned cluster without its final snapshot being
 * created. A successful response from the web service indicates that the
 * request was received correctly. Use <a>DescribeClusters</a> to monitor the
 * status of the deletion. The delete operation cannot be canceled or reverted
 * once submitted. For more information about managing clusters, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
 * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 * <p>
 * If you want to shut down the cluster and retain it for future use, set
 * <i>SkipFinalClusterSnapshot</i> to <code>false</code> and specify a name for
 * <i>FinalClusterSnapshotIdentifier</i>. You can later restore this snapshot to
 * resume using the cluster. If a final cluster snapshot is requested, the
 * status of the cluster will be "final-snapshot" while the snapshot is being
 * taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.
 * </p>
 * <p>
 * For more information about managing clusters, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
 * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 */
public class DeleteClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean skipFinalClusterSnapshot;

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String finalClusterSnapshotIdentifier;

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     */
    private Integer finalClusterSnapshotRetentionPeriod;

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the cluster to be deleted.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain lowercase characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster to be deleted.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain lowercase characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster to be deleted.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain lowercase characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Determines whether a final snapshot of the cluster is created
     *         before Amazon Redshift deletes the cluster. If <code>true</code>,
     *         a final cluster snapshot is not created. If <code>false</code>, a
     *         final cluster snapshot is created before the cluster is deleted.
     *         </p>
     *         <note>
     *         <p>
     *         The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     *         specified if <i>SkipFinalClusterSnapshot</i> is
     *         <code>false</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isSkipFinalClusterSnapshot() {
        return skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Determines whether a final snapshot of the cluster is created
     *         before Amazon Redshift deletes the cluster. If <code>true</code>,
     *         a final cluster snapshot is not created. If <code>false</code>, a
     *         final cluster snapshot is created before the cluster is deleted.
     *         </p>
     *         <note>
     *         <p>
     *         The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     *         specified if <i>SkipFinalClusterSnapshot</i> is
     *         <code>false</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getSkipFinalClusterSnapshot() {
        return skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param skipFinalClusterSnapshot <p>
     *            Determines whether a final snapshot of the cluster is created
     *            before Amazon Redshift deletes the cluster. If
     *            <code>true</code>, a final cluster snapshot is not created. If
     *            <code>false</code>, a final cluster snapshot is created before
     *            the cluster is deleted.
     *            </p>
     *            <note>
     *            <p>
     *            The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     *            specified if <i>SkipFinalClusterSnapshot</i> is
     *            <code>false</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        this.skipFinalClusterSnapshot = skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipFinalClusterSnapshot <p>
     *            Determines whether a final snapshot of the cluster is created
     *            before Amazon Redshift deletes the cluster. If
     *            <code>true</code>, a final cluster snapshot is not created. If
     *            <code>false</code>, a final cluster snapshot is created before
     *            the cluster is deleted.
     *            </p>
     *            <note>
     *            <p>
     *            The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     *            specified if <i>SkipFinalClusterSnapshot</i> is
     *            <code>false</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterRequest withSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        this.skipFinalClusterSnapshot = skipFinalClusterSnapshot;
        return this;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the final snapshot that is to be created
     *         immediately before deleting the cluster. If this parameter is
     *         provided, <i>SkipFinalClusterSnapshot</i> must be
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFinalClusterSnapshotIdentifier() {
        return finalClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param finalClusterSnapshotIdentifier <p>
     *            The identifier of the final snapshot that is to be created
     *            immediately before deleting the cluster. If this parameter is
     *            provided, <i>SkipFinalClusterSnapshot</i> must be
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFinalClusterSnapshotIdentifier(String finalClusterSnapshotIdentifier) {
        this.finalClusterSnapshotIdentifier = finalClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalClusterSnapshotIdentifier <p>
     *            The identifier of the final snapshot that is to be created
     *            immediately before deleting the cluster. If this parameter is
     *            provided, <i>SkipFinalClusterSnapshot</i> must be
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterRequest withFinalClusterSnapshotIdentifier(
            String finalClusterSnapshotIdentifier) {
        this.finalClusterSnapshotIdentifier = finalClusterSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     *
     * @return <p>
     *         The number of days that a manual snapshot is retained. If the
     *         value is -1, the manual snapshot is retained indefinitely.
     *         </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         The default value is -1.
     *         </p>
     */
    public Integer getFinalClusterSnapshotRetentionPeriod() {
        return finalClusterSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     *
     * @param finalClusterSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If the
     *            value is -1, the manual snapshot is retained indefinitely.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     *            <p>
     *            The default value is -1.
     *            </p>
     */
    public void setFinalClusterSnapshotRetentionPeriod(Integer finalClusterSnapshotRetentionPeriod) {
        this.finalClusterSnapshotRetentionPeriod = finalClusterSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalClusterSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If the
     *            value is -1, the manual snapshot is retained indefinitely.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     *            <p>
     *            The default value is -1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterRequest withFinalClusterSnapshotRetentionPeriod(
            Integer finalClusterSnapshotRetentionPeriod) {
        this.finalClusterSnapshotRetentionPeriod = finalClusterSnapshotRetentionPeriod;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSkipFinalClusterSnapshot() != null)
            sb.append("SkipFinalClusterSnapshot: " + getSkipFinalClusterSnapshot() + ",");
        if (getFinalClusterSnapshotIdentifier() != null)
            sb.append("FinalClusterSnapshotIdentifier: " + getFinalClusterSnapshotIdentifier()
                    + ",");
        if (getFinalClusterSnapshotRetentionPeriod() != null)
            sb.append("FinalClusterSnapshotRetentionPeriod: "
                    + getFinalClusterSnapshotRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSkipFinalClusterSnapshot() == null) ? 0 : getSkipFinalClusterSnapshot()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalClusterSnapshotIdentifier() == null) ? 0
                        : getFinalClusterSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalClusterSnapshotRetentionPeriod() == null) ? 0
                        : getFinalClusterSnapshotRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterRequest == false)
            return false;
        DeleteClusterRequest other = (DeleteClusterRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSkipFinalClusterSnapshot() == null
                ^ this.getSkipFinalClusterSnapshot() == null)
            return false;
        if (other.getSkipFinalClusterSnapshot() != null
                && other.getSkipFinalClusterSnapshot().equals(this.getSkipFinalClusterSnapshot()) == false)
            return false;
        if (other.getFinalClusterSnapshotIdentifier() == null
                ^ this.getFinalClusterSnapshotIdentifier() == null)
            return false;
        if (other.getFinalClusterSnapshotIdentifier() != null
                && other.getFinalClusterSnapshotIdentifier().equals(
                        this.getFinalClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getFinalClusterSnapshotRetentionPeriod() == null
                ^ this.getFinalClusterSnapshotRetentionPeriod() == null)
            return false;
        if (other.getFinalClusterSnapshotRetentionPeriod() != null
                && other.getFinalClusterSnapshotRetentionPeriod().equals(
                        this.getFinalClusterSnapshotRetentionPeriod()) == false)
            return false;
        return true;
    }
}
