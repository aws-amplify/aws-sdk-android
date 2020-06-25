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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates crash-consistent snapshots of multiple EBS volumes and stores the
 * data in S3. Volumes are chosen by specifying an instance. Any attached
 * volumes will produce one snapshot each that is crash-consistent across the
 * instance. Boot volumes can be excluded by changing the parameters.
 * </p>
 */
public class CreateSnapshotsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The instance to specify which volumes should be included in the
     * snapshots.
     * </p>
     */
    private InstanceSpecification instanceSpecification;

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>volume
     */
    private String copyTagsFromSource;

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     *
     * @return <p>
     *         A description propagated to every snapshot specified by the
     *         instance.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     *
     * @param description <p>
     *            A description propagated to every snapshot specified by the
     *            instance.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description propagated to every snapshot specified by the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description propagated to every snapshot specified by the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The instance to specify which volumes should be included in the
     * snapshots.
     * </p>
     *
     * @return <p>
     *         The instance to specify which volumes should be included in the
     *         snapshots.
     *         </p>
     */
    public InstanceSpecification getInstanceSpecification() {
        return instanceSpecification;
    }

    /**
     * <p>
     * The instance to specify which volumes should be included in the
     * snapshots.
     * </p>
     *
     * @param instanceSpecification <p>
     *            The instance to specify which volumes should be included in
     *            the snapshots.
     *            </p>
     */
    public void setInstanceSpecification(InstanceSpecification instanceSpecification) {
        this.instanceSpecification = instanceSpecification;
    }

    /**
     * <p>
     * The instance to specify which volumes should be included in the
     * snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceSpecification <p>
     *            The instance to specify which volumes should be included in
     *            the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsRequest withInstanceSpecification(
            InstanceSpecification instanceSpecification) {
        this.instanceSpecification = instanceSpecification;
        return this;
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     *
     * @return <p>
     *         Tags to apply to every snapshot specified by the instance.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     *
     * @param tagSpecifications <p>
     *            Tags to apply to every snapshot specified by the instance.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            Tags to apply to every snapshot specified by the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags to apply to every snapshot specified by the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            Tags to apply to every snapshot specified by the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>volume
     *
     * @return <p>
     *         Copies the tags from the specified volume to corresponding
     *         snapshot.
     *         </p>
     * @see CopyTagsFromSource
     */
    public String getCopyTagsFromSource() {
        return copyTagsFromSource;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>volume
     *
     * @param copyTagsFromSource <p>
     *            Copies the tags from the specified volume to corresponding
     *            snapshot.
     *            </p>
     * @see CopyTagsFromSource
     */
    public void setCopyTagsFromSource(String copyTagsFromSource) {
        this.copyTagsFromSource = copyTagsFromSource;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>volume
     *
     * @param copyTagsFromSource <p>
     *            Copies the tags from the specified volume to corresponding
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyTagsFromSource
     */
    public CreateSnapshotsRequest withCopyTagsFromSource(String copyTagsFromSource) {
        this.copyTagsFromSource = copyTagsFromSource;
        return this;
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>volume
     *
     * @param copyTagsFromSource <p>
     *            Copies the tags from the specified volume to corresponding
     *            snapshot.
     *            </p>
     * @see CopyTagsFromSource
     */
    public void setCopyTagsFromSource(CopyTagsFromSource copyTagsFromSource) {
        this.copyTagsFromSource = copyTagsFromSource.toString();
    }

    /**
     * <p>
     * Copies the tags from the specified volume to corresponding snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>volume
     *
     * @param copyTagsFromSource <p>
     *            Copies the tags from the specified volume to corresponding
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyTagsFromSource
     */
    public CreateSnapshotsRequest withCopyTagsFromSource(CopyTagsFromSource copyTagsFromSource) {
        this.copyTagsFromSource = copyTagsFromSource.toString();
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInstanceSpecification() != null)
            sb.append("InstanceSpecification: " + getInstanceSpecification() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getCopyTagsFromSource() != null)
            sb.append("CopyTagsFromSource: " + getCopyTagsFromSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceSpecification() == null) ? 0 : getInstanceSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsFromSource() == null) ? 0 : getCopyTagsFromSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotsRequest == false)
            return false;
        CreateSnapshotsRequest other = (CreateSnapshotsRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceSpecification() == null ^ this.getInstanceSpecification() == null)
            return false;
        if (other.getInstanceSpecification() != null
                && other.getInstanceSpecification().equals(this.getInstanceSpecification()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getCopyTagsFromSource() == null ^ this.getCopyTagsFromSource() == null)
            return false;
        if (other.getCopyTagsFromSource() != null
                && other.getCopyTagsFromSource().equals(this.getCopyTagsFromSource()) == false)
            return false;
        return true;
    }
}
