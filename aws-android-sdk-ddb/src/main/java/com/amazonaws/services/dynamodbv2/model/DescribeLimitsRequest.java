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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the current provisioned-capacity limits for your AWS account in a
 * region, both for the region as a whole and for any one DynamoDB table that
 * you create there.
 * </p>
 * <p>
 * When you establish an AWS account, the account has initial limits on the
 * maximum read capacity units and write capacity units that you can provision
 * across all of your DynamoDB tables in a given region. Also, there are
 * per-table limits that apply when you create a table there. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
 * >Limits</a> page in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * Although you can increase these limits by filing a case at <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>,
 * obtaining the increase is not instantaneous. The <code>DescribeLimits</code>
 * action lets you write code to compare the capacity you are currently using to
 * those limits imposed by your account so that you have enough time to apply
 * for an increase before you hit a limit.
 * </p>
 * <p>
 * For example, you could use one of the AWS SDKs to do the following:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Call <code>DescribeLimits</code> for a particular region to obtain your
 * current account limits on provisioned capacity there.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a variable to hold the aggregate read capacity units provisioned for
 * all your tables in that region, and one to hold the aggregate write capacity
 * units. Zero them both.
 * </p>
 * </li>
 * <li>
 * <p>
 * Call <code>ListTables</code> to obtain a list of all your DynamoDB tables.
 * </p>
 * </li>
 * <li>
 * <p>
 * For each table name listed by <code>ListTables</code>, do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Call <code>DescribeTable</code> with the table name.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the data returned by <code>DescribeTable</code> to add the read capacity
 * units and write capacity units provisioned for the table itself to your
 * variables.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the table has one or more global secondary indexes (GSIs), loop over these
 * GSIs and add their provisioned capacity values to your variables as well.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Report the account limits for that region returned by
 * <code>DescribeLimits</code>, along with the total current provisioned
 * capacity levels you have calculated.
 * </p>
 * </li>
 * </ol>
 * <p>
 * This will let you see whether you are getting close to your account-level
 * limits.
 * </p>
 * <p>
 * The per-table limits apply only when you are creating a new table. They
 * restrict the sum of the provisioned capacity of the new table itself and all
 * its global secondary indexes.
 * </p>
 * <p>
 * For existing tables and their GSIs, DynamoDB will not let you increase
 * provisioned capacity extremely rapidly, but the only upper limit that applies
 * is that the aggregate provisioned capacity over all your tables and GSIs
 * cannot exceed either of the per-account limits.
 * </p>
 * <note>
 * <p>
 * <code>DescribeLimits</code> should only be called periodically. You can
 * expect throttling errors if you call it more than once in a minute.
 * </p>
 * </note>
 * <p>
 * The <code>DescribeLimits</code> Request element has no content.
 * </p>
 */
public class DescribeLimitsRequest extends AmazonWebServiceRequest implements Serializable {
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
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLimitsRequest == false)
            return false;
        DescribeLimitsRequest other = (DescribeLimitsRequest) obj;

        return true;
    }
}
