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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Generates a random password of the specified complexity. This operation is intended for use in the Lambda rotation function. Per best practice, we recommend that you specify the maximum length and include every character type that the system you are generating a password for can support.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:GetRandomPassword</p> </li> </ul>
 */
public class GetRandomPasswordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     */
    private Long passwordLength;

    /**
     * <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String excludeCharacters;

    /**
     * <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     */
    private Boolean excludeNumbers;

    /**
     * <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     */
    private Boolean excludePunctuation;

    /**
     * <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     */
    private Boolean excludeUppercase;

    /**
     * <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     */
    private Boolean excludeLowercase;

    /**
     * <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     */
    private Boolean includeSpace;

    /**
     * <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     */
    private Boolean requireEachIncludedType;

    /**
     * <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @return <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     */
    public Long getPasswordLength() {
        return passwordLength;
    }

    /**
     * <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param passwordLength <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     */
    public void setPasswordLength(Long passwordLength) {
        this.passwordLength = passwordLength;
    }

    /**
     * <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param passwordLength <p>The desired length of the generated password. The default value if you do not include this parameter is 32 characters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withPasswordLength(Long passwordLength) {
        this.passwordLength = passwordLength;
        return this;
    }

    /**
     * <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     */
    public String getExcludeCharacters() {
        return excludeCharacters;
    }

    /**
     * <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param excludeCharacters <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     */
    public void setExcludeCharacters(String excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
    }

    /**
     * <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param excludeCharacters <p>A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withExcludeCharacters(String excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
        return this;
    }

    /**
     * <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     *
     * @return <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     */
    public Boolean isExcludeNumbers() {
        return excludeNumbers;
    }

    /**
     * <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     *
     * @return <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     */
    public Boolean getExcludeNumbers() {
        return excludeNumbers;
    }

    /**
     * <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     *
     * @param excludeNumbers <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     */
    public void setExcludeNumbers(Boolean excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
    }

    /**
     * <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param excludeNumbers <p>Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withExcludeNumbers(Boolean excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
        return this;
    }

    /**
     * <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     *
     * @return <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     */
    public Boolean isExcludePunctuation() {
        return excludePunctuation;
    }

    /**
     * <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     *
     * @return <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     */
    public Boolean getExcludePunctuation() {
        return excludePunctuation;
    }

    /**
     * <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     *
     * @param excludePunctuation <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     */
    public void setExcludePunctuation(Boolean excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
    }

    /**
     * <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param excludePunctuation <p>Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included.</p> <p>The following are the punctuation characters that <i>can</i> be included in the generated password if you don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:</p> <p> <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code> </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withExcludePunctuation(Boolean excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
        return this;
    }

    /**
     * <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     *
     * @return <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     */
    public Boolean isExcludeUppercase() {
        return excludeUppercase;
    }

    /**
     * <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     *
     * @return <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     */
    public Boolean getExcludeUppercase() {
        return excludeUppercase;
    }

    /**
     * <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     *
     * @param excludeUppercase <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     */
    public void setExcludeUppercase(Boolean excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
    }

    /**
     * <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param excludeUppercase <p>Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withExcludeUppercase(Boolean excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
        return this;
    }

    /**
     * <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     *
     * @return <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     */
    public Boolean isExcludeLowercase() {
        return excludeLowercase;
    }

    /**
     * <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     *
     * @return <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     */
    public Boolean getExcludeLowercase() {
        return excludeLowercase;
    }

    /**
     * <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     *
     * @param excludeLowercase <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     */
    public void setExcludeLowercase(Boolean excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
    }

    /**
     * <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param excludeLowercase <p>Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withExcludeLowercase(Boolean excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
        return this;
    }

    /**
     * <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     *
     * @return <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     */
    public Boolean isIncludeSpace() {
        return includeSpace;
    }

    /**
     * <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     *
     * @return <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     */
    public Boolean getIncludeSpace() {
        return includeSpace;
    }

    /**
     * <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     *
     * @param includeSpace <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     */
    public void setIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
    }

    /**
     * <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeSpace <p>Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
        return this;
    }

    /**
     * <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     *
     * @return <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     */
    public Boolean isRequireEachIncludedType() {
        return requireEachIncludedType;
    }

    /**
     * <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     *
     * @return <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     */
    public Boolean getRequireEachIncludedType() {
        return requireEachIncludedType;
    }

    /**
     * <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     *
     * @param requireEachIncludedType <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     */
    public void setRequireEachIncludedType(Boolean requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
    }

    /**
     * <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireEachIncludedType <p>A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is <code>True</code> and the operation requires at least one of every character type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRandomPasswordRequest withRequireEachIncludedType(Boolean requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
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
        if (getPasswordLength() != null) sb.append("PasswordLength: " + getPasswordLength() + ",");
        if (getExcludeCharacters() != null) sb.append("ExcludeCharacters: " + getExcludeCharacters() + ",");
        if (getExcludeNumbers() != null) sb.append("ExcludeNumbers: " + getExcludeNumbers() + ",");
        if (getExcludePunctuation() != null) sb.append("ExcludePunctuation: " + getExcludePunctuation() + ",");
        if (getExcludeUppercase() != null) sb.append("ExcludeUppercase: " + getExcludeUppercase() + ",");
        if (getExcludeLowercase() != null) sb.append("ExcludeLowercase: " + getExcludeLowercase() + ",");
        if (getIncludeSpace() != null) sb.append("IncludeSpace: " + getIncludeSpace() + ",");
        if (getRequireEachIncludedType() != null) sb.append("RequireEachIncludedType: " + getRequireEachIncludedType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordLength() == null) ? 0 : getPasswordLength().hashCode());
        hashCode = prime * hashCode + ((getExcludeCharacters() == null) ? 0 : getExcludeCharacters().hashCode());
        hashCode = prime * hashCode + ((getExcludeNumbers() == null) ? 0 : getExcludeNumbers().hashCode());
        hashCode = prime * hashCode + ((getExcludePunctuation() == null) ? 0 : getExcludePunctuation().hashCode());
        hashCode = prime * hashCode + ((getExcludeUppercase() == null) ? 0 : getExcludeUppercase().hashCode());
        hashCode = prime * hashCode + ((getExcludeLowercase() == null) ? 0 : getExcludeLowercase().hashCode());
        hashCode = prime * hashCode + ((getIncludeSpace() == null) ? 0 : getIncludeSpace().hashCode());
        hashCode = prime * hashCode + ((getRequireEachIncludedType() == null) ? 0 : getRequireEachIncludedType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRandomPasswordRequest == false) return false;
        GetRandomPasswordRequest other = (GetRandomPasswordRequest)obj;

        if (other.getPasswordLength() == null ^ this.getPasswordLength() == null) return false;
        if (other.getPasswordLength() != null && other.getPasswordLength().equals(this.getPasswordLength()) == false) return false;
        if (other.getExcludeCharacters() == null ^ this.getExcludeCharacters() == null) return false;
        if (other.getExcludeCharacters() != null && other.getExcludeCharacters().equals(this.getExcludeCharacters()) == false) return false;
        if (other.getExcludeNumbers() == null ^ this.getExcludeNumbers() == null) return false;
        if (other.getExcludeNumbers() != null && other.getExcludeNumbers().equals(this.getExcludeNumbers()) == false) return false;
        if (other.getExcludePunctuation() == null ^ this.getExcludePunctuation() == null) return false;
        if (other.getExcludePunctuation() != null && other.getExcludePunctuation().equals(this.getExcludePunctuation()) == false) return false;
        if (other.getExcludeUppercase() == null ^ this.getExcludeUppercase() == null) return false;
        if (other.getExcludeUppercase() != null && other.getExcludeUppercase().equals(this.getExcludeUppercase()) == false) return false;
        if (other.getExcludeLowercase() == null ^ this.getExcludeLowercase() == null) return false;
        if (other.getExcludeLowercase() != null && other.getExcludeLowercase().equals(this.getExcludeLowercase()) == false) return false;
        if (other.getIncludeSpace() == null ^ this.getIncludeSpace() == null) return false;
        if (other.getIncludeSpace() != null && other.getIncludeSpace().equals(this.getIncludeSpace()) == false) return false;
        if (other.getRequireEachIncludedType() == null ^ this.getRequireEachIncludedType() == null) return false;
        if (other.getRequireEachIncludedType() != null && other.getRequireEachIncludedType().equals(this.getRequireEachIncludedType()) == false) return false;
        return true;
    }
}
