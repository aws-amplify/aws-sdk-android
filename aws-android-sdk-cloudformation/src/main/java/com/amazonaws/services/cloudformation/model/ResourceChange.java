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
 * The <code>ResourceChange</code> structure describes the resource and the
 * action that AWS CloudFormation will perform on it if you execute this change
 * set.
 * </p>
 */
public class ResourceChange implements Serializable {
    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as
     * <code>Add</code> (adds a new resource), <code>Modify</code> (changes a
     * resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Add, Modify, Remove, Import
     */
    private String action;

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     */
    private String logicalResourceId;

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding
     * don't have physical IDs because they haven't been created.
     * </p>
     */
    private String physicalResourceId;

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation
     * will replace the resource by creating a new one and deleting the old one.
     * This value depends on the value of the <code>RequiresRecreation</code>
     * property in the <code>ResourceTargetDefinition</code> structure. For
     * example, if the <code>RequiresRecreation</code> field is
     * <code>Always</code> and the <code>Evaluation</code> field is
     * <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     * the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>,
     * <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different
     * <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A
     * <code>RequiresRecreation</code> value of <code>Always</code> has the most
     * impact, followed by <code>Conditionally</code>, and then
     * <code>Never</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>True, False, Conditional
     */
    private String replacement;

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is
     * triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     */
    private java.util.List<String> scope;

    /**
     * <p>
     * For the <code>Modify</code> action, a list of
     * <code>ResourceChangeDetail</code> structures that describes the changes
     * that AWS CloudFormation will make to the resource.
     * </p>
     */
    private java.util.List<ResourceChangeDetail> details;

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as
     * <code>Add</code> (adds a new resource), <code>Modify</code> (changes a
     * resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Add, Modify, Remove, Import
     *
     * @return <p>
     *         The action that AWS CloudFormation takes on the resource, such as
     *         <code>Add</code> (adds a new resource), <code>Modify</code>
     *         (changes a resource), or <code>Remove</code> (deletes a
     *         resource).
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as
     * <code>Add</code> (adds a new resource), <code>Modify</code> (changes a
     * resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Add, Modify, Remove, Import
     *
     * @param action <p>
     *            The action that AWS CloudFormation takes on the resource, such
     *            as <code>Add</code> (adds a new resource), <code>Modify</code>
     *            (changes a resource), or <code>Remove</code> (deletes a
     *            resource).
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as
     * <code>Add</code> (adds a new resource), <code>Modify</code> (changes a
     * resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Add, Modify, Remove, Import
     *
     * @param action <p>
     *            The action that AWS CloudFormation takes on the resource, such
     *            as <code>Add</code> (adds a new resource), <code>Modify</code>
     *            (changes a resource), or <code>Remove</code> (deletes a
     *            resource).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public ResourceChange withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as
     * <code>Add</code> (adds a new resource), <code>Modify</code> (changes a
     * resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Add, Modify, Remove, Import
     *
     * @param action <p>
     *            The action that AWS CloudFormation takes on the resource, such
     *            as <code>Add</code> (adds a new resource), <code>Modify</code>
     *            (changes a resource), or <code>Remove</code> (deletes a
     *            resource).
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as
     * <code>Add</code> (adds a new resource), <code>Modify</code> (changes a
     * resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Add, Modify, Remove, Import
     *
     * @param action <p>
     *            The action that AWS CloudFormation takes on the resource, such
     *            as <code>Add</code> (adds a new resource), <code>Modify</code>
     *            (changes a resource), or <code>Remove</code> (deletes a
     *            resource).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public ResourceChange withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     *
     * @return <p>
     *         The resource's logical ID, which is defined in the stack's
     *         template.
     *         </p>
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     *
     * @param logicalResourceId <p>
     *            The resource's logical ID, which is defined in the stack's
     *            template.
     *            </p>
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceId <p>
     *            The resource's logical ID, which is defined in the stack's
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding
     * don't have physical IDs because they haven't been created.
     * </p>
     *
     * @return <p>
     *         The resource's physical ID (resource name). Resources that you
     *         are adding don't have physical IDs because they haven't been
     *         created.
     *         </p>
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding
     * don't have physical IDs because they haven't been created.
     * </p>
     *
     * @param physicalResourceId <p>
     *            The resource's physical ID (resource name). Resources that you
     *            are adding don't have physical IDs because they haven't been
     *            created.
     *            </p>
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding
     * don't have physical IDs because they haven't been created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalResourceId <p>
     *            The resource's physical ID (resource name). Resources that you
     *            are adding don't have physical IDs because they haven't been
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The type of AWS CloudFormation resource, such as
     *         <code>AWS::S3::Bucket</code>.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The type of AWS CloudFormation resource, such as
     *            <code>AWS::S3::Bucket</code>.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as
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
     *            The type of AWS CloudFormation resource, such as
     *            <code>AWS::S3::Bucket</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation
     * will replace the resource by creating a new one and deleting the old one.
     * This value depends on the value of the <code>RequiresRecreation</code>
     * property in the <code>ResourceTargetDefinition</code> structure. For
     * example, if the <code>RequiresRecreation</code> field is
     * <code>Always</code> and the <code>Evaluation</code> field is
     * <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     * the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>,
     * <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different
     * <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A
     * <code>RequiresRecreation</code> value of <code>Always</code> has the most
     * impact, followed by <code>Conditionally</code>, and then
     * <code>Never</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>True, False, Conditional
     *
     * @return <p>
     *         For the <code>Modify</code> action, indicates whether AWS
     *         CloudFormation will replace the resource by creating a new one
     *         and deleting the old one. This value depends on the value of the
     *         <code>RequiresRecreation</code> property in the
     *         <code>ResourceTargetDefinition</code> structure. For example, if
     *         the <code>RequiresRecreation</code> field is <code>Always</code>
     *         and the <code>Evaluation</code> field is <code>Static</code>,
     *         <code>Replacement</code> is <code>True</code>. If the
     *         <code>RequiresRecreation</code> field is <code>Always</code> and
     *         the <code>Evaluation</code> field is <code>Dynamic</code>,
     *         <code>Replacement</code> is <code>Conditionally</code>.
     *         </p>
     *         <p>
     *         If you have multiple changes with different
     *         <code>RequiresRecreation</code> values, the
     *         <code>Replacement</code> value depends on the change with the
     *         most impact. A <code>RequiresRecreation</code> value of
     *         <code>Always</code> has the most impact, followed by
     *         <code>Conditionally</code>, and then <code>Never</code>.
     *         </p>
     * @see Replacement
     */
    public String getReplacement() {
        return replacement;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation
     * will replace the resource by creating a new one and deleting the old one.
     * This value depends on the value of the <code>RequiresRecreation</code>
     * property in the <code>ResourceTargetDefinition</code> structure. For
     * example, if the <code>RequiresRecreation</code> field is
     * <code>Always</code> and the <code>Evaluation</code> field is
     * <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     * the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>,
     * <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different
     * <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A
     * <code>RequiresRecreation</code> value of <code>Always</code> has the most
     * impact, followed by <code>Conditionally</code>, and then
     * <code>Never</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>True, False, Conditional
     *
     * @param replacement <p>
     *            For the <code>Modify</code> action, indicates whether AWS
     *            CloudFormation will replace the resource by creating a new one
     *            and deleting the old one. This value depends on the value of
     *            the <code>RequiresRecreation</code> property in the
     *            <code>ResourceTargetDefinition</code> structure. For example,
     *            if the <code>RequiresRecreation</code> field is
     *            <code>Always</code> and the <code>Evaluation</code> field is
     *            <code>Static</code>, <code>Replacement</code> is
     *            <code>True</code>. If the <code>RequiresRecreation</code>
     *            field is <code>Always</code> and the <code>Evaluation</code>
     *            field is <code>Dynamic</code>, <code>Replacement</code> is
     *            <code>Conditionally</code>.
     *            </p>
     *            <p>
     *            If you have multiple changes with different
     *            <code>RequiresRecreation</code> values, the
     *            <code>Replacement</code> value depends on the change with the
     *            most impact. A <code>RequiresRecreation</code> value of
     *            <code>Always</code> has the most impact, followed by
     *            <code>Conditionally</code>, and then <code>Never</code>.
     *            </p>
     * @see Replacement
     */
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation
     * will replace the resource by creating a new one and deleting the old one.
     * This value depends on the value of the <code>RequiresRecreation</code>
     * property in the <code>ResourceTargetDefinition</code> structure. For
     * example, if the <code>RequiresRecreation</code> field is
     * <code>Always</code> and the <code>Evaluation</code> field is
     * <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     * the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>,
     * <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different
     * <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A
     * <code>RequiresRecreation</code> value of <code>Always</code> has the most
     * impact, followed by <code>Conditionally</code>, and then
     * <code>Never</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>True, False, Conditional
     *
     * @param replacement <p>
     *            For the <code>Modify</code> action, indicates whether AWS
     *            CloudFormation will replace the resource by creating a new one
     *            and deleting the old one. This value depends on the value of
     *            the <code>RequiresRecreation</code> property in the
     *            <code>ResourceTargetDefinition</code> structure. For example,
     *            if the <code>RequiresRecreation</code> field is
     *            <code>Always</code> and the <code>Evaluation</code> field is
     *            <code>Static</code>, <code>Replacement</code> is
     *            <code>True</code>. If the <code>RequiresRecreation</code>
     *            field is <code>Always</code> and the <code>Evaluation</code>
     *            field is <code>Dynamic</code>, <code>Replacement</code> is
     *            <code>Conditionally</code>.
     *            </p>
     *            <p>
     *            If you have multiple changes with different
     *            <code>RequiresRecreation</code> values, the
     *            <code>Replacement</code> value depends on the change with the
     *            most impact. A <code>RequiresRecreation</code> value of
     *            <code>Always</code> has the most impact, followed by
     *            <code>Conditionally</code>, and then <code>Never</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Replacement
     */
    public ResourceChange withReplacement(String replacement) {
        this.replacement = replacement;
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation
     * will replace the resource by creating a new one and deleting the old one.
     * This value depends on the value of the <code>RequiresRecreation</code>
     * property in the <code>ResourceTargetDefinition</code> structure. For
     * example, if the <code>RequiresRecreation</code> field is
     * <code>Always</code> and the <code>Evaluation</code> field is
     * <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     * the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>,
     * <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different
     * <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A
     * <code>RequiresRecreation</code> value of <code>Always</code> has the most
     * impact, followed by <code>Conditionally</code>, and then
     * <code>Never</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>True, False, Conditional
     *
     * @param replacement <p>
     *            For the <code>Modify</code> action, indicates whether AWS
     *            CloudFormation will replace the resource by creating a new one
     *            and deleting the old one. This value depends on the value of
     *            the <code>RequiresRecreation</code> property in the
     *            <code>ResourceTargetDefinition</code> structure. For example,
     *            if the <code>RequiresRecreation</code> field is
     *            <code>Always</code> and the <code>Evaluation</code> field is
     *            <code>Static</code>, <code>Replacement</code> is
     *            <code>True</code>. If the <code>RequiresRecreation</code>
     *            field is <code>Always</code> and the <code>Evaluation</code>
     *            field is <code>Dynamic</code>, <code>Replacement</code> is
     *            <code>Conditionally</code>.
     *            </p>
     *            <p>
     *            If you have multiple changes with different
     *            <code>RequiresRecreation</code> values, the
     *            <code>Replacement</code> value depends on the change with the
     *            most impact. A <code>RequiresRecreation</code> value of
     *            <code>Always</code> has the most impact, followed by
     *            <code>Conditionally</code>, and then <code>Never</code>.
     *            </p>
     * @see Replacement
     */
    public void setReplacement(Replacement replacement) {
        this.replacement = replacement.toString();
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation
     * will replace the resource by creating a new one and deleting the old one.
     * This value depends on the value of the <code>RequiresRecreation</code>
     * property in the <code>ResourceTargetDefinition</code> structure. For
     * example, if the <code>RequiresRecreation</code> field is
     * <code>Always</code> and the <code>Evaluation</code> field is
     * <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     * the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>,
     * <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different
     * <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A
     * <code>RequiresRecreation</code> value of <code>Always</code> has the most
     * impact, followed by <code>Conditionally</code>, and then
     * <code>Never</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>True, False, Conditional
     *
     * @param replacement <p>
     *            For the <code>Modify</code> action, indicates whether AWS
     *            CloudFormation will replace the resource by creating a new one
     *            and deleting the old one. This value depends on the value of
     *            the <code>RequiresRecreation</code> property in the
     *            <code>ResourceTargetDefinition</code> structure. For example,
     *            if the <code>RequiresRecreation</code> field is
     *            <code>Always</code> and the <code>Evaluation</code> field is
     *            <code>Static</code>, <code>Replacement</code> is
     *            <code>True</code>. If the <code>RequiresRecreation</code>
     *            field is <code>Always</code> and the <code>Evaluation</code>
     *            field is <code>Dynamic</code>, <code>Replacement</code> is
     *            <code>Conditionally</code>.
     *            </p>
     *            <p>
     *            If you have multiple changes with different
     *            <code>RequiresRecreation</code> values, the
     *            <code>Replacement</code> value depends on the change with the
     *            most impact. A <code>RequiresRecreation</code> value of
     *            <code>Always</code> has the most impact, followed by
     *            <code>Conditionally</code>, and then <code>Never</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Replacement
     */
    public ResourceChange withReplacement(Replacement replacement) {
        this.replacement = replacement.toString();
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is
     * triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     *
     * @return <p>
     *         For the <code>Modify</code> action, indicates which resource
     *         attribute is triggering this update, such as a change in the
     *         resource attribute's <code>Metadata</code>,
     *         <code>Properties</code>, or <code>Tags</code>.
     *         </p>
     */
    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is
     * triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     *
     * @param scope <p>
     *            For the <code>Modify</code> action, indicates which resource
     *            attribute is triggering this update, such as a change in the
     *            resource attribute's <code>Metadata</code>,
     *            <code>Properties</code>, or <code>Tags</code>.
     *            </p>
     */
    public void setScope(java.util.Collection<String> scope) {
        if (scope == null) {
            this.scope = null;
            return;
        }

        this.scope = new java.util.ArrayList<String>(scope);
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is
     * triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scope <p>
     *            For the <code>Modify</code> action, indicates which resource
     *            attribute is triggering this update, such as a change in the
     *            resource attribute's <code>Metadata</code>,
     *            <code>Properties</code>, or <code>Tags</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withScope(String... scope) {
        if (getScope() == null) {
            this.scope = new java.util.ArrayList<String>(scope.length);
        }
        for (String value : scope) {
            this.scope.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is
     * triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scope <p>
     *            For the <code>Modify</code> action, indicates which resource
     *            attribute is triggering this update, such as a change in the
     *            resource attribute's <code>Metadata</code>,
     *            <code>Properties</code>, or <code>Tags</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withScope(java.util.Collection<String> scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of
     * <code>ResourceChangeDetail</code> structures that describes the changes
     * that AWS CloudFormation will make to the resource.
     * </p>
     *
     * @return <p>
     *         For the <code>Modify</code> action, a list of
     *         <code>ResourceChangeDetail</code> structures that describes the
     *         changes that AWS CloudFormation will make to the resource.
     *         </p>
     */
    public java.util.List<ResourceChangeDetail> getDetails() {
        return details;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of
     * <code>ResourceChangeDetail</code> structures that describes the changes
     * that AWS CloudFormation will make to the resource.
     * </p>
     *
     * @param details <p>
     *            For the <code>Modify</code> action, a list of
     *            <code>ResourceChangeDetail</code> structures that describes
     *            the changes that AWS CloudFormation will make to the resource.
     *            </p>
     */
    public void setDetails(java.util.Collection<ResourceChangeDetail> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new java.util.ArrayList<ResourceChangeDetail>(details);
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of
     * <code>ResourceChangeDetail</code> structures that describes the changes
     * that AWS CloudFormation will make to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            For the <code>Modify</code> action, a list of
     *            <code>ResourceChangeDetail</code> structures that describes
     *            the changes that AWS CloudFormation will make to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withDetails(ResourceChangeDetail... details) {
        if (getDetails() == null) {
            this.details = new java.util.ArrayList<ResourceChangeDetail>(details.length);
        }
        for (ResourceChangeDetail value : details) {
            this.details.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of
     * <code>ResourceChangeDetail</code> structures that describes the changes
     * that AWS CloudFormation will make to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            For the <code>Modify</code> action, a list of
     *            <code>ResourceChangeDetail</code> structures that describes
     *            the changes that AWS CloudFormation will make to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceChange withDetails(java.util.Collection<ResourceChangeDetail> details) {
        setDetails(details);
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getReplacement() != null)
            sb.append("Replacement: " + getReplacement() + ",");
        if (getScope() != null)
            sb.append("Scope: " + getScope() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getReplacement() == null) ? 0 : getReplacement().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChange == false)
            return false;
        ResourceChange other = (ResourceChange) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null
                && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null
                && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getReplacement() == null ^ this.getReplacement() == null)
            return false;
        if (other.getReplacement() != null
                && other.getReplacement().equals(this.getReplacement()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
