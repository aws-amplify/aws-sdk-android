/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the use case.
 * </p>
 */
public class UseCase implements Serializable {
    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String useCaseId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     */
    private String useCaseArn;

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     */
    private String useCaseType;

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The identifier for the use case.
     *         </p>
     */
    public String getUseCaseId() {
        return useCaseId;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param useCaseId <p>
     *            The identifier for the use case.
     *            </p>
     */
    public void setUseCaseId(String useCaseId) {
        this.useCaseId = useCaseId;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param useCaseId <p>
     *            The identifier for the use case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UseCase withUseCaseId(String useCaseId) {
        this.useCaseId = useCaseId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the use case.
     *         </p>
     */
    public String getUseCaseArn() {
        return useCaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     *
     * @param useCaseArn <p>
     *            The Amazon Resource Name (ARN) for the use case.
     *            </p>
     */
    public void setUseCaseArn(String useCaseArn) {
        this.useCaseArn = useCaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useCaseArn <p>
     *            The Amazon Resource Name (ARN) for the use case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UseCase withUseCaseArn(String useCaseArn) {
        this.useCaseArn = useCaseArn;
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @return <p>
     *         The type of use case to associate to the integration association.
     *         Each integration association can have only one of each use case
     *         type.
     *         </p>
     * @see UseCaseType
     */
    public String getUseCaseType() {
        return useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @see UseCaseType
     */
    public void setUseCaseType(String useCaseType) {
        this.useCaseType = useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UseCaseType
     */
    public UseCase withUseCaseType(String useCaseType) {
        this.useCaseType = useCaseType;
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @see UseCaseType
     */
    public void setUseCaseType(UseCaseType useCaseType) {
        this.useCaseType = useCaseType.toString();
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UseCaseType
     */
    public UseCase withUseCaseType(UseCaseType useCaseType) {
        this.useCaseType = useCaseType.toString();
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
        if (getUseCaseId() != null)
            sb.append("UseCaseId: " + getUseCaseId() + ",");
        if (getUseCaseArn() != null)
            sb.append("UseCaseArn: " + getUseCaseArn() + ",");
        if (getUseCaseType() != null)
            sb.append("UseCaseType: " + getUseCaseType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseCaseId() == null) ? 0 : getUseCaseId().hashCode());
        hashCode = prime * hashCode + ((getUseCaseArn() == null) ? 0 : getUseCaseArn().hashCode());
        hashCode = prime * hashCode
                + ((getUseCaseType() == null) ? 0 : getUseCaseType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UseCase == false)
            return false;
        UseCase other = (UseCase) obj;

        if (other.getUseCaseId() == null ^ this.getUseCaseId() == null)
            return false;
        if (other.getUseCaseId() != null
                && other.getUseCaseId().equals(this.getUseCaseId()) == false)
            return false;
        if (other.getUseCaseArn() == null ^ this.getUseCaseArn() == null)
            return false;
        if (other.getUseCaseArn() != null
                && other.getUseCaseArn().equals(this.getUseCaseArn()) == false)
            return false;
        if (other.getUseCaseType() == null ^ this.getUseCaseType() == null)
            return false;
        if (other.getUseCaseType() != null
                && other.getUseCaseType().equals(this.getUseCaseType()) == false)
            return false;
        return true;
    }
}
