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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a collection of <a>Authorizer</a> resources.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html"
 * >Use Lambda Function as Authorizer</a> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html"
 * >Use Cognito User Pool as Authorizer</a> </div>
 */
public class GetAuthorizersResult implements Serializable {
    /**
     * The new value for the position property for this object.
     */
    private String position;

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     */
    private java.util.List<Authorizer> items;

    /**
     * Returns the value of the position property for this object.
     *
     * @return The value of the position property for this object.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of position
     *
     * @param position The new value for the position property for this object.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Sets the value of the position property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position The new value for the position property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizersResult withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     *
     * @return <p>
     *         The current page of elements from this collection.
     *         </p>
     */
    public java.util.List<Authorizer> getItems() {
        return items;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     *
     * @param items <p>
     *            The current page of elements from this collection.
     *            </p>
     */
    public void setItems(java.util.Collection<Authorizer> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Authorizer>(items);
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The current page of elements from this collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizersResult withItems(Authorizer... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<Authorizer>(items.length);
        }
        for (Authorizer value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The current page of elements from this collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizersResult withItems(java.util.Collection<Authorizer> items) {
        setItems(items);
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
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getItems() != null)
            sb.append("items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizersResult == false)
            return false;
        GetAuthorizersResult other = (GetAuthorizersResult) obj;

        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
