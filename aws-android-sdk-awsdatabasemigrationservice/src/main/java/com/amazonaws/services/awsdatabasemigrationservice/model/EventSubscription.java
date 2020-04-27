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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an event notification subscription created by the
 * <code>CreateEventSubscription</code> operation.
 * </p>
 */
public class EventSubscription implements Serializable {
    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification
     * subscription.
     * </p>
     */
    private String customerAwsId;

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     */
    private String custSubscriptionId;

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active |
     * no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has
     * permission to post to the SNS topic. The status "topic-not-exist"
     * indicates that the topic was deleted after the subscription was created.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     */
    private String subscriptionCreationTime;

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     */
    private java.util.List<String> sourceIdsList;

    /**
     * <p>
     * A lists of event categories.
     * </p>
     */
    private java.util.List<String> eventCategoriesList;

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification
     * subscription.
     * </p>
     *
     * @return <p>
     *         The AWS customer account associated with the AWS DMS event
     *         notification subscription.
     *         </p>
     */
    public String getCustomerAwsId() {
        return customerAwsId;
    }

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification
     * subscription.
     * </p>
     *
     * @param customerAwsId <p>
     *            The AWS customer account associated with the AWS DMS event
     *            notification subscription.
     *            </p>
     */
    public void setCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
    }

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification
     * subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerAwsId <p>
     *            The AWS customer account associated with the AWS DMS event
     *            notification subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
        return this;
    }

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     *
     * @return <p>
     *         The AWS DMS event notification subscription Id.
     *         </p>
     */
    public String getCustSubscriptionId() {
        return custSubscriptionId;
    }

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     *
     * @param custSubscriptionId <p>
     *            The AWS DMS event notification subscription Id.
     *            </p>
     */
    public void setCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
    }

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param custSubscriptionId <p>
     *            The AWS DMS event notification subscription Id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
        return this;
    }

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     *
     * @return <p>
     *         The topic ARN of the AWS DMS event notification subscription.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     *
     * @param snsTopicArn <p>
     *            The topic ARN of the AWS DMS event notification subscription.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snsTopicArn <p>
     *            The topic ARN of the AWS DMS event notification subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active |
     * no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has
     * permission to post to the SNS topic. The status "topic-not-exist"
     * indicates that the topic was deleted after the subscription was created.
     * </p>
     *
     * @return <p>
     *         The status of the AWS DMS event notification subscription.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <p>
     *         Can be one of the following: creating | modifying | deleting |
     *         active | no-permission | topic-not-exist
     *         </p>
     *         <p>
     *         The status "no-permission" indicates that AWS DMS no longer has
     *         permission to post to the SNS topic. The status "topic-not-exist"
     *         indicates that the topic was deleted after the subscription was
     *         created.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active |
     * no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has
     * permission to post to the SNS topic. The status "topic-not-exist"
     * indicates that the topic was deleted after the subscription was created.
     * </p>
     *
     * @param status <p>
     *            The status of the AWS DMS event notification subscription.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <p>
     *            Can be one of the following: creating | modifying | deleting |
     *            active | no-permission | topic-not-exist
     *            </p>
     *            <p>
     *            The status "no-permission" indicates that AWS DMS no longer
     *            has permission to post to the SNS topic. The status
     *            "topic-not-exist" indicates that the topic was deleted after
     *            the subscription was created.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active |
     * no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has
     * permission to post to the SNS topic. The status "topic-not-exist"
     * indicates that the topic was deleted after the subscription was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the AWS DMS event notification subscription.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <p>
     *            Can be one of the following: creating | modifying | deleting |
     *            active | no-permission | topic-not-exist
     *            </p>
     *            <p>
     *            The status "no-permission" indicates that AWS DMS no longer
     *            has permission to post to the SNS topic. The status
     *            "topic-not-exist" indicates that the topic was deleted after
     *            the subscription was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     *
     * @return <p>
     *         The time the RDS event notification subscription was created.
     *         </p>
     */
    public String getSubscriptionCreationTime() {
        return subscriptionCreationTime;
    }

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     *
     * @param subscriptionCreationTime <p>
     *            The time the RDS event notification subscription was created.
     *            </p>
     */
    public void setSubscriptionCreationTime(String subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
    }

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionCreationTime <p>
     *            The time the RDS event notification subscription was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withSubscriptionCreationTime(String subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
        return this;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     *
     * @return <p>
     *         The type of AWS DMS resource that generates events.
     *         </p>
     *         <p>
     *         Valid values: replication-instance | replication-server |
     *         security-group | replication-task
     *         </p>
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | replication-server |
     *            security-group | replication-task
     *            </p>
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | replication-server |
     *            security-group | replication-task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     *
     * @return <p>
     *         A list of source Ids for the event subscription.
     *         </p>
     */
    public java.util.List<String> getSourceIdsList() {
        return sourceIdsList;
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     *
     * @param sourceIdsList <p>
     *            A list of source Ids for the event subscription.
     *            </p>
     */
    public void setSourceIdsList(java.util.Collection<String> sourceIdsList) {
        if (sourceIdsList == null) {
            this.sourceIdsList = null;
            return;
        }

        this.sourceIdsList = new java.util.ArrayList<String>(sourceIdsList);
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdsList <p>
     *            A list of source Ids for the event subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withSourceIdsList(String... sourceIdsList) {
        if (getSourceIdsList() == null) {
            this.sourceIdsList = new java.util.ArrayList<String>(sourceIdsList.length);
        }
        for (String value : sourceIdsList) {
            this.sourceIdsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdsList <p>
     *            A list of source Ids for the event subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withSourceIdsList(java.util.Collection<String> sourceIdsList) {
        setSourceIdsList(sourceIdsList);
        return this;
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     *
     * @return <p>
     *         A lists of event categories.
     *         </p>
     */
    public java.util.List<String> getEventCategoriesList() {
        return eventCategoriesList;
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     *
     * @param eventCategoriesList <p>
     *            A lists of event categories.
     *            </p>
     */
    public void setEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        if (eventCategoriesList == null) {
            this.eventCategoriesList = null;
            return;
        }

        this.eventCategoriesList = new java.util.ArrayList<String>(eventCategoriesList);
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategoriesList <p>
     *            A lists of event categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withEventCategoriesList(String... eventCategoriesList) {
        if (getEventCategoriesList() == null) {
            this.eventCategoriesList = new java.util.ArrayList<String>(eventCategoriesList.length);
        }
        for (String value : eventCategoriesList) {
            this.eventCategoriesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategoriesList <p>
     *            A lists of event categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withEventCategoriesList(
            java.util.Collection<String> eventCategoriesList) {
        setEventCategoriesList(eventCategoriesList);
        return this;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     *
     * @return <p>
     *         Boolean value that indicates if the event subscription is
     *         enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     *
     * @return <p>
     *         Boolean value that indicates if the event subscription is
     *         enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Boolean value that indicates if the event subscription is
     *            enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Boolean value that indicates if the event subscription is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventSubscription withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getCustomerAwsId() != null)
            sb.append("CustomerAwsId: " + getCustomerAwsId() + ",");
        if (getCustSubscriptionId() != null)
            sb.append("CustSubscriptionId: " + getCustSubscriptionId() + ",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSubscriptionCreationTime() != null)
            sb.append("SubscriptionCreationTime: " + getSubscriptionCreationTime() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getSourceIdsList() != null)
            sb.append("SourceIdsList: " + getSourceIdsList() + ",");
        if (getEventCategoriesList() != null)
            sb.append("EventCategoriesList: " + getEventCategoriesList() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomerAwsId() == null) ? 0 : getCustomerAwsId().hashCode());
        hashCode = prime * hashCode
                + ((getCustSubscriptionId() == null) ? 0 : getCustSubscriptionId().hashCode());
        hashCode = prime * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getSubscriptionCreationTime() == null) ? 0 : getSubscriptionCreationTime()
                        .hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getSourceIdsList() == null) ? 0 : getSourceIdsList().hashCode());
        hashCode = prime * hashCode
                + ((getEventCategoriesList() == null) ? 0 : getEventCategoriesList().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSubscription == false)
            return false;
        EventSubscription other = (EventSubscription) obj;

        if (other.getCustomerAwsId() == null ^ this.getCustomerAwsId() == null)
            return false;
        if (other.getCustomerAwsId() != null
                && other.getCustomerAwsId().equals(this.getCustomerAwsId()) == false)
            return false;
        if (other.getCustSubscriptionId() == null ^ this.getCustSubscriptionId() == null)
            return false;
        if (other.getCustSubscriptionId() != null
                && other.getCustSubscriptionId().equals(this.getCustSubscriptionId()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscriptionCreationTime() == null
                ^ this.getSubscriptionCreationTime() == null)
            return false;
        if (other.getSubscriptionCreationTime() != null
                && other.getSubscriptionCreationTime().equals(this.getSubscriptionCreationTime()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceIdsList() == null ^ this.getSourceIdsList() == null)
            return false;
        if (other.getSourceIdsList() != null
                && other.getSourceIdsList().equals(this.getSourceIdsList()) == false)
            return false;
        if (other.getEventCategoriesList() == null ^ this.getEventCategoriesList() == null)
            return false;
        if (other.getEventCategoriesList() != null
                && other.getEventCategoriesList().equals(this.getEventCategoriesList()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
