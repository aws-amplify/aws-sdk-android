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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides authorization for Amazon to bring a specific IP address range to a
 * specific AWS account using bring your own IP addresses (BYOIP). For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#prepare-for-byoip"
 * >Prepare to Bring Your Address Range to Your AWS Account</a> in the <i>Amazon
 * Elastic Compute Cloud User Guide</i>.
 * </p>
 */
public class CidrAuthorizationContext implements Serializable {
    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     *
     * @return <p>
     *         The plain-text authorization message for the prefix and account.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     *
     * @param message <p>
     *            The plain-text authorization message for the prefix and
     *            account.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The plain-text authorization message for the prefix and
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CidrAuthorizationContext withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     *
     * @return <p>
     *         The signed authorization message for the prefix and account.
     *         </p>
     */
    public String getSignature() {
        return signature;
    }

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     *
     * @param signature <p>
     *            The signed authorization message for the prefix and account.
     *            </p>
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signature <p>
     *            The signed authorization message for the prefix and account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CidrAuthorizationContext withSignature(String signature) {
        this.signature = signature;
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSignature() != null)
            sb.append("Signature: " + getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CidrAuthorizationContext == false)
            return false;
        CidrAuthorizationContext other = (CidrAuthorizationContext) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null
                && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }
}
