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

package com.amazonaws.services.fsx.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The resource specified for the tagging operation is not a resource type owned
 * by Amazon FSx. Use the API of the relevant service to perform the operation.
 * </p>
 */
public class NotServiceResourceErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     */
    private String resourceARN;

    /**
     * Constructs a new NotServiceResourceErrorException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public NotServiceResourceErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }
}
