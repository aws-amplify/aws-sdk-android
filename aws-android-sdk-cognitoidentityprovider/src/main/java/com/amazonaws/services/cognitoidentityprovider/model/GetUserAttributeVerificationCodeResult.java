/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The verification code response returned by the server response to get the
 * user attribute verification code.
 * </p>
 */
public class GetUserAttributeVerificationCodeResult implements Serializable {
    /**
     * <p>
     * The code delivery details returned by the server response to get the user
     * attribute verification code.
     * </p>
     */
    private CodeDeliveryDetailsType codeDeliveryDetails;

    /**
     * <p>
     * The code delivery details returned by the server response to get the user
     * attribute verification code.
     * </p>
     *
     * @return <p>
     *         The code delivery details returned by the server response to get
     *         the user attribute verification code.
     *         </p>
     */
    public CodeDeliveryDetailsType getCodeDeliveryDetails() {
        return codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to get the user
     * attribute verification code.
     * </p>
     *
     * @param codeDeliveryDetails <p>
     *            The code delivery details returned by the server response to
     *            get the user attribute verification code.
     *            </p>
     */
    public void setCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to get the user
     * attribute verification code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeDeliveryDetails <p>
     *            The code delivery details returned by the server response to
     *            get the user attribute verification code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserAttributeVerificationCodeResult withCodeDeliveryDetails(
            CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
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
        if (getCodeDeliveryDetails() != null)
            sb.append("CodeDeliveryDetails: " + getCodeDeliveryDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCodeDeliveryDetails() == null) ? 0 : getCodeDeliveryDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserAttributeVerificationCodeResult == false)
            return false;
        GetUserAttributeVerificationCodeResult other = (GetUserAttributeVerificationCodeResult) obj;

        if (other.getCodeDeliveryDetails() == null ^ this.getCodeDeliveryDetails() == null)
            return false;
        if (other.getCodeDeliveryDetails() != null
                && other.getCodeDeliveryDetails().equals(this.getCodeDeliveryDetails()) == false)
            return false;
        return true;
    }
}
