/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * When included in a receipt rule, this action calls Amazon WorkMail and,
 * optionally, publishes a notification to Amazon Simple Notification Service
 * (Amazon SNS). It usually isn't necessary to set this up manually, because
 * Amazon WorkMail adds the rule automatically during its setup procedure.
 * </p>
 * <p>
 * For information using a receipt rule to call Amazon WorkMail, see the <a
 * href=
 * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-workmail.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class WorkmailAction implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * WorkMail action is called. You can find the ARN of a topic by using the
     * <a href="https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html">
     * ListTopics</a> operation in Amazon SNS.
     * </p>
     * <p>
     * For more information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
     * Amazon WorkMail ARNs use the following format:
     * </p>
     * <p>
     * <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     * </p>
     * <p>
     * You can find the ID of your organization by using the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     * >ListOrganizations</a> operation in Amazon WorkMail. Amazon WorkMail
     * organization IDs begin with "<code>m-</code>", followed by a string of
     * alphanumeric characters.
     * </p>
     * <p>
     * For information about Amazon WorkMail organizations, see the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     * >Amazon WorkMail Administrator Guide</a>.
     * </p>
     */
    private String organizationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * WorkMail action is called. You can find the ARN of a topic by using the
     * <a href="https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html">
     * ListTopics</a> operation in Amazon SNS.
     * </p>
     * <p>
     * For more information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS topic to notify
     *         when the WorkMail action is called. You can find the ARN of a
     *         topic by using the <a href=
     *         "https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html"
     *         >ListTopics</a> operation in Amazon SNS.
     *         </p>
     *         <p>
     *         For more information about Amazon SNS topics, see the <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *         >Amazon SNS Developer Guide</a>.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * WorkMail action is called. You can find the ARN of a topic by using the
     * <a href="https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html">
     * ListTopics</a> operation in Amazon SNS.
     * </p>
     * <p>
     * For more information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            notify when the WorkMail action is called. You can find the
     *            ARN of a topic by using the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html"
     *            >ListTopics</a> operation in Amazon SNS.
     *            </p>
     *            <p>
     *            For more information about Amazon SNS topics, see the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *            >Amazon SNS Developer Guide</a>.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * WorkMail action is called. You can find the ARN of a topic by using the
     * <a href="https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html">
     * ListTopics</a> operation in Amazon SNS.
     * </p>
     * <p>
     * For more information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            notify when the WorkMail action is called. You can find the
     *            ARN of a topic by using the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html"
     *            >ListTopics</a> operation in Amazon SNS.
     *            </p>
     *            <p>
     *            For more information about Amazon SNS topics, see the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *            >Amazon SNS Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkmailAction withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
     * Amazon WorkMail ARNs use the following format:
     * </p>
     * <p>
     * <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     * </p>
     * <p>
     * You can find the ID of your organization by using the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     * >ListOrganizations</a> operation in Amazon WorkMail. Amazon WorkMail
     * organization IDs begin with "<code>m-</code>", followed by a string of
     * alphanumeric characters.
     * </p>
     * <p>
     * For information about Amazon WorkMail organizations, see the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     * >Amazon WorkMail Administrator Guide</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon WorkMail
     *         organization. Amazon WorkMail ARNs use the following format:
     *         </p>
     *         <p>
     *         <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     *         </p>
     *         <p>
     *         You can find the ID of your organization by using the <a href=
     *         "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     *         >ListOrganizations</a> operation in Amazon WorkMail. Amazon
     *         WorkMail organization IDs begin with "<code>m-</code>", followed
     *         by a string of alphanumeric characters.
     *         </p>
     *         <p>
     *         For information about Amazon WorkMail organizations, see the <a
     *         href=
     *         "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     *         >Amazon WorkMail Administrator Guide</a>.
     *         </p>
     */
    public String getOrganizationArn() {
        return organizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
     * Amazon WorkMail ARNs use the following format:
     * </p>
     * <p>
     * <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     * </p>
     * <p>
     * You can find the ID of your organization by using the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     * >ListOrganizations</a> operation in Amazon WorkMail. Amazon WorkMail
     * organization IDs begin with "<code>m-</code>", followed by a string of
     * alphanumeric characters.
     * </p>
     * <p>
     * For information about Amazon WorkMail organizations, see the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     * >Amazon WorkMail Administrator Guide</a>.
     * </p>
     *
     * @param organizationArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon WorkMail
     *            organization. Amazon WorkMail ARNs use the following format:
     *            </p>
     *            <p>
     *            <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     *            </p>
     *            <p>
     *            You can find the ID of your organization by using the <a href=
     *            "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     *            >ListOrganizations</a> operation in Amazon WorkMail. Amazon
     *            WorkMail organization IDs begin with "<code>m-</code>",
     *            followed by a string of alphanumeric characters.
     *            </p>
     *            <p>
     *            For information about Amazon WorkMail organizations, see the
     *            <a href=
     *            "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     *            >Amazon WorkMail Administrator Guide</a>.
     *            </p>
     */
    public void setOrganizationArn(String organizationArn) {
        this.organizationArn = organizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
     * Amazon WorkMail ARNs use the following format:
     * </p>
     * <p>
     * <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     * </p>
     * <p>
     * You can find the ID of your organization by using the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     * >ListOrganizations</a> operation in Amazon WorkMail. Amazon WorkMail
     * organization IDs begin with "<code>m-</code>", followed by a string of
     * alphanumeric characters.
     * </p>
     * <p>
     * For information about Amazon WorkMail organizations, see the <a href=
     * "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     * >Amazon WorkMail Administrator Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon WorkMail
     *            organization. Amazon WorkMail ARNs use the following format:
     *            </p>
     *            <p>
     *            <code>arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;</code>
     *            </p>
     *            <p>
     *            You can find the ID of your organization by using the <a href=
     *            "https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html"
     *            >ListOrganizations</a> operation in Amazon WorkMail. Amazon
     *            WorkMail organization IDs begin with "<code>m-</code>",
     *            followed by a string of alphanumeric characters.
     *            </p>
     *            <p>
     *            For information about Amazon WorkMail organizations, see the
     *            <a href=
     *            "https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html"
     *            >Amazon WorkMail Administrator Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkmailAction withOrganizationArn(String organizationArn) {
        this.organizationArn = organizationArn;
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
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getOrganizationArn() != null)
            sb.append("OrganizationArn: " + getOrganizationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationArn() == null) ? 0 : getOrganizationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkmailAction == false)
            return false;
        WorkmailAction other = (WorkmailAction) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getOrganizationArn() == null ^ this.getOrganizationArn() == null)
            return false;
        if (other.getOrganizationArn() != null
                && other.getOrganizationArn().equals(this.getOrganizationArn()) == false)
            return false;
        return true;
    }
}
