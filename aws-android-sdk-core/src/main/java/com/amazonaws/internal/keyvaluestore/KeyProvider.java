/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal.keyvaluestore;

import java.security.Key;

/**
 * The interface that manages the generation
 * and retrieval of key used for encrypting
 * and decrypting data.
 */
interface KeyProvider {
    /**
     * Generate the encryption key that is used for encrypting
     * and decrypting data. The encryption key will be identified
     * by a keyAlias.
     *
     * @param keyAlias String that identifies the encryption key.
     * @return the key that can be used to encrypt and
     *          decrypt data.
     * @throws KeyNotGeneratedException when the encryption key
     *          cannot be generated successfully. The caller of this method is
     *          expected to handle this exception appropriately.
     */
    Key generateKey(final String keyAlias) throws KeyNotGeneratedException;

    /**
     * Retrieve the encryption key that is used for encrypting
     * and decrypting data. The encryption key will be identified
     * by a keyAlias.
     *
     * @param keyAlias String that identifies the encryption key.
     * @return the key that can be used to encrypt and
     *          decrypt data.
     * @throws KeyNotFoundException when the encryption key
     *          cannot be found. The caller of this method is
     *          expected to handle this exception appropriately.
     */
    Key retrieveKey(final String keyAlias) throws KeyNotFoundException;

    /**
     * Delete the encryption key that is used for encrypting
     * and decrypting data. The encryption key will be identified
     * by a keyAlias.
     *
     * @param keyAlias String that identifies the encryption key.
     */
    void deleteKey(final String keyAlias);
}
