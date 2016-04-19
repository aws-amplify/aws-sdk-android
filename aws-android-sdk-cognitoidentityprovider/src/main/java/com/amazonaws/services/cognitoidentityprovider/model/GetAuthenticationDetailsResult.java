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
 * Represents the response from the server to get authentication details.
 * </p>
 */
public class GetAuthenticationDetailsResult implements Serializable {

    /**
     * A salt that gets returned by the response from the server to get
     * authentication details. For more information, see <a
     * href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     * cryptography</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     */
    private String salt;

    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     */
    private String srpB;

    /**
     * A blob that blocks the secret hash in the get authentication details
     * response.
     */
    private java.nio.ByteBuffer secretBlock;

    /**
     * The resolved username for a possible alias in the input username
     * parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * A salt that gets returned by the response from the server to get
     * authentication details. For more information, see <a
     * href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     * cryptography</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @return A salt that gets returned by the response from the server to get
     *         authentication details. For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     *         cryptography</a>.
     */
    public String getSalt() {
        return salt;
    }
    
    /**
     * A salt that gets returned by the response from the server to get
     * authentication details. For more information, see <a
     * href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     * cryptography</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param salt A salt that gets returned by the response from the server to get
     *         authentication details. For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     *         cryptography</a>.
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    /**
     * A salt that gets returned by the response from the server to get
     * authentication details. For more information, see <a
     * href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     * cryptography</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param salt A salt that gets returned by the response from the server to get
     *         authentication details. For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Salt_%28cryptography%29">Salt
     *         cryptography</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsResult withSalt(String salt) {
        this.salt = salt;
        return this;
    }

    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @return The Secure Remote Password protocol (SRP) key. For more information,
     *         see <a
     *         href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     *         Remote Password Protocol</a>.
     */
    public String getSrpB() {
        return srpB;
    }
    
    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param srpB The Secure Remote Password protocol (SRP) key. For more information,
     *         see <a
     *         href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     *         Remote Password Protocol</a>.
     */
    public void setSrpB(String srpB) {
        this.srpB = srpB;
    }
    
    /**
     * The Secure Remote Password protocol (SRP) key. For more information,
     * see <a
     * href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     * Remote Password Protocol</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param srpB The Secure Remote Password protocol (SRP) key. For more information,
     *         see <a
     *         href="https://en.wikipedia.org/wiki/Secure_Remote_Password_protocol">Secure
     *         Remote Password Protocol</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsResult withSrpB(String srpB) {
        this.srpB = srpB;
        return this;
    }

    /**
     * A blob that blocks the secret hash in the get authentication details
     * response.
     *
     * @return A blob that blocks the secret hash in the get authentication details
     *         response.
     */
    public java.nio.ByteBuffer getSecretBlock() {
        return secretBlock;
    }
    
    /**
     * A blob that blocks the secret hash in the get authentication details
     * response.
     *
     * @param secretBlock A blob that blocks the secret hash in the get authentication details
     *         response.
     */
    public void setSecretBlock(java.nio.ByteBuffer secretBlock) {
        this.secretBlock = secretBlock;
    }
    
    /**
     * A blob that blocks the secret hash in the get authentication details
     * response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretBlock A blob that blocks the secret hash in the get authentication details
     *         response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsResult withSecretBlock(java.nio.ByteBuffer secretBlock) {
        this.secretBlock = secretBlock;
        return this;
    }

    /**
     * The resolved username for a possible alias in the input username
     * parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The resolved username for a possible alias in the input username
     *         parameter.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The resolved username for a possible alias in the input username
     * parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The resolved username for a possible alias in the input username
     *         parameter.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The resolved username for a possible alias in the input username
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The resolved username for a possible alias in the input username
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAuthenticationDetailsResult withUsername(String username) {
        this.username = username;
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
        if (getSalt() != null) sb.append("Salt: " + getSalt() + ",");
        if (getSrpB() != null) sb.append("SrpB: " + getSrpB() + ",");
        if (getSecretBlock() != null) sb.append("SecretBlock: " + getSecretBlock() + ",");
        if (getUsername() != null) sb.append("Username: " + getUsername() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSalt() == null) ? 0 : getSalt().hashCode()); 
        hashCode = prime * hashCode + ((getSrpB() == null) ? 0 : getSrpB().hashCode()); 
        hashCode = prime * hashCode + ((getSecretBlock() == null) ? 0 : getSecretBlock().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAuthenticationDetailsResult == false) return false;
        GetAuthenticationDetailsResult other = (GetAuthenticationDetailsResult)obj;
        
        if (other.getSalt() == null ^ this.getSalt() == null) return false;
        if (other.getSalt() != null && other.getSalt().equals(this.getSalt()) == false) return false; 
        if (other.getSrpB() == null ^ this.getSrpB() == null) return false;
        if (other.getSrpB() != null && other.getSrpB().equals(this.getSrpB()) == false) return false; 
        if (other.getSecretBlock() == null ^ this.getSecretBlock() == null) return false;
        if (other.getSecretBlock() != null && other.getSecretBlock().equals(this.getSecretBlock()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        return true;
    }
    
}
    