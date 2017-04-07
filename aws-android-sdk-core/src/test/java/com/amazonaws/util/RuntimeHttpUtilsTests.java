
package com.amazonaws.util;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Protocol;
import com.amazonaws.Request;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RuntimeHttpUtilsTests {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testconvertRequestToUrl() throws MalformedURLException {
        final Request<?> request = new DefaultRequest<Void>("Foo");
        request.setContent(new ByteArrayInputStream("testcontent"
                .getBytes(StringUtils.UTF8)));
        request.addHeader("Host", "demo.us-east-1.amazonaws.com");
        // HTTP header containing multiple spaces in a row.
        request.addHeader("x-amz-archive-description", "test  test");
        request.setResourcePath("/");
        request.setEndpoint(URI.create("http://demo.us-east-1.amazonaws.com"));

        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("foo", "bar");
        parameters.put("temple", "run");
        request.setParameters(parameters);
        final RuntimeHttpUtils utils = new RuntimeHttpUtils();

        Assert.assertEquals(new URL("http://demo.us-east-1.amazonaws.com/?foo=bar&temple=run"),
                RuntimeHttpUtils.convertRequestToUrl(request, true, false));

    }

    @Test
    public void testUri() throws MalformedURLException, URISyntaxException {
        Assert.assertEquals(new URI("https://demo.us-east-1.amazonaws.com/"),
                RuntimeHttpUtils.toUri("demo.us-east-1.amazonaws.com/",
                        new ClientConfiguration().withProtocol(Protocol.HTTPS)));

        exception.expect(IllegalArgumentException.class);
        RuntimeHttpUtils.toUri(null, new ClientConfiguration());

        exception.expect(IllegalArgumentException.class);
        RuntimeHttpUtils.toUri(null, (ClientConfiguration) null);

        Assert.assertEquals(new URI("http://demo.us-east-1.amazonaws.com/"),
                RuntimeHttpUtils.toUri("https://demo.us-east-1.amazonaws.com/",
                        new ClientConfiguration().withProtocol(Protocol.HTTP)));
    }

}
