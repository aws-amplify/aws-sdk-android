
package com.amazonaws.auth;

/**
 * The interface to handle the appropriate updates when an identity change event
 * was caught
 */
public interface IdentityChangedListener {

    /**
     * Defines the actions to be taken after an identity change event has been
     * captured to update data appropriately
     * 
     * @param oldIdentityId the old identity, now out of date
     * @param newIdentityId the new identity which is to be kept
     */
    void identityChanged(String oldIdentityId, String newIdentityId);
}
