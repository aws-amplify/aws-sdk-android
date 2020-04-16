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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an image recipe.
 * </p>
 */
public class GetImageRecipeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     */
    private String imageRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image recipe that you want
     *         to retrieve.
     *         </p>
     */
    public String getImageRecipeArn() {
        return imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe that you
     *            want to retrieve.
     *            </p>
     */
    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that you want to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe that you
     *            want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImageRecipeRequest withImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
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
        if (getImageRecipeArn() != null)
            sb.append("imageRecipeArn: " + getImageRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageRecipeRequest == false)
            return false;
        GetImageRecipeRequest other = (GetImageRecipeRequest) obj;

        if (other.getImageRecipeArn() == null ^ this.getImageRecipeArn() == null)
            return false;
        if (other.getImageRecipeArn() != null
                && other.getImageRecipeArn().equals(this.getImageRecipeArn()) == false)
            return false;
        return true;
    }
}
