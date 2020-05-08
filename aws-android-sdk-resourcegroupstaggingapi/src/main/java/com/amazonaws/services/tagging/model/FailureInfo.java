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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the errors that are returned for each failed resource. This
 * information can include <code>InternalServiceException</code> and
 * <code>InvalidParameterException</code> errors. It can also include any valid
 * error code returned by the AWS service that hosts the resource that the ARN
 * key represents.
 * </p>
 * <p>
 * The following are common error codes that you might receive from other AWS
 * services:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>InternalServiceException</b> – This can mean that the Resource Groups
 * Tagging API didn't receive a response from another AWS service. It can also
 * mean the the resource type in the request is not supported by the Resource
 * Groups Tagging API. In these cases, it's safe to retry the request and then
 * call <a href=
 * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
 * >GetResources</a> to verify the changes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AccessDeniedException</b> – This can mean that you need permission to
 * calling tagging operations in the AWS service that contains the resource. For
 * example, to use the Resource Groups Tagging API to tag a CloudWatch alarm
 * resource, you need permission to call <a href=
 * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_TagResources.html"
 * > <code>TagResources</code> </a> <i>and</i> <a href=
 * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html"
 * > <code>TagResource</code> </a> in the CloudWatch API.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information on errors that are generated from other AWS services,
 * see the documentation for that service.
 * </p>
 */
public class FailureInfo implements Serializable {
    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * The code of the common error. Valid values include
     * <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned
     * by the AWS service that hosts the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalServiceException,
     * InvalidParameterException
     */
    private String errorCode;

    /**
     * <p>
     * The message of the common error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     *
     * @return <p>
     *         The HTTP status code of the common error.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     *
     * @param statusCode <p>
     *            The HTTP status code of the common error.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode <p>
     *            The HTTP status code of the common error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailureInfo withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The code of the common error. Valid values include
     * <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned
     * by the AWS service that hosts the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalServiceException,
     * InvalidParameterException
     *
     * @return <p>
     *         The code of the common error. Valid values include
     *         <code>InternalServiceException</code>,
     *         <code>InvalidParameterException</code>, and any valid error code
     *         returned by the AWS service that hosts the resource that you want
     *         to tag.
     *         </p>
     * @see ErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The code of the common error. Valid values include
     * <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned
     * by the AWS service that hosts the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalServiceException,
     * InvalidParameterException
     *
     * @param errorCode <p>
     *            The code of the common error. Valid values include
     *            <code>InternalServiceException</code>,
     *            <code>InvalidParameterException</code>, and any valid error
     *            code returned by the AWS service that hosts the resource that
     *            you want to tag.
     *            </p>
     * @see ErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code of the common error. Valid values include
     * <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned
     * by the AWS service that hosts the resource that you want to tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalServiceException,
     * InvalidParameterException
     *
     * @param errorCode <p>
     *            The code of the common error. Valid values include
     *            <code>InternalServiceException</code>,
     *            <code>InvalidParameterException</code>, and any valid error
     *            code returned by the AWS service that hosts the resource that
     *            you want to tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public FailureInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The code of the common error. Valid values include
     * <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned
     * by the AWS service that hosts the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalServiceException,
     * InvalidParameterException
     *
     * @param errorCode <p>
     *            The code of the common error. Valid values include
     *            <code>InternalServiceException</code>,
     *            <code>InvalidParameterException</code>, and any valid error
     *            code returned by the AWS service that hosts the resource that
     *            you want to tag.
     *            </p>
     * @see ErrorCode
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * The code of the common error. Valid values include
     * <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned
     * by the AWS service that hosts the resource that you want to tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalServiceException,
     * InvalidParameterException
     *
     * @param errorCode <p>
     *            The code of the common error. Valid values include
     *            <code>InternalServiceException</code>,
     *            <code>InvalidParameterException</code>, and any valid error
     *            code returned by the AWS service that hosts the resource that
     *            you want to tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public FailureInfo withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The message of the common error.
     * </p>
     *
     * @return <p>
     *         The message of the common error.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The message of the common error.
     * </p>
     *
     * @param errorMessage <p>
     *            The message of the common error.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message of the common error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The message of the common error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailureInfo withErrorMessage(String errorMessage) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
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

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
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

        if (obj instanceof FailureInfo == false)
            return false;
        FailureInfo other = (FailureInfo) obj;

        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
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
