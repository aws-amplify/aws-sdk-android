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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Simple Notification Service (Amazon SNS) notification settings
 * associated with a specific job. The <code>Notification</code> object is
 * returned as a part of the response syntax of the <code>DescribeJob</code>
 * action in the <code>JobMetadata</code> data type.
 * </p>
 * <p>
 * When the notification settings are defined during job creation, you can
 * choose to notify based on a specific set of job states using the
 * <code>JobStatesToNotify</code> array of strings, or you can specify that you
 * want to have Amazon SNS notifications sent out for all job states with
 * <code>NotifyAll</code> set to true.
 * </p>
 */
public class Notification implements Serializable {
    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this
     * job. You can create Amazon Resource Names (ARNs) for topics by using the
     * <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">
     * CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS
     * Management Console, or by using the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     * >Subscribe</a> AWS Simple Notification Service (SNS) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:sns:.*:[0-9]{12}:.*<br/>
     */
    private String snsTopicARN;

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     */
    private java.util.List<String> jobStatesToNotify;

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     */
    private Boolean notifyAll;

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this
     * job. You can create Amazon Resource Names (ARNs) for topics by using the
     * <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">
     * CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS
     * Management Console, or by using the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     * >Subscribe</a> AWS Simple Notification Service (SNS) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:sns:.*:[0-9]{12}:.*<br/>
     *
     * @return <p>
     *         The new SNS <code>TopicArn</code> that you want to associate with
     *         this job. You can create Amazon Resource Names (ARNs) for topics
     *         by using the <a href=
     *         "https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html"
     *         >CreateTopic</a> Amazon SNS API action.
     *         </p>
     *         <p>
     *         You can subscribe email addresses to an Amazon SNS topic through
     *         the AWS Management Console, or by using the <a href=
     *         "https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     *         >Subscribe</a> AWS Simple Notification Service (SNS) API action.
     *         </p>
     */
    public String getSnsTopicARN() {
        return snsTopicARN;
    }

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this
     * job. You can create Amazon Resource Names (ARNs) for topics by using the
     * <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">
     * CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS
     * Management Console, or by using the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     * >Subscribe</a> AWS Simple Notification Service (SNS) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:sns:.*:[0-9]{12}:.*<br/>
     *
     * @param snsTopicARN <p>
     *            The new SNS <code>TopicArn</code> that you want to associate
     *            with this job. You can create Amazon Resource Names (ARNs) for
     *            topics by using the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html"
     *            >CreateTopic</a> Amazon SNS API action.
     *            </p>
     *            <p>
     *            You can subscribe email addresses to an Amazon SNS topic
     *            through the AWS Management Console, or by using the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     *            >Subscribe</a> AWS Simple Notification Service (SNS) API
     *            action.
     *            </p>
     */
    public void setSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
    }

    /**
     * <p>
     * The new SNS <code>TopicArn</code> that you want to associate with this
     * job. You can create Amazon Resource Names (ARNs) for topics by using the
     * <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html">
     * CreateTopic</a> Amazon SNS API action.
     * </p>
     * <p>
     * You can subscribe email addresses to an Amazon SNS topic through the AWS
     * Management Console, or by using the <a
     * href="https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     * >Subscribe</a> AWS Simple Notification Service (SNS) API action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:sns:.*:[0-9]{12}:.*<br/>
     *
     * @param snsTopicARN <p>
     *            The new SNS <code>TopicArn</code> that you want to associate
     *            with this job. You can create Amazon Resource Names (ARNs) for
     *            topics by using the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html"
     *            >CreateTopic</a> Amazon SNS API action.
     *            </p>
     *            <p>
     *            You can subscribe email addresses to an Amazon SNS topic
     *            through the AWS Management Console, or by using the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html"
     *            >Subscribe</a> AWS Simple Notification Service (SNS) API
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Notification withSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
        return this;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     *
     * @return <p>
     *         The list of job states that will trigger a notification for this
     *         job.
     *         </p>
     */
    public java.util.List<String> getJobStatesToNotify() {
        return jobStatesToNotify;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     *
     * @param jobStatesToNotify <p>
     *            The list of job states that will trigger a notification for
     *            this job.
     *            </p>
     */
    public void setJobStatesToNotify(java.util.Collection<String> jobStatesToNotify) {
        if (jobStatesToNotify == null) {
            this.jobStatesToNotify = null;
            return;
        }

        this.jobStatesToNotify = new java.util.ArrayList<String>(jobStatesToNotify);
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobStatesToNotify <p>
     *            The list of job states that will trigger a notification for
     *            this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Notification withJobStatesToNotify(String... jobStatesToNotify) {
        if (getJobStatesToNotify() == null) {
            this.jobStatesToNotify = new java.util.ArrayList<String>(jobStatesToNotify.length);
        }
        for (String value : jobStatesToNotify) {
            this.jobStatesToNotify.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of job states that will trigger a notification for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobStatesToNotify <p>
     *            The list of job states that will trigger a notification for
     *            this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Notification withJobStatesToNotify(java.util.Collection<String> jobStatesToNotify) {
        setJobStatesToNotify(jobStatesToNotify);
        return this;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     *
     * @return <p>
     *         Any change in job state will trigger a notification for this job.
     *         </p>
     */
    public Boolean isNotifyAll() {
        return notifyAll;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     *
     * @return <p>
     *         Any change in job state will trigger a notification for this job.
     *         </p>
     */
    public Boolean getNotifyAll() {
        return notifyAll;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     *
     * @param notifyAll <p>
     *            Any change in job state will trigger a notification for this
     *            job.
     *            </p>
     */
    public void setNotifyAll(Boolean notifyAll) {
        this.notifyAll = notifyAll;
    }

    /**
     * <p>
     * Any change in job state will trigger a notification for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notifyAll <p>
     *            Any change in job state will trigger a notification for this
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Notification withNotifyAll(Boolean notifyAll) {
        this.notifyAll = notifyAll;
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
        if (getSnsTopicARN() != null)
            sb.append("SnsTopicARN: " + getSnsTopicARN() + ",");
        if (getJobStatesToNotify() != null)
            sb.append("JobStatesToNotify: " + getJobStatesToNotify() + ",");
        if (getNotifyAll() != null)
            sb.append("NotifyAll: " + getNotifyAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnsTopicARN() == null) ? 0 : getSnsTopicARN().hashCode());
        hashCode = prime * hashCode
                + ((getJobStatesToNotify() == null) ? 0 : getJobStatesToNotify().hashCode());
        hashCode = prime * hashCode + ((getNotifyAll() == null) ? 0 : getNotifyAll().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Notification == false)
            return false;
        Notification other = (Notification) obj;

        if (other.getSnsTopicARN() == null ^ this.getSnsTopicARN() == null)
            return false;
        if (other.getSnsTopicARN() != null
                && other.getSnsTopicARN().equals(this.getSnsTopicARN()) == false)
            return false;
        if (other.getJobStatesToNotify() == null ^ this.getJobStatesToNotify() == null)
            return false;
        if (other.getJobStatesToNotify() != null
                && other.getJobStatesToNotify().equals(this.getJobStatesToNotify()) == false)
            return false;
        if (other.getNotifyAll() == null ^ this.getNotifyAll() == null)
            return false;
        if (other.getNotifyAll() != null
                && other.getNotifyAll().equals(this.getNotifyAll()) == false)
            return false;
        return true;
    }
}
