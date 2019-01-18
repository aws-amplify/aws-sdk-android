/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a statement to a topic's access control policy, granting access for the
 * specified AWS accounts to the specified actions.
 * </p>
 */
public class AddPermissionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     */
    private String label;

    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to
     * the specified actions. The users must have AWS accounts, but do not need
     * to be signed up for this service.
     * </p>
     */
    private java.util.List<String> aWSAccountIds = new java.util.ArrayList<String>();

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     */
    private java.util.List<String> actionNames = new java.util.ArrayList<String>();

    /**
     * Default constructor for AddPermissionRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public AddPermissionRequest() {
    }

    /**
     * Constructs a new AddPermissionRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic whose access control policy you wish to
     *            modify.
     *            </p>
     * @param label <p>
     *            A unique identifier for the new policy statement.
     *            </p>
     * @param aWSAccountIds <p>
     *            The AWS account IDs of the users (principals) who will be
     *            given access to the specified actions. The users must have AWS
     *            accounts, but do not need to be signed up for this service.
     *            </p>
     * @param actionNames <p>
     *            The action you want to allow for the specified principal(s).
     *            </p>
     *            <p>
     *            Valid values: any Amazon SNS action name.
     *            </p>
     */
    public AddPermissionRequest(String topicArn, String label,
            java.util.List<String> aWSAccountIds, java.util.List<String> actionNames) {
        setTopicArn(topicArn);
        setLabel(label);
        setAWSAccountIds(aWSAccountIds);
        setActionNames(actionNames);
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic whose access control policy you wish to
     *         modify.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the topic whose access control policy you wish to
     *            modify.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the topic whose access control policy you wish to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the new policy statement.
     *         </p>
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     *
     * @param label <p>
     *            A unique identifier for the new policy statement.
     *            </p>
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            A unique identifier for the new policy statement.
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
     * The AWS account IDs of the users (principals) who will be given access to
     * the specified actions. The users must have AWS accounts, but do not need
     * to be signed up for this service.
     * </p>
     *
     * @return <p>
     *         The AWS account IDs of the users (principals) who will be given
     *         access to the specified actions. The users must have AWS
     *         accounts, but do not need to be signed up for this service.
     *         </p>
     */
    public java.util.List<String> getAWSAccountIds() {
        return aWSAccountIds;
    }

    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to
     * the specified actions. The users must have AWS accounts, but do not need
     * to be signed up for this service.
     * </p>
     *
     * @param aWSAccountIds <p>
     *            The AWS account IDs of the users (principals) who will be
     *            given access to the specified actions. The users must have AWS
     *            accounts, but do not need to be signed up for this service.
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
     * The AWS account IDs of the users (principals) who will be given access to
     * the specified actions. The users must have AWS accounts, but do not need
     * to be signed up for this service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccountIds <p>
     *            The AWS account IDs of the users (principals) who will be
     *            given access to the specified actions. The users must have AWS
     *            accounts, but do not need to be signed up for this service.
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
     * The AWS account IDs of the users (principals) who will be given access to
     * the specified actions. The users must have AWS accounts, but do not need
     * to be signed up for this service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccountIds <p>
     *            The AWS account IDs of the users (principals) who will be
     *            given access to the specified actions. The users must have AWS
     *            accounts, but do not need to be signed up for this service.
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
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     *
     * @return <p>
     *         The action you want to allow for the specified principal(s).
     *         </p>
     *         <p>
     *         Valid values: any Amazon SNS action name.
     *         </p>
     */
    public java.util.List<String> getActionNames() {
        return actionNames;
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     *
     * @param actionNames <p>
     *            The action you want to allow for the specified principal(s).
     *            </p>
     *            <p>
     *            Valid values: any Amazon SNS action name.
     *            </p>
     */
    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }

        this.actionNames = new java.util.ArrayList<String>(actionNames);
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionNames <p>
     *            The action you want to allow for the specified principal(s).
     *            </p>
     *            <p>
     *            Valid values: any Amazon SNS action name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withActionNames(String... actionNames) {
        if (getActionNames() == null) {
            this.actionNames = new java.util.ArrayList<String>(actionNames.length);
        }
        for (String value : actionNames) {
            this.actionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionNames <p>
     *            The action you want to allow for the specified principal(s).
     *            </p>
     *            <p>
     *            Valid values: any Amazon SNS action name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddPermissionRequest withActionNames(java.util.Collection<String> actionNames) {
        setActionNames(actionNames);
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
        if (getLabel() != null)
            sb.append("Label: " + getLabel() + ",");
        if (getAWSAccountIds() != null)
            sb.append("AWSAccountIds: " + getAWSAccountIds() + ",");
        if (getActionNames() != null)
            sb.append("ActionNames: " + getActionNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode
                + ((getAWSAccountIds() == null) ? 0 : getAWSAccountIds().hashCode());
        hashCode = prime * hashCode
                + ((getActionNames() == null) ? 0 : getActionNames().hashCode());
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

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
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
        if (other.getActionNames() == null ^ this.getActionNames() == null)
            return false;
        if (other.getActionNames() != null
                && other.getActionNames().equals(this.getActionNames()) == false)
            return false;
        return true;
    }
}
