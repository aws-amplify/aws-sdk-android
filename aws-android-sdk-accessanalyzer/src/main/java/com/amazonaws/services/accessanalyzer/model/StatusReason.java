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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * Provides more details about the current status of the analyzer. For example,
 * if the creation for the analyzer fails, a <code>Failed</code> status is
 * displayed. For an analyzer with organization as the type, this failure can be
 * due to an issue with creating the service-linked roles required in the member
 * accounts of the AWS organization.
 * </p>
 */
public class StatusReason implements Serializable {
    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_SERVICE_ACCESS_DISABLED,
     * DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED,
     * SERVICE_LINKED_ROLE_CREATION_FAILED
     */
    private String code;

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_SERVICE_ACCESS_DISABLED,
     * DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED,
     * SERVICE_LINKED_ROLE_CREATION_FAILED
     *
     * @return <p>
     *         The reason code for the current status of the analyzer.
     *         </p>
     * @see ReasonCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_SERVICE_ACCESS_DISABLED,
     * DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED,
     * SERVICE_LINKED_ROLE_CREATION_FAILED
     *
     * @param code <p>
     *            The reason code for the current status of the analyzer.
     *            </p>
     * @see ReasonCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_SERVICE_ACCESS_DISABLED,
     * DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED,
     * SERVICE_LINKED_ROLE_CREATION_FAILED
     *
     * @param code <p>
     *            The reason code for the current status of the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReasonCode
     */
    public StatusReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_SERVICE_ACCESS_DISABLED,
     * DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED,
     * SERVICE_LINKED_ROLE_CREATION_FAILED
     *
     * @param code <p>
     *            The reason code for the current status of the analyzer.
     *            </p>
     * @see ReasonCode
     */
    public void setCode(ReasonCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_SERVICE_ACCESS_DISABLED,
     * DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED,
     * SERVICE_LINKED_ROLE_CREATION_FAILED
     *
     * @param code <p>
     *            The reason code for the current status of the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReasonCode
     */
    public StatusReason withCode(ReasonCode code) {
        this.code = code.toString();
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
            sb.append("code: " + getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusReason == false)
            return false;
        StatusReason other = (StatusReason) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }
}
