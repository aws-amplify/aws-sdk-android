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
 * Text extraction encountered one or more page-level errors in the input
 * document.
 * </p>
 * <p>
 * The <code>ErrorCode</code> contains one of the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * TEXTRACT_BAD_PAGE - Amazon Textract cannot read the page. For more
 * information about page limits in Amazon Textract, see <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/limits-document.html">
 * Page Quotas in Amazon Textract</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED - The number of requests exceeded
 * your throughput limit. For more information about throughput quotas in Amazon
 * Textract, see <a href=
 * "https://docs.aws.amazon.com/textract/latest/dg/limits-quotas-explained.html"
 * > Default quotas in Amazon Textract</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * PAGE_CHARACTERS_EXCEEDED - Too many text characters on the page (10,000
 * characters maximum).
 * </p>
 * </li>
 * <li>
 * <p>
 * PAGE_SIZE_EXCEEDED - The maximum page size is 10 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * INTERNAL_SERVER_ERROR - The request encountered a service issue. Try the API
 * request again.
 * </p>
 * </li>
 * </ul>
 */
public class ErrorsListItem implements Serializable {
    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_BAD_PAGE,
     * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED,
     * PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR
     */
    private String errorCode;

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String errorMessage;

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     *
     * @return <p>
     *         Page number where the error occurred.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     *
     * @param page <p>
     *            Page number where the error occurred.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param page <p>
     *            Page number where the error occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorsListItem withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_BAD_PAGE,
     * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED,
     * PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR
     *
     * @return <p>
     *         Error code for the cause of the error.
     *         </p>
     * @see PageBasedErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_BAD_PAGE,
     * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED,
     * PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR
     *
     * @param errorCode <p>
     *            Error code for the cause of the error.
     *            </p>
     * @see PageBasedErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_BAD_PAGE,
     * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED,
     * PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR
     *
     * @param errorCode <p>
     *            Error code for the cause of the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PageBasedErrorCode
     */
    public ErrorsListItem withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_BAD_PAGE,
     * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED,
     * PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR
     *
     * @param errorCode <p>
     *            Error code for the cause of the error.
     *            </p>
     * @see PageBasedErrorCode
     */
    public void setErrorCode(PageBasedErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_BAD_PAGE,
     * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED, PAGE_CHARACTERS_EXCEEDED,
     * PAGE_SIZE_EXCEEDED, INTERNAL_SERVER_ERROR
     *
     * @param errorCode <p>
     *            Error code for the cause of the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PageBasedErrorCode
     */
    public ErrorsListItem withErrorCode(PageBasedErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Text message explaining the reason for the error.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param errorMessage <p>
     *            Text message explaining the reason for the error.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param errorMessage <p>
     *            Text message explaining the reason for the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorsListItem withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorsListItem == false)
            return false;
        ErrorsListItem other = (ErrorsListItem) obj;

        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
