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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class BatchUpdatePhoneNumberResult implements Serializable {
    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request,
     * a list of the phone numbers is returned, along with error codes and error
     * messages.
     * </p>
     */
    private java.util.List<PhoneNumberError> phoneNumberErrors;

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request,
     * a list of the phone numbers is returned, along with error codes and error
     * messages.
     * </p>
     *
     * @return <p>
     *         If the action fails for one or more of the phone numbers in the
     *         request, a list of the phone numbers is returned, along with
     *         error codes and error messages.
     *         </p>
     */
    public java.util.List<PhoneNumberError> getPhoneNumberErrors() {
        return phoneNumberErrors;
    }

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request,
     * a list of the phone numbers is returned, along with error codes and error
     * messages.
     * </p>
     *
     * @param phoneNumberErrors <p>
     *            If the action fails for one or more of the phone numbers in
     *            the request, a list of the phone numbers is returned, along
     *            with error codes and error messages.
     *            </p>
     */
    public void setPhoneNumberErrors(java.util.Collection<PhoneNumberError> phoneNumberErrors) {
        if (phoneNumberErrors == null) {
            this.phoneNumberErrors = null;
            return;
        }

        this.phoneNumberErrors = new java.util.ArrayList<PhoneNumberError>(phoneNumberErrors);
    }

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request,
     * a list of the phone numbers is returned, along with error codes and error
     * messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberErrors <p>
     *            If the action fails for one or more of the phone numbers in
     *            the request, a list of the phone numbers is returned, along
     *            with error codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdatePhoneNumberResult withPhoneNumberErrors(PhoneNumberError... phoneNumberErrors) {
        if (getPhoneNumberErrors() == null) {
            this.phoneNumberErrors = new java.util.ArrayList<PhoneNumberError>(
                    phoneNumberErrors.length);
        }
        for (PhoneNumberError value : phoneNumberErrors) {
            this.phoneNumberErrors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request,
     * a list of the phone numbers is returned, along with error codes and error
     * messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberErrors <p>
     *            If the action fails for one or more of the phone numbers in
     *            the request, a list of the phone numbers is returned, along
     *            with error codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdatePhoneNumberResult withPhoneNumberErrors(
            java.util.Collection<PhoneNumberError> phoneNumberErrors) {
        setPhoneNumberErrors(phoneNumberErrors);
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
        if (getPhoneNumberErrors() != null)
            sb.append("PhoneNumberErrors: " + getPhoneNumberErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberErrors() == null) ? 0 : getPhoneNumberErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdatePhoneNumberResult == false)
            return false;
        BatchUpdatePhoneNumberResult other = (BatchUpdatePhoneNumberResult) obj;

        if (other.getPhoneNumberErrors() == null ^ this.getPhoneNumberErrors() == null)
            return false;
        if (other.getPhoneNumberErrors() != null
                && other.getPhoneNumberErrors().equals(this.getPhoneNumberErrors()) == false)
            return false;
        return true;
    }
}
