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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The error code and error message that is returned for a parameter or
 * parameter combination that is not valid when a new launch template or new
 * version of a launch template is created.
 * </p>
 */
public class ValidationError implements Serializable {
    /**
     * <p>
     * The error code that indicates why the parameter or parameter combination
     * is not valid. For more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The error message that describes why the parameter or parameter
     * combination is not valid. For more information about error messages, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code that indicates why the parameter or parameter combination
     * is not valid. For more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @return <p>
     *         The error code that indicates why the parameter or parameter
     *         combination is not valid. For more information about error codes,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *         >Error Codes</a>.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The error code that indicates why the parameter or parameter combination
     * is not valid. For more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @param code <p>
     *            The error code that indicates why the parameter or parameter
     *            combination is not valid. For more information about error
     *            codes, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code that indicates why the parameter or parameter combination
     * is not valid. For more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The error code that indicates why the parameter or parameter
     *            combination is not valid. For more information about error
     *            codes, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidationError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The error message that describes why the parameter or parameter
     * combination is not valid. For more information about error messages, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @return <p>
     *         The error message that describes why the parameter or parameter
     *         combination is not valid. For more information about error
     *         messages, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *         >Error Codes</a>.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The error message that describes why the parameter or parameter
     * combination is not valid. For more information about error messages, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @param message <p>
     *            The error message that describes why the parameter or
     *            parameter combination is not valid. For more information about
     *            error messages, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message that describes why the parameter or parameter
     * combination is not valid. For more information about error messages, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The error message that describes why the parameter or
     *            parameter combination is not valid. For more information about
     *            error messages, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidationError withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationError == false)
            return false;
        ValidationError other = (ValidationError) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
