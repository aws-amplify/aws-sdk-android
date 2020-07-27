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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Get information about a parameter by using the parameter name. Don't confuse this API action with the <a>GetParameters</a> API action.</p>
 */
public class GetParameterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of the parameter you want to query.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String name;

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    private Boolean withDecryption;

    /**
     * <p>The name of the parameter you want to query.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The name of the parameter you want to query.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the parameter you want to query.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>The name of the parameter you want to query.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the parameter you want to query.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>The name of the parameter you want to query.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParameterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @return <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    public Boolean isWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @return <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    public Boolean getWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @param withDecryption <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param withDecryption <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParameterRequest withWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getWithDecryption() != null) sb.append("WithDecryption: " + getWithDecryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetParameterRequest == false) return false;
        GetParameterRequest other = (GetParameterRequest)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getWithDecryption() == null ^ this.getWithDecryption() == null) return false;
        if (other.getWithDecryption() != null && other.getWithDecryption().equals(this.getWithDecryption()) == false) return false;
        return true;
    }
}
