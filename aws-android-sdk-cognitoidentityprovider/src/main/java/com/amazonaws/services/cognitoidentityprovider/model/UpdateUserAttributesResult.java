/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The code delivery details list from the server for the request to
     * update user attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CodeDeliveryDetailsType> codeDeliveryDetailsList;

    /**
     * The code delivery details list from the server for the request to
     * update user attributes.
     *
     * @return The code delivery details list from the server for the request to
     *         update user attributes.
     */
    public java.util.List<CodeDeliveryDetailsType> getCodeDeliveryDetailsList() {
        if (codeDeliveryDetailsList == null) {
              codeDeliveryDetailsList = new com.amazonaws.internal.ListWithAutoConstructFlag<CodeDeliveryDetailsType>();
              codeDeliveryDetailsList.setAutoConstruct(true);
        }
        return codeDeliveryDetailsList;
    }
    
    /**
     * The code delivery details list from the server for the request to
     * update user attributes.
     *
     * @param codeDeliveryDetailsList The code delivery details list from the server for the request to
     *         update user attributes.
     */
    public void setCodeDeliveryDetailsList(java.util.Collection<CodeDeliveryDetailsType> codeDeliveryDetailsList) {
        if (codeDeliveryDetailsList == null) {
            this.codeDeliveryDetailsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CodeDeliveryDetailsType> codeDeliveryDetailsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CodeDeliveryDetailsType>(codeDeliveryDetailsList.size());
        codeDeliveryDetailsListCopy.addAll(codeDeliveryDetailsList);
        this.codeDeliveryDetailsList = codeDeliveryDetailsListCopy;
    }
    
    /**
     * The code delivery details list from the server for the request to
     * update user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param codeDeliveryDetailsList The code delivery details list from the server for the request to
     *         update user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserAttributesResult withCodeDeliveryDetailsList(CodeDeliveryDetailsType... codeDeliveryDetailsList) {
        if (getCodeDeliveryDetailsList() == null) setCodeDeliveryDetailsList(new java.util.ArrayList<CodeDeliveryDetailsType>(codeDeliveryDetailsList.length));
        for (CodeDeliveryDetailsType value : codeDeliveryDetailsList) {
            getCodeDeliveryDetailsList().add(value);
        }
        return this;
    }
    
    /**
     * The code delivery details list from the server for the request to
     * update user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param codeDeliveryDetailsList The code delivery details list from the server for the request to
     *         update user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserAttributesResult withCodeDeliveryDetailsList(java.util.Collection<CodeDeliveryDetailsType> codeDeliveryDetailsList) {
        if (codeDeliveryDetailsList == null) {
            this.codeDeliveryDetailsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CodeDeliveryDetailsType> codeDeliveryDetailsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CodeDeliveryDetailsType>(codeDeliveryDetailsList.size());
            codeDeliveryDetailsListCopy.addAll(codeDeliveryDetailsList);
            this.codeDeliveryDetailsList = codeDeliveryDetailsListCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCodeDeliveryDetailsList() != null) sb.append("CodeDeliveryDetailsList: " + getCodeDeliveryDetailsList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCodeDeliveryDetailsList() == null) ? 0 : getCodeDeliveryDetailsList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateUserAttributesResult == false) return false;
        UpdateUserAttributesResult other = (UpdateUserAttributesResult)obj;
        
        if (other.getCodeDeliveryDetailsList() == null ^ this.getCodeDeliveryDetailsList() == null) return false;
        if (other.getCodeDeliveryDetailsList() != null && other.getCodeDeliveryDetailsList().equals(this.getCodeDeliveryDetailsList()) == false) return false; 
        return true;
    }
    
}
    