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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The response from the server for a registration request.
 * </p>
 */
public class SignUpResult implements Serializable {
    /**
     * <p>
     * A response from the server indicating that a user registration has been
     * confirmed.
     * </p>
     */
    private Boolean userConfirmed;

    /**
     * <p>
     * The code delivery details returned by the server response to the user
     * registration request.
     * </p>
     */
    private CodeDeliveryDetailsType codeDeliveryDetails;

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as
     * <code>username</code>.
     * </p>
     */
    private String userSub;

    /**
     * <p>
     * A response from the server indicating that a user registration has been
     * confirmed.
     * </p>
     *
     * @return <p>
     *         A response from the server indicating that a user registration
     *         has been confirmed.
     *         </p>
     */
    public Boolean isUserConfirmed() {
        return userConfirmed;
    }

    /**
     * <p>
     * A response from the server indicating that a user registration has been
     * confirmed.
     * </p>
     *
     * @return <p>
     *         A response from the server indicating that a user registration
     *         has been confirmed.
     *         </p>
     */
    public Boolean getUserConfirmed() {
        return userConfirmed;
    }

    /**
     * <p>
     * A response from the server indicating that a user registration has been
     * confirmed.
     * </p>
     *
     * @param userConfirmed <p>
     *            A response from the server indicating that a user registration
     *            has been confirmed.
     *            </p>
     */
    public void setUserConfirmed(Boolean userConfirmed) {
        this.userConfirmed = userConfirmed;
    }

    /**
     * <p>
     * A response from the server indicating that a user registration has been
     * confirmed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userConfirmed <p>
     *            A response from the server indicating that a user registration
     *            has been confirmed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignUpResult withUserConfirmed(Boolean userConfirmed) {
        this.userConfirmed = userConfirmed;
        return this;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to the user
     * registration request.
     * </p>
     *
     * @return <p>
     *         The code delivery details returned by the server response to the
     *         user registration request.
     *         </p>
     */
    public CodeDeliveryDetailsType getCodeDeliveryDetails() {
        return codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to the user
     * registration request.
     * </p>
     *
     * @param codeDeliveryDetails <p>
     *            The code delivery details returned by the server response to
     *            the user registration request.
     *            </p>
     */
    public void setCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to the user
     * registration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeDeliveryDetails <p>
     *            The code delivery details returned by the server response to
     *            the user registration request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignUpResult withCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
        return this;
    }

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as
     * <code>username</code>.
     * </p>
     *
     * @return <p>
     *         The UUID of the authenticated user. This is not the same as
     *         <code>username</code>.
     *         </p>
     */
    public String getUserSub() {
        return userSub;
    }

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as
     * <code>username</code>.
     * </p>
     *
     * @param userSub <p>
     *            The UUID of the authenticated user. This is not the same as
     *            <code>username</code>.
     *            </p>
     */
    public void setUserSub(String userSub) {
        this.userSub = userSub;
    }

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as
     * <code>username</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userSub <p>
     *            The UUID of the authenticated user. This is not the same as
     *            <code>username</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignUpResult withUserSub(String userSub) {
        this.userSub = userSub;
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
        if (getUserConfirmed() != null)
            sb.append("UserConfirmed: " + getUserConfirmed() + ",");
        if (getCodeDeliveryDetails() != null)
            sb.append("CodeDeliveryDetails: " + getCodeDeliveryDetails() + ",");
        if (getUserSub() != null)
            sb.append("UserSub: " + getUserSub());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserConfirmed() == null) ? 0 : getUserConfirmed().hashCode());
        hashCode = prime * hashCode
                + ((getCodeDeliveryDetails() == null) ? 0 : getCodeDeliveryDetails().hashCode());
        hashCode = prime * hashCode + ((getUserSub() == null) ? 0 : getUserSub().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignUpResult == false)
            return false;
        SignUpResult other = (SignUpResult) obj;

        if (other.getUserConfirmed() == null ^ this.getUserConfirmed() == null)
            return false;
        if (other.getUserConfirmed() != null
                && other.getUserConfirmed().equals(this.getUserConfirmed()) == false)
            return false;
        if (other.getCodeDeliveryDetails() == null ^ this.getCodeDeliveryDetails() == null)
            return false;
        if (other.getCodeDeliveryDetails() != null
                && other.getCodeDeliveryDetails().equals(this.getCodeDeliveryDetails()) == false)
            return false;
        if (other.getUserSub() == null ^ this.getUserSub() == null)
            return false;
        if (other.getUserSub() != null && other.getUserSub().equals(this.getUserSub()) == false)
            return false;
        return true;
    }
}
