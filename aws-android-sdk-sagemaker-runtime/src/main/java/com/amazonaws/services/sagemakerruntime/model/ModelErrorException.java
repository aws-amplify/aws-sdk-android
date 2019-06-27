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

package com.amazonaws.services.sagemakerruntime.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Model (owned by the customer in the container) returned an error 500.
 * </p>
 */
public class ModelErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Original status code.
     * </p>
     */
    private Integer originalStatusCode;

    /**
     * <p>
     * Original message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String originalMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     */
    private String logStreamArn;

    /**
     * Constructs a new ModelErrorException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ModelErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * Original status code.
     * </p>
     *
     * @return <p>
     *         Original status code.
     *         </p>
     */
    public Integer getOriginalStatusCode() {
        return originalStatusCode;
    }

    /**
     * <p>
     * Original status code.
     * </p>
     *
     * @param originalStatusCode <p>
     *            Original status code.
     *            </p>
     */
    public void setOriginalStatusCode(Integer originalStatusCode) {
        this.originalStatusCode = originalStatusCode;
    }

    /**
     * <p>
     * Original message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         Original message.
     *         </p>
     */
    public String getOriginalMessage() {
        return originalMessage;
    }

    /**
     * <p>
     * Original message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param originalMessage <p>
     *            Original message.
     *            </p>
     */
    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the log stream.
     *         </p>
     */
    public String getLogStreamArn() {
        return logStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     *
     * @param logStreamArn <p>
     *            The Amazon Resource Name (ARN) of the log stream.
     *            </p>
     */
    public void setLogStreamArn(String logStreamArn) {
        this.logStreamArn = logStreamArn;
    }
}
