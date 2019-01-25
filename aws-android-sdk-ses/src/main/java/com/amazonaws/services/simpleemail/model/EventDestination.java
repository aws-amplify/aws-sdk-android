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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the event destination that the specified email
 * sending events will be published to.
 * </p>
 * <note>
 * <p>
 * When you create or update an event destination, you must provide one, and
 * only one, destination. The destination can be Amazon CloudWatch, Amazon
 * Kinesis Firehose or Amazon Simple Notification Service (Amazon SNS).
 * </p>
 * </note>
 * <p>
 * Event destinations are associated with configuration sets, which enable you
 * to publish email sending events to Amazon CloudWatch, Amazon Kinesis
 * Firehose, or Amazon Simple Notification Service (Amazon SNS). For information
 * about using configuration sets, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class EventDestination implements Serializable {
    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you
     * send an email with the associated configuration set. Set to
     * <code>true</code> to enable publishing to this destination; set to
     * <code>false</code> to prevent publishing to this destination. The default
     * value is <code>false</code>.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     */
    private java.util.List<String> matchingEventTypes = new java.util.ArrayList<String>();

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN
     * associated with an Amazon Kinesis Firehose event destination.
     * </p>
     */
    private KinesisFirehoseDestination kinesisFirehoseDestination;

    /**
     * <p>
     * An object that contains the names, default values, and sources of the
     * dimensions associated with an Amazon CloudWatch event destination.
     * </p>
     */
    private CloudWatchDestination cloudWatchDestination;

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple
     * Notification Service (Amazon SNS) event destination.
     * </p>
     */
    private SNSDestination sNSDestination;

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the event destination. The name must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers
     *         (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @param name <p>
     *            The name of the event destination. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 64 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the event destination. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 64 characters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you
     * send an email with the associated configuration set. Set to
     * <code>true</code> to enable publishing to this destination; set to
     * <code>false</code> to prevent publishing to this destination. The default
     * value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Sets whether Amazon SES publishes events to this destination when
     *         you send an email with the associated configuration set. Set to
     *         <code>true</code> to enable publishing to this destination; set
     *         to <code>false</code> to prevent publishing to this destination.
     *         The default value is <code>false</code>.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you
     * send an email with the associated configuration set. Set to
     * <code>true</code> to enable publishing to this destination; set to
     * <code>false</code> to prevent publishing to this destination. The default
     * value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Sets whether Amazon SES publishes events to this destination when
     *         you send an email with the associated configuration set. Set to
     *         <code>true</code> to enable publishing to this destination; set
     *         to <code>false</code> to prevent publishing to this destination.
     *         The default value is <code>false</code>.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you
     * send an email with the associated configuration set. Set to
     * <code>true</code> to enable publishing to this destination; set to
     * <code>false</code> to prevent publishing to this destination. The default
     * value is <code>false</code>.
     * </p>
     *
     * @param enabled <p>
     *            Sets whether Amazon SES publishes events to this destination
     *            when you send an email with the associated configuration set.
     *            Set to <code>true</code> to enable publishing to this
     *            destination; set to <code>false</code> to prevent publishing
     *            to this destination. The default value is <code>false</code>.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you
     * send an email with the associated configuration set. Set to
     * <code>true</code> to enable publishing to this destination; set to
     * <code>false</code> to prevent publishing to this destination. The default
     * value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Sets whether Amazon SES publishes events to this destination
     *            when you send an email with the associated configuration set.
     *            Set to <code>true</code> to enable publishing to this
     *            destination; set to <code>false</code> to prevent publishing
     *            to this destination. The default value is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     *
     * @return <p>
     *         The type of email sending events to publish to the event
     *         destination.
     *         </p>
     */
    public java.util.List<String> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     *
     * @param matchingEventTypes <p>
     *            The type of email sending events to publish to the event
     *            destination.
     *            </p>
     */
    public void setMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        if (matchingEventTypes == null) {
            this.matchingEventTypes = null;
            return;
        }

        this.matchingEventTypes = new java.util.ArrayList<String>(matchingEventTypes);
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchingEventTypes <p>
     *            The type of email sending events to publish to the event
     *            destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withMatchingEventTypes(String... matchingEventTypes) {
        if (getMatchingEventTypes() == null) {
            this.matchingEventTypes = new java.util.ArrayList<String>(matchingEventTypes.length);
        }
        for (String value : matchingEventTypes) {
            this.matchingEventTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchingEventTypes <p>
     *            The type of email sending events to publish to the event
     *            destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        setMatchingEventTypes(matchingEventTypes);
        return this;
    }

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN
     * associated with an Amazon Kinesis Firehose event destination.
     * </p>
     *
     * @return <p>
     *         An object that contains the delivery stream ARN and the IAM role
     *         ARN associated with an Amazon Kinesis Firehose event destination.
     *         </p>
     */
    public KinesisFirehoseDestination getKinesisFirehoseDestination() {
        return kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN
     * associated with an Amazon Kinesis Firehose event destination.
     * </p>
     *
     * @param kinesisFirehoseDestination <p>
     *            An object that contains the delivery stream ARN and the IAM
     *            role ARN associated with an Amazon Kinesis Firehose event
     *            destination.
     *            </p>
     */
    public void setKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN
     * associated with an Amazon Kinesis Firehose event destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisFirehoseDestination <p>
     *            An object that contains the delivery stream ARN and the IAM
     *            role ARN associated with an Amazon Kinesis Firehose event
     *            destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withKinesisFirehoseDestination(
            KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
        return this;
    }

    /**
     * <p>
     * An object that contains the names, default values, and sources of the
     * dimensions associated with an Amazon CloudWatch event destination.
     * </p>
     *
     * @return <p>
     *         An object that contains the names, default values, and sources of
     *         the dimensions associated with an Amazon CloudWatch event
     *         destination.
     *         </p>
     */
    public CloudWatchDestination getCloudWatchDestination() {
        return cloudWatchDestination;
    }

    /**
     * <p>
     * An object that contains the names, default values, and sources of the
     * dimensions associated with an Amazon CloudWatch event destination.
     * </p>
     *
     * @param cloudWatchDestination <p>
     *            An object that contains the names, default values, and sources
     *            of the dimensions associated with an Amazon CloudWatch event
     *            destination.
     *            </p>
     */
    public void setCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
    }

    /**
     * <p>
     * An object that contains the names, default values, and sources of the
     * dimensions associated with an Amazon CloudWatch event destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchDestination <p>
     *            An object that contains the names, default values, and sources
     *            of the dimensions associated with an Amazon CloudWatch event
     *            destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
        return this;
    }

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple
     * Notification Service (Amazon SNS) event destination.
     * </p>
     *
     * @return <p>
     *         An object that contains the topic ARN associated with an Amazon
     *         Simple Notification Service (Amazon SNS) event destination.
     *         </p>
     */
    public SNSDestination getSNSDestination() {
        return sNSDestination;
    }

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple
     * Notification Service (Amazon SNS) event destination.
     * </p>
     *
     * @param sNSDestination <p>
     *            An object that contains the topic ARN associated with an
     *            Amazon Simple Notification Service (Amazon SNS) event
     *            destination.
     *            </p>
     */
    public void setSNSDestination(SNSDestination sNSDestination) {
        this.sNSDestination = sNSDestination;
    }

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple
     * Notification Service (Amazon SNS) event destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sNSDestination <p>
     *            An object that contains the topic ARN associated with an
     *            Amazon Simple Notification Service (Amazon SNS) event
     *            destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDestination withSNSDestination(SNSDestination sNSDestination) {
        this.sNSDestination = sNSDestination;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getMatchingEventTypes() != null)
            sb.append("MatchingEventTypes: " + getMatchingEventTypes() + ",");
        if (getKinesisFirehoseDestination() != null)
            sb.append("KinesisFirehoseDestination: " + getKinesisFirehoseDestination() + ",");
        if (getCloudWatchDestination() != null)
            sb.append("CloudWatchDestination: " + getCloudWatchDestination() + ",");
        if (getSNSDestination() != null)
            sb.append("SNSDestination: " + getSNSDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getMatchingEventTypes() == null) ? 0 : getMatchingEventTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisFirehoseDestination() == null) ? 0 : getKinesisFirehoseDestination()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchDestination() == null) ? 0 : getCloudWatchDestination().hashCode());
        hashCode = prime * hashCode
                + ((getSNSDestination() == null) ? 0 : getSNSDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDestination == false)
            return false;
        EventDestination other = (EventDestination) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMatchingEventTypes() == null ^ this.getMatchingEventTypes() == null)
            return false;
        if (other.getMatchingEventTypes() != null
                && other.getMatchingEventTypes().equals(this.getMatchingEventTypes()) == false)
            return false;
        if (other.getKinesisFirehoseDestination() == null
                ^ this.getKinesisFirehoseDestination() == null)
            return false;
        if (other.getKinesisFirehoseDestination() != null
                && other.getKinesisFirehoseDestination().equals(
                        this.getKinesisFirehoseDestination()) == false)
            return false;
        if (other.getCloudWatchDestination() == null ^ this.getCloudWatchDestination() == null)
            return false;
        if (other.getCloudWatchDestination() != null
                && other.getCloudWatchDestination().equals(this.getCloudWatchDestination()) == false)
            return false;
        if (other.getSNSDestination() == null ^ this.getSNSDestination() == null)
            return false;
        if (other.getSNSDestination() != null
                && other.getSNSDestination().equals(this.getSNSDestination()) == false)
            return false;
        return true;
    }
}
