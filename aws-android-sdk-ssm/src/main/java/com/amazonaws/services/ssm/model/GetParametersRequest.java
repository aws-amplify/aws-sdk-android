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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Get details of a parameter. Don't confuse this API action with the
 * <a>GetParameter</a> API action.
 * </p>
 */
public class GetParametersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure
     * string parameters. This flag is ignored for String and StringList
     * parameter types.
     * </p>
     */
    private Boolean withDecryption;

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     *
     * @return <p>
     *         Names of the parameters for which you want to query information.
     *         </p>
     */
    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     *
     * @param names <p>
     *            Names of the parameters for which you want to query
     *            information.
     *            </p>
     */
    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            Names of the parameters for which you want to query
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersRequest withNames(String... names) {
        if (getNames() == null) {
            this.names = new java.util.ArrayList<String>(names.length);
        }
        for (String value : names) {
            this.names.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            Names of the parameters for which you want to query
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure
     * string parameters. This flag is ignored for String and StringList
     * parameter types.
     * </p>
     *
     * @return <p>
     *         Return decrypted secure string value. Return decrypted values for
     *         secure string parameters. This flag is ignored for String and
     *         StringList parameter types.
     *         </p>
     */
    public Boolean isWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure
     * string parameters. This flag is ignored for String and StringList
     * parameter types.
     * </p>
     *
     * @return <p>
     *         Return decrypted secure string value. Return decrypted values for
     *         secure string parameters. This flag is ignored for String and
     *         StringList parameter types.
     *         </p>
     */
    public Boolean getWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure
     * string parameters. This flag is ignored for String and StringList
     * parameter types.
     * </p>
     *
     * @param withDecryption <p>
     *            Return decrypted secure string value. Return decrypted values
     *            for secure string parameters. This flag is ignored for String
     *            and StringList parameter types.
     *            </p>
     */
    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure
     * string parameters. This flag is ignored for String and StringList
     * parameter types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param withDecryption <p>
     *            Return decrypted secure string value. Return decrypted values
     *            for secure string parameters. This flag is ignored for String
     *            and StringList parameter types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersRequest withWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
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
        if (getNames() != null)
            sb.append("Names: " + getNames() + ",");
        if (getWithDecryption() != null)
            sb.append("WithDecryption: " + getWithDecryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode
                + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersRequest == false)
            return false;
        GetParametersRequest other = (GetParametersRequest) obj;

        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getWithDecryption() == null ^ this.getWithDecryption() == null)
            return false;
        if (other.getWithDecryption() != null
                && other.getWithDecryption().equals(this.getWithDecryption()) == false)
            return false;
        return true;
    }
}
