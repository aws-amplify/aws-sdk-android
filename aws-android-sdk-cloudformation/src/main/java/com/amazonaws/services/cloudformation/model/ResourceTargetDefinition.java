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
 * The field that AWS CloudFormation will change, such as the name of a
 * resource's property, and whether the resource will be recreated.
 * </p>
 */
public class ResourceTargetDefinition implements Serializable {
    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>,
     * <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Properties, Metadata, CreationPolicy,
     * UpdatePolicy, DeletionPolicy, Tags
     */
    private String attribute;

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name
     * of the property. For all other attributes, the value is null.
     * </p>
     */
    private String name;

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates
     * whether a change to this property causes the resource to be recreated.
     * The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a
     * <code>Conditionally</code> recreation, see the update behavior for that
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Never, Conditionally, Always
     */
    private String requiresRecreation;

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>,
     * <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Properties, Metadata, CreationPolicy,
     * UpdatePolicy, DeletionPolicy, Tags
     *
     * @return <p>
     *         Indicates which resource attribute is triggering this update,
     *         such as a change in the resource attribute's
     *         <code>Metadata</code>, <code>Properties</code>, or
     *         <code>Tags</code>.
     *         </p>
     * @see ResourceAttribute
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>,
     * <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Properties, Metadata, CreationPolicy,
     * UpdatePolicy, DeletionPolicy, Tags
     *
     * @param attribute <p>
     *            Indicates which resource attribute is triggering this update,
     *            such as a change in the resource attribute's
     *            <code>Metadata</code>, <code>Properties</code>, or
     *            <code>Tags</code>.
     *            </p>
     * @see ResourceAttribute
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>,
     * <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Properties, Metadata, CreationPolicy,
     * UpdatePolicy, DeletionPolicy, Tags
     *
     * @param attribute <p>
     *            Indicates which resource attribute is triggering this update,
     *            such as a change in the resource attribute's
     *            <code>Metadata</code>, <code>Properties</code>, or
     *            <code>Tags</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceAttribute
     */
    public ResourceTargetDefinition withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>,
     * <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Properties, Metadata, CreationPolicy,
     * UpdatePolicy, DeletionPolicy, Tags
     *
     * @param attribute <p>
     *            Indicates which resource attribute is triggering this update,
     *            such as a change in the resource attribute's
     *            <code>Metadata</code>, <code>Properties</code>, or
     *            <code>Tags</code>.
     *            </p>
     * @see ResourceAttribute
     */
    public void setAttribute(ResourceAttribute attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>,
     * <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Properties, Metadata, CreationPolicy,
     * UpdatePolicy, DeletionPolicy, Tags
     *
     * @param attribute <p>
     *            Indicates which resource attribute is triggering this update,
     *            such as a change in the resource attribute's
     *            <code>Metadata</code>, <code>Properties</code>, or
     *            <code>Tags</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceAttribute
     */
    public ResourceTargetDefinition withAttribute(ResourceAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name
     * of the property. For all other attributes, the value is null.
     * </p>
     *
     * @return <p>
     *         If the <code>Attribute</code> value is <code>Properties</code>,
     *         the name of the property. For all other attributes, the value is
     *         null.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name
     * of the property. For all other attributes, the value is null.
     * </p>
     *
     * @param name <p>
     *            If the <code>Attribute</code> value is <code>Properties</code>
     *            , the name of the property. For all other attributes, the
     *            value is null.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name
     * of the property. For all other attributes, the value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            If the <code>Attribute</code> value is <code>Properties</code>
     *            , the name of the property. For all other attributes, the
     *            value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceTargetDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates
     * whether a change to this property causes the resource to be recreated.
     * The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a
     * <code>Conditionally</code> recreation, see the update behavior for that
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Never, Conditionally, Always
     *
     * @return <p>
     *         If the <code>Attribute</code> value is <code>Properties</code>,
     *         indicates whether a change to this property causes the resource
     *         to be recreated. The value can be <code>Never</code>,
     *         <code>Always</code>, or <code>Conditionally</code>. To determine
     *         the conditions for a <code>Conditionally</code> recreation, see
     *         the update behavior for that <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >property</a> in the AWS CloudFormation User Guide.
     *         </p>
     * @see RequiresRecreation
     */
    public String getRequiresRecreation() {
        return requiresRecreation;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates
     * whether a change to this property causes the resource to be recreated.
     * The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a
     * <code>Conditionally</code> recreation, see the update behavior for that
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Never, Conditionally, Always
     *
     * @param requiresRecreation <p>
     *            If the <code>Attribute</code> value is <code>Properties</code>
     *            , indicates whether a change to this property causes the
     *            resource to be recreated. The value can be <code>Never</code>,
     *            <code>Always</code>, or <code>Conditionally</code>. To
     *            determine the conditions for a <code>Conditionally</code>
     *            recreation, see the update behavior for that <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >property</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @see RequiresRecreation
     */
    public void setRequiresRecreation(String requiresRecreation) {
        this.requiresRecreation = requiresRecreation;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates
     * whether a change to this property causes the resource to be recreated.
     * The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a
     * <code>Conditionally</code> recreation, see the update behavior for that
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Never, Conditionally, Always
     *
     * @param requiresRecreation <p>
     *            If the <code>Attribute</code> value is <code>Properties</code>
     *            , indicates whether a change to this property causes the
     *            resource to be recreated. The value can be <code>Never</code>,
     *            <code>Always</code>, or <code>Conditionally</code>. To
     *            determine the conditions for a <code>Conditionally</code>
     *            recreation, see the update behavior for that <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >property</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequiresRecreation
     */
    public ResourceTargetDefinition withRequiresRecreation(String requiresRecreation) {
        this.requiresRecreation = requiresRecreation;
        return this;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates
     * whether a change to this property causes the resource to be recreated.
     * The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a
     * <code>Conditionally</code> recreation, see the update behavior for that
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Never, Conditionally, Always
     *
     * @param requiresRecreation <p>
     *            If the <code>Attribute</code> value is <code>Properties</code>
     *            , indicates whether a change to this property causes the
     *            resource to be recreated. The value can be <code>Never</code>,
     *            <code>Always</code>, or <code>Conditionally</code>. To
     *            determine the conditions for a <code>Conditionally</code>
     *            recreation, see the update behavior for that <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >property</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @see RequiresRecreation
     */
    public void setRequiresRecreation(RequiresRecreation requiresRecreation) {
        this.requiresRecreation = requiresRecreation.toString();
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates
     * whether a change to this property causes the resource to be recreated.
     * The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a
     * <code>Conditionally</code> recreation, see the update behavior for that
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Never, Conditionally, Always
     *
     * @param requiresRecreation <p>
     *            If the <code>Attribute</code> value is <code>Properties</code>
     *            , indicates whether a change to this property causes the
     *            resource to be recreated. The value can be <code>Never</code>,
     *            <code>Always</code>, or <code>Conditionally</code>. To
     *            determine the conditions for a <code>Conditionally</code>
     *            recreation, see the update behavior for that <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >property</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequiresRecreation
     */
    public ResourceTargetDefinition withRequiresRecreation(RequiresRecreation requiresRecreation) {
        this.requiresRecreation = requiresRecreation.toString();
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRequiresRecreation() != null)
            sb.append("RequiresRecreation: " + getRequiresRecreation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRequiresRecreation() == null) ? 0 : getRequiresRecreation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTargetDefinition == false)
            return false;
        ResourceTargetDefinition other = (ResourceTargetDefinition) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequiresRecreation() == null ^ this.getRequiresRecreation() == null)
            return false;
        if (other.getRequiresRecreation() != null
                && other.getRequiresRecreation().equals(this.getRequiresRecreation()) == false)
            return false;
        return true;
    }
}
