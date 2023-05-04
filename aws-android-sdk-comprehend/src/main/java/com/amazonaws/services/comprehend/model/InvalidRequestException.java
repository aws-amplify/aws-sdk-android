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

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request is invalid.
 * </p>
 */
public class InvalidRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String reason;

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
     * Too many pages in the document - Check the number of pages in your file
     * and resubmit the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access denied to Amazon Textract - Verify that your account has
     * permission to use Amazon Textract API operations and resubmit the
     * request.
     * </p>
     * </li>
     * </ul>
     */
    private InvalidRequestDetail detail;

    /**
     * Constructs a new InvalidRequestException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * Returns the value of the reason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DOCUMENT
     *
     * @return The value of the reason property for this object.
     * @see InvalidRequestReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DOCUMENT
     *
     * @param reason The new value for the reason property for this object.
     * @see InvalidRequestReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

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
     * Too many pages in the document - Check the number of pages in your file
     * and resubmit the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access denied to Amazon Textract - Verify that your account has
     * permission to use Amazon Textract API operations and resubmit the
     * request.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Provides additional detail about why the request failed:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Document size is too large - Check the size of your file and
     *         resubmit the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Document type is not supported - Check the file type and resubmit
     *         the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Too many pages in the document - Check the number of pages in
     *         your file and resubmit the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Access denied to Amazon Textract - Verify that your account has
     *         permission to use Amazon Textract API operations and resubmit the
     *         request.
     *         </p>
     *         </li>
     *         </ul>
     */
    public InvalidRequestDetail getDetail() {
        return detail;
    }

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
     * Too many pages in the document - Check the number of pages in your file
     * and resubmit the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Access denied to Amazon Textract - Verify that your account has
     * permission to use Amazon Textract API operations and resubmit the
     * request.
     * </p>
     * </li>
     * </ul>
     *
     * @param detail <p>
     *            Provides additional detail about why the request failed:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Document size is too large - Check the size of your file and
     *            resubmit the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Document type is not supported - Check the file type and
     *            resubmit the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Too many pages in the document - Check the number of pages in
     *            your file and resubmit the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Access denied to Amazon Textract - Verify that your account
     *            has permission to use Amazon Textract API operations and
     *            resubmit the request.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDetail(InvalidRequestDetail detail) {
        this.detail = detail;
    }
}
