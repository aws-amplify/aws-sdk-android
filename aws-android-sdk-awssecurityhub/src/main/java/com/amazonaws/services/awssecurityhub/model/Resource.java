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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A resource related to a finding.
 * </p>
 */
public class Resource implements Serializable {
    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set
     * <code>Type</code> to one of the supported resource types. For example, if
     * the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set
     * <code>Type</code> to <code>Other</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws, aws-cn, aws-us-gov
     */
    private String partition;

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String region;

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was
     * processed.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     */
    private ResourceDetails details;

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set
     * <code>Type</code> to one of the supported resource types. For example, if
     * the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set
     * <code>Type</code> to <code>Other</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of the resource that details are provided for. If
     *         possible, set <code>Type</code> to one of the supported resource
     *         types. For example, if the resource is an EC2 instance, then set
     *         <code>Type</code> to <code>AwsEc2Instance</code>.
     *         </p>
     *         <p>
     *         If the resource does not match any of the provided types, then
     *         set <code>Type</code> to <code>Other</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set
     * <code>Type</code> to one of the supported resource types. For example, if
     * the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set
     * <code>Type</code> to <code>Other</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of the resource that details are provided for. If
     *            possible, set <code>Type</code> to one of the supported
     *            resource types. For example, if the resource is an EC2
     *            instance, then set <code>Type</code> to
     *            <code>AwsEc2Instance</code>.
     *            </p>
     *            <p>
     *            If the resource does not match any of the provided types, then
     *            set <code>Type</code> to <code>Other</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource that details are provided for. If possible, set
     * <code>Type</code> to one of the supported resource types. For example, if
     * the resource is an EC2 instance, then set <code>Type</code> to
     * <code>AwsEc2Instance</code>.
     * </p>
     * <p>
     * If the resource does not match any of the provided types, then set
     * <code>Type</code> to <code>Other</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of the resource that details are provided for. If
     *            possible, set <code>Type</code> to one of the supported
     *            resource types. For example, if the resource is an EC2
     *            instance, then set <code>Type</code> to
     *            <code>AwsEc2Instance</code>.
     *            </p>
     *            <p>
     *            If the resource does not match any of the provided types, then
     *            set <code>Type</code> to <code>Other</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The canonical identifier for the given resource type.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The canonical identifier for the given resource type.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The canonical identifier for the given resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The canonical identifier for the given resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws, aws-cn, aws-us-gov
     *
     * @return <p>
     *         The canonical AWS partition name that the Region is assigned to.
     *         </p>
     * @see Partition
     */
    public String getPartition() {
        return partition;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws, aws-cn, aws-us-gov
     *
     * @param partition <p>
     *            The canonical AWS partition name that the Region is assigned
     *            to.
     *            </p>
     * @see Partition
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws, aws-cn, aws-us-gov
     *
     * @param partition <p>
     *            The canonical AWS partition name that the Region is assigned
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Partition
     */
    public Resource withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws, aws-cn, aws-us-gov
     *
     * @param partition <p>
     *            The canonical AWS partition name that the Region is assigned
     *            to.
     *            </p>
     * @see Partition
     */
    public void setPartition(Partition partition) {
        this.partition = partition.toString();
    }

    /**
     * <p>
     * The canonical AWS partition name that the Region is assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws, aws-cn, aws-us-gov
     *
     * @param partition <p>
     *            The canonical AWS partition name that the Region is assigned
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Partition
     */
    public Resource withPartition(Partition partition) {
        this.partition = partition.toString();
        return this;
    }

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The canonical AWS external Region name where this resource is
     *         located.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param region <p>
     *            The canonical AWS external Region name where this resource is
     *            located.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The canonical AWS external Region name where this resource is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param region <p>
     *            The canonical AWS external Region name where this resource is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was
     * processed.
     * </p>
     *
     * @return <p>
     *         A list of AWS tags associated with a resource at the time the
     *         finding was processed.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was
     * processed.
     * </p>
     *
     * @param tags <p>
     *            A list of AWS tags associated with a resource at the time the
     *            finding was processed.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was
     * processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of AWS tags associated with a resource at the time the
     *            finding was processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of AWS tags associated with a resource at the time the finding was
     * processed.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Resource clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     *
     * @return <p>
     *         Additional details about the resource related to a finding.
     *         </p>
     */
    public ResourceDetails getDetails() {
        return details;
    }

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     *
     * @param details <p>
     *            Additional details about the resource related to a finding.
     *            </p>
     */
    public void setDetails(ResourceDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Additional details about the resource related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            Additional details about the resource related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withDetails(ResourceDetails details) {
        this.details = details;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getPartition() != null)
            sb.append("Partition: " + getPartition() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null
                && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
