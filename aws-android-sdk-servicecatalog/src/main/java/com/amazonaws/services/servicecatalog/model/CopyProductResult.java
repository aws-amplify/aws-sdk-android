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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class CopyProductResult implements Serializable {
    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String copyProductToken;

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The token to use to track the progress of the operation.
     *         </p>
     */
    public String getCopyProductToken() {
        return copyProductToken;
    }

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param copyProductToken <p>
     *            The token to use to track the progress of the operation.
     *            </p>
     */
    public void setCopyProductToken(String copyProductToken) {
        this.copyProductToken = copyProductToken;
    }

    /**
     * <p>
     * The token to use to track the progress of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param copyProductToken <p>
     *            The token to use to track the progress of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductResult withCopyProductToken(String copyProductToken) {
        this.copyProductToken = copyProductToken;
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
        if (getCopyProductToken() != null)
            sb.append("CopyProductToken: " + getCopyProductToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCopyProductToken() == null) ? 0 : getCopyProductToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyProductResult == false)
            return false;
        CopyProductResult other = (CopyProductResult) obj;

        if (other.getCopyProductToken() == null ^ this.getCopyProductToken() == null)
            return false;
        if (other.getCopyProductToken() != null
                && other.getCopyProductToken().equals(this.getCopyProductToken()) == false)
            return false;
        return true;
    }
}
