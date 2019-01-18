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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class GetJobDocumentResult implements Serializable {
    /**
     * <p>
     * The job document content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     */
    private String document;

    /**
     * <p>
     * The job document content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @return <p>
     *         The job document content.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The job document content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document content.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobDocumentResult withDocument(String document) {
        this.document = document;
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
        if (getDocument() != null)
            sb.append("document: " + getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobDocumentResult == false)
            return false;
        GetJobDocumentResult other = (GetJobDocumentResult) obj;

        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }
}
