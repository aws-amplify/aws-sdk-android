/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a tag.
 * </p>
 */
public class Tag implements Serializable {

    /**
     * The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     * accept a maximum of 127 Unicode characters. May not begin with
     * <code>aws:</code>
     */
    private String key;

    /**
     * The value of the tag. <p>Constraints: Tag values are case-sensitive
     * and accept a maximum of 255 Unicode characters.
     */
    private String value;

    /**
     * Default constructor for a new Tag object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Tag() {}
    
    /**
     * Constructs a new Tag object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param key The key of the tag. <p>Constraints: Tag keys are
     * case-sensitive and accept a maximum of 127 Unicode characters. May not
     * begin with <code>aws:</code>
     * @param value The value of the tag. <p>Constraints: Tag values are
     * case-sensitive and accept a maximum of 255 Unicode characters.
     */
    public Tag(String key, String value) {
        setKey(key);
        setValue(value);
    }

    /**
     * Constructs a new Tag object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param key The key of the tag. <p>Constraints: Tag keys are
     * case-sensitive and accept a maximum of 127 Unicode characters. May not
     * begin with <code>aws:</code>
     */
    public Tag(String key) {
        setKey(key);
    }

    /**
     * The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     * accept a maximum of 127 Unicode characters. May not begin with
     * <code>aws:</code>
     *
     * @return The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     *         accept a maximum of 127 Unicode characters. May not begin with
     *         <code>aws:</code>
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     * accept a maximum of 127 Unicode characters. May not begin with
     * <code>aws:</code>
     *
     * @param key The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     *         accept a maximum of 127 Unicode characters. May not begin with
     *         <code>aws:</code>
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     * accept a maximum of 127 Unicode characters. May not begin with
     * <code>aws:</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the tag. <p>Constraints: Tag keys are case-sensitive and
     *         accept a maximum of 127 Unicode characters. May not begin with
     *         <code>aws:</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The value of the tag. <p>Constraints: Tag values are case-sensitive
     * and accept a maximum of 255 Unicode characters.
     *
     * @return The value of the tag. <p>Constraints: Tag values are case-sensitive
     *         and accept a maximum of 255 Unicode characters.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the tag. <p>Constraints: Tag values are case-sensitive
     * and accept a maximum of 255 Unicode characters.
     *
     * @param value The value of the tag. <p>Constraints: Tag values are case-sensitive
     *         and accept a maximum of 255 Unicode characters.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the tag. <p>Constraints: Tag values are case-sensitive
     * and accept a maximum of 255 Unicode characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of the tag. <p>Constraints: Tag values are case-sensitive
     *         and accept a maximum of 255 Unicode characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withValue(String value) {
        this.value = value;
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
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Tag == false) return false;
        Tag other = (Tag)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    