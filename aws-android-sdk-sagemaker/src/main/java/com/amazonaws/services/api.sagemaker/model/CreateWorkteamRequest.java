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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new work team for labeling your data. A work team is defined by one
 * or more Amazon Cognito user pools. You must first create the user pools
 * before you can create a work team.
 * </p>
 * <p>
 * You cannot create more than 25 work teams in an account and region.
 * </p>
 */
public class CreateWorkteamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String workteamName;

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects
     * that identify the Amazon Cognito user pool that makes up the work team.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     * >Amazon Cognito User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the
     * member definition must have the same <code>ClientId</code> and
     * <code>UserPool</code> values.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String description;

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work
     * items.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     * >Resource Tag</a> and <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the work team. Use this name to identify the work
     *         team.
     *         </p>
     */
    public String getWorkteamName() {
        return workteamName;
    }

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team. Use this name to identify the work
     *            team.
     *            </p>
     */
    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team. Use this name to identify the work
     *            team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withWorkteamName(String workteamName) {
        this.workteamName = workteamName;
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects
     * that identify the Amazon Cognito user pool that makes up the work team.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     * >Amazon Cognito User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the
     * member definition must have the same <code>ClientId</code> and
     * <code>UserPool</code> values.
     * </p>
     *
     * @return <p>
     *         A list of <code>MemberDefinition</code> objects that contains
     *         objects that identify the Amazon Cognito user pool that makes up
     *         the work team. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     *         >Amazon Cognito User Pools</a>.
     *         </p>
     *         <p>
     *         All of the <code>CognitoMemberDefinition</code> objects that make
     *         up the member definition must have the same <code>ClientId</code>
     *         and <code>UserPool</code> values.
     *         </p>
     */
    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects
     * that identify the Amazon Cognito user pool that makes up the work team.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     * >Amazon Cognito User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the
     * member definition must have the same <code>ClientId</code> and
     * <code>UserPool</code> values.
     * </p>
     *
     * @param memberDefinitions <p>
     *            A list of <code>MemberDefinition</code> objects that contains
     *            objects that identify the Amazon Cognito user pool that makes
     *            up the work team. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     *            >Amazon Cognito User Pools</a>.
     *            </p>
     *            <p>
     *            All of the <code>CognitoMemberDefinition</code> objects that
     *            make up the member definition must have the same
     *            <code>ClientId</code> and <code>UserPool</code> values.
     *            </p>
     */
    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects
     * that identify the Amazon Cognito user pool that makes up the work team.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     * >Amazon Cognito User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the
     * member definition must have the same <code>ClientId</code> and
     * <code>UserPool</code> values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberDefinitions <p>
     *            A list of <code>MemberDefinition</code> objects that contains
     *            objects that identify the Amazon Cognito user pool that makes
     *            up the work team. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     *            >Amazon Cognito User Pools</a>.
     *            </p>
     *            <p>
     *            All of the <code>CognitoMemberDefinition</code> objects that
     *            make up the member definition must have the same
     *            <code>ClientId</code> and <code>UserPool</code> values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (getMemberDefinitions() == null) {
            this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(
                    memberDefinitions.length);
        }
        for (MemberDefinition value : memberDefinitions) {
            this.memberDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects
     * that identify the Amazon Cognito user pool that makes up the work team.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     * >Amazon Cognito User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the
     * member definition must have the same <code>ClientId</code> and
     * <code>UserPool</code> values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberDefinitions <p>
     *            A list of <code>MemberDefinition</code> objects that contains
     *            objects that identify the Amazon Cognito user pool that makes
     *            up the work team. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"
     *            >Amazon Cognito User Pools</a>.
     *            </p>
     *            <p>
     *            All of the <code>CognitoMemberDefinition</code> objects that
     *            make up the member definition must have the same
     *            <code>ClientId</code> and <code>UserPool</code> values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withMemberDefinitions(
            java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A description of the work team.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param description <p>
     *            A description of the work team.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param description <p>
     *            A description of the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work
     * items.
     * </p>
     *
     * @return <p>
     *         Configures notification of workers regarding available or
     *         expiring work items.
     *         </p>
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work
     * items.
     * </p>
     *
     * @param notificationConfiguration <p>
     *            Configures notification of workers regarding available or
     *            expiring work items.
     *            </p>
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Configures notification of workers regarding available or expiring work
     * items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            Configures notification of workers regarding available or
     *            expiring work items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withNotificationConfiguration(
            NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     * >Resource Tag</a> and <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *         >Resource Tag</a> and <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     *         Management User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     * >Resource Tag</a> and <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            An array of key-value pairs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *            >Resource Tag</a> and <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i> AWS Billing and
     *            Cost Management User Guide</i>.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     * >Resource Tag</a> and <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *            >Resource Tag</a> and <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i> AWS Billing and
     *            Cost Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     * >Resource Tag</a> and <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html"
     *            >Resource Tag</a> and <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i> AWS Billing and
     *            Cost Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkteamRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: " + getWorkteamName() + ",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: " + getMemberDefinitions() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode
                + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkteamRequest == false)
            return false;
        CreateWorkteamRequest other = (CreateWorkteamRequest) obj;

        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null
                && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null
                && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotificationConfiguration() == null
                ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null
                && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
