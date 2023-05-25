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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class GetPromptFileResult implements Serializable {
    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user
     * so they can access the prompt in S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String promptPresignedUrl;

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user
     * so they can access the prompt in S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         A generated URL to the prompt that can be given to an
     *         unauthorized user so they can access the prompt in S3.
     *         </p>
     */
    public String getPromptPresignedUrl() {
        return promptPresignedUrl;
    }

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user
     * so they can access the prompt in S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param promptPresignedUrl <p>
     *            A generated URL to the prompt that can be given to an
     *            unauthorized user so they can access the prompt in S3.
     *            </p>
     */
    public void setPromptPresignedUrl(String promptPresignedUrl) {
        this.promptPresignedUrl = promptPresignedUrl;
    }

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user
     * so they can access the prompt in S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param promptPresignedUrl <p>
     *            A generated URL to the prompt that can be given to an
     *            unauthorized user so they can access the prompt in S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPromptFileResult withPromptPresignedUrl(String promptPresignedUrl) {
        this.promptPresignedUrl = promptPresignedUrl;
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
        if (getPromptPresignedUrl() != null)
            sb.append("PromptPresignedUrl: " + getPromptPresignedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPromptPresignedUrl() == null) ? 0 : getPromptPresignedUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPromptFileResult == false)
            return false;
        GetPromptFileResult other = (GetPromptFileResult) obj;

        if (other.getPromptPresignedUrl() == null ^ this.getPromptPresignedUrl() == null)
            return false;
        if (other.getPromptPresignedUrl() != null
                && other.getPromptPresignedUrl().equals(this.getPromptPresignedUrl()) == false)
            return false;
        return true;
    }
}
