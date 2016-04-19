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
 * Specifies the type of configuration for AWS Lambda triggers.
 * </p>
 */
public class LambdaConfigType implements Serializable {

    /**
     * A pre-registration AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String preSignUp;

    /**
     * A custom Message AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String customMessage;

    /**
     * A post-confirmation AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String postConfirmation;

    /**
     * A pre-authentication AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String preAuthentication;

    /**
     * A post-authentication AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String postAuthentication;

    /**
     * A pre-registration AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return A pre-registration AWS Lambda trigger.
     */
    public String getPreSignUp() {
        return preSignUp;
    }
    
    /**
     * A pre-registration AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param preSignUp A pre-registration AWS Lambda trigger.
     */
    public void setPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
    }
    
    /**
     * A pre-registration AWS Lambda trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param preSignUp A pre-registration AWS Lambda trigger.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaConfigType withPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
        return this;
    }

    /**
     * A custom Message AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return A custom Message AWS Lambda trigger.
     */
    public String getCustomMessage() {
        return customMessage;
    }
    
    /**
     * A custom Message AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param customMessage A custom Message AWS Lambda trigger.
     */
    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }
    
    /**
     * A custom Message AWS Lambda trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param customMessage A custom Message AWS Lambda trigger.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaConfigType withCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }

    /**
     * A post-confirmation AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return A post-confirmation AWS Lambda trigger.
     */
    public String getPostConfirmation() {
        return postConfirmation;
    }
    
    /**
     * A post-confirmation AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param postConfirmation A post-confirmation AWS Lambda trigger.
     */
    public void setPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
    }
    
    /**
     * A post-confirmation AWS Lambda trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param postConfirmation A post-confirmation AWS Lambda trigger.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaConfigType withPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
        return this;
    }

    /**
     * A pre-authentication AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return A pre-authentication AWS Lambda trigger.
     */
    public String getPreAuthentication() {
        return preAuthentication;
    }
    
    /**
     * A pre-authentication AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param preAuthentication A pre-authentication AWS Lambda trigger.
     */
    public void setPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
    }
    
    /**
     * A pre-authentication AWS Lambda trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param preAuthentication A pre-authentication AWS Lambda trigger.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaConfigType withPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
        return this;
    }

    /**
     * A post-authentication AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return A post-authentication AWS Lambda trigger.
     */
    public String getPostAuthentication() {
        return postAuthentication;
    }
    
    /**
     * A post-authentication AWS Lambda trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param postAuthentication A post-authentication AWS Lambda trigger.
     */
    public void setPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
    }
    
    /**
     * A post-authentication AWS Lambda trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param postAuthentication A post-authentication AWS Lambda trigger.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaConfigType withPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
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
        if (getPreSignUp() != null) sb.append("PreSignUp: " + getPreSignUp() + ",");
        if (getCustomMessage() != null) sb.append("CustomMessage: " + getCustomMessage() + ",");
        if (getPostConfirmation() != null) sb.append("PostConfirmation: " + getPostConfirmation() + ",");
        if (getPreAuthentication() != null) sb.append("PreAuthentication: " + getPreAuthentication() + ",");
        if (getPostAuthentication() != null) sb.append("PostAuthentication: " + getPostAuthentication() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPreSignUp() == null) ? 0 : getPreSignUp().hashCode()); 
        hashCode = prime * hashCode + ((getCustomMessage() == null) ? 0 : getCustomMessage().hashCode()); 
        hashCode = prime * hashCode + ((getPostConfirmation() == null) ? 0 : getPostConfirmation().hashCode()); 
        hashCode = prime * hashCode + ((getPreAuthentication() == null) ? 0 : getPreAuthentication().hashCode()); 
        hashCode = prime * hashCode + ((getPostAuthentication() == null) ? 0 : getPostAuthentication().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LambdaConfigType == false) return false;
        LambdaConfigType other = (LambdaConfigType)obj;
        
        if (other.getPreSignUp() == null ^ this.getPreSignUp() == null) return false;
        if (other.getPreSignUp() != null && other.getPreSignUp().equals(this.getPreSignUp()) == false) return false; 
        if (other.getCustomMessage() == null ^ this.getCustomMessage() == null) return false;
        if (other.getCustomMessage() != null && other.getCustomMessage().equals(this.getCustomMessage()) == false) return false; 
        if (other.getPostConfirmation() == null ^ this.getPostConfirmation() == null) return false;
        if (other.getPostConfirmation() != null && other.getPostConfirmation().equals(this.getPostConfirmation()) == false) return false; 
        if (other.getPreAuthentication() == null ^ this.getPreAuthentication() == null) return false;
        if (other.getPreAuthentication() != null && other.getPreAuthentication().equals(this.getPreAuthentication()) == false) return false; 
        if (other.getPostAuthentication() == null ^ this.getPostAuthentication() == null) return false;
        if (other.getPostAuthentication() != null && other.getPostAuthentication().equals(this.getPostAuthentication()) == false) return false; 
        return true;
    }
    
}
    