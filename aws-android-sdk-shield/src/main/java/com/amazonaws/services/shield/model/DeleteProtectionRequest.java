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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an AWS Shield Advanced <a>Protection</a>.
 * </p>
 */
public class DeleteProtectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to be
     * deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     */
    private String protectionId;

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to be
     * deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) for the <a>Protection</a> object to be
     *         deleted.
     *         </p>
     */
    public String getProtectionId() {
        return protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to be
     * deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param protectionId <p>
     *            The unique identifier (ID) for the <a>Protection</a> object to
     *            be deleted.
     *            </p>
     */
    public void setProtectionId(String protectionId) {
        this.protectionId = protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to be
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param protectionId <p>
     *            The unique identifier (ID) for the <a>Protection</a> object to
     *            be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteProtectionRequest withProtectionId(String protectionId) {
        this.protectionId = protectionId;
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
        if (getProtectionId() != null)
            sb.append("ProtectionId: " + getProtectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProtectionId() == null) ? 0 : getProtectionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProtectionRequest == false)
            return false;
        DeleteProtectionRequest other = (DeleteProtectionRequest) obj;

        if (other.getProtectionId() == null ^ this.getProtectionId() == null)
            return false;
        if (other.getProtectionId() != null
                && other.getProtectionId().equals(this.getProtectionId()) == false)
            return false;
        return true;
    }
}
