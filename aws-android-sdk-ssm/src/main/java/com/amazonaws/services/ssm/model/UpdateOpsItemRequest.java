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
 * Edit or change an OpsItem. You must have permission in AWS Identity and
 * Access Management (IAM) to update an OpsItem. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
 * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * Operations engineers and IT professionals use OpsCenter to view, investigate,
 * and remediate operational issues impacting the performance and health of
 * their AWS resources. For more information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
 * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 */
public class UpdateOpsItemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Update the information about the OpsItem. Provide enough information so
     * that users reading this OpsItem for the first time understand the issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Add new keys or edit existing key-value pairs of the OperationalData map
     * in the OpsItem object.
     * </p>
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem. For example, you can specify log files, error strings,
     * license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128
     * characters. The value has a maximum size of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws,
     * amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account
     * or you can restrict search access. Searchable data means that all users
     * with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified
     * data. Operational data that is not searchable is only viewable by users
     * who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a
     * related resource in the request. Use the <code>/aws/automations</code>
     * key in OperationalData to associate an Automation runbook with the
     * OpsItem. To view AWS CLI example commands that use these keys, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems manually</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, OpsItemDataValue> operationalData;

    /**
     * <p>
     * Keys that you want to remove from the OperationalData map.
     * </p>
     */
    private java.util.List<String> operationalDataToDelete;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are
     * sent when this OpsItem is edited or changed.
     * </p>
     */
    private java.util.List<OpsItemNotification> notifications;

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     */
    private Integer priority;

    /**
     * <p>
     * One or more OpsItems that share something in common with the current
     * OpsItems. For example, related OpsItems can include OpsItems with similar
     * error messages, impacted resources, or statuses for the impacted
     * resource.
     * </p>
     */
    private java.util.List<RelatedOpsItem> relatedOpsItems;

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     * >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     */
    private String status;

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     */
    private String opsItemId;

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String title;

    /**
     * <p>
     * Specify a new category for an OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String category;

    /**
     * <p>
     * Specify a new severity for an OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String severity;

    /**
     * <p>
     * Update the information about the OpsItem. Provide enough information so
     * that users reading this OpsItem for the first time understand the issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Update the information about the OpsItem. Provide enough
     *         information so that users reading this OpsItem for the first time
     *         understand the issue.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Update the information about the OpsItem. Provide enough information so
     * that users reading this OpsItem for the first time understand the issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            Update the information about the OpsItem. Provide enough
     *            information so that users reading this OpsItem for the first
     *            time understand the issue.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Update the information about the OpsItem. Provide enough information so
     * that users reading this OpsItem for the first time understand the issue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            Update the information about the OpsItem. Provide enough
     *            information so that users reading this OpsItem for the first
     *            time understand the issue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Add new keys or edit existing key-value pairs of the OperationalData map
     * in the OpsItem object.
     * </p>
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem. For example, you can specify log files, error strings,
     * license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128
     * characters. The value has a maximum size of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws,
     * amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account
     * or you can restrict search access. Searchable data means that all users
     * with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified
     * data. Operational data that is not searchable is only viewable by users
     * who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a
     * related resource in the request. Use the <code>/aws/automations</code>
     * key in OperationalData to associate an Automation runbook with the
     * OpsItem. To view AWS CLI example commands that use these keys, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems manually</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Add new keys or edit existing key-value pairs of the
     *         OperationalData map in the OpsItem object.
     *         </p>
     *         <p>
     *         Operational data is custom data that provides useful reference
     *         details about the OpsItem. For example, you can specify log
     *         files, error strings, license keys, troubleshooting tips, or
     *         other relevant data. You enter operational data as key-value
     *         pairs. The key has a maximum length of 128 characters. The value
     *         has a maximum size of 20 KB.
     *         </p>
     *         <important>
     *         <p>
     *         Operational data keys <i>can't</i> begin with the following:
     *         amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     *         </p>
     *         </important>
     *         <p>
     *         You can choose to make the data searchable by other users in the
     *         account or you can restrict search access. Searchable data means
     *         that all users with access to the OpsItem Overview page (as
     *         provided by the <a>DescribeOpsItems</a> API action) can view and
     *         search on the specified data. Operational data that is not
     *         searchable is only viewable by users who have access to the
     *         OpsItem (as provided by the <a>GetOpsItem</a> API action).
     *         </p>
     *         <p>
     *         Use the <code>/aws/resources</code> key in OperationalData to
     *         specify a related resource in the request. Use the
     *         <code>/aws/automations</code> key in OperationalData to associate
     *         an Automation runbook with the OpsItem. To view AWS CLI example
     *         commands that use these keys, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     *         >Creating OpsItems manually</a> in the <i>AWS Systems Manager
     *         User Guide</i>.
     *         </p>
     */
    public java.util.Map<String, OpsItemDataValue> getOperationalData() {
        return operationalData;
    }

    /**
     * <p>
     * Add new keys or edit existing key-value pairs of the OperationalData map
     * in the OpsItem object.
     * </p>
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem. For example, you can specify log files, error strings,
     * license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128
     * characters. The value has a maximum size of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws,
     * amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account
     * or you can restrict search access. Searchable data means that all users
     * with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified
     * data. Operational data that is not searchable is only viewable by users
     * who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a
     * related resource in the request. Use the <code>/aws/automations</code>
     * key in OperationalData to associate an Automation runbook with the
     * OpsItem. To view AWS CLI example commands that use these keys, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems manually</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     *
     * @param operationalData <p>
     *            Add new keys or edit existing key-value pairs of the
     *            OperationalData map in the OpsItem object.
     *            </p>
     *            <p>
     *            Operational data is custom data that provides useful reference
     *            details about the OpsItem. For example, you can specify log
     *            files, error strings, license keys, troubleshooting tips, or
     *            other relevant data. You enter operational data as key-value
     *            pairs. The key has a maximum length of 128 characters. The
     *            value has a maximum size of 20 KB.
     *            </p>
     *            <important>
     *            <p>
     *            Operational data keys <i>can't</i> begin with the following:
     *            amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     *            </p>
     *            </important>
     *            <p>
     *            You can choose to make the data searchable by other users in
     *            the account or you can restrict search access. Searchable data
     *            means that all users with access to the OpsItem Overview page
     *            (as provided by the <a>DescribeOpsItems</a> API action) can
     *            view and search on the specified data. Operational data that
     *            is not searchable is only viewable by users who have access to
     *            the OpsItem (as provided by the <a>GetOpsItem</a> API action).
     *            </p>
     *            <p>
     *            Use the <code>/aws/resources</code> key in OperationalData to
     *            specify a related resource in the request. Use the
     *            <code>/aws/automations</code> key in OperationalData to
     *            associate an Automation runbook with the OpsItem. To view AWS
     *            CLI example commands that use these keys, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     *            >Creating OpsItems manually</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     */
    public void setOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
    }

    /**
     * <p>
     * Add new keys or edit existing key-value pairs of the OperationalData map
     * in the OpsItem object.
     * </p>
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem. For example, you can specify log files, error strings,
     * license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128
     * characters. The value has a maximum size of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws,
     * amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account
     * or you can restrict search access. Searchable data means that all users
     * with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified
     * data. Operational data that is not searchable is only viewable by users
     * who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a
     * related resource in the request. Use the <code>/aws/automations</code>
     * key in OperationalData to associate an Automation runbook with the
     * OpsItem. To view AWS CLI example commands that use these keys, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems manually</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationalData <p>
     *            Add new keys or edit existing key-value pairs of the
     *            OperationalData map in the OpsItem object.
     *            </p>
     *            <p>
     *            Operational data is custom data that provides useful reference
     *            details about the OpsItem. For example, you can specify log
     *            files, error strings, license keys, troubleshooting tips, or
     *            other relevant data. You enter operational data as key-value
     *            pairs. The key has a maximum length of 128 characters. The
     *            value has a maximum size of 20 KB.
     *            </p>
     *            <important>
     *            <p>
     *            Operational data keys <i>can't</i> begin with the following:
     *            amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     *            </p>
     *            </important>
     *            <p>
     *            You can choose to make the data searchable by other users in
     *            the account or you can restrict search access. Searchable data
     *            means that all users with access to the OpsItem Overview page
     *            (as provided by the <a>DescribeOpsItems</a> API action) can
     *            view and search on the specified data. Operational data that
     *            is not searchable is only viewable by users who have access to
     *            the OpsItem (as provided by the <a>GetOpsItem</a> API action).
     *            </p>
     *            <p>
     *            Use the <code>/aws/resources</code> key in OperationalData to
     *            specify a related resource in the request. Use the
     *            <code>/aws/automations</code> key in OperationalData to
     *            associate an Automation runbook with the OpsItem. To view AWS
     *            CLI example commands that use these keys, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     *            >Creating OpsItems manually</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withOperationalData(
            java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
        return this;
    }

    /**
     * <p>
     * Add new keys or edit existing key-value pairs of the OperationalData map
     * in the OpsItem object.
     * </p>
     * <p>
     * Operational data is custom data that provides useful reference details
     * about the OpsItem. For example, you can specify log files, error strings,
     * license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128
     * characters. The value has a maximum size of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws,
     * amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account
     * or you can restrict search access. Searchable data means that all users
     * with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified
     * data. Operational data that is not searchable is only viewable by users
     * who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a
     * related resource in the request. Use the <code>/aws/automations</code>
     * key in OperationalData to associate an Automation runbook with the
     * OpsItem. To view AWS CLI example commands that use these keys, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems manually</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into OperationalData parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into OperationalData.
     * @param value The corresponding value of the entry to be added into
     *            OperationalData.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest addOperationalDataEntry(String key, OpsItemDataValue value) {
        if (null == this.operationalData) {
            this.operationalData = new java.util.HashMap<String, OpsItemDataValue>();
        }
        if (this.operationalData.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.operationalData.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OperationalData.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateOpsItemRequest clearOperationalDataEntries() {
        this.operationalData = null;
        return this;
    }

    /**
     * <p>
     * Keys that you want to remove from the OperationalData map.
     * </p>
     *
     * @return <p>
     *         Keys that you want to remove from the OperationalData map.
     *         </p>
     */
    public java.util.List<String> getOperationalDataToDelete() {
        return operationalDataToDelete;
    }

    /**
     * <p>
     * Keys that you want to remove from the OperationalData map.
     * </p>
     *
     * @param operationalDataToDelete <p>
     *            Keys that you want to remove from the OperationalData map.
     *            </p>
     */
    public void setOperationalDataToDelete(java.util.Collection<String> operationalDataToDelete) {
        if (operationalDataToDelete == null) {
            this.operationalDataToDelete = null;
            return;
        }

        this.operationalDataToDelete = new java.util.ArrayList<String>(operationalDataToDelete);
    }

    /**
     * <p>
     * Keys that you want to remove from the OperationalData map.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationalDataToDelete <p>
     *            Keys that you want to remove from the OperationalData map.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withOperationalDataToDelete(String... operationalDataToDelete) {
        if (getOperationalDataToDelete() == null) {
            this.operationalDataToDelete = new java.util.ArrayList<String>(
                    operationalDataToDelete.length);
        }
        for (String value : operationalDataToDelete) {
            this.operationalDataToDelete.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Keys that you want to remove from the OperationalData map.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationalDataToDelete <p>
     *            Keys that you want to remove from the OperationalData map.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withOperationalDataToDelete(
            java.util.Collection<String> operationalDataToDelete) {
        setOperationalDataToDelete(operationalDataToDelete);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are
     * sent when this OpsItem is edited or changed.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an SNS topic where
     *         notifications are sent when this OpsItem is edited or changed.
     *         </p>
     */
    public java.util.List<OpsItemNotification> getNotifications() {
        return notifications;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are
     * sent when this OpsItem is edited or changed.
     * </p>
     *
     * @param notifications <p>
     *            The Amazon Resource Name (ARN) of an SNS topic where
     *            notifications are sent when this OpsItem is edited or changed.
     *            </p>
     */
    public void setNotifications(java.util.Collection<OpsItemNotification> notifications) {
        if (notifications == null) {
            this.notifications = null;
            return;
        }

        this.notifications = new java.util.ArrayList<OpsItemNotification>(notifications);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are
     * sent when this OpsItem is edited or changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notifications <p>
     *            The Amazon Resource Name (ARN) of an SNS topic where
     *            notifications are sent when this OpsItem is edited or changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withNotifications(OpsItemNotification... notifications) {
        if (getNotifications() == null) {
            this.notifications = new java.util.ArrayList<OpsItemNotification>(notifications.length);
        }
        for (OpsItemNotification value : notifications) {
            this.notifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are
     * sent when this OpsItem is edited or changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notifications <p>
     *            The Amazon Resource Name (ARN) of an SNS topic where
     *            notifications are sent when this OpsItem is edited or changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withNotifications(
            java.util.Collection<OpsItemNotification> notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @return <p>
     *         The importance of this OpsItem in relation to other OpsItems in
     *         the system.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param priority <p>
     *            The importance of this OpsItem in relation to other OpsItems
     *            in the system.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param priority <p>
     *            The importance of this OpsItem in relation to other OpsItems
     *            in the system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current
     * OpsItems. For example, related OpsItems can include OpsItems with similar
     * error messages, impacted resources, or statuses for the impacted
     * resource.
     * </p>
     *
     * @return <p>
     *         One or more OpsItems that share something in common with the
     *         current OpsItems. For example, related OpsItems can include
     *         OpsItems with similar error messages, impacted resources, or
     *         statuses for the impacted resource.
     *         </p>
     */
    public java.util.List<RelatedOpsItem> getRelatedOpsItems() {
        return relatedOpsItems;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current
     * OpsItems. For example, related OpsItems can include OpsItems with similar
     * error messages, impacted resources, or statuses for the impacted
     * resource.
     * </p>
     *
     * @param relatedOpsItems <p>
     *            One or more OpsItems that share something in common with the
     *            current OpsItems. For example, related OpsItems can include
     *            OpsItems with similar error messages, impacted resources, or
     *            statuses for the impacted resource.
     *            </p>
     */
    public void setRelatedOpsItems(java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        if (relatedOpsItems == null) {
            this.relatedOpsItems = null;
            return;
        }

        this.relatedOpsItems = new java.util.ArrayList<RelatedOpsItem>(relatedOpsItems);
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current
     * OpsItems. For example, related OpsItems can include OpsItems with similar
     * error messages, impacted resources, or statuses for the impacted
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedOpsItems <p>
     *            One or more OpsItems that share something in common with the
     *            current OpsItems. For example, related OpsItems can include
     *            OpsItems with similar error messages, impacted resources, or
     *            statuses for the impacted resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withRelatedOpsItems(RelatedOpsItem... relatedOpsItems) {
        if (getRelatedOpsItems() == null) {
            this.relatedOpsItems = new java.util.ArrayList<RelatedOpsItem>(relatedOpsItems.length);
        }
        for (RelatedOpsItem value : relatedOpsItems) {
            this.relatedOpsItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current
     * OpsItems. For example, related OpsItems can include OpsItems with similar
     * error messages, impacted resources, or statuses for the impacted
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedOpsItems <p>
     *            One or more OpsItems that share something in common with the
     *            current OpsItems. For example, related OpsItems can include
     *            OpsItems with similar error messages, impacted resources, or
     *            statuses for the impacted resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withRelatedOpsItems(
            java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        setRelatedOpsItems(relatedOpsItems);
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     * >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @return <p>
     *         The OpsItem status. Status can be <code>Open</code>,
     *         <code>In Progress</code>, or <code>Resolved</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     *         >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     *         </p>
     * @see OpsItemStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     * >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     *            >Editing OpsItem details</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @see OpsItemStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     * >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     *            >Editing OpsItem details</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemStatus
     */
    public UpdateOpsItemRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     * >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     *            >Editing OpsItem details</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @see OpsItemStatus
     */
    public void setStatus(OpsItemStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>,
     * <code>In Progress</code>, or <code>Resolved</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     * >Editing OpsItem details</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Resolved
     *
     * @param status <p>
     *            The OpsItem status. Status can be <code>Open</code>,
     *            <code>In Progress</code>, or <code>Resolved</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems.html#OpsCenter-working-with-OpsItems-editing-details"
     *            >Editing OpsItem details</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemStatus
     */
    public UpdateOpsItemRequest withStatus(OpsItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the OpsItem.
     *         </p>
     */
    public String getOpsItemId() {
        return opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>
     *            The ID of the OpsItem.
     *            </p>
     */
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>
     *            The ID of the OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
        return this;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A short heading that describes the nature of the OpsItem and the
     *         impacted resource.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param title <p>
     *            A short heading that describes the nature of the OpsItem and
     *            the impacted resource.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param title <p>
     *            A short heading that describes the nature of the OpsItem and
     *            the impacted resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * Specify a new category for an OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Specify a new category for an OpsItem.
     *         </p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * Specify a new category for an OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param category <p>
     *            Specify a new category for an OpsItem.
     *            </p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Specify a new category for an OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param category <p>
     *            Specify a new category for an OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * Specify a new severity for an OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Specify a new severity for an OpsItem.
     *         </p>
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * Specify a new severity for an OpsItem.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param severity <p>
     *            Specify a new severity for an OpsItem.
     *            </p>
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Specify a new severity for an OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param severity <p>
     *            Specify a new severity for an OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpsItemRequest withSeverity(String severity) {
        this.severity = severity;
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
        if (getOperationalData() != null)
            sb.append("OperationalData: " + getOperationalData() + ",");
        if (getOperationalDataToDelete() != null)
            sb.append("OperationalDataToDelete: " + getOperationalDataToDelete() + ",");
        if (getNotifications() != null)
            sb.append("Notifications: " + getNotifications() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getRelatedOpsItems() != null)
            sb.append("RelatedOpsItems: " + getRelatedOpsItems() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getOpsItemId() != null)
            sb.append("OpsItemId: " + getOpsItemId() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOperationalData() == null) ? 0 : getOperationalData().hashCode());
        hashCode = prime
                * hashCode
                + ((getOperationalDataToDelete() == null) ? 0 : getOperationalDataToDelete()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedOpsItems() == null) ? 0 : getRelatedOpsItems().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOpsItemRequest == false)
            return false;
        UpdateOpsItemRequest other = (UpdateOpsItemRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperationalData() == null ^ this.getOperationalData() == null)
            return false;
        if (other.getOperationalData() != null
                && other.getOperationalData().equals(this.getOperationalData()) == false)
            return false;
        if (other.getOperationalDataToDelete() == null ^ this.getOperationalDataToDelete() == null)
            return false;
        if (other.getOperationalDataToDelete() != null
                && other.getOperationalDataToDelete().equals(this.getOperationalDataToDelete()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null
                && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRelatedOpsItems() == null ^ this.getRelatedOpsItems() == null)
            return false;
        if (other.getRelatedOpsItems() != null
                && other.getRelatedOpsItems().equals(this.getRelatedOpsItems()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null
                && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }
}
