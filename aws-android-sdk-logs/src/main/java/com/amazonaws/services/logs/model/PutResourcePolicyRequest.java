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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a resource policy allowing other AWS services to put log
 * events to this account, such as Amazon Route 53. An account can have up to 10
 * resource policies per region.
 * </p>
 */
public class PutResourcePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that
     * is enabled to put logs to this account. This is formatted as a JSON
     * string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53
     * service to put DNS query logs in to the specified log group. Replace
     * "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     * group or log stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5120<br/>
     */
    private String policyDocument;

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     *
     * @return <p>
     *         Name of the new policy. This parameter is required.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     *
     * @param policyName <p>
     *            Name of the new policy. This parameter is required.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyName <p>
     *            Name of the new policy. This parameter is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that
     * is enabled to put logs to this account. This is formatted as a JSON
     * string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53
     * service to put DNS query logs in to the specified log group. Replace
     * "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     * group or log stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5120<br/>
     *
     * @return <p>
     *         Details of the new policy, including the identity of the
     *         principal that is enabled to put logs to this account. This is
     *         formatted as a JSON string.
     *         </p>
     *         <p>
     *         The following example creates a resource policy enabling the
     *         Route 53 service to put DNS query logs in to the specified log
     *         group. Replace "logArn" with the ARN of your CloudWatch Logs
     *         resource, such as a log group or log stream.
     *         </p>
     *         <p>
     *         <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that
     * is enabled to put logs to this account. This is formatted as a JSON
     * string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53
     * service to put DNS query logs in to the specified log group. Replace
     * "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     * group or log stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5120<br/>
     *
     * @param policyDocument <p>
     *            Details of the new policy, including the identity of the
     *            principal that is enabled to put logs to this account. This is
     *            formatted as a JSON string.
     *            </p>
     *            <p>
     *            The following example creates a resource policy enabling the
     *            Route 53 service to put DNS query logs in to the specified log
     *            group. Replace "logArn" with the ARN of your CloudWatch Logs
     *            resource, such as a log group or log stream.
     *            </p>
     *            <p>
     *            <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that
     * is enabled to put logs to this account. This is formatted as a JSON
     * string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53
     * service to put DNS query logs in to the specified log group. Replace
     * "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     * group or log stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5120<br/>
     *
     * @param policyDocument <p>
     *            Details of the new policy, including the identity of the
     *            principal that is enabled to put logs to this account. This is
     *            formatted as a JSON string.
     *            </p>
     *            <p>
     *            The following example creates a resource policy enabling the
     *            Route 53 service to put DNS query logs in to the specified log
     *            group. Replace "logArn" with the ARN of your CloudWatch Logs
     *            resource, such as a log group or log stream.
     *            </p>
     *            <p>
     *            <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
        if (getPolicyName() != null)
            sb.append("policyName: " + getPolicyName() + ",");
        if (getPolicyDocument() != null)
            sb.append("policyDocument: " + getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }
}
