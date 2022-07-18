package ut.com.atlassian.amatech.myPlugin;

import org.junit.Test;
import com.atlassian.amatech.myPlugin.api.MyPluginComponent;
import com.atlassian.amatech.myPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}