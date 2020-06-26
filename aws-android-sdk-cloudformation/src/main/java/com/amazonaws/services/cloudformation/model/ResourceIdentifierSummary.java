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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the target resources of a specific type in your import template
 * (for example, all <code>AWS::S3::Bucket</code> resources) and the properties
 * you can provide during the import to identify resources of that type.
 * </p>
 */
public class ResourceIdentifierSummary implements Serializable {
    /**
     * <p>
     * The template resource type of the target resources, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * <p>
     * The logical IDs of the target resources of the specified
     * <code>ResourceType</code>, as defined in the import template.
     * </p>
     */
    private java.util.List<String> logicalResourceIds;

    /**
     * <p>
     * The resource properties you can provide during the import to identify
     * your target resources. For example, <code>BucketName</code> is a possible
     * identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     */
    private java.util.List<String> resourceIdentifiers;

    /**
     * <p>
     * The template resource type of the target resources, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The template resource type of the target resources, such as
     *         <code>AWS::S3::Bucket</code>.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The template resource type of the target resources, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The template resource type of the target resources, such as
     *            <code>AWS::S3::Bucket</code>.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The template resource type of the target resources, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The template resource type of the target resources, such as
     *            <code>AWS::S3::Bucket</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifierSummary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified
     * <code>ResourceType</code>, as defined in the import template.
     * </p>
     *
     * @return <p>
     *         The logical IDs of the target resources of the specified
     *         <code>ResourceType</code>, as defined in the import template.
     *         </p>
     */
    public java.util.List<String> getLogicalResourceIds() {
        return logicalResourceIds;
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified
     * <code>ResourceType</code>, as defined in the import template.
     * </p>
     *
     * @param logicalResourceIds <p>
     *            The logical IDs of the target resources of the specified
     *            <code>ResourceType</code>, as defined in the import template.
     *            </p>
     */
    public void setLogicalResourceIds(java.util.Collection<String> logicalResourceIds) {
        if (logicalResourceIds == null) {
            this.logicalResourceIds = null;
            return;
        }

        this.logicalResourceIds = new java.util.ArrayList<String>(logicalResourceIds);
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified
     * <code>ResourceType</code>, as defined in the import template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceIds <p>
     *            The logical IDs of the target resources of the specified
     *            <code>ResourceType</code>, as defined in the import template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifierSummary withLogicalResourceIds(String... logicalResourceIds) {
        if (getLogicalResourceIds() == null) {
            this.logicalResourceIds = new java.util.ArrayList<String>(logicalResourceIds.length);
        }
        for (String value : logicalResourceIds) {
            this.logicalResourceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The logical IDs of the target resources of the specified
     * <code>ResourceType</code>, as defined in the import template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceIds <p>
     *            The logical IDs of the target resources of the specified
     *            <code>ResourceType</code>, as defined in the import template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifierSummary withLogicalResourceIds(
            java.util.Collection<String> logicalResourceIds) {
        setLogicalResourceIds(logicalResourceIds);
        return this;
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify
     * your target resources. For example, <code>BucketName</code> is a possible
     * identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     *
     * @return <p>
     *         The resource properties you can provide during the import to
     *         identify your target resources. For example,
     *         <code>BucketName</code> is a possible identifier property for
     *         <code>AWS::S3::Bucket</code> resources.
     *         </p>
     */
    public java.util.List<String> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify
     * your target resources. For example, <code>BucketName</code> is a possible
     * identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     *
     * @param resourceIdentifiers <p>
     *            The resource properties you can provide during the import to
     *            identify your target resources. For example,
     *            <code>BucketName</code> is a possible identifier property for
     *            <code>AWS::S3::Bucket</code> resources.
     *            </p>
     */
    public void setResourceIdentifiers(java.util.Collection<String> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new java.util.ArrayList<String>(resourceIdentifiers);
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify
     * your target resources. For example, <code>BucketName</code> is a possible
     * identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifiers <p>
     *            The resource properties you can provide during the import to
     *            identify your target resources. For example,
     *            <code>BucketName</code> is a possible identifier property for
     *            <code>AWS::S3::Bucket</code> resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifierSummary withResourceIdentifiers(String... resourceIdentifiers) {
        if (getResourceIdentifiers() == null) {
            this.resourceIdentifiers = new java.util.ArrayList<String>(resourceIdentifiers.length);
        }
        for (String value : resourceIdentifiers) {
            this.resourceIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resource properties you can provide during the import to identify
     * your target resources. For example, <code>BucketName</code> is a possible
     * identifier property for <code>AWS::S3::Bucket</code> resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifiers <p>
     *            The resource properties you can provide during the import to
     *            identify your target resources. For example,
     *            <code>BucketName</code> is a possible identifier property for
     *            <code>AWS::S3::Bucket</code> resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceIdentifierSummary withResourceIdentifiers(
            java.util.Collection<String> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getLogicalResourceIds() != null)
            sb.append("LogicalResourceIds: " + getLogicalResourceIds() + ",");
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: " + getResourceIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceIds() == null) ? 0 : getLogicalResourceIds().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIdentifierSummary == false)
            return false;
        ResourceIdentifierSummary other = (ResourceIdentifierSummary) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLogicalResourceIds() == null ^ this.getLogicalResourceIds() == null)
            return false;
        if (other.getLogicalResourceIds() != null
                && other.getLogicalResourceIds().equals(this.getLogicalResourceIds()) == false)
            return false;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null
                && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
            return false;
        return true;
    }
}
