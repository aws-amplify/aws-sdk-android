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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers a compliance type and other compliance details on a designated
 * resource. This action lets you register custom compliance details with a
 * resource. This call overwrites existing compliance information on the
 * resource, so you must provide a full list of compliance items each time that
 * you send the request.
 * </p>
 * <p>
 * ComplianceType can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * ExecutionId: The execution ID when the patch, association, or custom
 * compliance item was applied.
 * </p>
 * </li>
 * <li>
 * <p>
 * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * ExecutionTime. The time the patch, association, or custom compliance item was
 * applied to the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Id: The patch, association, or custom compliance ID.
 * </p>
 * </li>
 * <li>
 * <p>
 * Title: A title.
 * </p>
 * </li>
 * <li>
 * <p>
 * Status: The status of the compliance item. For example, <code>approved</code>
 * for patches, or <code>Failed</code> for associations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Severity: A patch severity. For example, <code>critical</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
 * </p>
 * </li>
 * <li>
 * <p>
 * DocumentVersion: An SSM document version number. For example, 4.
 * </p>
 * </li>
 * <li>
 * <p>
 * Classification: A patch classification. For example,
 * <code>security updates</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * PatchBaselineId: A patch baseline ID.
 * </p>
 * </li>
 * <li>
 * <p>
 * PatchSeverity: A patch severity. For example, <code>Critical</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * PatchState: A patch state. For example,
 * <code>InstancesWithFailedPatches</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * PatchGroup: The name of a patch group.
 * </p>
 * </li>
 * <li>
 * <p>
 * InstalledTime: The time the association, patch, or custom compliance item was
 * applied to the resource. Specify the time by using the following format:
 * yyyy-MM-dd'T'HH:mm:ss'Z'
 * </p>
 * </li>
 * </ul>
 */
public class PutComplianceItemsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the
     * instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String resourceId;

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently
     * the only supported resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String resourceType;

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a
     * State Manager association), Patch, or Custom:<code>string</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     */
    private String complianceType;

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type
     * of execution (for example, <code>Command</code>), and the date/time of
     * the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     */
    private ComplianceExecutionSummary executionSummary;

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For
     * example, for a patch compliance type, <code>Items</code> includes
     * information about the PatchSeverity, Classification, and so on.
     * </p>
     */
    private java.util.List<ComplianceItemEntry> items;

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if
     * existing information should be overwritten or ignored. If the content
     * hashes match, the request to put compliance information is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String itemContentHash;

    /**
     * <p>
     * The mode for uploading compliance items. You can specify
     * <code>COMPLETE</code> or <code>PARTIAL</code>. In <code>COMPLETE</code>
     * mode, the system overwrites all existing compliance information for the
     * resource. You must provide a full list of compliance items each time you
     * send the request.
     * </p>
     * <p>
     * In <code>PARTIAL</code> mode, the system overwrites compliance
     * information for a specific association. The association must be
     * configured with <code>SyncCompliance</code> set to <code>MANUAL</code>.
     * By default, all requests use <code>COMPLETE</code> mode.
     * </p>
     * <note>
     * <p>
     * This attribute is only valid for association compliance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PARTIAL
     */
    private String uploadType;

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the
     * instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specify an ID for this resource. For a managed instance, this is
     *         the instance ID.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the
     * instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>
     *            Specify an ID for this resource. For a managed instance, this
     *            is the instance ID.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the
     * instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>
     *            Specify an ID for this resource. For a managed instance, this
     *            is the instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently
     * the only supported resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         Specify the type of resource. <code>ManagedInstance</code> is
     *         currently the only supported resource type.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently
     * the only supported resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>
     *            Specify the type of resource. <code>ManagedInstance</code> is
     *            currently the only supported resource type.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently
     * the only supported resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>
     *            Specify the type of resource. <code>ManagedInstance</code> is
     *            currently the only supported resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a
     * State Manager association), Patch, or Custom:<code>string</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @return <p>
     *         Specify the compliance type. For example, specify Association
     *         (for a State Manager association), Patch, or Custom:
     *         <code>string</code>.
     *         </p>
     */
    public String getComplianceType() {
        return complianceType;
    }

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a
     * State Manager association), Patch, or Custom:<code>string</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>
     *            Specify the compliance type. For example, specify Association
     *            (for a State Manager association), Patch, or Custom:
     *            <code>string</code>.
     *            </p>
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a
     * State Manager association), Patch, or Custom:<code>string</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>
     *            Specify the compliance type. For example, specify Association
     *            (for a State Manager association), Patch, or Custom:
     *            <code>string</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type
     * of execution (for example, <code>Command</code>), and the date/time of
     * the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     *
     * @return <p>
     *         A summary of the call execution that includes an execution ID,
     *         the type of execution (for example, <code>Command</code>), and
     *         the date/time of the execution using a datetime object that is
     *         saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     *         </p>
     */
    public ComplianceExecutionSummary getExecutionSummary() {
        return executionSummary;
    }

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type
     * of execution (for example, <code>Command</code>), and the date/time of
     * the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     *
     * @param executionSummary <p>
     *            A summary of the call execution that includes an execution ID,
     *            the type of execution (for example, <code>Command</code>), and
     *            the date/time of the execution using a datetime object that is
     *            saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     *            </p>
     */
    public void setExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type
     * of execution (for example, <code>Command</code>), and the date/time of
     * the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionSummary <p>
     *            A summary of the call execution that includes an execution ID,
     *            the type of execution (for example, <code>Command</code>), and
     *            the date/time of the execution using a datetime object that is
     *            saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withExecutionSummary(
            ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
        return this;
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For
     * example, for a patch compliance type, <code>Items</code> includes
     * information about the PatchSeverity, Classification, and so on.
     * </p>
     *
     * @return <p>
     *         Information about the compliance as defined by the resource type.
     *         For example, for a patch compliance type, <code>Items</code>
     *         includes information about the PatchSeverity, Classification, and
     *         so on.
     *         </p>
     */
    public java.util.List<ComplianceItemEntry> getItems() {
        return items;
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For
     * example, for a patch compliance type, <code>Items</code> includes
     * information about the PatchSeverity, Classification, and so on.
     * </p>
     *
     * @param items <p>
     *            Information about the compliance as defined by the resource
     *            type. For example, for a patch compliance type,
     *            <code>Items</code> includes information about the
     *            PatchSeverity, Classification, and so on.
     *            </p>
     */
    public void setItems(java.util.Collection<ComplianceItemEntry> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ComplianceItemEntry>(items);
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For
     * example, for a patch compliance type, <code>Items</code> includes
     * information about the PatchSeverity, Classification, and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Information about the compliance as defined by the resource
     *            type. For example, for a patch compliance type,
     *            <code>Items</code> includes information about the
     *            PatchSeverity, Classification, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withItems(ComplianceItemEntry... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<ComplianceItemEntry>(items.length);
        }
        for (ComplianceItemEntry value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For
     * example, for a patch compliance type, <code>Items</code> includes
     * information about the PatchSeverity, Classification, and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Information about the compliance as defined by the resource
     *            type. For example, for a patch compliance type,
     *            <code>Items</code> includes information about the
     *            PatchSeverity, Classification, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withItems(java.util.Collection<ComplianceItemEntry> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if
     * existing information should be overwritten or ignored. If the content
     * hashes match, the request to put compliance information is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         MD5 or SHA-256 content hash. The content hash is used to
     *         determine if existing information should be overwritten or
     *         ignored. If the content hashes match, the request to put
     *         compliance information is ignored.
     *         </p>
     */
    public String getItemContentHash() {
        return itemContentHash;
    }

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if
     * existing information should be overwritten or ignored. If the content
     * hashes match, the request to put compliance information is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param itemContentHash <p>
     *            MD5 or SHA-256 content hash. The content hash is used to
     *            determine if existing information should be overwritten or
     *            ignored. If the content hashes match, the request to put
     *            compliance information is ignored.
     *            </p>
     */
    public void setItemContentHash(String itemContentHash) {
        this.itemContentHash = itemContentHash;
    }

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if
     * existing information should be overwritten or ignored. If the content
     * hashes match, the request to put compliance information is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param itemContentHash <p>
     *            MD5 or SHA-256 content hash. The content hash is used to
     *            determine if existing information should be overwritten or
     *            ignored. If the content hashes match, the request to put
     *            compliance information is ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutComplianceItemsRequest withItemContentHash(String itemContentHash) {
        this.itemContentHash = itemContentHash;
        return this;
    }

    /**
     * <p>
     * The mode for uploading compliance items. You can specify
     * <code>COMPLETE</code> or <code>PARTIAL</code>. In <code>COMPLETE</code>
     * mode, the system overwrites all existing compliance information for the
     * resource. You must provide a full list of compliance items each time you
     * send the request.
     * </p>
     * <p>
     * In <code>PARTIAL</code> mode, the system overwrites compliance
     * information for a specific association. The association must be
     * configured with <code>SyncCompliance</code> set to <code>MANUAL</code>.
     * By default, all requests use <code>COMPLETE</code> mode.
     * </p>
     * <note>
     * <p>
     * This attribute is only valid for association compliance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PARTIAL
     *
     * @return <p>
     *         The mode for uploading compliance items. You can specify
     *         <code>COMPLETE</code> or <code>PARTIAL</code>. In
     *         <code>COMPLETE</code> mode, the system overwrites all existing
     *         compliance information for the resource. You must provide a full
     *         list of compliance items each time you send the request.
     *         </p>
     *         <p>
     *         In <code>PARTIAL</code> mode, the system overwrites compliance
     *         information for a specific association. The association must be
     *         configured with <code>SyncCompliance</code> set to
     *         <code>MANUAL</code>. By default, all requests use
     *         <code>COMPLETE</code> mode.
     *         </p>
     *         <note>
     *         <p>
     *         This attribute is only valid for association compliance.
     *         </p>
     *         </note>
     * @see ComplianceUploadType
     */
    public String getUploadType() {
        return uploadType;
    }

    /**
     * <p>
     * The mode for uploading compliance items. You can specify
     * <code>COMPLETE</code> or <code>PARTIAL</code>. In <code>COMPLETE</code>
     * mode, the system overwrites all existing compliance information for the
     * resource. You must provide a full list of compliance items each time you
     * send the request.
     * </p>
     * <p>
     * In <code>PARTIAL</code> mode, the system overwrites compliance
     * information for a specific association. The association must be
     * configured with <code>SyncCompliance</code> set to <code>MANUAL</code>.
     * By default, all requests use <code>COMPLETE</code> mode.
     * </p>
     * <note>
     * <p>
     * This attribute is only valid for association compliance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PARTIAL
     *
     * @param uploadType <p>
     *            The mode for uploading compliance items. You can specify
     *            <code>COMPLETE</code> or <code>PARTIAL</code>. In
     *            <code>COMPLETE</code> mode, the system overwrites all existing
     *            compliance information for the resource. You must provide a
     *            full list of compliance items each time you send the request.
     *            </p>
     *            <p>
     *            In <code>PARTIAL</code> mode, the system overwrites compliance
     *            information for a specific association. The association must
     *            be configured with <code>SyncCompliance</code> set to
     *            <code>MANUAL</code>. By default, all requests use
     *            <code>COMPLETE</code> mode.
     *            </p>
     *            <note>
     *            <p>
     *            This attribute is only valid for association compliance.
     *            </p>
     *            </note>
     * @see ComplianceUploadType
     */
    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    /**
     * <p>
     * The mode for uploading compliance items. You can specify
     * <code>COMPLETE</code> or <code>PARTIAL</code>. In <code>COMPLETE</code>
     * mode, the system overwrites all existing compliance information for the
     * resource. You must provide a full list of compliance items each time you
     * send the request.
     * </p>
     * <p>
     * In <code>PARTIAL</code> mode, the system overwrites compliance
     * information for a specific association. The association must be
     * configured with <code>SyncCompliance</code> set to <code>MANUAL</code>.
     * By default, all requests use <code>COMPLETE</code> mode.
     * </p>
     * <note>
     * <p>
     * This attribute is only valid for association compliance.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PARTIAL
     *
     * @param uploadType <p>
     *            The mode for uploading compliance items. You can specify
     *            <code>COMPLETE</code> or <code>PARTIAL</code>. In
     *            <code>COMPLETE</code> mode, the system overwrites all existing
     *            compliance information for the resource. You must provide a
     *            full list of compliance items each time you send the request.
     *            </p>
     *            <p>
     *            In <code>PARTIAL</code> mode, the system overwrites compliance
     *            information for a specific association. The association must
     *            be configured with <code>SyncCompliance</code> set to
     *            <code>MANUAL</code>. By default, all requests use
     *            <code>COMPLETE</code> mode.
     *            </p>
     *            <note>
     *            <p>
     *            This attribute is only valid for association compliance.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceUploadType
     */
    public PutComplianceItemsRequest withUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }

    /**
     * <p>
     * The mode for uploading compliance items. You can specify
     * <code>COMPLETE</code> or <code>PARTIAL</code>. In <code>COMPLETE</code>
     * mode, the system overwrites all existing compliance information for the
     * resource. You must provide a full list of compliance items each time you
     * send the request.
     * </p>
     * <p>
     * In <code>PARTIAL</code> mode, the system overwrites compliance
     * information for a specific association. The association must be
     * configured with <code>SyncCompliance</code> set to <code>MANUAL</code>.
     * By default, all requests use <code>COMPLETE</code> mode.
     * </p>
     * <note>
     * <p>
     * This attribute is only valid for association compliance.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PARTIAL
     *
     * @param uploadType <p>
     *            The mode for uploading compliance items. You can specify
     *            <code>COMPLETE</code> or <code>PARTIAL</code>. In
     *            <code>COMPLETE</code> mode, the system overwrites all existing
     *            compliance information for the resource. You must provide a
     *            full list of compliance items each time you send the request.
     *            </p>
     *            <p>
     *            In <code>PARTIAL</code> mode, the system overwrites compliance
     *            information for a specific association. The association must
     *            be configured with <code>SyncCompliance</code> set to
     *            <code>MANUAL</code>. By default, all requests use
     *            <code>COMPLETE</code> mode.
     *            </p>
     *            <note>
     *            <p>
     *            This attribute is only valid for association compliance.
     *            </p>
     *            </note>
     * @see ComplianceUploadType
     */
    public void setUploadType(ComplianceUploadType uploadType) {
        this.uploadType = uploadType.toString();
    }

    /**
     * <p>
     * The mode for uploading compliance items. You can specify
     * <code>COMPLETE</code> or <code>PARTIAL</code>. In <code>COMPLETE</code>
     * mode, the system overwrites all existing compliance information for the
     * resource. You must provide a full list of compliance items each time you
     * send the request.
     * </p>
     * <p>
     * In <code>PARTIAL</code> mode, the system overwrites compliance
     * information for a specific association. The association must be
     * configured with <code>SyncCompliance</code> set to <code>MANUAL</code>.
     * By default, all requests use <code>COMPLETE</code> mode.
     * </p>
     * <note>
     * <p>
     * This attribute is only valid for association compliance.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PARTIAL
     *
     * @param uploadType <p>
     *            The mode for uploading compliance items. You can specify
     *            <code>COMPLETE</code> or <code>PARTIAL</code>. In
     *            <code>COMPLETE</code> mode, the system overwrites all existing
     *            compliance information for the resource. You must provide a
     *            full list of compliance items each time you send the request.
     *            </p>
     *            <p>
     *            In <code>PARTIAL</code> mode, the system overwrites compliance
     *            information for a specific association. The association must
     *            be configured with <code>SyncCompliance</code> set to
     *            <code>MANUAL</code>. By default, all requests use
     *            <code>COMPLETE</code> mode.
     *            </p>
     *            <note>
     *            <p>
     *            This attribute is only valid for association compliance.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceUploadType
     */
    public PutComplianceItemsRequest withUploadType(ComplianceUploadType uploadType) {
        this.uploadType = uploadType.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: " + getComplianceType() + ",");
        if (getExecutionSummary() != null)
            sb.append("ExecutionSummary: " + getExecutionSummary() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getItemContentHash() != null)
            sb.append("ItemContentHash: " + getItemContentHash() + ",");
        if (getUploadType() != null)
            sb.append("UploadType: " + getUploadType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode
                + ((getItemContentHash() == null) ? 0 : getItemContentHash().hashCode());
        hashCode = prime * hashCode + ((getUploadType() == null) ? 0 : getUploadType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutComplianceItemsRequest == false)
            return false;
        PutComplianceItemsRequest other = (PutComplianceItemsRequest) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null
                && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null)
            return false;
        if (other.getExecutionSummary() != null
                && other.getExecutionSummary().equals(this.getExecutionSummary()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getItemContentHash() == null ^ this.getItemContentHash() == null)
            return false;
        if (other.getItemContentHash() != null
                && other.getItemContentHash().equals(this.getItemContentHash()) == false)
            return false;
        if (other.getUploadType() == null ^ this.getUploadType() == null)
            return false;
        if (other.getUploadType() != null
                && other.getUploadType().equals(this.getUploadType()) == false)
            return false;
        return true;
    }
}
