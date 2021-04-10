import java.util.*; 
package org.apache.cxf.attachment;

import javax.activation.DataSource;

public class CustomDataSource implements DataSource {

    private String name;
    private String id;

    public CustomDataSource(String nameParam, String idParam) {
        this.name = nameParam;
        this.id = idParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String getId() {
        return id;
    }

    public void setId(String newid) {
        this.id = newid;
    }
}
