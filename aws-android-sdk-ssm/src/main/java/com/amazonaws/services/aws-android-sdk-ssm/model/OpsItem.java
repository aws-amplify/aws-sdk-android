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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues impacting the performance and health of their AWS resources. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>. </p>
 */
public class OpsItem implements Serializable {
    /**
     * <p>The ARN of the AWS account that created the OpsItem.</p>
     */
    private String createdBy;

    /**
     * <p>The date and time the OpsItem was created.</p>
     */
    private java.util.Date createdTime;

    /**
     * <p>The OpsItem description.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>The ARN of the AWS account that last updated the OpsItem.</p>
     */
    private String lastModifiedBy;

    /**
     * <p>The date and time the OpsItem was last updated.</p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     */
    private java.util.List<OpsItemNotification> notifications;

    /**
     * <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     */
    private Integer priority;

    /**
     * <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     */
    private java.util.List<RelatedOpsItem> relatedOpsItems;

    /**
     * <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     */
    private String status;

    /**
     * <p>The ID of the OpsItem.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     */
    private String opsItemId;

    /**
     * <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     */
    private String version;

    /**
     * <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String title;

    /**
     * <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String source;

    /**
     * <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    private java.util.Map<String, OpsItemDataValue> operationalData;

    /**
     * <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String category;

    /**
     * <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String severity;

    /**
     * <p>The ARN of the AWS account that created the OpsItem.</p>
     *
     * @return <p>The ARN of the AWS account that created the OpsItem.</p>
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>The ARN of the AWS account that created the OpsItem.</p>
     *
     * @param createdBy <p>The ARN of the AWS account that created the OpsItem.</p>
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>The ARN of the AWS account that created the OpsItem.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdBy <p>The ARN of the AWS account that created the OpsItem.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>The date and time the OpsItem was created.</p>
     *
     * @return <p>The date and time the OpsItem was created.</p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>The date and time the OpsItem was created.</p>
     *
     * @param createdTime <p>The date and time the OpsItem was created.</p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>The date and time the OpsItem was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime <p>The date and time the OpsItem was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>The OpsItem description.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>The OpsItem description.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>The OpsItem description.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>The OpsItem description.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>The OpsItem description.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>The OpsItem description.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The ARN of the AWS account that last updated the OpsItem.</p>
     *
     * @return <p>The ARN of the AWS account that last updated the OpsItem.</p>
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>The ARN of the AWS account that last updated the OpsItem.</p>
     *
     * @param lastModifiedBy <p>The ARN of the AWS account that last updated the OpsItem.</p>
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>The ARN of the AWS account that last updated the OpsItem.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedBy <p>The ARN of the AWS account that last updated the OpsItem.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>The date and time the OpsItem was last updated.</p>
     *
     * @return <p>The date and time the OpsItem was last updated.</p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>The date and time the OpsItem was last updated.</p>
     *
     * @param lastModifiedTime <p>The date and time the OpsItem was last updated.</p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>The date and time the OpsItem was last updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedTime <p>The date and time the OpsItem was last updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     */
    public java.util.List<OpsItemNotification> getNotifications() {
        return notifications;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     *
     * @param notifications <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     */
    public void setNotifications(java.util.Collection<OpsItemNotification> notifications) {
        if (notifications == null) {
            this.notifications = null;
            return;
        }

        this.notifications = new java.util.ArrayList<OpsItemNotification>(notifications);
    }

    /**
     * <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withNotifications(OpsItemNotification... notifications) {
        if (getNotifications() == null) {
            this.notifications = new java.util.ArrayList<OpsItemNotification>(notifications.length);
        }
        for (OpsItemNotification value : notifications) {
            this.notifications.add(value);
        }
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications <p>The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withNotifications(java.util.Collection<OpsItemNotification> notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @return <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param priority <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param priority <p>The importance of this OpsItem in relation to other OpsItems in the system.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     *
     * @return <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     */
    public java.util.List<RelatedOpsItem> getRelatedOpsItems() {
        return relatedOpsItems;
    }

    /**
     * <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     *
     * @param relatedOpsItems <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     */
    public void setRelatedOpsItems(java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        if (relatedOpsItems == null) {
            this.relatedOpsItems = null;
            return;
        }

        this.relatedOpsItems = new java.util.ArrayList<RelatedOpsItem>(relatedOpsItems);
    }

    /**
     * <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relatedOpsItems <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withRelatedOpsItems(RelatedOpsItem... relatedOpsItems) {
        if (getRelatedOpsItems() == null) {
            this.relatedOpsItems = new java.util.ArrayList<RelatedOpsItem>(relatedOpsItems.length);
        }
        for (RelatedOpsItem value : relatedOpsItems) {
            this.relatedOpsItems.add(value);
        }
        return this;
    }

    /**
     * <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relatedOpsItems <p>One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withRelatedOpsItems(java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        setRelatedOpsItems(relatedOpsItems);
        return this;
    }

    /**
     * <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @return <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @see OpsItemStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @see OpsItemStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OpsItemStatus
     */
    public OpsItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @see OpsItemStatus
     */
    public void setStatus(OpsItemStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html">Editing OpsItem details</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OpsItemStatus
     */
    public OpsItem withStatus(OpsItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The ID of the OpsItem.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @return <p>The ID of the OpsItem.</p>
     */
    public String getOpsItemId() {
        return opsItemId;
    }

    /**
     * <p>The ID of the OpsItem.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>The ID of the OpsItem.</p>
     */
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>The ID of the OpsItem.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>The ID of the OpsItem.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
        return this;
    }

    /**
     * <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     *
     * @return <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     *
     * @param version <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version <p>The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param title <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param title <p>A short heading that describes the nature of the OpsItem and the impacted resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param source <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param source <p>The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public java.util.Map<String, OpsItemDataValue> getOperationalData() {
        return operationalData;
    }

    /**
     * <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @param operationalData <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
    }

    /**
     * <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationalData <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
        return this;
    }

    /**
     * <p>Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.</p> <important> <p>Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.</p> </important> <p>You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API action).</p> <p>Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems">Creating OpsItems manually</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * The method adds a new key-value pair into OperationalData parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into OperationalData.
     * @param value The corresponding value of the entry to be added into OperationalData.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem addOperationalDataEntry(String key, OpsItemDataValue value) {
        if (null == this.operationalData) {
            this.operationalData = new java.util.HashMap<String, OpsItemDataValue>();
        }
        if (this.operationalData.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.operationalData.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OperationalData.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public OpsItem clearOperationalDataEntries() {
        this.operationalData = null;
        return this;
    }

    /**
     * <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param category <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param category <p>An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param severity <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param severity <p>The severity of the OpsItem. Severity options range from 1 to 4.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsItem withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreatedBy() != null) sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getCreatedTime() != null) sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getLastModifiedBy() != null) sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getLastModifiedTime() != null) sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getNotifications() != null) sb.append("Notifications: " + getNotifications() + ",");
        if (getPriority() != null) sb.append("Priority: " + getPriority() + ",");
        if (getRelatedOpsItems() != null) sb.append("RelatedOpsItems: " + getRelatedOpsItems() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getOpsItemId() != null) sb.append("OpsItemId: " + getOpsItemId() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getTitle() != null) sb.append("Title: " + getTitle() + ",");
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getOperationalData() != null) sb.append("OperationalData: " + getOperationalData() + ",");
        if (getCategory() != null) sb.append("Category: " + getCategory() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRelatedOpsItems() == null) ? 0 : getRelatedOpsItems().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getOperationalData() == null) ? 0 : getOperationalData().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OpsItem == false) return false;
        OpsItem other = (OpsItem)obj;

        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null) return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false) return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null) return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null) return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false) return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null) return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false) return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null) return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false) return false;
        if (other.getPriority() == null ^ this.getPriority() == null) return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false) return false;
        if (other.getRelatedOpsItems() == null ^ this.getRelatedOpsItems() == null) return false;
        if (other.getRelatedOpsItems() != null && other.getRelatedOpsItems().equals(this.getRelatedOpsItems()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null) return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false) return false;
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false;
        if (other.getTitle() == null ^ this.getTitle() == null) return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false) return false;
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false;
        if (other.getOperationalData() == null ^ this.getOperationalData() == null) return false;
        if (other.getOperationalData() != null && other.getOperationalData().equals(this.getOperationalData()) == false) return false;
        if (other.getCategory() == null ^ this.getCategory() == null) return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false) return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false;
        return true;
    }
}
