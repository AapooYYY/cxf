package org.apache.cxf.attachment;

import java.util.Collections;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AttachmentDataSourceTest {

    private static final String ctParam = "ctParam";
    byte[] data = "123,456,789,123,456,789".getBytes();
    private InputStream inParam = new ByteArrayInputStream(data);
  
    @Test
    public void testGetName() {
        DataSource ds = new AttachmentDataSource(ctParam, inParam);
        assertEquals("ctParam",ds.getName());
    }
}
