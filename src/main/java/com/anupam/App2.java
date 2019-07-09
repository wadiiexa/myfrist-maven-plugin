package com.anupam;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Hello world!
 *
 */
 @Mojo(name = "hello2", defaultPhase = LifecyclePhase.COMPILE)
public class App2 extends AbstractMojo {
    @Parameter(property = "msg",defaultValue = "from maven 2")
    private String msg;
    public void execute()
            throws MojoExecutionException {
        getLog().info("Hello " + msg);
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
