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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class CreateCodeRepositoryResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     */
    private String codeRepositoryArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the new repository.
     *         </p>
     */
    public String getCodeRepositoryArn() {
        return codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     *
     * @param codeRepositoryArn <p>
     *            The Amazon Resource Name (ARN) of the new repository.
     *            </p>
     */
    public void setCodeRepositoryArn(String codeRepositoryArn) {
        this.codeRepositoryArn = codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     *
     * @param codeRepositoryArn <p>
     *            The Amazon Resource Name (ARN) of the new repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCodeRepositoryResult withCodeRepositoryArn(String codeRepositoryArn) {
        this.codeRepositoryArn = codeRepositoryArn;
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
        if (getCodeRepositoryArn() != null)
            sb.append("CodeRepositoryArn: " + getCodeRepositoryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCodeRepositoryArn() == null) ? 0 : getCodeRepositoryArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCodeRepositoryResult == false)
            return false;
        CreateCodeRepositoryResult other = (CreateCodeRepositoryResult) obj;

        if (other.getCodeRepositoryArn() == null ^ this.getCodeRepositoryArn() == null)
            return false;
        if (other.getCodeRepositoryArn() != null
                && other.getCodeRepositoryArn().equals(this.getCodeRepositoryArn()) == false)
            return false;
        return true;
    }
}
