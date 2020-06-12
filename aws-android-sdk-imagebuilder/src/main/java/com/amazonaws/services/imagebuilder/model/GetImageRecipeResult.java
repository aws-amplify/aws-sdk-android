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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

public class GetImageRecipeResult implements Serializable {
    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String requestId;

    /**
     * <p>
     * The image recipe object.
     * </p>
     */
    private ImageRecipe imageRecipe;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The request ID that uniquely identifies this request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImageRecipeResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The image recipe object.
     * </p>
     *
     * @return <p>
     *         The image recipe object.
     *         </p>
     */
    public ImageRecipe getImageRecipe() {
        return imageRecipe;
    }

    /**
     * <p>
     * The image recipe object.
     * </p>
     *
     * @param imageRecipe <p>
     *            The image recipe object.
     *            </p>
     */
    public void setImageRecipe(ImageRecipe imageRecipe) {
        this.imageRecipe = imageRecipe;
    }

    /**
     * <p>
     * The image recipe object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageRecipe <p>
     *            The image recipe object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImageRecipeResult withImageRecipe(ImageRecipe imageRecipe) {
        this.imageRecipe = imageRecipe;
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
        if (getRequestId() != null)
            sb.append("requestId: " + getRequestId() + ",");
        if (getImageRecipe() != null)
            sb.append("imageRecipe: " + getImageRecipe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getImageRecipe() == null) ? 0 : getImageRecipe().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageRecipeResult == false)
            return false;
        GetImageRecipeResult other = (GetImageRecipeResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getImageRecipe() == null ^ this.getImageRecipe() == null)
            return false;
        if (other.getImageRecipe() != null
                && other.getImageRecipe().equals(this.getImageRecipe()) == false)
            return false;
        return true;
    }
}
