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
 * When included in a receipt rule, this action calls an AWS Lambda function
 * and, optionally, publishes a notification to Amazon Simple Notification
 * Service (Amazon SNS).
 * </p>
 * <p>
 * To enable Amazon SES to call your AWS Lambda function or to publish to an
 * Amazon SNS topic of another account, Amazon SES must have permission to
 * access those resources. For information about giving permissions, see the <a
 * href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * For information about using AWS Lambda actions in receipt rules, see the <a
 * href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class LambdaAction implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * Lambda action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function. An example of
     * an AWS Lambda function ARN is
     * <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>. For
     * more information about AWS Lambda, see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     */
    private String functionArn;

    /**
     * <p>
     * The invocation type of the AWS Lambda function. An invocation type of
     * <code>RequestResponse</code> means that the execution of the function
     * will immediately result in a response, and a value of <code>Event</code>
     * means that the function will be invoked asynchronously. The default value
     * is <code>Event</code>. For information about AWS Lambda invocation types,
     * see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <important>
     * <p>
     * There is a 30-second timeout on <code>RequestResponse</code> invocations.
     * You should use <code>Event</code> invocation in most cases. Use
     * <code>RequestResponse</code> only when you want to make a mail flow
     * decision, such as whether to stop the receipt rule or the receipt rule
     * set.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse
     */
    private String invocationType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * Lambda action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS topic to notify
     *         when the Lambda action is taken. An example of an Amazon SNS
     *         topic ARN is
     *         <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a href=
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
     * Lambda action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            notify when the Lambda action is taken. An example of an
     *            Amazon SNS topic ARN is
     *            <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For
     *            more information about Amazon SNS topics, see the <a href=
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
     * Lambda action is taken. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic to
     *            notify when the Lambda action is taken. An example of an
     *            Amazon SNS topic ARN is
     *            <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For
     *            more information about Amazon SNS topics, see the <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html"
     *            >Amazon SNS Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaAction withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function. An example of
     * an AWS Lambda function ARN is
     * <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>. For
     * more information about AWS Lambda, see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Lambda function. An
     *         example of an AWS Lambda function ARN is
     *         <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>
     *         . For more information about AWS Lambda, see the <a href=
     *         "https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">AWS
     *         Lambda Developer Guide</a>.
     *         </p>
     */
    public String getFunctionArn() {
        return functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function. An example of
     * an AWS Lambda function ARN is
     * <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>. For
     * more information about AWS Lambda, see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     *
     * @param functionArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Lambda function. An
     *            example of an AWS Lambda function ARN is
     *            <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>
     *            . For more information about AWS Lambda, see the <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/welcome.html"
     *            >AWS Lambda Developer Guide</a>.
     *            </p>
     */
    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function. An example of
     * an AWS Lambda function ARN is
     * <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>. For
     * more information about AWS Lambda, see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param functionArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Lambda function. An
     *            example of an AWS Lambda function ARN is
     *            <code>arn:aws:lambda:us-west-2:account-id:function:MyFunction</code>
     *            . For more information about AWS Lambda, see the <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/welcome.html"
     *            >AWS Lambda Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaAction withFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    /**
     * <p>
     * The invocation type of the AWS Lambda function. An invocation type of
     * <code>RequestResponse</code> means that the execution of the function
     * will immediately result in a response, and a value of <code>Event</code>
     * means that the function will be invoked asynchronously. The default value
     * is <code>Event</code>. For information about AWS Lambda invocation types,
     * see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <important>
     * <p>
     * There is a 30-second timeout on <code>RequestResponse</code> invocations.
     * You should use <code>Event</code> invocation in most cases. Use
     * <code>RequestResponse</code> only when you want to make a mail flow
     * decision, such as whether to stop the receipt rule or the receipt rule
     * set.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse
     *
     * @return <p>
     *         The invocation type of the AWS Lambda function. An invocation
     *         type of <code>RequestResponse</code> means that the execution of
     *         the function will immediately result in a response, and a value
     *         of <code>Event</code> means that the function will be invoked
     *         asynchronously. The default value is <code>Event</code>. For
     *         information about AWS Lambda invocation types, see the <a href=
     *         "https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html"
     *         >AWS Lambda Developer Guide</a>.
     *         </p>
     *         <important>
     *         <p>
     *         There is a 30-second timeout on <code>RequestResponse</code>
     *         invocations. You should use <code>Event</code> invocation in most
     *         cases. Use <code>RequestResponse</code> only when you want to
     *         make a mail flow decision, such as whether to stop the receipt
     *         rule or the receipt rule set.
     *         </p>
     *         </important>
     * @see InvocationType
     */
    public String getInvocationType() {
        return invocationType;
    }

    /**
     * <p>
     * The invocation type of the AWS Lambda function. An invocation type of
     * <code>RequestResponse</code> means that the execution of the function
     * will immediately result in a response, and a value of <code>Event</code>
     * means that the function will be invoked asynchronously. The default value
     * is <code>Event</code>. For information about AWS Lambda invocation types,
     * see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <important>
     * <p>
     * There is a 30-second timeout on <code>RequestResponse</code> invocations.
     * You should use <code>Event</code> invocation in most cases. Use
     * <code>RequestResponse</code> only when you want to make a mail flow
     * decision, such as whether to stop the receipt rule or the receipt rule
     * set.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse
     *
     * @param invocationType <p>
     *            The invocation type of the AWS Lambda function. An invocation
     *            type of <code>RequestResponse</code> means that the execution
     *            of the function will immediately result in a response, and a
     *            value of <code>Event</code> means that the function will be
     *            invoked asynchronously. The default value is
     *            <code>Event</code>. For information about AWS Lambda
     *            invocation types, see the <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html"
     *            >AWS Lambda Developer Guide</a>.
     *            </p>
     *            <important>
     *            <p>
     *            There is a 30-second timeout on <code>RequestResponse</code>
     *            invocations. You should use <code>Event</code> invocation in
     *            most cases. Use <code>RequestResponse</code> only when you
     *            want to make a mail flow decision, such as whether to stop the
     *            receipt rule or the receipt rule set.
     *            </p>
     *            </important>
     * @see InvocationType
     */
    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * The invocation type of the AWS Lambda function. An invocation type of
     * <code>RequestResponse</code> means that the execution of the function
     * will immediately result in a response, and a value of <code>Event</code>
     * means that the function will be invoked asynchronously. The default value
     * is <code>Event</code>. For information about AWS Lambda invocation types,
     * see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <important>
     * <p>
     * There is a 30-second timeout on <code>RequestResponse</code> invocations.
     * You should use <code>Event</code> invocation in most cases. Use
     * <code>RequestResponse</code> only when you want to make a mail flow
     * decision, such as whether to stop the receipt rule or the receipt rule
     * set.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse
     *
     * @param invocationType <p>
     *            The invocation type of the AWS Lambda function. An invocation
     *            type of <code>RequestResponse</code> means that the execution
     *            of the function will immediately result in a response, and a
     *            value of <code>Event</code> means that the function will be
     *            invoked asynchronously. The default value is
     *            <code>Event</code>. For information about AWS Lambda
     *            invocation types, see the <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html"
     *            >AWS Lambda Developer Guide</a>.
     *            </p>
     *            <important>
     *            <p>
     *            There is a 30-second timeout on <code>RequestResponse</code>
     *            invocations. You should use <code>Event</code> invocation in
     *            most cases. Use <code>RequestResponse</code> only when you
     *            want to make a mail flow decision, such as whether to stop the
     *            receipt rule or the receipt rule set.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvocationType
     */
    public LambdaAction withInvocationType(String invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * <p>
     * The invocation type of the AWS Lambda function. An invocation type of
     * <code>RequestResponse</code> means that the execution of the function
     * will immediately result in a response, and a value of <code>Event</code>
     * means that the function will be invoked asynchronously. The default value
     * is <code>Event</code>. For information about AWS Lambda invocation types,
     * see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <important>
     * <p>
     * There is a 30-second timeout on <code>RequestResponse</code> invocations.
     * You should use <code>Event</code> invocation in most cases. Use
     * <code>RequestResponse</code> only when you want to make a mail flow
     * decision, such as whether to stop the receipt rule or the receipt rule
     * set.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse
     *
     * @param invocationType <p>
     *            The invocation type of the AWS Lambda function. An invocation
     *            type of <code>RequestResponse</code> means that the execution
     *            of the function will immediately result in a response, and a
     *            value of <code>Event</code> means that the function will be
     *            invoked asynchronously. The default value is
     *            <code>Event</code>. For information about AWS Lambda
     *            invocation types, see the <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html"
     *            >AWS Lambda Developer Guide</a>.
     *            </p>
     *            <important>
     *            <p>
     *            There is a 30-second timeout on <code>RequestResponse</code>
     *            invocations. You should use <code>Event</code> invocation in
     *            most cases. Use <code>RequestResponse</code> only when you
     *            want to make a mail flow decision, such as whether to stop the
     *            receipt rule or the receipt rule set.
     *            </p>
     *            </important>
     * @see InvocationType
     */
    public void setInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
    }

    /**
     * <p>
     * The invocation type of the AWS Lambda function. An invocation type of
     * <code>RequestResponse</code> means that the execution of the function
     * will immediately result in a response, and a value of <code>Event</code>
     * means that the function will be invoked asynchronously. The default value
     * is <code>Event</code>. For information about AWS Lambda invocation types,
     * see the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html">AWS
     * Lambda Developer Guide</a>.
     * </p>
     * <important>
     * <p>
     * There is a 30-second timeout on <code>RequestResponse</code> invocations.
     * You should use <code>Event</code> invocation in most cases. Use
     * <code>RequestResponse</code> only when you want to make a mail flow
     * decision, such as whether to stop the receipt rule or the receipt rule
     * set.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse
     *
     * @param invocationType <p>
     *            The invocation type of the AWS Lambda function. An invocation
     *            type of <code>RequestResponse</code> means that the execution
     *            of the function will immediately result in a response, and a
     *            value of <code>Event</code> means that the function will be
     *            invoked asynchronously. The default value is
     *            <code>Event</code>. For information about AWS Lambda
     *            invocation types, see the <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html"
     *            >AWS Lambda Developer Guide</a>.
     *            </p>
     *            <important>
     *            <p>
     *            There is a 30-second timeout on <code>RequestResponse</code>
     *            invocations. You should use <code>Event</code> invocation in
     *            most cases. Use <code>RequestResponse</code> only when you
     *            want to make a mail flow decision, such as whether to stop the
     *            receipt rule or the receipt rule set.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvocationType
     */
    public LambdaAction withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: " + getFunctionArn() + ",");
        if (getInvocationType() != null)
            sb.append("InvocationType: " + getInvocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode
                + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaAction == false)
            return false;
        LambdaAction other = (LambdaAction) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null
                && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null
                && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        return true;
    }
}
