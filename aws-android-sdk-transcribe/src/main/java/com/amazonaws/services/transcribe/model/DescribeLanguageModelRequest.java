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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about a single custom language model. Use this information
 * to see details about the language model in your Amazon Web Services account.
 * You can also see whether the base language model used to create your custom
 * language model has been updated. If Amazon Transcribe has updated the base
 * model, you can create a new custom language model using the updated base
 * model. If the language model wasn't created, you can use this operation to
 * understand why Amazon Transcribe couldn't create it.
 * </p>
 */
public class DescribeLanguageModelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom language model you submit to get more information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String modelName;

    /**
     * <p>
     * The name of the custom language model you submit to get more information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom language model you submit to get more
     *         information.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The name of the custom language model you submit to get more information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param modelName <p>
     *            The name of the custom language model you submit to get more
     *            information.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the custom language model you submit to get more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param modelName <p>
     *            The name of the custom language model you submit to get more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLanguageModelRequest withModelName(String modelName) {
        this.modelName = modelName;
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
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLanguageModelRequest == false)
            return false;
        DescribeLanguageModelRequest other = (DescribeLanguageModelRequest) obj;

        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        return true;
    }
}
