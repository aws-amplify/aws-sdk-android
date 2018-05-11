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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the data for an attribute. You can set one, and only one, of the
 * elements.
 * </p>
 * <p>
 * Each attribute in an item is a name-value pair. An attribute can be
 * single-valued or multi-valued set. For example, a book item can have title
 * and authors attributes. Each book has one title but can have many authors.
 * The multi-valued attribute is a set; duplicate values are not allowed.
 * </p>
 */
public class AttributeValue implements Serializable {
    /**
     * <p>
     * A String data type.
     * </p>
     */
    private String s;

    /**
     * <p>
     * A Number data type.
     * </p>
     */
    private String n;

    /**
     * <p>
     * A Binary data type.
     * </p>
     */
    private java.nio.ByteBuffer b;

    /**
     * <p>
     * A String Set data type.
     * </p>
     */
    private java.util.List<String> sS;

    /**
     * <p>
     * A Number Set data type.
     * </p>
     */
    private java.util.List<String> nS;

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> bS;

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     */
    private java.util.Map<String, AttributeValue> m;

    /**
     * <p>
     * A List of attribute values.
     * </p>
     */
    private java.util.List<AttributeValue> l;

    /**
     * <p>
     * A Null data type.
     * </p>
     */
    private Boolean nULL;

    /**
     * <p>
     * A Boolean data type.
     * </p>
     */
    private Boolean bOOL;

    /**
     * Default constructor for AttributeValue object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public AttributeValue() {
    }

    /**
     * Constructs a new AttributeValue object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param s <p>
     *            A String data type.
     *            </p>
     */
    public AttributeValue(String s) {
        setS(s);
    }

    /**
     * Constructs a new AttributeValue object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param sS <p>
     *            A String Set data type.
     *            </p>
     */
    public AttributeValue(java.util.List<String> sS) {
        setSS(sS);
    }

    /**
     * <p>
     * A String data type.
     * </p>
     *
     * @return <p>
     *         A String data type.
     *         </p>
     */
    public String getS() {
        return s;
    }

    /**
     * <p>
     * A String data type.
     * </p>
     *
     * @param s <p>
     *            A String data type.
     *            </p>
     */
    public void setS(String s) {
        this.s = s;
    }

    /**
     * <p>
     * A String data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s <p>
     *            A String data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withS(String s) {
        this.s = s;
        return this;
    }

    /**
     * <p>
     * A Number data type.
     * </p>
     *
     * @return <p>
     *         A Number data type.
     *         </p>
     */
    public String getN() {
        return n;
    }

    /**
     * <p>
     * A Number data type.
     * </p>
     *
     * @param n <p>
     *            A Number data type.
     *            </p>
     */
    public void setN(String n) {
        this.n = n;
    }

    /**
     * <p>
     * A Number data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param n <p>
     *            A Number data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withN(String n) {
        this.n = n;
        return this;
    }

    /**
     * <p>
     * A Binary data type.
     * </p>
     *
     * @return <p>
     *         A Binary data type.
     *         </p>
     */
    public java.nio.ByteBuffer getB() {
        return b;
    }

    /**
     * <p>
     * A Binary data type.
     * </p>
     *
     * @param b <p>
     *            A Binary data type.
     *            </p>
     */
    public void setB(java.nio.ByteBuffer b) {
        this.b = b;
    }

    /**
     * <p>
     * A Binary data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param b <p>
     *            A Binary data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withB(java.nio.ByteBuffer b) {
        this.b = b;
        return this;
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     *
     * @return <p>
     *         A String Set data type.
     *         </p>
     */
    public java.util.List<String> getSS() {
        return sS;
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     *
     * @param sS <p>
     *            A String Set data type.
     *            </p>
     */
    public void setSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
            return;
        }

        this.sS = new java.util.ArrayList<String>(sS);
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sS <p>
     *            A String Set data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withSS(String... sS) {
        if (getSS() == null) {
            this.sS = new java.util.ArrayList<String>(sS.length);
        }
        for (String value : sS) {
            this.sS.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A String Set data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sS <p>
     *            A String Set data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withSS(java.util.Collection<String> sS) {
        setSS(sS);
        return this;
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     *
     * @return <p>
     *         A Number Set data type.
     *         </p>
     */
    public java.util.List<String> getNS() {
        return nS;
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     *
     * @param nS <p>
     *            A Number Set data type.
     *            </p>
     */
    public void setNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
            return;
        }

        this.nS = new java.util.ArrayList<String>(nS);
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nS <p>
     *            A Number Set data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withNS(String... nS) {
        if (getNS() == null) {
            this.nS = new java.util.ArrayList<String>(nS.length);
        }
        for (String value : nS) {
            this.nS.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A Number Set data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nS <p>
     *            A Number Set data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withNS(java.util.Collection<String> nS) {
        setNS(nS);
        return this;
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     *
     * @return <p>
     *         A Binary Set data type.
     *         </p>
     */
    public java.util.List<java.nio.ByteBuffer> getBS() {
        return bS;
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     *
     * @param bS <p>
     *            A Binary Set data type.
     *            </p>
     */
    public void setBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
            return;
        }

        this.bS = new java.util.ArrayList<java.nio.ByteBuffer>(bS);
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bS <p>
     *            A Binary Set data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withBS(java.nio.ByteBuffer... bS) {
        if (getBS() == null) {
            this.bS = new java.util.ArrayList<java.nio.ByteBuffer>(bS.length);
        }
        for (java.nio.ByteBuffer value : bS) {
            this.bS.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A Binary Set data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bS <p>
     *            A Binary Set data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        setBS(bS);
        return this;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     *
     * @return <p>
     *         A Map of attribute values.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getM() {
        return m;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     *
     * @param m <p>
     *            A Map of attribute values.
     *            </p>
     */
    public void setM(java.util.Map<String, AttributeValue> m) {
        this.m = m;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param m <p>
     *            A Map of attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withM(java.util.Map<String, AttributeValue> m) {
        this.m = m;
        return this;
    }

    /**
     * <p>
     * A Map of attribute values.
     * </p>
     * <p>
     * The method adds a new key-value pair into M parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into M.
     * @param value The corresponding value of the entry to be added into M.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue addMEntry(String key, AttributeValue value) {
        if (null == this.m) {
            this.m = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.m.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.m.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into M.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AttributeValue clearMEntries() {
        this.m = null;
        return this;
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     *
     * @return <p>
     *         A List of attribute values.
     *         </p>
     */
    public java.util.List<AttributeValue> getL() {
        return l;
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     *
     * @param l <p>
     *            A List of attribute values.
     *            </p>
     */
    public void setL(java.util.Collection<AttributeValue> l) {
        if (l == null) {
            this.l = null;
            return;
        }

        this.l = new java.util.ArrayList<AttributeValue>(l);
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param l <p>
     *            A List of attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withL(AttributeValue... l) {
        if (getL() == null) {
            this.l = new java.util.ArrayList<AttributeValue>(l.length);
        }
        for (AttributeValue value : l) {
            this.l.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A List of attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param l <p>
     *            A List of attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withL(java.util.Collection<AttributeValue> l) {
        setL(l);
        return this;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     *
     * @return <p>
     *         A Null data type.
     *         </p>
     */
    public Boolean isNULL() {
        return nULL;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     *
     * @return <p>
     *         A Null data type.
     *         </p>
     */
    public Boolean getNULL() {
        return nULL;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     *
     * @param nULL <p>
     *            A Null data type.
     *            </p>
     */
    public void setNULL(Boolean nULL) {
        this.nULL = nULL;
    }

    /**
     * <p>
     * A Null data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nULL <p>
     *            A Null data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withNULL(Boolean nULL) {
        this.nULL = nULL;
        return this;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     *
     * @return <p>
     *         A Boolean data type.
     *         </p>
     */
    public Boolean isBOOL() {
        return bOOL;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     *
     * @return <p>
     *         A Boolean data type.
     *         </p>
     */
    public Boolean getBOOL() {
        return bOOL;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     *
     * @param bOOL <p>
     *            A Boolean data type.
     *            </p>
     */
    public void setBOOL(Boolean bOOL) {
        this.bOOL = bOOL;
    }

    /**
     * <p>
     * A Boolean data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bOOL <p>
     *            A Boolean data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeValue withBOOL(Boolean bOOL) {
        this.bOOL = bOOL;
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
        if (getS() != null)
            sb.append("S: " + getS() + ",");
        if (getN() != null)
            sb.append("N: " + getN() + ",");
        if (getB() != null)
            sb.append("B: " + getB() + ",");
        if (getSS() != null)
            sb.append("SS: " + getSS() + ",");
        if (getNS() != null)
            sb.append("NS: " + getNS() + ",");
        if (getBS() != null)
            sb.append("BS: " + getBS() + ",");
        if (getM() != null)
            sb.append("M: " + getM() + ",");
        if (getL() != null)
            sb.append("L: " + getL() + ",");
        if (getNULL() != null)
            sb.append("NULL: " + getNULL() + ",");
        if (getBOOL() != null)
            sb.append("BOOL: " + getBOOL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS() == null) ? 0 : getS().hashCode());
        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode + ((getB() == null) ? 0 : getB().hashCode());
        hashCode = prime * hashCode + ((getSS() == null) ? 0 : getSS().hashCode());
        hashCode = prime * hashCode + ((getNS() == null) ? 0 : getNS().hashCode());
        hashCode = prime * hashCode + ((getBS() == null) ? 0 : getBS().hashCode());
        hashCode = prime * hashCode + ((getM() == null) ? 0 : getM().hashCode());
        hashCode = prime * hashCode + ((getL() == null) ? 0 : getL().hashCode());
        hashCode = prime * hashCode + ((getNULL() == null) ? 0 : getNULL().hashCode());
        hashCode = prime * hashCode + ((getBOOL() == null) ? 0 : getBOOL().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeValue == false)
            return false;
        AttributeValue other = (AttributeValue) obj;

        if (other.getS() == null ^ this.getS() == null)
            return false;
        if (other.getS() != null && other.getS().equals(this.getS()) == false)
            return false;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        if (other.getB() == null ^ this.getB() == null)
            return false;
        if (other.getB() != null && other.getB().equals(this.getB()) == false)
            return false;
        if (other.getSS() == null ^ this.getSS() == null)
            return false;
        if (other.getSS() != null && other.getSS().equals(this.getSS()) == false)
            return false;
        if (other.getNS() == null ^ this.getNS() == null)
            return false;
        if (other.getNS() != null && other.getNS().equals(this.getNS()) == false)
            return false;
        if (other.getBS() == null ^ this.getBS() == null)
            return false;
        if (other.getBS() != null && other.getBS().equals(this.getBS()) == false)
            return false;
        if (other.getM() == null ^ this.getM() == null)
            return false;
        if (other.getM() != null && other.getM().equals(this.getM()) == false)
            return false;
        if (other.getL() == null ^ this.getL() == null)
            return false;
        if (other.getL() != null && other.getL().equals(this.getL()) == false)
            return false;
        if (other.getNULL() == null ^ this.getNULL() == null)
            return false;
        if (other.getNULL() != null && other.getNULL().equals(this.getNULL()) == false)
            return false;
        if (other.getBOOL() == null ^ this.getBOOL() == null)
            return false;
        if (other.getBOOL() != null && other.getBOOL().equals(this.getBOOL()) == false)
            return false;
        return true;
    }
}
