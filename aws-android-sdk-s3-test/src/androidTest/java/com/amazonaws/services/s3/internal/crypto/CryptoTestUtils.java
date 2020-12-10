/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 
package com.amazonaws.services.s3.internal.crypto;
 
import static com.amazonaws.testutils.TestUtils.yyMMdd_hhmmss;
import static org.junit.Assert.assertFalse;
 
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.MD5DigestCalculatingInputStream;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.util.Base16;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;
 
import org.apache.commons.io.IOUtils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
 
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
 
public class CryptoTestUtils {
    private static final Random rand = new Random();
    private static final SecureRandom srand = new SecureRandom();
    private static final String TEST_PRIVATE_KEY_B64 = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKo4dkqOcgSJGQdRQgGg1IeQNrEc5pXPxag3XOgz4JcSkttBTI597aPCPW51/939EDNskiFhNyP7XzUVTHr5AnZ2GBjVkUKY4eo9Hd4CWxptLKgZCIZ+MOhyreE51rGLlA/Mxp7r5/AtDZ4GqAntFW3Ask4ePByqFBWyewVYfO5dAgMBAAECgYAA3WqUdGbV6RBsfhg0w+lwiuYMPlZZmoWpliZts53HhruiS5GlA7TKaTlAr27OZPPJHxsa+lB6aVORhHswAMXnbBEbMm9pUllRc04iQrZ30dOa9Ud70p5kWuCJN3FKjrExKp/90Mbt2nJ46uCnE/QbnUhhXhtgIZVRac8eZ8gtYQJBANIQlYH3cPj792TXf6Ul85wKk3mcK4CEn2JYLmU8oyplJj1cNuwWrExAU/Z35HrcXJAhhku5Fg+iZWyNtU6StkUCQQDPcWZ3Q+dVmsN4f5de9CpvLD10zSRUYPdeEG/2zlUefjRFfg47NX0/HDExk1oGc9NjTu9sdorc+00BGPe05wU5AkAwXVMe3kqreM/H7vnbmzZQefrkZ/l4GJDdwrHD60ch7rH0NLQMfVfkIndyar43L188bAuQiaezp880RBg3Y/4FAkBuJgnBhGXet6nZXu6SddXeaEBNt+v1ffN7mADLrW3XHi5FRBTsbY+Opjqc12AzEueI0M4i6qL7idiun4JQJWdJAkBoyZJTZS5ZInxTD2jm3QAIR1yM7I3wsvEyFVqVeV5gkYXQ3GyTIKEaCuYDN8o9SWUqn0bKOt7w2z3XG9EyXbbV";
    private static final String TEST_PUBLIC_KEY_B64 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqOHZKjnIEiRkHUUIBoNSHkDaxHOaVz8WoN1zoM+CXEpLbQUyOfe2jwj1udf/d/RAzbJIhYTcj+181FUx6+QJ2dhgY1ZFCmOHqPR3eAlsabSyoGQiGfjDocq3hOdaxi5QPzMae6+fwLQ2eBqgJ7RVtwLJOHjwcqhQVsnsFWHzuXQIDAQAB";
 
    /**
     * Used to control whether those tests that take a long time are to be run
     * or not.
     *
     * @return true if the environment variable "RUN_TIME_CONSUMING_TESTS" has
     *         been set; false otherwise.
     */
    public static boolean runTimeConsumingTests() {
        return Boolean.parseBoolean(System.getenv("RUN_TIME_CONSUMING_TESTS"));
    }
 
    // http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html#KeyGenerator
    public static SecretKey generateSecretKey(String keyGenAlgorithm,
            int keyBitLength) throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance(keyGenAlgorithm);
        generator.init(keyBitLength);
        return generator.generateKey();
    }
 
    // http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html#KeyPairGenerator
    public static KeyPair generateKeyPair(String keyGenAlgorithm,
            int keyBitLength) throws NoSuchAlgorithmException {
        KeyPairGenerator generator = KeyPairGenerator
                .getInstance(keyGenAlgorithm);
        generator.initialize(keyBitLength);
        return generator.generateKeyPair();
    }
 
    static final int ASCII_LOW = 33; // '!', skipping space for readability
    static final int ASCII_HIGH = 126;
    // include a line break character
    static final int modulo = ASCII_HIGH - ASCII_LOW + 2;
 
    /**
     * Generate a random ASCII file of the specified number of bytes. The ASCII
     * characters ranges over all printable ASCII from 33 to 126 inclusive and
     * LF '\n', intentionally skipping space for readability.
     */
    public static File generateRandomAsciiFile(long byteSize)
            throws IOException {
        return generateRandomAsciiFile(byteSize, true);
    }
 
    public static File generateRandomAsciiFile(long byteSize,
            boolean deleteOnExit) throws IOException {
        File file = File.createTempFile("CryptoTestUtils", ".txt");
        System.out.println("Generating random ASCII file with size: "
                + byteSize + " at " + file);
        if (deleteOnExit)
            file.deleteOnExit();
        OutputStream out = new FileOutputStream(file);
        int BUFSIZE = 1024 * 8;
        byte[] buf = new byte[1024 * 8];
        long counts = byteSize / BUFSIZE;
        try {
            while (counts-- > 0) {
                IOUtils.write(fillRandomAscii(buf), out);
            }
            int remainder = (int) byteSize % BUFSIZE;
            if (remainder > 0) {
                buf = new byte[remainder];
                IOUtils.write(fillRandomAscii(buf), out);
            }
        } finally {
            out.close();
        }
        return file;
    }
 
    public static File generateRandomGCMEncryptedAsciiFile(long byteSize)
            throws IOException, InvalidKeyException, NoSuchAlgorithmException,
            NoSuchProviderException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        return generateRandomGCMEncryptedAsciiFile(byteSize, true);
    }
 
    public static File generateRandomGCMEncryptedAsciiFile(long byteSize,
            boolean deleteOnExit) throws IOException, InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        File infile = generateRandomAsciiFile(byteSize, deleteOnExit);
        File oufile = new File(infile.getAbsolutePath() + "-gcm-encrypted");
        System.out.println("Generating random ASCII file with size: "
                + byteSize + " at " + oufile);
        if (deleteOnExit)
            oufile.deleteOnExit();
        ContentCryptoScheme scheme = ContentCryptoScheme.AES_GCM;
        IOUtils.copy(
                new CipherLiteInputStream(new FileInputStream(infile), scheme
                        .createCipherLite(getTestSecretKey(scheme),
                                new byte[scheme.getIVLengthInBytes()],
                                Cipher.ENCRYPT_MODE)), new FileOutputStream(
                        oufile));
        return oufile;
    }
 
    private static byte[] fillRandomAscii(byte[] bytes) {
        rand.nextBytes(bytes);
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            if (b < ASCII_LOW || b > ASCII_HIGH) {
                byte c = (byte) (b % modulo);
                if (c < 0)
                    c = (byte) (c + modulo);
                bytes[i] = (byte) (c + ASCII_LOW);
                if (bytes[i] > ASCII_HIGH)
                    bytes[i] = (byte) '\n';
            }
        }
        return bytes;
    }
 
    public static KeyPair createRSAKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator g = KeyPairGenerator.getInstance("RSA");
        g.initialize(1024);
        KeyPair kp = g.generateKeyPair();
        System.out.println(encodeBase64String(kp.getPrivate().getEncoded()));
        System.out.println(encodeBase64String(kp.getPublic().getEncoded()));
        return kp;
    }
 
    public static SecretKey getTestSecretKey(ContentCryptoScheme scheme) {
        return new SecretKeySpec(new byte[scheme.getKeyLengthInBits() / 8],
                scheme.getKeyGeneratorAlgorithm());
    }
 
    public static SecretKey getTestSecretKey() {
        return new SecretKeySpec(new byte[32], "AES");
    }
 
    public static CipherLite createTestCipherWithStartingBytePos(
            ContentCryptoScheme scheme, int sourceIVLengthInBytes,
            int cipherMode, int startingBytePos) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        SecretKey cek = getTestSecretKey(scheme);
        byte[] iv_gcm = new byte[sourceIVLengthInBytes];
        byte[] iv = scheme.adjustIV(iv_gcm, startingBytePos);
        return scheme.createCipherLite(cek, iv, cipherMode);
    }
 
    public static CipherLite createTestCipher(ContentCryptoScheme scheme,
            int sourceIVLengthInBytes, int cipherMode)
            throws InvalidKeyException, NoSuchAlgorithmException,
            NoSuchProviderException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        return createTestCipherWithStartingBytePos(scheme,
                sourceIVLengthInBytes, cipherMode, 0);
    }
 
    public static KeyPair getTestKeyPair() throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = kf.generatePrivate(new PKCS8EncodedKeySpec(
                decodeBase64(TEST_PRIVATE_KEY_B64)));
        PublicKey publicKey = kf.generatePublic(new X509EncodedKeySpec(
                decodeBase64(TEST_PUBLIC_KEY_B64)));
        return new KeyPair(publicKey, privateKey);
    }
 
    public static KeyPair getTestPublicKeyPair()
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PublicKey publicKey = kf.generatePublic(new X509EncodedKeySpec(
                decodeBase64(TEST_PUBLIC_KEY_B64)));
        return new KeyPair(publicKey, null);
    }
 
    public static String valueOf(S3Object s3object) throws IOException {
        InputStream is = s3object.getObjectContent();
        try {
            return IOUtils.toString(is);
        } finally {
            is.close();
        }
    }
 
    public static byte[] bytesOf(S3Object s3object) throws IOException {
        InputStream is = s3object.getObjectContent();
        try {
            return IOUtils.toByteArray(is);
        } finally {
            is.close();
        }
    }
 
    public static byte[] md5of(S3Object s3object) throws IOException,
            NoSuchAlgorithmException {
        return md5of(s3object.getObjectContent());
    }
 
    public static byte[] md5of(File file) throws IOException,
            NoSuchAlgorithmException {
        return md5of(new FileInputStream(file));
    }
 
    public static byte[] md5of(InputStream is) throws IOException,
            NoSuchAlgorithmException {
        byte[] buf = new byte[1024 * 2];
        MD5DigestCalculatingInputStream md5is = new MD5DigestCalculatingInputStream(
                is);
        try {
            int len;
            do {
                len = md5is.read(buf);
            } while (len > -1);
        } finally {
            md5is.close();
        }
        return md5is.getMd5Digest();
    }
 
    public static CipherLite createTestCipherLite(int cipherMode,
            ContentCryptoScheme scheme) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        return createTestCipherLite(cipherMode, scheme, null);
    }
 
    /**
     * Creates and returns an test CipherLite using the same underlying test
     * secret key.
     */
    public static CipherLite createTestCipherLite(int cipherMode,
            ContentCryptoScheme scheme, Provider provider) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        // Assuming IV is always in bytes
        SecretKey cek = new SecretKeySpec(
                new byte[scheme.getKeyLengthInBits() / 8],
                scheme.getKeyGeneratorAlgorithm());
        byte[] iv = new byte[scheme.getIVLengthInBytes()];
        return scheme.createCipherLite(cek, iv, cipherMode, provider);
    }
 
    public static CipherLite generateTestCipherLite(int cipherMode,
            ContentCryptoScheme scheme) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        return generateTestCipherLite(cipherMode, scheme, null);
    }
 
    /**
     * Generates and returns a test CipherLite using a random test secret key.
     */
    public static CipherLite generateTestCipherLite(int cipherMode,
            ContentCryptoScheme scheme, Provider provider) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        KeyGenerator kg = KeyGenerator.getInstance(scheme.getKeyGeneratorAlgorithm());
        kg.init(scheme.getKeyLengthInBits(), srand);
        SecretKey cek = kg.generateKey();
        // Assuming IV is always in bytes
        byte[] iv = new byte[scheme.getIVLengthInBytes()];
        return scheme.createCipherLite(cek, iv, cipherMode, provider);
    }
 
    public static byte[] flipRandomBit(byte[] in) {
        byte[] out = in.clone();
        int pos = rand.nextInt(out.length); // random target byte
        int bit = rand.nextInt(8); // random target bit
        out[pos] ^= (1 << bit);
        assertFalse(Arrays.equals(in, out));
        return out;
    }
 
    public static String tempBucketName(String prefix) {
        return StringUtils.lowerCase(prefix) + "-" + yyMMdd_hhmmss();
    }
 
    public static String tempBucketName(Class<?> clazz) {
        return tempBucketName(clazz.getSimpleName());
    }
 
    public static void tryCreateBucket(AmazonS3 s3, String bucketName) {
        try {
            s3.createBucket(bucketName);
        } catch (Exception ex) {
            LogFactory.getLog(CryptoTestUtils.class).debug("", ex);
        }
        return;
    }
 
    public static void deleteBucketAndAllContents(AmazonS3 client, String bucketName) {
        System.out.println("Deleting S3 bucket: " + bucketName);
        ObjectListing objectListing = client.listObjects(bucketName);
 
        while (true) {
            for (Iterator<?> iterator = objectListing.getObjectSummaries().iterator(); iterator
                    .hasNext();) {
                S3ObjectSummary objectSummary = (S3ObjectSummary) iterator.next();
                client.deleteObject(bucketName, objectSummary.getKey());
            }
 
            if (objectListing.isTruncated()) {
                objectListing = client.listNextBatchOfObjects(objectListing);
            } else {
                break;
            }
        }
 
        client.deleteBucket(bucketName);
    }
 
    public static AWSCredentials awsTestCredentials() throws IOException {
        return new PropertiesCredentials(new File(
                System.getProperty("user.home")
                        + "/.aws/awsTestAccount.properties"));
    }
 
    public static Provider newBouncyCastleProvider()
            throws InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        return (Provider) Class.forName(
                "org.bouncycastle.jce.provider.BouncyCastleProvider")
                .newInstance();
    }
 
    public static String encodeHexString(byte[] b) {
        return Base16.encodeAsString(b);
    }
 
    public static String encodeBase64String(byte[] b) {
        return Base64.encodeAsString(b);
    }
 
    public static byte[] decodeBase64(String b64s) {
        return Base64.decode(b64s);
    }
}
