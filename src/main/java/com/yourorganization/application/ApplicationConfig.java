package com.yourorganization.application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * By company code and service conventions: all rest services need to have as root path the word api.
 */
@ApplicationPath("/api")
public class ApplicationConfig extends Application {
}
