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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class RegisterTypeResult implements Serializable {
    /**
     * <p>
     * The identifier for this registration request.
     * </p>
     * <p>
     * Use this registration token when calling
     * <code> <a>DescribeTypeRegistration</a> </code>, which returns information
     * about the status and IDs of the type registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String registrationToken;

    /**
     * <p>
     * The identifier for this registration request.
     * </p>
     * <p>
     * Use this registration token when calling
     * <code> <a>DescribeTypeRegistration</a> </code>, which returns information
     * about the status and IDs of the type registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The identifier for this registration request.
     *         </p>
     *         <p>
     *         Use this registration token when calling
     *         <code> <a>DescribeTypeRegistration</a> </code>, which returns
     *         information about the status and IDs of the type registration.
     *         </p>
     */
    public String getRegistrationToken() {
        return registrationToken;
    }

    /**
     * <p>
     * The identifier for this registration request.
     * </p>
     * <p>
     * Use this registration token when calling
     * <code> <a>DescribeTypeRegistration</a> </code>, which returns information
     * about the status and IDs of the type registration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param registrationToken <p>
     *            The identifier for this registration request.
     *            </p>
     *            <p>
     *            Use this registration token when calling
     *            <code> <a>DescribeTypeRegistration</a> </code>, which returns
     *            information about the status and IDs of the type registration.
     *            </p>
     */
    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    /**
     * <p>
     * The identifier for this registration request.
     * </p>
     * <p>
     * Use this registration token when calling
     * <code> <a>DescribeTypeRegistration</a> </code>, which returns information
     * about the status and IDs of the type registration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param registrationToken <p>
     *            The identifier for this registration request.
     *            </p>
     *            <p>
     *            Use this registration token when calling
     *            <code> <a>DescribeTypeRegistration</a> </code>, which returns
     *            information about the status and IDs of the type registration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTypeResult withRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
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
        if (getRegistrationToken() != null)
            sb.append("RegistrationToken: " + getRegistrationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegistrationToken() == null) ? 0 : getRegistrationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTypeResult == false)
            return false;
        RegisterTypeResult other = (RegisterTypeResult) obj;

        if (other.getRegistrationToken() == null ^ this.getRegistrationToken() == null)
            return false;
        if (other.getRegistrationToken() != null
                && other.getRegistrationToken().equals(this.getRegistrationToken()) == false)
            return false;
        return true;
    }
}
