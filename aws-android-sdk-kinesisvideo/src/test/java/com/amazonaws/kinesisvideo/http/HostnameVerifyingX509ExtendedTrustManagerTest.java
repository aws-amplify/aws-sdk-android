package com.amazonaws.kinesisvideo.http;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 * Adapted from (Apache 2.0 License):
 * https://github.com/apache/zookeeper/blob/master/zookeeper-server/src/test/java/org/apache/zookeeper/common/ZKHostnameVerifierTest.java
 */
public class HostnameVerifyingX509ExtendedTrustManagerTest {
    /**
     * CN=foo.com
     */
    public final static byte[] X509_FOO = (
            "-----BEGIN CERTIFICATE-----\n" +
                    "MIIERjCCAy6gAwIBAgIJAIz+EYMBU6aQMA0GCSqGSIb3DQEBBQUAMIGiMQswCQYD\n" +
                    "VQQGEwJDQTELMAkGA1UECBMCQkMxEjAQBgNVBAcTCVZhbmNvdXZlcjEWMBQGA1UE\n" +
                    "ChMNd3d3LmN1Y2JjLmNvbTEUMBIGA1UECxQLY29tbW9uc19zc2wxHTAbBgNVBAMU\n" +
                    "FGRlbW9faW50ZXJtZWRpYXRlX2NhMSUwIwYJKoZIhvcNAQkBFhZqdWxpdXNkYXZp\n" +
                    "ZXNAZ21haWwuY29tMB4XDTA2MTIxMTE1MzE0MVoXDTI4MTEwNTE1MzE0MVowgaQx\n" +
                    "CzAJBgNVBAYTAlVTMREwDwYDVQQIEwhNYXJ5bGFuZDEUMBIGA1UEBxMLRm9yZXN0\n" +
                    "IEhpbGwxFzAVBgNVBAoTDmh0dHBjb21wb25lbnRzMRowGAYDVQQLExF0ZXN0IGNl\n" +
                    "cnRpZmljYXRlczEQMA4GA1UEAxMHZm9vLmNvbTElMCMGCSqGSIb3DQEJARYWanVs\n" +
                    "aXVzZGF2aWVzQGdtYWlsLmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoC\n" +
                    "ggEBAMhjr5aCPoyp0R1iroWAfnEyBMGYWoCidH96yGPFjYLowez5aYKY1IOKTY2B\n" +
                    "lYho4O84X244QrZTRl8kQbYtxnGh4gSCD+Z8gjZ/gMvLUlhqOb+WXPAUHMB39GRy\n" +
                    "zerA/ZtrlUqf+lKo0uWcocxeRc771KN8cPH3nHZ0rV0Hx4ZAZy6U4xxObe4rtSVY\n" +
                    "07hNKXAb2odnVqgzcYiDkLV8ilvEmoNWMWrp8UBqkTcpEhYhCYp3cTkgJwMSuqv8\n" +
                    "BqnGd87xQU3FVZI4tbtkB+KzjD9zz8QCDJAfDjZHR03KNQ5mxOgXwxwKw6lGMaiV\n" +
                    "JTxpTKqym93whYk93l3ocEe55c0CAwEAAaN7MHkwCQYDVR0TBAIwADAsBglghkgB\n" +
                    "hvhCAQ0EHxYdT3BlblNTTCBHZW5lcmF0ZWQgQ2VydGlmaWNhdGUwHQYDVR0OBBYE\n" +
                    "FJ8Ud78/OrbKOIJCSBYs2tDLXofYMB8GA1UdIwQYMBaAFHua2o+QmU5S0qzbswNS\n" +
                    "yoemDT4NMA0GCSqGSIb3DQEBBQUAA4IBAQC3jRmEya6sQCkmieULcvx8zz1euCk9\n" +
                    "fSez7BEtki8+dmfMXe3K7sH0lI8f4jJR0rbSCjpmCQLYmzC3NxBKeJOW0RcjNBpO\n" +
                    "c2JlGO9auXv2GDP4IYiXElLJ6VSqc8WvDikv0JmCCWm0Zga+bZbR/EWN5DeEtFdF\n" +
                    "815CLpJZNcYwiYwGy/CVQ7w2TnXlG+mraZOz+owr+cL6J/ZesbdEWfjoS1+cUEhE\n" +
                    "HwlNrAu8jlZ2UqSgskSWlhYdMTAP9CPHiUv9N7FcT58Itv/I4fKREINQYjDpvQcx\n" +
                    "SaTYb9dr5sB4WLNglk7zxDtM80H518VvihTcP7FHL+Gn6g4j5fkI98+S\n" +
                    "-----END CERTIFICATE-----\n").getBytes();

    /**
     * CN=foo.com, subjectAlt=bar.com
     */
    public final static byte[] X509_FOO_BAR = (
            "-----BEGIN CERTIFICATE-----\n" +
                    "MIIEXDCCA0SgAwIBAgIJAIz+EYMBU6aRMA0GCSqGSIb3DQEBBQUAMIGiMQswCQYD\n" +
                    "VQQGEwJDQTELMAkGA1UECBMCQkMxEjAQBgNVBAcTCVZhbmNvdXZlcjEWMBQGA1UE\n" +
                    "ChMNd3d3LmN1Y2JjLmNvbTEUMBIGA1UECxQLY29tbW9uc19zc2wxHTAbBgNVBAMU\n" +
                    "FGRlbW9faW50ZXJtZWRpYXRlX2NhMSUwIwYJKoZIhvcNAQkBFhZqdWxpdXNkYXZp\n" +
                    "ZXNAZ21haWwuY29tMB4XDTA2MTIxMTE1MzYyOVoXDTI4MTEwNTE1MzYyOVowgaQx\n" +
                    "CzAJBgNVBAYTAlVTMREwDwYDVQQIEwhNYXJ5bGFuZDEUMBIGA1UEBxMLRm9yZXN0\n" +
                    "IEhpbGwxFzAVBgNVBAoTDmh0dHBjb21wb25lbnRzMRowGAYDVQQLExF0ZXN0IGNl\n" +
                    "cnRpZmljYXRlczEQMA4GA1UEAxMHZm9vLmNvbTElMCMGCSqGSIb3DQEJARYWanVs\n" +
                    "aXVzZGF2aWVzQGdtYWlsLmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoC\n" +
                    "ggEBAMhjr5aCPoyp0R1iroWAfnEyBMGYWoCidH96yGPFjYLowez5aYKY1IOKTY2B\n" +
                    "lYho4O84X244QrZTRl8kQbYtxnGh4gSCD+Z8gjZ/gMvLUlhqOb+WXPAUHMB39GRy\n" +
                    "zerA/ZtrlUqf+lKo0uWcocxeRc771KN8cPH3nHZ0rV0Hx4ZAZy6U4xxObe4rtSVY\n" +
                    "07hNKXAb2odnVqgzcYiDkLV8ilvEmoNWMWrp8UBqkTcpEhYhCYp3cTkgJwMSuqv8\n" +
                    "BqnGd87xQU3FVZI4tbtkB+KzjD9zz8QCDJAfDjZHR03KNQ5mxOgXwxwKw6lGMaiV\n" +
                    "JTxpTKqym93whYk93l3ocEe55c0CAwEAAaOBkDCBjTAJBgNVHRMEAjAAMCwGCWCG\n" +
                    "SAGG+EIBDQQfFh1PcGVuU1NMIEdlbmVyYXRlZCBDZXJ0aWZpY2F0ZTAdBgNVHQ4E\n" +
                    "FgQUnxR3vz86tso4gkJIFiza0Mteh9gwHwYDVR0jBBgwFoAUe5raj5CZTlLSrNuz\n" +
                    "A1LKh6YNPg0wEgYDVR0RBAswCYIHYmFyLmNvbTANBgkqhkiG9w0BAQUFAAOCAQEA\n" +
                    "dQyprNZBmVnvuVWjV42sey/PTfkYShJwy1j0/jcFZR/ypZUovpiHGDO1DgL3Y3IP\n" +
                    "zVQ26uhUsSw6G0gGRiaBDe/0LUclXZoJzXX1qpS55OadxW73brziS0sxRgGrZE/d\n" +
                    "3g5kkio6IED47OP6wYnlmZ7EKP9cqjWwlnvHnnUcZ2SscoLNYs9rN9ccp8tuq2by\n" +
                    "88OyhKwGjJfhOudqfTNZcDzRHx4Fzm7UsVaycVw4uDmhEHJrAsmMPpj/+XRK9/42\n" +
                    "2xq+8bc6HojdtbCyug/fvBZvZqQXSmU8m8IVcMmWMz0ZQO8ee3QkBHMZfCy7P/kr\n" +
                    "VbWx/uETImUu+NZg22ewEw==\n" +
                    "-----END CERTIFICATE-----\n").getBytes();


    /**
     * CN=*.foo.com
     */
    public final static byte[] X509_WILD_FOO = (
            "-----BEGIN CERTIFICATE-----\n" +
                    "MIIESDCCAzCgAwIBAgIJAIz+EYMBU6aUMA0GCSqGSIb3DQEBBQUAMIGiMQswCQYD\n" +
                    "VQQGEwJDQTELMAkGA1UECBMCQkMxEjAQBgNVBAcTCVZhbmNvdXZlcjEWMBQGA1UE\n" +
                    "ChMNd3d3LmN1Y2JjLmNvbTEUMBIGA1UECxQLY29tbW9uc19zc2wxHTAbBgNVBAMU\n" +
                    "FGRlbW9faW50ZXJtZWRpYXRlX2NhMSUwIwYJKoZIhvcNAQkBFhZqdWxpdXNkYXZp\n" +
                    "ZXNAZ21haWwuY29tMB4XDTA2MTIxMTE2MTU1NVoXDTI4MTEwNTE2MTU1NVowgaYx\n" +
                    "CzAJBgNVBAYTAlVTMREwDwYDVQQIEwhNYXJ5bGFuZDEUMBIGA1UEBxMLRm9yZXN0\n" +
                    "IEhpbGwxFzAVBgNVBAoTDmh0dHBjb21wb25lbnRzMRowGAYDVQQLExF0ZXN0IGNl\n" +
                    "cnRpZmljYXRlczESMBAGA1UEAxQJKi5mb28uY29tMSUwIwYJKoZIhvcNAQkBFhZq\n" +
                    "dWxpdXNkYXZpZXNAZ21haWwuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\n" +
                    "CgKCAQEAyGOvloI+jKnRHWKuhYB+cTIEwZhagKJ0f3rIY8WNgujB7PlpgpjUg4pN\n" +
                    "jYGViGjg7zhfbjhCtlNGXyRBti3GcaHiBIIP5nyCNn+Ay8tSWGo5v5Zc8BQcwHf0\n" +
                    "ZHLN6sD9m2uVSp/6UqjS5ZyhzF5FzvvUo3xw8fecdnStXQfHhkBnLpTjHE5t7iu1\n" +
                    "JVjTuE0pcBvah2dWqDNxiIOQtXyKW8Sag1YxaunxQGqRNykSFiEJindxOSAnAxK6\n" +
                    "q/wGqcZ3zvFBTcVVkji1u2QH4rOMP3PPxAIMkB8ONkdHTco1DmbE6BfDHArDqUYx\n" +
                    "qJUlPGlMqrKb3fCFiT3eXehwR7nlzQIDAQABo3sweTAJBgNVHRMEAjAAMCwGCWCG\n" +
                    "SAGG+EIBDQQfFh1PcGVuU1NMIEdlbmVyYXRlZCBDZXJ0aWZpY2F0ZTAdBgNVHQ4E\n" +
                    "FgQUnxR3vz86tso4gkJIFiza0Mteh9gwHwYDVR0jBBgwFoAUe5raj5CZTlLSrNuz\n" +
                    "A1LKh6YNPg0wDQYJKoZIhvcNAQEFBQADggEBAH0ipG6J561UKUfgkeW7GvYwW98B\n" +
                    "N1ZooWX+JEEZK7+Pf/96d3Ij0rw9ACfN4bpfnCq0VUNZVSYB+GthQ2zYuz7tf/UY\n" +
                    "A6nxVgR/IjG69BmsBl92uFO7JTNtHztuiPqBn59pt+vNx4yPvno7zmxsfI7jv0ww\n" +
                    "yfs+0FNm7FwdsC1k47GBSOaGw38kuIVWqXSAbL4EX9GkryGGOKGNh0qvAENCdRSB\n" +
                    "G9Z6tyMbmfRY+dLSh3a9JwoEcBUso6EWYBakLbq4nG/nvYdYvG9ehrnLVwZFL82e\n" +
                    "l3Q/RK95bnA6cuRClGusLad0e6bjkBzx/VQ3VarDEpAkTLUGVAa0CLXtnyc=\n" +
                    "-----END CERTIFICATE-----\n").getBytes();

    /**
     * subjectAlt=foo.com
     */
    public final static byte[] X509_NO_CNS_FOO = (
            "-----BEGIN CERTIFICATE-----\n" +
                    "MIIESjCCAzKgAwIBAgIJAIz+EYMBU6aYMA0GCSqGSIb3DQEBBQUAMIGiMQswCQYD\n" +
                    "VQQGEwJDQTELMAkGA1UECBMCQkMxEjAQBgNVBAcTCVZhbmNvdXZlcjEWMBQGA1UE\n" +
                    "ChMNd3d3LmN1Y2JjLmNvbTEUMBIGA1UECxQLY29tbW9uc19zc2wxHTAbBgNVBAMU\n" +
                    "FGRlbW9faW50ZXJtZWRpYXRlX2NhMSUwIwYJKoZIhvcNAQkBFhZqdWxpdXNkYXZp\n" +
                    "ZXNAZ21haWwuY29tMB4XDTA2MTIxMTE2MjYxMFoXDTI4MTEwNTE2MjYxMFowgZIx\n" +
                    "CzAJBgNVBAYTAlVTMREwDwYDVQQIDAhNYXJ5bGFuZDEUMBIGA1UEBwwLRm9yZXN0\n" +
                    "IEhpbGwxFzAVBgNVBAoMDmh0dHBjb21wb25lbnRzMRowGAYDVQQLDBF0ZXN0IGNl\n" +
                    "cnRpZmljYXRlczElMCMGCSqGSIb3DQEJARYWanVsaXVzZGF2aWVzQGdtYWlsLmNv\n" +
                    "bTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMhjr5aCPoyp0R1iroWA\n" +
                    "fnEyBMGYWoCidH96yGPFjYLowez5aYKY1IOKTY2BlYho4O84X244QrZTRl8kQbYt\n" +
                    "xnGh4gSCD+Z8gjZ/gMvLUlhqOb+WXPAUHMB39GRyzerA/ZtrlUqf+lKo0uWcocxe\n" +
                    "Rc771KN8cPH3nHZ0rV0Hx4ZAZy6U4xxObe4rtSVY07hNKXAb2odnVqgzcYiDkLV8\n" +
                    "ilvEmoNWMWrp8UBqkTcpEhYhCYp3cTkgJwMSuqv8BqnGd87xQU3FVZI4tbtkB+Kz\n" +
                    "jD9zz8QCDJAfDjZHR03KNQ5mxOgXwxwKw6lGMaiVJTxpTKqym93whYk93l3ocEe5\n" +
                    "5c0CAwEAAaOBkDCBjTAJBgNVHRMEAjAAMCwGCWCGSAGG+EIBDQQfFh1PcGVuU1NM\n" +
                    "IEdlbmVyYXRlZCBDZXJ0aWZpY2F0ZTAdBgNVHQ4EFgQUnxR3vz86tso4gkJIFiza\n" +
                    "0Mteh9gwHwYDVR0jBBgwFoAUe5raj5CZTlLSrNuzA1LKh6YNPg0wEgYDVR0RBAsw\n" +
                    "CYIHZm9vLmNvbTANBgkqhkiG9w0BAQUFAAOCAQEAjl78oMjzFdsMy6F1sGg/IkO8\n" +
                    "tF5yUgPgFYrs41yzAca7IQu6G9qtFDJz/7ehh/9HoG+oqCCIHPuIOmS7Sd0wnkyJ\n" +
                    "Y7Y04jVXIb3a6f6AgBkEFP1nOT0z6kjT7vkA5LJ2y3MiDcXuRNMSta5PYVnrX8aZ\n" +
                    "yiqVUNi40peuZ2R8mAUSBvWgD7z2qWhF8YgDb7wWaFjg53I36vWKn90ZEti3wNCw\n" +
                    "qAVqixM+J0qJmQStgAc53i2aTMvAQu3A3snvH/PHTBo+5UL72n9S1kZyNCsVf1Qo\n" +
                    "n8jKTiRriEM+fMFlcgQP284EBFzYHyCXFb9O/hMjK2+6mY9euMB1U1aFFzM/Bg==\n" +
                    "-----END CERTIFICATE-----\n").getBytes();

    public final static byte[] IP_1_1_1_1 = (
            "-----BEGIN CERTIFICATE-----\n" +
                    "MIICwjCCAaqgAwIBAgIBATANBgkqhkiG9w0BAQUFADAaMRgwFgYDVQQDEw9kdW1t\n" +
                    "eS12YWx1ZS5jb20wHhcNMTcwMTEzMjI1MTQ2WhcNMTgwMTEzMjI1MTQ2WjAaMRgw\n" +
                    "FgYDVQQDEw9kdW1teS12YWx1ZS5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAw\n" +
                    "ggEKAoIBAQDfrapp3jHLp1RlElzpR/4sF9AcTYwMF1N+adkHRoVtmTlJV2lTIAjn\n" +
                    "QLauy0Kkzv8uxmbID3uROgrFNDQ5RxTTCe+kW/vE6Pyzr5Z5ayjSTKeycTE7mAC4\n" +
                    "6ntoCeEWiD593zlfqVo5PuRSp9Kusd+kexNVjC/BETDPa3yXctcH1ouW9GyGItgQ\n" +
                    "u4GhCE8cipKMuTltgfK+Gh/5e9lFG9/F2fD+wHUVBULLR3JOQoqwgk2zAwKDwLuS\n" +
                    "sEd1CBi35+W3apCKN0SEdTKIAxc/R+O/1j2hpOl9yXCCYyveGwJdFXVZtDcx+9/H\n" +
                    "7NXhOdmw/mTXC5fOQGKciEo2SXt8Wp89AgMBAAGjEzARMA8GA1UdEQQIMAaHBAEB\n" +
                    "AQEwDQYJKoZIhvcNAQEFBQADggEBAEAO6CE8twpcfdjk9oMjI5nX9GdC5Wt6+ujd\n" +
                    "tLj0SbXvMKzCLLkveT0xTEzXfyEo8KW2qYYvPP1h83BIxsbR/J3Swt35UQVofv+4\n" +
                    "JgO0FIdgB+iLEcjUh5+60xslylqWE+9bSWm4f06OXuv78tq5NYPZKku/3i4tqLRp\n" +
                    "gH2rTtjX7Q4olSS7GdAgfiA2AnDZAbMtxtsnTt/QFpYQqhlkqHVDwgkGP7C8aMBD\n" +
                    "RH0UIQCPxUkhwhtNmVyHO42r6oHXselZoVU6XRHuhogrGxPf/pzDUvrKBiJhsZQQ\n" +
                    "oEu+pZCwkFLiNwUoq1G2oDpkkdBWB0JcBXB2Txa536ezFFWZYc0=\n" +
                    "-----END CERTIFICATE-----"
    ).getBytes();

    private HostnameVerifyingX509ExtendedTrustManager trustManager;
    private CertificateFactory certificateFactory;

    @Before
    public void initialize() throws Exception {
        trustManager = new HostnameVerifyingX509ExtendedTrustManager(true);
        certificateFactory = CertificateFactory.getInstance("X.509");
    }

    @Test
    public void valid_CNOnly() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);
        trustManager.performHostVerification("", "foo.com", x509);
    }

    @Test
    public void valid_CNWithSAN() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_FOO_BAR);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);
        trustManager.performHostVerification("", "bar.com", x509);
    }

    @Test
    public void valid_Wildcard() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_WILD_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "www.foo.com", x509);
        trustManager.performHostVerification("", "\u82b1\u5b50.foo.com", x509);
    }

    @Test
    public void valid_SANOnly() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_NO_CNS_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "foo.com", x509);
    }

    @Test
    public void valid_IP() throws Exception {
        final InputStream in = new ByteArrayInputStream(IP_1_1_1_1);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("1.1.1.1", "", x509);
    }

    @Test(expected = CertificateException.class)
    public void invalid_CNOnlyNotMatched() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "bar.com", x509);
    }

    @Test(expected = CertificateException.class)
    public void invalid_CNWithSANNotMatched() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_FOO_BAR);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "foo.com", x509);
    }

    @Test(expected = CertificateException.class)
    public void invalid_WildcardNotMatched() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_WILD_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "foo.com", x509);
    }

    @Test(expected = CertificateException.class)
    public void invalid_WildcardNestedWildcard() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_WILD_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "a.b.foo.com", x509);
    }

    @Test(expected = CertificateException.class)
    public void invalid_SANOnlyNotMatched() throws Exception {
        final InputStream in = new ByteArrayInputStream(X509_NO_CNS_FOO);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("", "a.foo.com", x509);
    }

    @Test(expected = CertificateException.class)
    public void invalid_IPNotMatched() throws Exception {
        final InputStream in = new ByteArrayInputStream(IP_1_1_1_1);
        final X509Certificate x509 = (X509Certificate) certificateFactory.generateCertificate(in);

        trustManager.performHostVerification("1.1.1.2", "", x509);
    }
}