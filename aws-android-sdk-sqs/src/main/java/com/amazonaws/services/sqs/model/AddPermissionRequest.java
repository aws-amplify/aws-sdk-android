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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a permission to a queue for a specific <a
 * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
 * >principal</a>. This allows sharing access to the queue.
 * </p>
 * <p>
 * When you create a queue, you have full control access rights for the queue.
 * Only you, the owner of the queue, can grant or deny permissions to the queue.
 * For more information about these permissions, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-writing-an-sqs-policy.html#write-messages-to-shared-queue"
 * >Allow Developers to Write Messages to a Shared Queue</a> in the <i>Amazon
 * Simple Queue Service Developer Guide</i>.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * <code>AddPermission</code> generates a policy for you. You can use
 * <code> <a>SetQueueAttributes</a> </code> to upload your policy. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html"
 * >Using Custom Policies with the Amazon SQS Access Policy Language</a> in the
 * <i>Amazon Simple Queue Service Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * An Amazon SQS policy can have a maximum of 7 actions.
 * </p>
 * </li>
 * <li>
 * <p>
 * To remove the ability to change queue permissions, you must deny permission
 * to the <code>AddPermission</code>, <code>RemovePermission</code>, and
 * <code>SetQueueAttributes</code> actions in your IAM policy.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * Some actions take lists of parameters. These lists are specified using the
 * <code>param.n</code> notation. Values of <code>n</code> are integers starting
 * from 1. For example, a parameter list with two elements looks like this:
 * </p>
 * <p>
 * <code>&amp;AttributeName.1=first</code>
 * </p>
 * <p>
 * <code>&amp;AttributeName.2=second</code>
 * </p>
 * <note>
 * <p>
 * Cross-account permissions don't apply to this action. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
 * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
 * <i>Amazon Simple Queue Service Developer Guide</i>.
 * </p>
 * </note>
 */
public class AddPermissionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * The unique identification of the permission you're setting (for example,
     * <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters
     * include alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     */
    private String label;

    /**
     * <p>
     * The AWS account number of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a> who is given permission. The principal must have an AWS
     * account, but does not need to be signed up for Amazon SQS. For
     * information about locating the AWS account identification, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> aWSAccountIds;

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid
     * values: the name of any action or <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue
     * Service Resource</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also
     * grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon SQS queue to which permissions are added.
     *         </p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     *         </p>
     */
    public String getQueueUrl() {
        return queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to which permissions are
     *            added.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to which permissions are
     *            added.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * The unique identification of the permission you're setting (for example,
     * <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters
     * include alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     *
     * @return <p>
     *         The unique identification of the permission you're setting (for
     *         example, <code>AliceSendMessage</code>). Maximum 80 characters.
     *         Allowed characters include alphanumeric characters, hyphens (
     *         <code>-</code>), and underscores (<code>_</code>).
     *         </p>
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * The unique identification of the permission you're setting (for example,
     * <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters
     * include alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     *
     * @param label <p>
     *            The unique identification of the permission you're setting
     *            (for example, <code>AliceSendMessage</code>). Maximum 80
     *            characters. Allowed characters include alphanumeric
     *            characters, hyphens (<code>-</code>), and underscores (
     *            <code>_</code>).
     *            </p>
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The unique identification of the permission you're setting (for example,
     * <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters
     * include alphanumeric characters, hyphens (<code>-</code>), and
     * underscores (<code>_</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            The unique identification of the permission you're setting
     *            (for example, <code>AliceSendMessage</code>). Maximum 80
     *            characters. Allowed characters include alphanumeric
     *            characters, hyphens (<code>-</code>), and underscores (
     *            <code>_</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a> who is given permission. The principal must have an AWS
     * account, but does not need to be signed up for Amazon SQS. For
     * information about locating the AWS account identification, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The AWS account number of the <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     *         >principal</a> who is given permission. The principal must have
     *         an AWS account, but does not need to be signed up for Amazon SQS.
     *         For information about locating the AWS account identification,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *         >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getAWSAccountIds() {
        return aWSAccountIds;
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a> who is given permission. The principal must have an AWS
     * account, but does not need to be signed up for Amazon SQS. For
     * information about locating the AWS account identification, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     *
     * @param aWSAccountIds <p>
     *            The AWS account number of the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     *            >principal</a> who is given permission. The principal must
     *            have an AWS account, but does not need to be signed up for
     *            Amazon SQS. For information about locating the AWS account
     *            identification, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *            >Your AWS Identifiers</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
            return;
        }

        this.aWSAccountIds = new java.util.ArrayList<String>(aWSAccountIds);
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a> who is given permission. The principal must have an AWS
     * account, but does not need to be signed up for Amazon SQS. For
     * information about locating the AWS account identification, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccountIds <p>
     *            The AWS account number of the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     *            >principal</a> who is given permission. The principal must
     *            have an AWS account, but does not need to be signed up for
     *            Amazon SQS. For information about locating the AWS account
     *            identification, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *            >Your AWS Identifiers</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        if (getAWSAccountIds() == null) {
            this.aWSAccountIds = new java.util.ArrayList<String>(aWSAccountIds.length);
        }
        for (String value : aWSAccountIds) {
            this.aWSAccountIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a> who is given permission. The principal must have an AWS
     * account, but does not need to be signed up for Amazon SQS. For
     * information about locating the AWS account identification, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccountIds <p>
     *            The AWS account number of the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     *            >principal</a> who is given permission. The principal must
     *            have an AWS account, but does not need to be signed up for
     *            Amazon SQS. For information about locating the AWS account
     *            identification, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *            >Your AWS Identifiers</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        setAWSAccountIds(aWSAccountIds);
        return this;
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid
     * values: the name of any action or <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue
     * Service Resource</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also
     * grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     *
     * @return <p>
     *         The action the client wants to allow for the specified principal.
     *         Valid values: the name of any action or <code>*</code>.
     *         </p>
     *         <p>
     *         For more information about these actions, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *         >Overview of Managing Access Permissions to Your Amazon Simple
     *         Queue Service Resource</a> in the <i>Amazon Simple Queue Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         Specifying <code>SendMessage</code>, <code>DeleteMessage</code>,
     *         or <code>ChangeMessageVisibility</code> for
     *         <code>ActionName.n</code> also grants permissions for the
     *         corresponding batch versions of those actions:
     *         <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>,
     *         and <code>ChangeMessageVisibilityBatch</code>.
     *         </p>
     */
    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid
     * values: the name of any action or <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue
     * Service Resource</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also
     * grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     *
     * @param actions <p>
     *            The action the client wants to allow for the specified
     *            principal. Valid values: the name of any action or
     *            <code>*</code>.
     *            </p>
     *            <p>
     *            For more information about these actions, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *            >Overview of Managing Access Permissions to Your Amazon Simple
     *            Queue Service Resource</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            Specifying <code>SendMessage</code>,
     *            <code>DeleteMessage</code>, or
     *            <code>ChangeMessageVisibility</code> for
     *            <code>ActionName.n</code> also grants permissions for the
     *            corresponding batch versions of those actions:
     *            <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>
     *            , and <code>ChangeMessageVisibilityBatch</code>.
     *            </p>
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid
     * values: the name of any action or <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue
     * Service Resource</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also
     * grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The action the client wants to allow for the specified
     *            principal. Valid values: the name of any action or
     *            <code>*</code>.
     *            </p>
     *            <p>
     *            For more information about these actions, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *            >Overview of Managing Access Permissions to Your Amazon Simple
     *            Queue Service Resource</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            Specifying <code>SendMessage</code>,
     *            <code>DeleteMessage</code>, or
     *            <code>ChangeMessageVisibility</code> for
     *            <code>ActionName.n</code> also grants permissions for the
     *            corresponding batch versions of those actions:
     *            <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>
     *            , and <code>ChangeMessageVisibilityBatch</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withActions(String... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<String>(actions.length);
        }
        for (String value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid
     * values: the name of any action or <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue
     * Service Resource</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also
     * grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The action the client wants to allow for the specified
     *            principal. Valid values: the name of any action or
     *            <code>*</code>.
     *            </p>
     *            <p>
     *            For more information about these actions, see <a href=
     *            "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *            >Overview of Managing Access Permissions to Your Amazon Simple
     *            Queue Service Resource</a> in the <i>Amazon Simple Queue
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            Specifying <code>SendMessage</code>,
     *            <code>DeleteMessage</code>, or
     *            <code>ChangeMessageVisibility</code> for
     *            <code>ActionName.n</code> also grants permissions for the
     *            corresponding batch versions of those actions:
     *            <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>
     *            , and <code>ChangeMessageVisibilityBatch</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getLabel() != null)
            sb.append("Label: " + getLabel() + ",");
        if (getAWSAccountIds() != null)
            sb.append("AWSAccountIds: " + getAWSAccountIds() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode
                + ((getAWSAccountIds() == null) ? 0 : getAWSAccountIds().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddPermissionRequest == false)
            return false;
        AddPermissionRequest other = (AddPermissionRequest) obj;

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getAWSAccountIds() == null ^ this.getAWSAccountIds() == null)
            return false;
        if (other.getAWSAccountIds() != null
                && other.getAWSAccountIds().equals(this.getAWSAccountIds()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }
}
