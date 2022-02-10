/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Retrieves the SMS sandbox status for the calling Amazon Web Services account
 * in the target Amazon Web Services Region.
 * </p>
 * <p>
 * When you start using Amazon SNS to send SMS messages, your Amazon Web
 * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
 * safe environment for you to try Amazon SNS features without risking your
 * reputation as an SMS sender. While your Amazon Web Services account is in the
 * SMS sandbox, you can use all of the features of Amazon SNS. However, you can
 * send SMS messages only to verified destination phone numbers. For more
 * information, including how to move out of the sandbox to send messages
 * without restrictions, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
 * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
 * </p>
 */
public class GetSMSSandboxAccountStatusRequest extends AmazonWebServiceRequest implements
        Serializable {
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

        if (obj instanceof GetSMSSandboxAccountStatusRequest == false)
            return false;
        GetSMSSandboxAccountStatusRequest other = (GetSMSSandboxAccountStatusRequest) obj;

        return true;
    }
}
