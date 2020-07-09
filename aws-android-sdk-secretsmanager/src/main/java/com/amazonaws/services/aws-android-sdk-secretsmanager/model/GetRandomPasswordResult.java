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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class GetRandomPasswordResult implements Serializable {
    /**
     * <p>A string with the generated password.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String randomPassword;

    /**
     * <p>A string with the generated password.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>A string with the generated password.</p>
     */
    public String getRandomPassword() {
        return randomPassword;
    }

    /**
     * <p>A string with the generated password.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param randomPassword <p>A string with the generated password.</p>
     */
    public void setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
    }

    /**
     * <p>A string with the generated password.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param randomPassword <p>A string with the generated password.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordResult withRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRandomPassword() != null) sb.append("RandomPassword: " + getRandomPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRandomPassword() == null) ? 0 : getRandomPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRandomPasswordResult == false) return false;
        GetRandomPasswordResult other = (GetRandomPasswordResult)obj;

        if (other.getRandomPassword() == null ^ this.getRandomPassword() == null) return false;
        if (other.getRandomPassword() != null && other.getRandomPassword().equals(this.getRandomPassword()) == false) return false;
        return true;
    }
}
