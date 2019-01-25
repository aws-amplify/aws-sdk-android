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
 * When included in a receipt rule, this action terminates the evaluation of the
 * receipt rule set and, optionally, publishes a notification to Amazon Simple
 * Notification Service (Amazon SNS).
 * </p>
 * <p>
 * For information about setting a stop action in a receipt rule, see the <a
 * href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-stop.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class StopAction implements Serializable {
    /**
     * <p>
     * The name of the RuleSet that is being stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RuleSet
     */
    private String scope;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * stop action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The name of the RuleSet that is being stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RuleSet
     *
     * @return <p>
     *         The name of the RuleSet that is being stopped.
     *         </p>
     * @see StopScope
     */
    public String getScope() {
        return scope;
    }

    /**
     * <p>
     * The name of the RuleSet that is being stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RuleSet
     *
     * @param scope <p>
     *            The name of the RuleSet that is being stopped.
     *            </p>
     * @see StopScope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The name of the RuleSet that is being stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RuleSet
     *
     * @param scope <p>
     *            The name of the RuleSet that is being stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StopScope
     */
    public StopAction withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * <p>
     * The name of the RuleSet that is being stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RuleSet
     *
     * @param scope <p>
     *            The name of the RuleSet that is being stopped.
     *            </p>
     * @see StopScope
     */
    public void setScope(StopScope scope) {
        this.scope = scope.toString();
    }

    /**
     * <p>
     * The name of the RuleSet that is being stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RuleSet
     *
     * @param scope <p>
     *            The name of the RuleSet that is being stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StopScope
     */
    public StopAction withScope(StopScope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * stop action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS topic to notify
     *         when the stop action is taken. An example of an Amazon SNS topic
     *         ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>.
     *         For more information about Amazon SNS topics, see the <a href=
     *         "http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *         >Amazon SNS Developer Guide</a>.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * stop action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            notify when the stop action is taken. An example of an Amazon
     *            SNS topic ARN is
     *            <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For
     *            more information about Amazon SNS topics, see the <a href=
     *            "http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *            >Amazon SNS Developer Guide</a>.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * stop action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            notify when the stop action is taken. An example of an Amazon
     *            SNS topic ARN is
     *            <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For
     *            more information about Amazon SNS topics, see the <a href=
     *            "http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *            >Amazon SNS Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopAction withTopicArn(String topicArn) {
        this.topicArn = topicArn;
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
        if (getScope() != null)
            sb.append("Scope: " + getScope() + ",");
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopAction == false)
            return false;
        StopAction other = (StopAction) obj;

        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }
}
