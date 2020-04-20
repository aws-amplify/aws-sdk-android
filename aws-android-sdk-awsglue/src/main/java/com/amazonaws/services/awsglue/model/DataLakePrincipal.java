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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * The AWS Lake Formation principal.
 * </p>
 */
public class DataLakePrincipal implements Serializable {
    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String dataLakePrincipalIdentifier;

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         An identifier for the AWS Lake Formation principal.
     *         </p>
     */
    public String getDataLakePrincipalIdentifier() {
        return dataLakePrincipalIdentifier;
    }

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param dataLakePrincipalIdentifier <p>
     *            An identifier for the AWS Lake Formation principal.
     *            </p>
     */
    public void setDataLakePrincipalIdentifier(String dataLakePrincipalIdentifier) {
        this.dataLakePrincipalIdentifier = dataLakePrincipalIdentifier;
    }

    /**
     * <p>
     * An identifier for the AWS Lake Formation principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param dataLakePrincipalIdentifier <p>
     *            An identifier for the AWS Lake Formation principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataLakePrincipal withDataLakePrincipalIdentifier(String dataLakePrincipalIdentifier) {
        this.dataLakePrincipalIdentifier = dataLakePrincipalIdentifier;
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
        if (getDataLakePrincipalIdentifier() != null)
            sb.append("DataLakePrincipalIdentifier: " + getDataLakePrincipalIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDataLakePrincipalIdentifier() == null) ? 0
                        : getDataLakePrincipalIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakePrincipal == false)
            return false;
        DataLakePrincipal other = (DataLakePrincipal) obj;

        if (other.getDataLakePrincipalIdentifier() == null
                ^ this.getDataLakePrincipalIdentifier() == null)
            return false;
        if (other.getDataLakePrincipalIdentifier() != null
                && other.getDataLakePrincipalIdentifier().equals(
                        this.getDataLakePrincipalIdentifier()) == false)
            return false;
        return true;
    }
}
