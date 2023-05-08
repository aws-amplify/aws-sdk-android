/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Provides additional detail about why the request failed:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Document size is too large - Check the size of your file and resubmit the
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Document type is not supported - Check the file type and resubmit the
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Too many pages in the document - Check the number of pages in your file and
 * resubmit the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Access denied to Amazon Textract - Verify that your account has permission to
 * use Amazon Textract API operations and resubmit the request.
 * </p>
 * </li>
 * </ul>
 */
public class InvalidRequestDetail implements Serializable {
    /**
     * <p>
     * Reason code is <code>INVALID_DOCUMENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_SIZE_EXCEEDED, UNSUPPORTED_DOC_TYPE,
     * PAGE_LIMIT_EXCEEDED, TEXTRACT_ACCESS_DENIED
     */
    private String reason;

    /**
     * <p>
     * Reason code is <code>INVALID_DOCUMENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_SIZE_EXCEEDED, UNSUPPORTED_DOC_TYPE,
     * PAGE_LIMIT_EXCEEDED, TEXTRACT_ACCESS_DENIED
     *
     * @return <p>
     *         Reason code is <code>INVALID_DOCUMENT</code>.
     *         </p>
     * @see InvalidRequestDetailReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * Reason code is <code>INVALID_DOCUMENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_SIZE_EXCEEDED, UNSUPPORTED_DOC_TYPE,
     * PAGE_LIMIT_EXCEEDED, TEXTRACT_ACCESS_DENIED
     *
     * @param reason <p>
     *            Reason code is <code>INVALID_DOCUMENT</code>.
     *            </p>
     * @see InvalidRequestDetailReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Reason code is <code>INVALID_DOCUMENT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_SIZE_EXCEEDED, UNSUPPORTED_DOC_TYPE,
     * PAGE_LIMIT_EXCEEDED, TEXTRACT_ACCESS_DENIED
     *
     * @param reason <p>
     *            Reason code is <code>INVALID_DOCUMENT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvalidRequestDetailReason
     */
    public InvalidRequestDetail withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * Reason code is <code>INVALID_DOCUMENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_SIZE_EXCEEDED, UNSUPPORTED_DOC_TYPE,
     * PAGE_LIMIT_EXCEEDED, TEXTRACT_ACCESS_DENIED
     *
     * @param reason <p>
     *            Reason code is <code>INVALID_DOCUMENT</code>.
     *            </p>
     * @see InvalidRequestDetailReason
     */
    public void setReason(InvalidRequestDetailReason reason) {
        this.reason = reason.toString();
    }

    /**
     * <p>
     * Reason code is <code>INVALID_DOCUMENT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_SIZE_EXCEEDED, UNSUPPORTED_DOC_TYPE,
     * PAGE_LIMIT_EXCEEDED, TEXTRACT_ACCESS_DENIED
     *
     * @param reason <p>
     *            Reason code is <code>INVALID_DOCUMENT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvalidRequestDetailReason
     */
    public InvalidRequestDetail withReason(InvalidRequestDetailReason reason) {
        this.reason = reason.toString();
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
        if (getReason() != null)
            sb.append("Reason: " + getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidRequestDetail == false)
            return false;
        InvalidRequestDetail other = (InvalidRequestDetail) obj;

        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }
}
