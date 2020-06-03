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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class ConfirmPublicVirtualInterfaceResult implements Serializable {
    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     */
    private String virtualInterfaceState;

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @return <p>
     *         The state of the virtual interface. The following are the
     *         possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>confirming</code>: The creation of the virtual interface is
     *         pending confirmation from the virtual interface owner. If the
     *         owner of the virtual interface is different from the owner of the
     *         connection on which it is provisioned, then the virtual interface
     *         will remain in this state until it is confirmed by the virtual
     *         interface owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>verifying</code>: This state only applies to public virtual
     *         interfaces. Each public virtual interface needs validation before
     *         the virtual interface can be created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: A virtual interface is in this state from
     *         the time that it is created until the virtual interface is ready
     *         to forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: A virtual interface that is able to
     *         forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: A virtual interface that is BGP down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: A virtual interface is in this state
     *         immediately after calling <a>DeleteVirtualInterface</a> until it
     *         can no longer forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: A virtual interface that cannot forward
     *         traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rejected</code>: The virtual interface owner has declined
     *         creation of the virtual interface. If a virtual interface in the
     *         <code>Confirming</code> state is deleted by the virtual interface
     *         owner, the virtual interface enters the <code>Rejected</code>
     *         state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the virtual interface is not
     *         available.
     *         </p>
     *         </li>
     *         </ul>
     * @see VirtualInterfaceState
     */
    public String getVirtualInterfaceState() {
        return virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualInterfaceState
     */
    public ConfirmPublicVirtualInterfaceResult withVirtualInterfaceState(
            String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
        return this;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending
     * confirmation from the virtual interface owner. If the owner of the
     * virtual interface is different from the owner of the connection on which
     * it is provisioned, then the virtual interface will remain in this state
     * until it is confirmed by the virtual interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual
     * interfaces. Each public virtual interface needs validation before the
     * virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time
     * that it is created until the virtual interface is ready to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately
     * after calling <a>DeleteVirtualInterface</a> until it can no longer
     * forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation
     * of the virtual interface. If a virtual interface in the
     * <code>Confirming</code> state is deleted by the virtual interface owner,
     * the virtual interface enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not
     * available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, down,
     * deleting, deleted, rejected, unknown
     *
     * @param virtualInterfaceState <p>
     *            The state of the virtual interface. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>confirming</code>: The creation of the virtual interface
     *            is pending confirmation from the virtual interface owner. If
     *            the owner of the virtual interface is different from the owner
     *            of the connection on which it is provisioned, then the virtual
     *            interface will remain in this state until it is confirmed by
     *            the virtual interface owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>verifying</code>: This state only applies to public
     *            virtual interfaces. Each public virtual interface needs
     *            validation before the virtual interface can be created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: A virtual interface is in this state
     *            from the time that it is created until the virtual interface
     *            is ready to forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: A virtual interface that is able to
     *            forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>down</code>: A virtual interface that is BGP down.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: A virtual interface is in this state
     *            immediately after calling <a>DeleteVirtualInterface</a> until
     *            it can no longer forward traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: A virtual interface that cannot forward
     *            traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rejected</code>: The virtual interface owner has
     *            declined creation of the virtual interface. If a virtual
     *            interface in the <code>Confirming</code> state is deleted by
     *            the virtual interface owner, the virtual interface enters the
     *            <code>Rejected</code> state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unknown</code>: The state of the virtual interface is
     *            not available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VirtualInterfaceState
     */
    public ConfirmPublicVirtualInterfaceResult withVirtualInterfaceState(
            VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
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
        if (getVirtualInterfaceState() != null)
            sb.append("virtualInterfaceState: " + getVirtualInterfaceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmPublicVirtualInterfaceResult == false)
            return false;
        ConfirmPublicVirtualInterfaceResult other = (ConfirmPublicVirtualInterfaceResult) obj;

        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null
                && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        return true;
    }
}
