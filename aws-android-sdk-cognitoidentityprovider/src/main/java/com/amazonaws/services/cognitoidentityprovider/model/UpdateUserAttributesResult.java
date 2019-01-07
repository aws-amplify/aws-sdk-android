/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response from the server for the request to update user
 * attributes.
 * </p>
 */
public class UpdateUserAttributesResult implements Serializable {
    /**
     * <p>
     * The code delivery details list from the server for the request to update
     * user attributes.
     * </p>
     */
    private java.util.List<CodeDeliveryDetailsType> codeDeliveryDetailsList;

    /**
     * <p>
     * The code delivery details list from the server for the request to update
     * user attributes.
     * </p>
     *
     * @return <p>
     *         The code delivery details list from the server for the request to
     *         update user attributes.
     *         </p>
     */
    public java.util.List<CodeDeliveryDetailsType> getCodeDeliveryDetailsList() {
        return codeDeliveryDetailsList;
    }

    /**
     * <p>
     * The code delivery details list from the server for the request to update
     * user attributes.
     * </p>
     *
     * @param codeDeliveryDetailsList <p>
     *            The code delivery details list from the server for the request
     *            to update user attributes.
     *            </p>
     */
    public void setCodeDeliveryDetailsList(
            java.util.Collection<CodeDeliveryDetailsType> codeDeliveryDetailsList) {
        if (codeDeliveryDetailsList == null) {
            this.codeDeliveryDetailsList = null;
            return;
        }

        this.codeDeliveryDetailsList = new java.util.ArrayList<CodeDeliveryDetailsType>(
                codeDeliveryDetailsList);
    }

    /**
     * <p>
     * The code delivery details list from the server for the request to update
     * user attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeDeliveryDetailsList <p>
     *            The code delivery details list from the server for the request
     *            to update user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesResult withCodeDeliveryDetailsList(
            CodeDeliveryDetailsType... codeDeliveryDetailsList) {
        if (getCodeDeliveryDetailsList() == null) {
            this.codeDeliveryDetailsList = new java.util.ArrayList<CodeDeliveryDetailsType>(
                    codeDeliveryDetailsList.length);
        }
        for (CodeDeliveryDetailsType value : codeDeliveryDetailsList) {
            this.codeDeliveryDetailsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The code delivery details list from the server for the request to update
     * user attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeDeliveryDetailsList <p>
     *            The code delivery details list from the server for the request
     *            to update user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesResult withCodeDeliveryDetailsList(
            java.util.Collection<CodeDeliveryDetailsType> codeDeliveryDetailsList) {
        setCodeDeliveryDetailsList(codeDeliveryDetailsList);
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
        if (getCodeDeliveryDetailsList() != null)
            sb.append("CodeDeliveryDetailsList: " + getCodeDeliveryDetailsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCodeDeliveryDetailsList() == null) ? 0 : getCodeDeliveryDetailsList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserAttributesResult == false)
            return false;
        UpdateUserAttributesResult other = (UpdateUserAttributesResult) obj;

        if (other.getCodeDeliveryDetailsList() == null ^ this.getCodeDeliveryDetailsList() == null)
            return false;
        if (other.getCodeDeliveryDetailsList() != null
                && other.getCodeDeliveryDetailsList().equals(this.getCodeDeliveryDetailsList()) == false)
            return false;
        return true;
    }
}
