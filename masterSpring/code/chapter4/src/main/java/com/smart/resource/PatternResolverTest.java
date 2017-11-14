package com.smart.resource;

import groovy.json.internal.Byt;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.InputStream;

/**
 * Created by xuhc on 2017/10/16.
 */
public class PatternResolverTest
{
    public void getResourses() throws Throwable
    {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resources[] = resolver.getResources("classpath*:com/smart/**/*.xml");
        for(Resource resource : resources)
            System.out.println(resource.getDescription());

        InputStream input = (new DefaultResourceLoader()).getResource("classpath:/moAttack.xml").getInputStream();
        byte res[] = new byte[40];
        int readbytes = 0;
        do {
            if((readbytes = input.read(res)) >0 )
                System.out.write(res,0,readbytes);
            else
                break;
        }
        while(true);
    }

    public static void main(String[] args) throws Throwable {
        new PatternResolverTest().getResourses();
    }
}
