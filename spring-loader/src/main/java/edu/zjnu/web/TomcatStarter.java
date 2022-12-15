package edu.zjnu.web;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.util.Objects;

/**
 * @author: 杨海波
 * @date: 2022-12-15 10:17:37
 * @description: todo
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "edu.zjnu.web")
public class TomcatStarter  {
    private static int port = 8080;
    private static String contextPath = "/";

    public static void start() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        String baseDir = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
        tomcat.setBaseDir(baseDir);
        tomcat.setPort(port);
        //tomcat.setConnector(new Connector());

        tomcat.addWebapp(contextPath, baseDir);

        tomcat.enableNaming();
        tomcat.start();
        tomcat.getServer().await();
    }

    public static void main(String[] args) throws IOException, LifecycleException {

        start();
    }


//    private void configurateServletContext(ServletContext container) {
//
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.setServletContext(container);
//
//        ServletRegistration.Dynamic servlet = container.addServlet(
//                "dispatcher", new DispatcherServlet(ctx));
//
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//    }
}
