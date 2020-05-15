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
 * The StackSummary Data Type
 * </p>
 */
public class StackSummary implements Serializable {
    /**
     * <p>
     * Unique stack identifier.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The time the stack was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     */
    private java.util.Date deletionTime;

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     */
    private String stackStatus;

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     */
    private String stackStatusReason;

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String parentId;

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String rootId;

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs,
     * or has <i>drifted</i>, from it's expected configuration, as defined in
     * the stack template and any values specified as template parameters. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     */
    private StackDriftInformationSummary driftInformation;

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     *
     * @return <p>
     *         Unique stack identifier.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     *
     * @param stackId <p>
     *            Unique stack identifier.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            Unique stack identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     *
     * @return <p>
     *         The name associated with the stack.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     *
     * @param stackName <p>
     *            The name associated with the stack.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name associated with the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     *
     * @return <p>
     *         The template description of the template used to create the
     *         stack.
     *         </p>
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     *
     * @param templateDescription <p>
     *            The template description of the template used to create the
     *            stack.
     *            </p>
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateDescription <p>
     *            The template description of the template used to create the
     *            stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     *
     * @return <p>
     *         The time the stack was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the stack was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the stack was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     *
     * @return <p>
     *         The time the stack was last updated. This field will only be
     *         returned if the stack has been updated at least once.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The time the stack was last updated. This field will only be
     *            returned if the stack has been updated at least once.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if
     * the stack has been updated at least once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The time the stack was last updated. This field will only be
     *            returned if the stack has been updated at least once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     *
     * @return <p>
     *         The time the stack was deleted.
     *         </p>
     */
    public java.util.Date getDeletionTime() {
        return deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     *
     * @param deletionTime <p>
     *            The time the stack was deleted.
     *            </p>
     */
    public void setDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionTime <p>
     *            The time the stack was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @return <p>
     *         The current status of the stack.
     *         </p>
     * @see StackStatus
     */
    public String getStackStatus() {
        return stackStatus;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            The current status of the stack.
     *            </p>
     * @see StackStatus
     */
    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            The current status of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public StackSummary withStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            The current status of the stack.
     *            </p>
     * @see StackStatus
     */
    public void setStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED,
     * ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE,
     * UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED,
     * UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE,
     * REVIEW_IN_PROGRESS, IMPORT_IN_PROGRESS, IMPORT_COMPLETE,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param stackStatus <p>
     *            The current status of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackStatus
     */
    public StackSummary withStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     *
     * @return <p>
     *         Success/Failure message associated with the stack status.
     *         </p>
     */
    public String getStackStatusReason() {
        return stackStatusReason;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     *
     * @param stackStatusReason <p>
     *            Success/Failure message associated with the stack status.
     *            </p>
     */
    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackStatusReason <p>
     *            Success/Failure message associated with the stack status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         For nested stacks--stacks created as resources for another
     *         stack--the stack ID of the direct parent of this stack. For the
     *         first level of nested stacks, the root stack is also the parent
     *         stack.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     *         Guide</i>.
     *         </p>
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @param parentId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the direct parent of this stack. For
     *            the first level of nested stacks, the root stack is also the
     *            parent stack.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the direct parent of this stack. For the first level of
     * nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the direct parent of this stack. For
     *            the first level of nested stacks, the root stack is also the
     *            parent stack.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         For nested stacks--stacks created as resources for another
     *         stack--the stack ID of the top-level stack to which the nested
     *         stack ultimately belongs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     *         Guide</i>.
     *         </p>
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     *
     * @param rootId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the top-level stack to which the nested
     *            stack ultimately belongs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     */
    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the
     * stack ID of the top-level stack to which the nested stack ultimately
     * belongs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >Working with Nested Stacks</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootId <p>
     *            For nested stacks--stacks created as resources for another
     *            stack--the stack ID of the top-level stack to which the nested
     *            stack ultimately belongs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >Working with Nested Stacks</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs,
     * or has <i>drifted</i>, from it's expected configuration, as defined in
     * the stack template and any values specified as template parameters. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     *
     * @return <p>
     *         Summarizes information on whether a stack's actual configuration
     *         differs, or has <i>drifted</i>, from it's expected configuration,
     *         as defined in the stack template and any values specified as
     *         template parameters. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *         >Detecting Unregulated Configuration Changes to Stacks and
     *         Resources</a>.
     *         </p>
     */
    public StackDriftInformationSummary getDriftInformation() {
        return driftInformation;
    }

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs,
     * or has <i>drifted</i>, from it's expected configuration, as defined in
     * the stack template and any values specified as template parameters. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     *
     * @param driftInformation <p>
     *            Summarizes information on whether a stack's actual
     *            configuration differs, or has <i>drifted</i>, from it's
     *            expected configuration, as defined in the stack template and
     *            any values specified as template parameters. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *            >Detecting Unregulated Configuration Changes to Stacks and
     *            Resources</a>.
     *            </p>
     */
    public void setDriftInformation(StackDriftInformationSummary driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs,
     * or has <i>drifted</i>, from it's expected configuration, as defined in
     * the stack template and any values specified as template parameters. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param driftInformation <p>
     *            Summarizes information on whether a stack's actual
     *            configuration differs, or has <i>drifted</i>, from it's
     *            expected configuration, as defined in the stack template and
     *            any values specified as template parameters. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *            >Detecting Unregulated Configuration Changes to Stacks and
     *            Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSummary withDriftInformation(StackDriftInformationSummary driftInformation) {
        this.driftInformation = driftInformation;
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: " + getDeletionTime() + ",");
        if (getStackStatus() != null)
            sb.append("StackStatus: " + getStackStatus() + ",");
        if (getStackStatusReason() != null)
            sb.append("StackStatusReason: " + getStackStatusReason() + ",");
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getRootId() != null)
            sb.append("RootId: " + getRootId() + ",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: " + getDriftInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        hashCode = prime * hashCode
                + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSummary == false)
            return false;
        StackSummary other = (StackSummary) obj;

        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null
                && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null
                && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getStackStatus() == null ^ this.getStackStatus() == null)
            return false;
        if (other.getStackStatus() != null
                && other.getStackStatus().equals(this.getStackStatus()) == false)
            return false;
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null)
            return false;
        if (other.getStackStatusReason() != null
                && other.getStackStatusReason().equals(this.getStackStatusReason()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null
                && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        return true;
    }
}
