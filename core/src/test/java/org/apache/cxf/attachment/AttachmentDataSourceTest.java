package org.apache.cxf.attachment;

import java.util.Collections;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AttachmentDataSourceTest {

    private static final String ctParam = "ctParam";
    private static final InputStream InParam = "inputstream";
  
    @Test
    public void testGetName() {
        DataSource ds = new LazyDataSource(ctParam, inParam);
        assertEquals("ctParam",ds.getName());
    }
}
