/*
 * Copyright 2013-2016 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Encapsulates all data required to authenticate a user.
 * Pass an object of this type to the continuation object to continue with the authentication process.
 * This contents of this object are set when it is constructed and are immutable afterwards.
 */
public class AuthenticationDetails {
    private final String userId;
    private final String password;
    private List<AttributeType> validationData;

    /**
     * Constructs a new object with authentication details.
     *
     * @param userId            REQUIRED: User ID, NOTE: This will over ride the current Used ID.
     * @param password          REQUIRED: Users' password.
     * @param validationData    REQUIRED: Validation data parameters for the pre-auth lambda.
     */
    public AuthenticationDetails(String  userId, String password, Map<String, String> validationData){
        this.userId = userId;
        this.password = password;
        if(validationData != null){
            this.validationData = new ArrayList<AttributeType>();
            for (Map.Entry<String, String> data : validationData.entrySet()) {
                AttributeType validation = new AttributeType();
                validation.setName(data.getKey());
                validation.setValue(data.getValue());
                this.validationData.add(validation);
            }
        }
        else{
            this.validationData = null;
        }
    }

    /**
     * This method returns the password.
     *
     * @return password set.
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method returns the User Id.
     *
     * @return
     */
    public String getUserId()
    {
        return  userId;
    }

    /**
     * This method returns the validation data.
     *
     * @return
     */
    public List<AttributeType> getValidationData() {
        return validationData;
    }
}