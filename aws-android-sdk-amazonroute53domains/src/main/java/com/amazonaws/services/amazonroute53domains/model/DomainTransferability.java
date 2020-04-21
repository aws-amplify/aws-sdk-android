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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about whether the specified domain
 * can be transferred to Route 53.
 * </p>
 */
public class DomainTransferability implements Serializable {
    /**
     * <p>
     * Whether the domain name can be transferred to Route 53.
     * </p>
     * <note>
     * <p>
     * You can transfer only domains that have a value of
     * <code>TRANSFERABLE</code> for <code>Transferable</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>TRANSFERABLE</dt>
     * <dd>
     * <p>
     * The domain name can be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>UNTRANSFERRABLE</dt>
     * <dd>
     * <p>
     * The domain name can't be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * Reserved for future use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW
     */
    private String transferable;

    /**
     * <p>
     * Whether the domain name can be transferred to Route 53.
     * </p>
     * <note>
     * <p>
     * You can transfer only domains that have a value of
     * <code>TRANSFERABLE</code> for <code>Transferable</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>TRANSFERABLE</dt>
     * <dd>
     * <p>
     * The domain name can be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>UNTRANSFERRABLE</dt>
     * <dd>
     * <p>
     * The domain name can't be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * Reserved for future use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW
     *
     * @return <p>
     *         Whether the domain name can be transferred to Route 53.
     *         </p>
     *         <note>
     *         <p>
     *         You can transfer only domains that have a value of
     *         <code>TRANSFERABLE</code> for <code>Transferable</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values:
     *         </p>
     *         <dl>
     *         <dt>TRANSFERABLE</dt>
     *         <dd>
     *         <p>
     *         The domain name can be transferred to Route 53.
     *         </p>
     *         </dd>
     *         <dt>UNTRANSFERRABLE</dt>
     *         <dd>
     *         <p>
     *         The domain name can't be transferred to Route 53.
     *         </p>
     *         </dd>
     *         <dt>DONT_KNOW</dt>
     *         <dd>
     *         <p>
     *         Reserved for future use.
     *         </p>
     *         </dd>
     *         </dl>
     * @see Transferable
     */
    public String getTransferable() {
        return transferable;
    }

    /**
     * <p>
     * Whether the domain name can be transferred to Route 53.
     * </p>
     * <note>
     * <p>
     * You can transfer only domains that have a value of
     * <code>TRANSFERABLE</code> for <code>Transferable</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>TRANSFERABLE</dt>
     * <dd>
     * <p>
     * The domain name can be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>UNTRANSFERRABLE</dt>
     * <dd>
     * <p>
     * The domain name can't be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * Reserved for future use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW
     *
     * @param transferable <p>
     *            Whether the domain name can be transferred to Route 53.
     *            </p>
     *            <note>
     *            <p>
     *            You can transfer only domains that have a value of
     *            <code>TRANSFERABLE</code> for <code>Transferable</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>TRANSFERABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>UNTRANSFERRABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can't be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            Reserved for future use.
     *            </p>
     *            </dd>
     *            </dl>
     * @see Transferable
     */
    public void setTransferable(String transferable) {
        this.transferable = transferable;
    }

    /**
     * <p>
     * Whether the domain name can be transferred to Route 53.
     * </p>
     * <note>
     * <p>
     * You can transfer only domains that have a value of
     * <code>TRANSFERABLE</code> for <code>Transferable</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>TRANSFERABLE</dt>
     * <dd>
     * <p>
     * The domain name can be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>UNTRANSFERRABLE</dt>
     * <dd>
     * <p>
     * The domain name can't be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * Reserved for future use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW
     *
     * @param transferable <p>
     *            Whether the domain name can be transferred to Route 53.
     *            </p>
     *            <note>
     *            <p>
     *            You can transfer only domains that have a value of
     *            <code>TRANSFERABLE</code> for <code>Transferable</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>TRANSFERABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>UNTRANSFERRABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can't be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            Reserved for future use.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Transferable
     */
    public DomainTransferability withTransferable(String transferable) {
        this.transferable = transferable;
        return this;
    }

    /**
     * <p>
     * Whether the domain name can be transferred to Route 53.
     * </p>
     * <note>
     * <p>
     * You can transfer only domains that have a value of
     * <code>TRANSFERABLE</code> for <code>Transferable</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>TRANSFERABLE</dt>
     * <dd>
     * <p>
     * The domain name can be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>UNTRANSFERRABLE</dt>
     * <dd>
     * <p>
     * The domain name can't be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * Reserved for future use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW
     *
     * @param transferable <p>
     *            Whether the domain name can be transferred to Route 53.
     *            </p>
     *            <note>
     *            <p>
     *            You can transfer only domains that have a value of
     *            <code>TRANSFERABLE</code> for <code>Transferable</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>TRANSFERABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>UNTRANSFERRABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can't be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            Reserved for future use.
     *            </p>
     *            </dd>
     *            </dl>
     * @see Transferable
     */
    public void setTransferable(Transferable transferable) {
        this.transferable = transferable.toString();
    }

    /**
     * <p>
     * Whether the domain name can be transferred to Route 53.
     * </p>
     * <note>
     * <p>
     * You can transfer only domains that have a value of
     * <code>TRANSFERABLE</code> for <code>Transferable</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>TRANSFERABLE</dt>
     * <dd>
     * <p>
     * The domain name can be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>UNTRANSFERRABLE</dt>
     * <dd>
     * <p>
     * The domain name can't be transferred to Route 53.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * Reserved for future use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW
     *
     * @param transferable <p>
     *            Whether the domain name can be transferred to Route 53.
     *            </p>
     *            <note>
     *            <p>
     *            You can transfer only domains that have a value of
     *            <code>TRANSFERABLE</code> for <code>Transferable</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>TRANSFERABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>UNTRANSFERRABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name can't be transferred to Route 53.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            Reserved for future use.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Transferable
     */
    public DomainTransferability withTransferable(Transferable transferable) {
        this.transferable = transferable.toString();
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
        if (getTransferable() != null)
            sb.append("Transferable: " + getTransferable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransferable() == null) ? 0 : getTransferable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainTransferability == false)
            return false;
        DomainTransferability other = (DomainTransferability) obj;

        if (other.getTransferable() == null ^ this.getTransferable() == null)
            return false;
        if (other.getTransferable() != null
                && other.getTransferable().equals(this.getTransferable()) == false)
            return false;
        return true;
    }
}
