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

package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The query string is not valid. Details about this error are displayed in a
 * <code>QueryCompileError</code> object. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_QueryCompileError.html"
 * >QueryCompileError</a>"/&gt;.
 * </p>
 * <p>
 * For more information about valid query syntax, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
 * >CloudWatch Logs Insights Query Syntax</a>.
 * </p>
 */
public class MalformedQueryException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Reserved.
     * </p>
     */
    private QueryCompileError queryCompileError;

    /**
     * Constructs a new MalformedQueryException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public MalformedQueryException(String message) {
        super(message);
    }

    /**
     * <p>
     * Reserved.
     * </p>
     *
     * @return <p>
     *         Reserved.
     *         </p>
     */
    public QueryCompileError getQueryCompileError() {
        return queryCompileError;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     *
     * @param queryCompileError <p>
     *            Reserved.
     *            </p>
     */
    public void setQueryCompileError(QueryCompileError queryCompileError) {
        this.queryCompileError = queryCompileError;
    }
}
