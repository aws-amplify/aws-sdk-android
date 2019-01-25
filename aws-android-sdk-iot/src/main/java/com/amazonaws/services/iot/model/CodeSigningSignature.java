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

/**
 * <p>
 * Describes the signature for a file.
 * </p>
 */
public class CodeSigningSignature implements Serializable {
    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
     * </p>
     */
    private java.nio.ByteBuffer inlineDocument;

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
     * </p>
     *
     * @return <p>
     *         A base64 encoded binary representation of the code signing
     *         signature.
     *         </p>
     */
    public java.nio.ByteBuffer getInlineDocument() {
        return inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
     * </p>
     *
     * @param inlineDocument <p>
     *            A base64 encoded binary representation of the code signing
     *            signature.
     *            </p>
     */
    public void setInlineDocument(java.nio.ByteBuffer inlineDocument) {
        this.inlineDocument = inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inlineDocument <p>
     *            A base64 encoded binary representation of the code signing
     *            signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeSigningSignature withInlineDocument(java.nio.ByteBuffer inlineDocument) {
        this.inlineDocument = inlineDocument;
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
        if (getInlineDocument() != null)
            sb.append("inlineDocument: " + getInlineDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInlineDocument() == null) ? 0 : getInlineDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigningSignature == false)
            return false;
        CodeSigningSignature other = (CodeSigningSignature) obj;

        if (other.getInlineDocument() == null ^ this.getInlineDocument() == null)
            return false;
        if (other.getInlineDocument() != null
                && other.getInlineDocument().equals(this.getInlineDocument()) == false)
            return false;
        return true;
    }
}
